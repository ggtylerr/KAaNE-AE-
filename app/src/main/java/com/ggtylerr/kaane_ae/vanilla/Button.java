package com.ggtylerr.kaane_ae.vanilla;

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

import java.util.Properties;

public class Button extends Fragment {
    private String color;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        log.print("Current screen: Vanilla Button");
        View v = inflater.inflate(R.layout.fragment_vanilla_button, container, false);
        // Grab Buttons
        View redBtn = v.findViewById(R.id.vanilla_button_color_red);
        View yellowBtn = v.findViewById(R.id.vanilla_button_color_yellow);
        View blueBtn = v.findViewById(R.id.vanilla_button_color_blue);
        View whiteBtn = v.findViewById(R.id.vanilla_button_color_white);
        // Set border changers
        redBtn.setOnClickListener((View view) -> {
            log.printExclog("Click listened: Red Button");
            redBtn.setBackgroundResource(R.drawable.imagebutton_border);
            yellowBtn.setBackgroundResource(R.drawable.imagebutton_noborder);
            blueBtn.setBackgroundResource(R.drawable.imagebutton_noborder);
            whiteBtn.setBackgroundResource(R.drawable.imagebutton_noborder);
            color = "Red";
        });
        yellowBtn.setOnClickListener((View view) -> {
            log.printExclog("Click listened: Yellow Button");
            redBtn.setBackgroundResource(R.drawable.imagebutton_noborder);
            yellowBtn.setBackgroundResource(R.drawable.imagebutton_border);
            blueBtn.setBackgroundResource(R.drawable.imagebutton_noborder);
            whiteBtn.setBackgroundResource(R.drawable.imagebutton_noborder);
            color = "Yellow";
        });
        blueBtn.setOnClickListener((View view) -> {
            log.printExclog("Click listened: Blue Button");
            redBtn.setBackgroundResource(R.drawable.imagebutton_noborder);
            yellowBtn.setBackgroundResource(R.drawable.imagebutton_noborder);
            blueBtn.setBackgroundResource(R.drawable.imagebutton_oborder);
            whiteBtn.setBackgroundResource(R.drawable.imagebutton_noborder);
            color = "Blue";
        });
        whiteBtn.setOnClickListener((View view) -> {
            log.printExclog("Click listened: White Button");
            redBtn.setBackgroundResource(R.drawable.imagebutton_noborder);
            yellowBtn.setBackgroundResource(R.drawable.imagebutton_noborder);
            blueBtn.setBackgroundResource(R.drawable.imagebutton_noborder);
            whiteBtn.setBackgroundResource(R.drawable.imagebutton_border);
            color = "White";
        });
        // Set default choice
        redBtn.setBackgroundResource(R.drawable.imagebutton_border);
        color = "Red";
        // Logic
        v.findViewById(R.id.vanilla_button_ok).setOnClickListener((View view) -> {
            log.printExclog("Click listened: OK Button");
            // Start timer
            long startTime = System.nanoTime();
            // Get spinner selection
            Spinner spinner = v.findViewById(R.id.vanilla_button_instruction_spinner);
            String selection = spinner.getSelectedItem().toString();
            // Turn to english string (just in case)
            String[] instructArr = getResources().getStringArray(R.array.vanilla_button_instructions);
            String instruction = (selection.equals(instructArr[0])) ? "Abort" :
                    (selection.equals(instructArr[1])) ? "Detonate" :
                    (selection.equals(instructArr[2])) ? "Hold" : "Press";
            // Grab properties
            Properties props = Props.load(new Properties());
            int batteries = Integer.parseInt(props.getProperty("batteriesTotal"));
            log.printExclog("Batteries: " + batteries);
            int litCAR = Integer.parseInt(props.getProperty("carLit"));
            log.printExclog("Lit CAR: " + litCAR);
            int litFRK = Integer.parseInt(props.getProperty("frkLit"));
            log.printExclog("Lit FRK: " + litFRK);
            // Logging
            log.print("Color: " + color);
            log.print("Instruction: " + instruction);
            // Set up outputs
            TextView output = v.findViewById(R.id.vanilla_button_output);
            String tapOutput = getResources().getString(R.string.vanilla_button_press);
            String rahbOutput = getResources().getString(R.string.vanilla_button_rahb);
            // Blue + "Abort" - RaHB
            if (color.equals("Blue") && instruction.equals("Abort")) {
                log.printExclog("Blue + \"Abort\" - RaHB");
                log.print("Follow RaHB instructions.");
                output.setText(rahbOutput);
            }
            // >1 battery + "Detonate" - Tap
            else if (batteries > 1 && instruction.equals("Detonate")) {
                log.printExclog(">1 Battery + \"Detonate\" - Tap");
                log.print("Press and Release.");
                output.setText(tapOutput);
            }
            // White + Lit CAR - RaHB
            else if (color.equals("White") && litCAR == 1) {
                log.printExclog("White + Lit CAR - RaHB");
                log.print("Follow RaHB instructions.");
                output.setText(rahbOutput);
            }
            // >2 batteries + Lit FRK - Tap
            else if (batteries > 2 && litFRK == 1) {
                log.printExclog(">2 Batteries + Lit FRK - Tap");
                log.print("Press and Release.");
                output.setText(tapOutput);
            }
            // Yellow - RaHB
            else if (color.equals("Yellow")) {
                log.printExclog("Yellow - RaHB");
                log.print("Follow RaHB instructions.");
                output.setText(rahbOutput);
            }
            // Red + "Hold" - Tap
            else if (color.equals("Red") && instruction.equals("Hold")) {
                log.printExclog("Red + \"Hold\" - Tap");
                log.print("Press and Release.");
                output.setText(tapOutput);
            }
            // Else - RaHB
            else {
                log.printExclog("Else - RaHB");
                log.print("Follow RaHB instructions.");
                output.setText(rahbOutput);
            }
            // Stop timer
            long endTime = System.nanoTime();
            long calcTime = endTime - startTime;
            log.print("Defuse Calculation done. Took " + (calcTime / 1000000) + " ms.");
            log.printExclog("Start time: " + startTime);
            log.printExclog("End time: " + endTime);
            log.printExclog("Exact calculated time: " + calcTime);
        });
        return v;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("The Button");
    }
}
