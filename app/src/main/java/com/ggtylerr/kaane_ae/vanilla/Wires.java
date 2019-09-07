package com.ggtylerr.kaane_ae.vanilla;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ggtylerr.kaane_ae.R;
import com.ggtylerr.kaane_ae.util.Props;
import com.ggtylerr.kaane_ae.util.log;
import com.ggtylerr.kaane_ae.util.string;

import java.util.Properties;

public class Wires extends Fragment {
    private static String wire1 = "";
    private static String wire2 = "";
    private static String wire3 = "";
    private static String wire4 = "";
    private static String wire5 = "";
    private static String wire6 = "";
    private View w1NoneButton;
    private View w1RedButton;
    private View w1YellowButton;
    private View w1BlueButton;
    private View w1WhiteButton;
    private View w1BlackButton;
    private View w2NoneButton;
    private View w2RedButton;
    private View w2YellowButton;
    private View w2BlueButton;
    private View w2WhiteButton;
    private View w2BlackButton;
    private View w3NoneButton;
    private View w3RedButton;
    private View w3YellowButton;
    private View w3BlueButton;
    private View w3WhiteButton;
    private View w3BlackButton;
    private View w4NoneButton;
    private View w4RedButton;
    private View w4YellowButton;
    private View w4BlueButton;
    private View w4WhiteButton;
    private View w4BlackButton;
    private View w5NoneButton;
    private View w5RedButton;
    private View w5YellowButton;
    private View w5BlueButton;
    private View w5WhiteButton;
    private View w5BlackButton;
    private View w6NoneButton;
    private View w6RedButton;
    private View w6YellowButton;
    private View w6BlueButton;
    private View w6WhiteButton;
    private View w6BlackButton;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        log.print("Current screen: Vanilla Wires");
        View view = inflater.inflate(R.layout.fragment_vanilla_wires, container, false);
        // W1 Buttons
        w1NoneButton = view.findViewById(R.id.vanilla_wires_w1_none);
        w1RedButton = view.findViewById(R.id.vanilla_wires_w1_red);
        w1YellowButton = view.findViewById(R.id.vanilla_wires_w1_yellow);
        w1BlueButton = view.findViewById(R.id.vanilla_wires_w1_blue);
        w1WhiteButton = view.findViewById(R.id.vanilla_wires_w1_white);
        w1BlackButton = view.findViewById(R.id.vanilla_wires_w1_black);
        // None
        w1NoneButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W1 None Button");
            wire1 = getResources().getStringArray(R.array.vanilla_wires_colors)[0];
            w1NoneButton.setBackgroundResource(R.drawable.imagebutton_border);
            w1RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w1YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w1BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w1WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w1BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // Red
        w1RedButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W1 Red Button");
            wire1 = getResources().getStringArray(R.array.vanilla_wires_colors)[1];
            w1NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w1RedButton.setBackgroundResource(R.drawable.imagebutton_border);
            w1YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w1BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w1WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w1BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // Yellow
        w1YellowButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W1 Yellow Button");
            wire1 = getResources().getStringArray(R.array.vanilla_wires_colors)[2];
            w1NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w1RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w1YellowButton.setBackgroundResource(R.drawable.imagebutton_border);
            w1BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w1WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w1BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // Blue
        w1BlueButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W1 Blue Button");
            wire1 = getResources().getStringArray(R.array.vanilla_wires_colors)[3];
            w1NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w1RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w1YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w1BlueButton.setBackgroundResource(R.drawable.imagebutton_oborder);
            w1WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w1BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // White
        w1WhiteButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W1 White Button");
            wire1 = getResources().getStringArray(R.array.vanilla_wires_colors)[4];
            w1NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w1RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w1YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w1BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w1WhiteButton.setBackgroundResource(R.drawable.imagebutton_border);
            w1BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // Black
        w1BlackButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W1 Black Button");
            wire1 = getResources().getStringArray(R.array.vanilla_wires_colors)[5];
            w1NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w1RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w1YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w1BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w1WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w1BlackButton.setBackgroundResource(R.drawable.imagebutton_oborder);
        });
        // W2 Buttons
        w2NoneButton = view.findViewById(R.id.vanilla_wires_w2_none);
        w2RedButton = view.findViewById(R.id.vanilla_wires_w2_red);
        w2YellowButton = view.findViewById(R.id.vanilla_wires_w2_yellow);
        w2BlueButton = view.findViewById(R.id.vanilla_wires_w2_blue);
        w2WhiteButton = view.findViewById(R.id.vanilla_wires_w2_white);
        w2BlackButton = view.findViewById(R.id.vanilla_wires_w2_black);
        // None
        w2NoneButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W2 None Button");
            wire2 = getResources().getStringArray(R.array.vanilla_wires_colors)[0];
            w2NoneButton.setBackgroundResource(R.drawable.imagebutton_border);
            w2RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w2YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w2BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w2WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w2BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // Red
        w2RedButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W2 Red Button");
            wire2 = getResources().getStringArray(R.array.vanilla_wires_colors)[1];
            w2NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w2RedButton.setBackgroundResource(R.drawable.imagebutton_border);
            w2YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w2BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w2WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w2BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // Yellow
        w2YellowButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W2 Yellow Button");
            wire2 = getResources().getStringArray(R.array.vanilla_wires_colors)[2];
            w2NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w2RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w2YellowButton.setBackgroundResource(R.drawable.imagebutton_border);
            w2BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w2WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w2BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // Blue
        w2BlueButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W2 Blue Button");
            wire2 = getResources().getStringArray(R.array.vanilla_wires_colors)[3];
            w2NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w2RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w2YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w2BlueButton.setBackgroundResource(R.drawable.imagebutton_oborder);
            w2WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w2BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // White
        w2WhiteButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W2 White Button");
            wire2 = getResources().getStringArray(R.array.vanilla_wires_colors)[4];
            w2NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w2RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w2YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w2BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w2WhiteButton.setBackgroundResource(R.drawable.imagebutton_border);
            w2BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // Black
        w2BlackButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W2 Black Button");
            wire2 = getResources().getStringArray(R.array.vanilla_wires_colors)[5];
            w2NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w2RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w2YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w2BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w2WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w2BlackButton.setBackgroundResource(R.drawable.imagebutton_oborder);
        });
        // W3 Buttons
        w3NoneButton = view.findViewById(R.id.vanilla_wires_w3_none);
        w3RedButton = view.findViewById(R.id.vanilla_wires_w3_red);
        w3YellowButton = view.findViewById(R.id.vanilla_wires_w3_yellow);
        w3BlueButton = view.findViewById(R.id.vanilla_wires_w3_blue);
        w3WhiteButton = view.findViewById(R.id.vanilla_wires_w3_white);
        w3BlackButton = view.findViewById(R.id.vanilla_wires_w3_black);
        // None
        w3NoneButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W3 None Button");
            wire3 = getResources().getStringArray(R.array.vanilla_wires_colors)[0];
            w3NoneButton.setBackgroundResource(R.drawable.imagebutton_border);
            w3RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w3YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w3BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w3WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w3BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // Red
        w3RedButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W3 Red Button");
            wire3 = getResources().getStringArray(R.array.vanilla_wires_colors)[1];
            w3NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w3RedButton.setBackgroundResource(R.drawable.imagebutton_border);
            w3YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w3BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w3WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w3BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // Yellow
        w3YellowButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W3 Yellow Button");
            wire3 = getResources().getStringArray(R.array.vanilla_wires_colors)[2];
            w3NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w3RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w3YellowButton.setBackgroundResource(R.drawable.imagebutton_border);
            w3BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w3WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w3BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // Blue
        w3BlueButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W3 Blue Button");
            wire3 = getResources().getStringArray(R.array.vanilla_wires_colors)[3];
            w3NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w3RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w3YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w3BlueButton.setBackgroundResource(R.drawable.imagebutton_oborder);
            w3WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w3BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // White
        w3WhiteButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W3 White Button");
            wire3 = getResources().getStringArray(R.array.vanilla_wires_colors)[4];
            w3NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w3RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w3YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w3BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w3WhiteButton.setBackgroundResource(R.drawable.imagebutton_border);
            w3BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // Black
        w3BlackButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W3 Black Button");
            wire3 = getResources().getStringArray(R.array.vanilla_wires_colors)[5];
            w3NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w3RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w3YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w3BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w3WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w3BlackButton.setBackgroundResource(R.drawable.imagebutton_oborder);
        });
        // W4 Buttons
        w4NoneButton = view.findViewById(R.id.vanilla_wires_w4_none);
        w4RedButton = view.findViewById(R.id.vanilla_wires_w4_red);
        w4YellowButton = view.findViewById(R.id.vanilla_wires_w4_yellow);
        w4BlueButton = view.findViewById(R.id.vanilla_wires_w4_blue);
        w4WhiteButton = view.findViewById(R.id.vanilla_wires_w4_white);
        w4BlackButton = view.findViewById(R.id.vanilla_wires_w4_black);
        // None
        w4NoneButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W4 None Button");
            wire4 = getResources().getStringArray(R.array.vanilla_wires_colors)[0];
            w4NoneButton.setBackgroundResource(R.drawable.imagebutton_border);
            w4RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w4YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w4BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w4WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w4BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // Red
        w4RedButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W4 Red Button");
            wire4 = getResources().getStringArray(R.array.vanilla_wires_colors)[1];
            w4NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w4RedButton.setBackgroundResource(R.drawable.imagebutton_border);
            w4YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w4BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w4WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w4BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // Yellow
        w4YellowButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W4 Yellow Button");
            wire4 = getResources().getStringArray(R.array.vanilla_wires_colors)[2];
            w4NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w4RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w4YellowButton.setBackgroundResource(R.drawable.imagebutton_border);
            w4BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w4WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w4BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // Blue
        w4BlueButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W4 Blue Button");
            wire4 = getResources().getStringArray(R.array.vanilla_wires_colors)[3];
            w4NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w4RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w4YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w4BlueButton.setBackgroundResource(R.drawable.imagebutton_oborder);
            w4WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w4BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // White
        w4WhiteButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W4 White Button");
            wire4 = getResources().getStringArray(R.array.vanilla_wires_colors)[4];
            w4NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w4RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w4YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w4BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w4WhiteButton.setBackgroundResource(R.drawable.imagebutton_border);
            w4BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // Black
        w4BlackButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W4 Black Button");
            wire4 = getResources().getStringArray(R.array.vanilla_wires_colors)[5];
            w4NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w4RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w4YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w4BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w4WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w4BlackButton.setBackgroundResource(R.drawable.imagebutton_oborder);
        });
        // W5 Buttons
        w5NoneButton = view.findViewById(R.id.vanilla_wires_w5_none);
        w5RedButton = view.findViewById(R.id.vanilla_wires_w5_red);
        w5YellowButton = view.findViewById(R.id.vanilla_wires_w5_yellow);
        w5BlueButton = view.findViewById(R.id.vanilla_wires_w5_blue);
        w5WhiteButton = view.findViewById(R.id.vanilla_wires_w5_white);
        w5BlackButton = view.findViewById(R.id.vanilla_wires_w5_black);
        // None
        w5NoneButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W5 None Button");
            wire5 = getResources().getStringArray(R.array.vanilla_wires_colors)[0];
            w5NoneButton.setBackgroundResource(R.drawable.imagebutton_border);
            w5RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w5YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w5BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w5WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w5BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // Red
        w5RedButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W5 Red Button");
            wire5 = getResources().getStringArray(R.array.vanilla_wires_colors)[1];
            w5NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w5RedButton.setBackgroundResource(R.drawable.imagebutton_border);
            w5YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w5BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w5WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w5BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // Yellow
        w5YellowButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W5 Yellow Button");
            wire5 = getResources().getStringArray(R.array.vanilla_wires_colors)[2];
            w5NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w5RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w5YellowButton.setBackgroundResource(R.drawable.imagebutton_border);
            w5BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w5WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w5BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // Blue
        w5BlueButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W5 Blue Button");
            wire5 = getResources().getStringArray(R.array.vanilla_wires_colors)[3];
            w5NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w5RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w5YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w5BlueButton.setBackgroundResource(R.drawable.imagebutton_oborder);
            w5WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w5BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // White
        w5WhiteButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W5 White Button");
            wire5 = getResources().getStringArray(R.array.vanilla_wires_colors)[4];
            w5NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w5RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w5YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w5BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w5WhiteButton.setBackgroundResource(R.drawable.imagebutton_border);
            w5BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // Black
        w5BlackButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W5 Black Button");
            wire5 = getResources().getStringArray(R.array.vanilla_wires_colors)[5];
            w5NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w5RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w5YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w5BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w5WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w5BlackButton.setBackgroundResource(R.drawable.imagebutton_oborder);
        });
        // W6 Buttons
        w6NoneButton = view.findViewById(R.id.vanilla_wires_w6_none);
        w6RedButton = view.findViewById(R.id.vanilla_wires_w6_red);
        w6YellowButton = view.findViewById(R.id.vanilla_wires_w6_yellow);
        w6BlueButton = view.findViewById(R.id.vanilla_wires_w6_blue);
        w6WhiteButton = view.findViewById(R.id.vanilla_wires_w6_white);
        w6BlackButton = view.findViewById(R.id.vanilla_wires_w6_black);
        // None
        w6NoneButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W6 None Button");
            wire6 = getResources().getStringArray(R.array.vanilla_wires_colors)[0];
            w6NoneButton.setBackgroundResource(R.drawable.imagebutton_border);
            w6RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w6YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w6BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w6WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w6BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // Red
        w6RedButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W6 Red Button");
            wire6 = getResources().getStringArray(R.array.vanilla_wires_colors)[1];
            w6NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w6RedButton.setBackgroundResource(R.drawable.imagebutton_border);
            w6YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w6BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w6WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w6BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // Yellow
        w6YellowButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W6 Yellow Button");
            wire6 = getResources().getStringArray(R.array.vanilla_wires_colors)[2];
            w6NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w6RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w6YellowButton.setBackgroundResource(R.drawable.imagebutton_border);
            w6BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w6WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w6BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // Blue
        w6BlueButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W6 Blue Button");
            wire6 = getResources().getStringArray(R.array.vanilla_wires_colors)[3];
            w6NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w6RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w6YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w6BlueButton.setBackgroundResource(R.drawable.imagebutton_oborder);
            w6WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w6BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // White
        w6WhiteButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W6 White Button");
            wire6 = getResources().getStringArray(R.array.vanilla_wires_colors)[4];
            w6NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w6RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w6YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w6BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w6WhiteButton.setBackgroundResource(R.drawable.imagebutton_border);
            w6BlackButton.setBackgroundResource(R.drawable.imagebutton_noborder);
        });
        // Black
        w6BlackButton.setOnClickListener((View v) -> {
            log.printExclog("Click listened: W6 Black Button");
            wire6 = getResources().getStringArray(R.array.vanilla_wires_colors)[5];
            w6NoneButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w6RedButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w6YellowButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w6BlueButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w6WhiteButton.setBackgroundResource(R.drawable.imagebutton_noborder);
            w6BlackButton.setBackgroundResource(R.drawable.imagebutton_oborder);
        });
        // Default Buttons/Wires
        wire1 = getResources().getStringArray(R.array.vanilla_wires_colors)[0];
        wire2 = wire1;
        wire3 = wire2;
        wire4 = wire3;
        wire5 = wire4;
        wire6 = wire5;
        w1NoneButton.setBackgroundResource(R.drawable.imagebutton_border);
        w2NoneButton.setBackgroundResource(R.drawable.imagebutton_border);
        w3NoneButton.setBackgroundResource(R.drawable.imagebutton_border);
        w4NoneButton.setBackgroundResource(R.drawable.imagebutton_border);
        w5NoneButton.setBackgroundResource(R.drawable.imagebutton_border);
        w6NoneButton.setBackgroundResource(R.drawable.imagebutton_border);
        // Button
        View button = view.findViewById(R.id.vanilla_wires_okBtn);
        button.setOnClickListener((View v) -> {
            log.printExclog("Click listened: Button");
            long startTime = System.nanoTime();
            // Get selection
            log.print("Wire 1 - " + wire1);
            log.print("Wire 2 - " + wire2);
            log.print("Wire 3 - " + wire3);
            log.print("Wire 4 - " + wire4);
            log.print("Wire 5 - " + wire5);
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
        getActivity().setTitle(getResources().getString(R.string.menu_vanilla_wires));
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