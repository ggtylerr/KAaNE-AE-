package com.ggtylerr.kaane_ae.util;

import android.os.Environment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class log {
    public static PrintStream setup() {
        PrintStream o = null;
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + "/kaane-ae","log.log");
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
                System.out.println("Unknown error occured when setting up log! Printing stack trace...");
                exc.printStackTrace();
            }
        }
        return o;
    }
    public static void print(String s) {
        PrintStream o = setup();
        PrintStream console = System.out;
        System.setOut(o);
        System.out.println(s);
        System.setOut(console);
        System.out.println(s);
    }
}
