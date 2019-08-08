package com.ggtylerr.kaane_ae.vanilla;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ggtylerr.kaane_ae.R;
import com.ggtylerr.kaane_ae.util.Props;
import com.ggtylerr.kaane_ae.util.log;
import com.ggtylerr.kaane_ae.util.string;

import java.util.Properties;

public class Wires extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        log.print("Current screen: Vanilla Wires");
        View view = inflater.inflate(R.layout.fragment_vanilla_wires, container, false);
        View button = view.findViewById(R.id.vanilla_wires_okBtn);
        button.setOnClickListener((View v) -> {
            log.printExclog("Click listened: Button");
            long startTime = System.nanoTime();
            // Get spinners
            Spinner wire1spin = view.findViewById(R.id.vanilla_wires_wire1spin);
            Spinner wire2spin = view.findViewById(R.id.vanilla_wires_wire2spin);
            Spinner wire3spin = view.findViewById(R.id.vanilla_wires_wire3spin);
            Spinner wire4spin = view.findViewById(R.id.vanilla_wires_wire4spin);
            Spinner wire5spin = view.findViewById(R.id.vanilla_wires_wire5spin);
            Spinner wire6spin = view.findViewById(R.id.vanilla_wires_wire6spin);
            // Get selection
            String wire1 = (String) wire1spin.getSelectedItem();
            log.print("Wire 1 - " + wire1);
            String wire2 = (String) wire2spin.getSelectedItem();
            log.print("Wire 2 - " + wire2);
            String wire3 = (String) wire3spin.getSelectedItem();
            log.print("Wire 3 - " + wire3);
            String wire4 = (String) wire4spin.getSelectedItem();
            log.print("Wire 4 - " + wire4);
            String wire5 = (String) wire5spin.getSelectedItem();
            log.print("Wire 5 - " + wire5);
            String wire6 = (String) wire6spin.getSelectedItem();
            log.print("Wire 6 - " + wire6);
            // Put into array
            String[] wireArr = {wire1,wire2,wire3,wire4,wire5,wire6};
            // Get resources
            Resources res = getResources();
            // Get color names
            String[] colors = res.getStringArray(R.array.vanilla_wires_colors);
            String none = colors[0];
            String red = colors[1];
            String yellow = colors[2];
            String blue = colors[3];
            String white = colors[4];
            String black = colors[5];
            // If there isn't <3 wires, cancel calculation
            TextView output = view.findViewById(R.id.vanilla_wires_output);
            if (string.count(wireArr,none) > 3) {
                log.print("Too few wires! Needs to be >= 3 wires.");
                output.setText(getResources().getString(R.string.vanilla_wires_invalid));
            } else {
                // Get props
                Properties props = Props.load(new Properties());
                // Get SN
                String sn = props.getProperty("sn");
                // Fix up the array (remove none wires)
                String[] newArr = string.exclude(wireArr,none);
                // Get the amount of wires
                int amount = inverse(string.count(wireArr,none));
                log.printExclog("Amount: " + amount);
                // 3 wires
                if (amount == 3) {
                    log.printExclog("Fixed up array items:");
                    log.printExclog("W1 - " + newArr[0]);
                    log.printExclog("W2 - " + newArr[1]);
                    log.printExclog("W3 - " + newArr[2]);
                    // No red wires -> Cut 2nd wire
                    if (string.count(newArr,red) == 0) {
                        log.printExclog("Rule 1.1 - No red wires -> Cut 2nd wire");
                        log.print("Cut the 2nd wire.");
                        output.setText(res.getString(R.string.vanilla_wires_cut_msg,"2nd"));
                    }
                    // Last wire white -> Cut 3rd (last) wire
                    else if (newArr[2].equals(white)) {
                        log.printExclog("Rule 1.2 - Last wire white -> Cut 3rd wire");
                        log.print("Cut the 3rd wire.");
                        output.setText(res.getString(R.string.vanilla_wires_cut_msg,"3rd"));
                    }
                    // >1 blue wire -> Cut last blue wire
                    else if (string.count(newArr,blue) > 1) {
                        log.printExclog("Rule 1.3 - >1 blue wire -> Cut last blue wire");
                        // Determine what is the last blue wire by checking if the 3rd wire is Blue.
                        String cutWire = (newArr[2].equals("Blue")) ? "3rd" : "2nd";
                        log.printExclog("Calculated last blue wire: " + cutWire);
                        log.print("Cut the " + cutWire + " wire.");
                        output.setText(res.getString(R.string.vanilla_wires_cut_msg,cutWire));
                    }
                    // Else -> Cut 3rd (last) wire
                    else {
                        log.printExclog("Rule 1.4 - Else -> Cut 3rd wire");
                        log.print("Cut the 3rd wire.");
                        output.setText(res.getString(R.string.vanilla_wires_cut_msg,"3rd"));
                    }
                }
                // 4 wires
                else if (amount == 4) {
                    // Fix up the wire formation
                    log.printExclog("Fixed up array items:");
                    log.printExclog("W1 - " + newArr[0]);
                    log.printExclog("W2 - " + newArr[1]);
                    log.printExclog("W3 - " + newArr[2]);
                    log.printExclog("W4 - " + newArr[3]);
                    // >1 red wire + last digit of SN is odd -> Cut last red wire
                    if (string.count(newArr,red) > 1 && string.lastInt(sn) % 2 == 1) {
                        log.printExclog("Rule 2.1 - >1 red wire + last digit of SN is odd -> Cut last red wire");
                        String cutWire = (newArr[3].equals("Red")) ? "4th" : (newArr[2].equals("Red")) ? "3rd" : "2nd";
                        log.printExclog("Calculated last red wire: " + cutWire);
                        log.print("Cut the " + cutWire + " wire.");
                        output.setText(res.getString(R.string.vanilla_wires_cut_msg,cutWire));
                    }
                    // Last wire yellow + No red wires -> Cut 1st wire
                    else if (newArr[3].equals(yellow) && string.count(newArr,red) == 0) {
                        log.printExclog("Rule 2.2 - Last wire yellow + no red wires -> Cut 1st wire");
                        log.print("Cut the 1st wire.");
                        output.setText(res.getString(R.string.vanilla_wires_cut_msg,"1st"));
                    }
                    // 1 blue wire -> Cut 1st wire
                    else if (string.count(newArr,blue) == 1) {
                        log.printExclog("Rule 2.3 - 1 blue wire -> Cut 1st wire");
                        log.print("Cut the 1st wire.");
                        output.setText(res.getString(R.string.vanilla_wires_cut_msg,"1st"));
                    }
                    // >1 yellow wire -> Cut 4th (last) wire
                    else if (string.count(newArr,yellow) > 1) {
                        log.printExclog("Rule 2.4 - >1 yellow wire -> Cut 4th wire");
                        log.print("Cut the 4th wire.");
                        output.setText(res.getString(R.string.vanilla_wires_cut_msg,"4th"));
                    }
                    // Else -> Cut 2nd wire
                    else {
                        log.printExclog("Rule 2.5 - Else -> Cut 2nd wire");
                        log.print("Cut the 2nd wire.");
                        output.setText(res.getString(R.string.vanilla_wires_cut_msg,"2nd"));
                    }
                }
                // 5 wires
                else if (amount == 5) {
                    // Fix up the wire formation
                    log.printExclog("Fixed up array items:");
                    log.printExclog("W1 - " + newArr[0]);
                    log.printExclog("W2 - " + newArr[1]);
                    log.printExclog("W3 - " + newArr[2]);
                    log.printExclog("W4 - " + newArr[3]);
                    log.printExclog("W5 - " + newArr[4]);
                    // Last wire black + last digit of SN is odd -> Cut 4th wire
                    if (newArr[5].equals(black) && string.lastInt(sn) % 2 == 1) {
                        log.printExclog("Rule 3.1 - Last wire black + last digit of SN is odd -> Cut 4th wire");
                        log.print("Cut the 4th wire.");
                        output.setText(res.getString(R.string.vanilla_wires_cut_msg,"4th"));
                    }
                    // 1 red wire + >1 yellow wire -> Cut 1st wire
                    else if (string.count(newArr,red) == 1 && string.count(newArr,yellow) > 1) {
                        log.printExclog("Rule 3.2 - 1 red wire + >1 yellow wire -> Cut 1st wire");
                        log.print("Cut the 1st wire.");
                        output.setText(res.getString(R.string.vanilla_wires_cut_msg,"1st"));
                    }
                    // No black wires -> Cut 2nd wire
                    else if (string.count(newArr,black) == 0) {
                        log.printExclog("Rule 3.3 - No black wires -> Cut 2nd wire");
                        log.print("Cut the 2nd wire.");
                        output.setText(res.getString(R.string.vanilla_wires_cut_msg,"2nd"));
                    }
                    // Else -> Cut 1st wire
                    else {
                        log.printExclog("Rule 3.4 - Else -> Cut 1st wire");
                        log.print("Cut the 1st wire.");
                        output.setText(res.getString(R.string.vanilla_wires_cut_msg,"1st"));
                    }
                }
                // 6 wires
                else {
                    // No yellow wires + last digit of SN is odd -> Cut 3rd wire
                    if (string.count(newArr,yellow) == 0 && string.lastInt(sn) % 2 == 1) {
                        log.printExclog("Rule 4.1 - No yellow wires + last digit of SN is odd -> Cut 3rd wire");
                        log.print("Cut the 3rd wire.");
                        output.setText(res.getString(R.string.vanilla_wires_cut_msg,"3rd"));
                    }
                    // 1 yellow wire + >1 white wire -> Cut 4th wire
                    else if (string.count(newArr,yellow) == 1 && string.count(newArr,white) > 1) {
                        log.printExclog("Rule 4.2 - 1 yellow wire + >1 white wire -> Cut 4th wire");
                        log.print("Cut the 4th wire.");
                        output.setText(res.getString(R.string.vanilla_wires_cut_msg,"4th"));
                    }
                    // No red wires -> Cut 6th (last) wire
                    else if (string.count(newArr,red) == 0) {
                        log.printExclog("Rule 4.3 - No red wires -> Cut 6th wire");
                        log.print("Cut the 6th wire.");
                        output.setText(res.getString(R.string.vanilla_wires_cut_msg,"6th"));
                    }
                    // Else -> Cut 4th wire
                    else {
                        log.printExclog("Rule 4.4 - Else -> Cut 4th wire");
                        log.print("Cut the 4th wire.");
                        output.setText(res.getString(R.string.vanilla_wires_cut_msg,"4th"));
                    }
                }
            }
            long endTime = System.nanoTime();
            long calcTime = endTime - startTime;
            log.print("Defuse Calculation done, took " + (calcTime / 1000000) + " ms.");
            log.printExclog("Start time: " + startTime);
            log.printExclog("End time: " + endTime);
            log.printExclog("Exact calculated time: " + calcTime);
        });
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Wires");
    }

    private int inverse(int i) {
        int o;
        switch (i) {
            case 0: o = 6; break;
            case 1: o = 5; break;
            case 2: o = 4; break;
            case 3: o = 3; break;
            default: o = 3; break;
        }
        return o;
    }
}