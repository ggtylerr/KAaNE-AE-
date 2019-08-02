package com.ggtylerr.kaane_ae.util;

import android.content.SharedPreferences;
import android.os.Environment;

import androidx.preference.PreferenceManager;

import com.ggtylerr.kaane_ae.MainActivity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class log {
    public static boolean excessive_log = MainActivity.grabExclogPreference();
    private static boolean setup = false;
    private static PrintStream o;
    private static File file;
    public static PrintStream setup() {
        setup = true;
        file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + "/kaane-ae","log.log");
        try {
            o = new PrintStream(file);
        } catch (FileNotFoundException ex){
            try {
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                if (!file.exists()) {
                    file.createNewFile();
                }
                o = new PrintStream(file);
            } catch (Exception exc){
                setup = false;
                System.out.println("Unknown error occured when setting up log! Printing stack trace...");
                exc.printStackTrace();
            }
        }
        return o;
    }
    public static void print(String s) {
        if (!setup) o = setup();
        PrintStream console = System.out;
        System.setOut(o);
        System.out.println(s);
        System.setOut(console);
        System.out.println(s);
    }
    public static void printExclog(String s) {if (excessive_log) print("[EXCLOG] " + s);}
    public static void printStackTrace(Exception ex) {
        ex.printStackTrace(o);
        ex.printStackTrace(System.out);
    }
    public static String getLog() {
        if (!setup) o = setup();
        StringBuilder builder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String current;
            while ((current = br.readLine()) != null) builder.append(current).append("\n");
        } catch (Exception ex) {
            StringWriter writer = new StringWriter();
            ex.printStackTrace(new PrintWriter(writer));
            ex.printStackTrace();
            return "Failed to load log!\nStack trace:\n" + writer.toString();
        }
        return builder.toString();
    }
}
