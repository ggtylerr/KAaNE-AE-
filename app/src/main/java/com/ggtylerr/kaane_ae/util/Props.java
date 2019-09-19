package com.ggtylerr.kaane_ae.util;

import android.os.Environment;

import com.ggtylerr.kaane_ae.MainActivity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class Props {

    public static File configFile;

    public static Properties load(Properties props) {

        if (!log.changed) {
            if (MainActivity.grabLocationPreference())
                configFile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + "/kaane-ae","config.properties");
            else
                configFile = new File(MainActivity.context.getFilesDir(), "config.properties");
        }

        try {
            FileReader reader = new FileReader(configFile);
            props.load(reader);
        } catch (FileNotFoundException ex) {
            System.out.println("File has not been found! Generating default properties and saving it...");
            long startTime = System.nanoTime();
            props.setProperty("sn1","B");
            props.setProperty("sn2","B");
            props.setProperty("sn3","B");
            props.setProperty("sn4","0");
            props.setProperty("sn5","0");
            props.setProperty("sn6","0");
            props.setProperty("bob","0");
            props.setProperty("car","0");
            props.setProperty("clr","0");
            props.setProperty("frk","0");
            props.setProperty("frq","0");
            props.setProperty("ind","0");
            props.setProperty("msa","0");
            props.setProperty("nsa","0");
            props.setProperty("sig","0");
            props.setProperty("snd","0");
            props.setProperty("trn","0");
            props.setProperty("bobLit","0");
            props.setProperty("carLit","0");
            props.setProperty("clrLit","0");
            props.setProperty("frkLit","0");
            props.setProperty("frqLit","0");
            props.setProperty("indLit","0");
            props.setProperty("msaLit","0");
            props.setProperty("nsaLit","0");
            props.setProperty("sigLit","0");
            props.setProperty("sndLit","0");
            props.setProperty("trnLit","0");
            props.setProperty("dvid","0");
            props.setProperty("parallel","0");
            props.setProperty("ps2","0");
            props.setProperty("rj45","0");
            props.setProperty("serial","0");
            props.setProperty("stereoRCA","0");
            props.setProperty("dvidQuantity","0");
            props.setProperty("parallelQuantity","0");
            props.setProperty("ps2Quantity","0");
            props.setProperty("rj45Quantity","0");
            props.setProperty("serialQuantity","0");
            props.setProperty("stereoRCAQuantity","0");
            props.setProperty("batteriesAA","0");
            props.setProperty("batteriesD","0");
            props.setProperty("batteryHolders","0");
            props.setProperty("batteriesTotal","0");
            props.setProperty("modules","0");
            props.setProperty("plates","0");
            props.setProperty("modPort","0");
            props.setProperty("modInd","0");
            props.setProperty("snVowel","f");
            props.setProperty("snFirstDig","0");
            props.setProperty("snLastDig","0");
            props.setProperty("snTotalDigs","0");
            props.setProperty("snTotalLets","0");
            props.setProperty("bobUnlit","0");
            props.setProperty("carUnlit","0");
            props.setProperty("clrUnlit","0");
            props.setProperty("frkUnlit","0");
            props.setProperty("frqUnlit","0");
            props.setProperty("indUnlit","0");
            props.setProperty("msaUnlit","0");
            props.setProperty("nsaUnlit","0");
            props.setProperty("sigUnlit","0");
            props.setProperty("sndUnlit","0");
            props.setProperty("trnUnlit","0");
            props.setProperty("totalInds","0");
            props.setProperty("totalIndsPlusMods","0");
            props.setProperty("totalIndsLit","0");
            props.setProperty("totalIndsUnlit","0");
            props.setProperty("totalPorts","0");
            props.setProperty("totalPortsPlusMods","0");
            props.setProperty("totalPortTypes","0");
            props.setProperty("owo","0");
            try {
                if (!configFile.getParentFile().exists()) {
                    configFile.getParentFile().mkdirs();
                }
                if (!configFile.exists()) {
                    configFile.createNewFile();
                }
                FileWriter writer = new FileWriter(configFile);
                props.store(writer,"settings");
            } catch (Exception exc) {
                System.out.println("Unknown Exception during creation of file! (Probably an IO exception) printing stack trace...");
                exc.printStackTrace();
            }
            long endTime = System.nanoTime();
            long timeElapsed = endTime - startTime;
            System.out.println("Done! Only took " + timeElapsed + " nanoseconds");
            System.out.println("(That would be " + timeElapsed / 1000000 + " milliseconds)");
        } catch (Exception ex) {
            System.out.println("Unknown Exception! (Probably an IO exception) printing stack trace...");
            ex.printStackTrace();
        }
        return props;
    }
}
