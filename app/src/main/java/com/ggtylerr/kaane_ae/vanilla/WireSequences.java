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
import com.ggtylerr.kaane_ae.util.log;

public class WireSequences extends Fragment {
    private String cutMsg;
    private int red;
    private int blue;
    private int black;
    private int s2red;
    private int s2blue;
    private int s2black;
    private int s3red;
    private int s3blue;
    private int s3black;
    private int s4red;
    private int s4blue;
    private int s4black;
    private int wire1;
    private int wire2;
    private int wire3;
    private int wire4;
    private int wire5;
    private int wire6;
    private int wire7;
    private int wire8;
    private int wire9;
    private int wire10;
    private int wire11;
    private int wire12;
    private View w1none;
    private View w1red;
    private View w1blue;
    private View w1black;
    private View w2none;
    private View w2red;
    private View w2blue;
    private View w2black;
    private View w3none;
    private View w3red;
    private View w3blue;
    private View w3black;
    private View w4none;
    private View w4red;
    private View w4blue;
    private View w4black;
    private View w5none;
    private View w5red;
    private View w5blue;
    private View w5black;
    private View w6none;
    private View w6red;
    private View w6blue;
    private View w6black;
    private View w7none;
    private View w7red;
    private View w7blue;
    private View w7black;
    private View w8none;
    private View w8red;
    private View w8blue;
    private View w8black;
    private View w9none;
    private View w9red;
    private View w9blue;
    private View w9black;
    private View w10none;
    private View w10red;
    private View w10blue;
    private View w10black;
    private View w11none;
    private View w11red;
    private View w11blue;
    private View w11black;
    private View w12none;
    private View w12red;
    private View w12blue;
    private View w12black;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        log.print("Current screen: Wire Sequences");
        long startTime = System.nanoTime();
        View v = inflater.inflate(R.layout.fragment_vanilla_wire_sequences, container, false);
        int borderID = R.drawable.imagebutton_border;
        int oBorderID = R.drawable.imagebutton_oborder;
        int noBorderID = R.drawable.imagebutton_noborder;
        // W1 Buttons
        w1none = v.findViewById(R.id.vanilla_wire_sequences_w1_none);
        w1red = v.findViewById(R.id.vanilla_wire_sequences_w1_red);
        w1blue = v.findViewById(R.id.vanilla_wire_sequences_w1_blue);
        w1black = v.findViewById(R.id.vanilla_wire_sequences_w1_black);
        w1none.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W1 None Button");
            wire1 = 0;
            w1none.setBackgroundResource(borderID);
            w1red.setBackgroundResource(noBorderID);
            w1blue.setBackgroundResource(noBorderID);
            w1black.setBackgroundResource(noBorderID);
        });
        w1red.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W1 Red Button");
            wire1 = 1;
            w1none.setBackgroundResource(noBorderID);
            w1red.setBackgroundResource(borderID);
            w1blue.setBackgroundResource(noBorderID);
            w1black.setBackgroundResource(noBorderID);
        });
        w1blue.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W1 Blue Button");
            wire1 = 2;
            w1none.setBackgroundResource(noBorderID);
            w1red.setBackgroundResource(noBorderID);
            w1blue.setBackgroundResource(oBorderID);
            w1black.setBackgroundResource(noBorderID);
        });
        w1black.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W1 Black Button");
            wire1 = 3;
            w1none.setBackgroundResource(noBorderID);
            w1red.setBackgroundResource(noBorderID);
            w1blue.setBackgroundResource(noBorderID);
            w1black.setBackgroundResource(oBorderID);
        });
        // W2 Buttons
        w2none = v.findViewById(R.id.vanilla_wire_sequences_w2_none);
        w2red = v.findViewById(R.id.vanilla_wire_sequences_w2_red);
        w2blue = v.findViewById(R.id.vanilla_wire_sequences_w2_blue);
        w2black = v.findViewById(R.id.vanilla_wire_sequences_w2_black);
        w2none.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W2 None Button");
            wire2 = 0;
            w2none.setBackgroundResource(borderID);
            w2red.setBackgroundResource(noBorderID);
            w2blue.setBackgroundResource(noBorderID);
            w2black.setBackgroundResource(noBorderID);
        });
        w2red.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W2 Red Button");
            wire2 = 1;
            w2none.setBackgroundResource(noBorderID);
            w2red.setBackgroundResource(borderID);
            w2blue.setBackgroundResource(noBorderID);
            w2black.setBackgroundResource(noBorderID);
        });
        w2blue.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W2 Blue Button");
            wire2 = 2;
            w2none.setBackgroundResource(noBorderID);
            w2red.setBackgroundResource(noBorderID);
            w2blue.setBackgroundResource(oBorderID);
            w2black.setBackgroundResource(noBorderID);
        });
        w2black.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W2 Black Button");
            wire2 = 3;
            w2none.setBackgroundResource(noBorderID);
            w2red.setBackgroundResource(noBorderID);
            w2blue.setBackgroundResource(noBorderID);
            w2black.setBackgroundResource(oBorderID);
        });
        // W3 Buttons
        w3none = v.findViewById(R.id.vanilla_wire_sequences_w3_none);
        w3red = v.findViewById(R.id.vanilla_wire_sequences_w3_red);
        w3blue = v.findViewById(R.id.vanilla_wire_sequences_w3_blue);
        w3black = v.findViewById(R.id.vanilla_wire_sequences_w3_black);
        w3none.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W3 None Button");
            wire3 = 0;
            w3none.setBackgroundResource(borderID);
            w3red.setBackgroundResource(noBorderID);
            w3blue.setBackgroundResource(noBorderID);
            w3black.setBackgroundResource(noBorderID);
        });
        w3red.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W3 Red Button");
            wire3 = 1;
            w3none.setBackgroundResource(noBorderID);
            w3red.setBackgroundResource(borderID);
            w3blue.setBackgroundResource(noBorderID);
            w3black.setBackgroundResource(noBorderID);
        });
        w3blue.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W3 Blue Button");
            wire3 = 2;
            w3none.setBackgroundResource(noBorderID);
            w3red.setBackgroundResource(noBorderID);
            w3blue.setBackgroundResource(oBorderID);
            w3black.setBackgroundResource(noBorderID);
        });
        w3black.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W3 Black Button");
            wire3 = 3;
            w3none.setBackgroundResource(noBorderID);
            w3red.setBackgroundResource(noBorderID);
            w3blue.setBackgroundResource(noBorderID);
            w3black.setBackgroundResource(oBorderID);
        });
        // W4 Buttons
        w4none = v.findViewById(R.id.vanilla_wire_sequences_w4_none);
        w4red = v.findViewById(R.id.vanilla_wire_sequences_w4_red);
        w4blue = v.findViewById(R.id.vanilla_wire_sequences_w4_blue);
        w4black = v.findViewById(R.id.vanilla_wire_sequences_w4_black);
        w4none.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W4 None Button");
            wire4 = 0;
            w4none.setBackgroundResource(borderID);
            w4red.setBackgroundResource(noBorderID);
            w4blue.setBackgroundResource(noBorderID);
            w4black.setBackgroundResource(noBorderID);
        });
        w4red.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W4 Red Button");
            wire4 = 1;
            w4none.setBackgroundResource(noBorderID);
            w4red.setBackgroundResource(borderID);
            w4blue.setBackgroundResource(noBorderID);
            w4black.setBackgroundResource(noBorderID);
        });
        w4blue.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W4 Blue Button");
            wire4 = 2;
            w4none.setBackgroundResource(noBorderID);
            w4red.setBackgroundResource(noBorderID);
            w4blue.setBackgroundResource(oBorderID);
            w4black.setBackgroundResource(noBorderID);
        });
        w4black.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W4 Black Button");
            wire4 = 3;
            w4none.setBackgroundResource(noBorderID);
            w4red.setBackgroundResource(noBorderID);
            w4blue.setBackgroundResource(noBorderID);
            w4black.setBackgroundResource(oBorderID);
        });
        // W5 Buttons
        w5none = v.findViewById(R.id.vanilla_wire_sequences_w5_none);
        w5red = v.findViewById(R.id.vanilla_wire_sequences_w5_red);
        w5blue = v.findViewById(R.id.vanilla_wire_sequences_w5_blue);
        w5black = v.findViewById(R.id.vanilla_wire_sequences_w5_black);
        w5none.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W5 None Button");
            wire5 = 0;
            w5none.setBackgroundResource(borderID);
            w5red.setBackgroundResource(noBorderID);
            w5blue.setBackgroundResource(noBorderID);
            w5black.setBackgroundResource(noBorderID);
        });
        w5red.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W5 Red Button");
            wire5 = 1;
            w5none.setBackgroundResource(noBorderID);
            w5red.setBackgroundResource(borderID);
            w5blue.setBackgroundResource(noBorderID);
            w5black.setBackgroundResource(noBorderID);
        });
        w5blue.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W5 Blue Button");
            wire5 = 2;
            w5none.setBackgroundResource(noBorderID);
            w5red.setBackgroundResource(noBorderID);
            w5blue.setBackgroundResource(oBorderID);
            w5black.setBackgroundResource(noBorderID);
        });
        w5black.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W5 Black Button");
            wire5 = 3;
            w5none.setBackgroundResource(noBorderID);
            w5red.setBackgroundResource(noBorderID);
            w5blue.setBackgroundResource(noBorderID);
            w5black.setBackgroundResource(oBorderID);
        });
        // W6 Buttons
        w6none = v.findViewById(R.id.vanilla_wire_sequences_w6_none);
        w6red = v.findViewById(R.id.vanilla_wire_sequences_w6_red);
        w6blue = v.findViewById(R.id.vanilla_wire_sequences_w6_blue);
        w6black = v.findViewById(R.id.vanilla_wire_sequences_w6_black);
        w6none.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W6 None Button");
            wire6 = 0;
            w6none.setBackgroundResource(borderID);
            w6red.setBackgroundResource(noBorderID);
            w6blue.setBackgroundResource(noBorderID);
            w6black.setBackgroundResource(noBorderID);
        });
        w6red.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W6 Red Button");
            wire6 = 1;
            w6none.setBackgroundResource(noBorderID);
            w6red.setBackgroundResource(borderID);
            w6blue.setBackgroundResource(noBorderID);
            w6black.setBackgroundResource(noBorderID);
        });
        w6blue.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W6 Blue Button");
            wire6 = 2;
            w6none.setBackgroundResource(noBorderID);
            w6red.setBackgroundResource(noBorderID);
            w6blue.setBackgroundResource(oBorderID);
            w6black.setBackgroundResource(noBorderID);
        });
        w6black.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W6 Black Button");
            wire6 = 3;
            w6none.setBackgroundResource(noBorderID);
            w6red.setBackgroundResource(noBorderID);
            w6blue.setBackgroundResource(noBorderID);
            w6black.setBackgroundResource(oBorderID);
        });
        // W7 Buttons
        w7none = v.findViewById(R.id.vanilla_wire_sequences_w7_none);
        w7red = v.findViewById(R.id.vanilla_wire_sequences_w7_red);
        w7blue = v.findViewById(R.id.vanilla_wire_sequences_w7_blue);
        w7black = v.findViewById(R.id.vanilla_wire_sequences_w7_black);
        w7none.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W7 None Button");
            wire7 = 0;
            w7none.setBackgroundResource(borderID);
            w7red.setBackgroundResource(noBorderID);
            w7blue.setBackgroundResource(noBorderID);
            w7black.setBackgroundResource(noBorderID);
        });
        w7red.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W7 Red Button");
            wire7 = 1;
            w7none.setBackgroundResource(noBorderID);
            w7red.setBackgroundResource(borderID);
            w7blue.setBackgroundResource(noBorderID);
            w7black.setBackgroundResource(noBorderID);
        });
        w7blue.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W7 Blue Button");
            wire7 = 2;
            w7none.setBackgroundResource(noBorderID);
            w7red.setBackgroundResource(noBorderID);
            w7blue.setBackgroundResource(oBorderID);
            w7black.setBackgroundResource(noBorderID);
        });
        w7black.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W7 Black Button");
            wire7 = 3;
            w7none.setBackgroundResource(noBorderID);
            w7red.setBackgroundResource(noBorderID);
            w7blue.setBackgroundResource(noBorderID);
            w7black.setBackgroundResource(oBorderID);
        });
        // W8 Buttons
        w8none = v.findViewById(R.id.vanilla_wire_sequences_w8_none);
        w8red = v.findViewById(R.id.vanilla_wire_sequences_w8_red);
        w8blue = v.findViewById(R.id.vanilla_wire_sequences_w8_blue);
        w8black = v.findViewById(R.id.vanilla_wire_sequences_w8_black);
        w8none.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W8 None Button");
            wire8 = 0;
            w8none.setBackgroundResource(borderID);
            w8red.setBackgroundResource(noBorderID);
            w8blue.setBackgroundResource(noBorderID);
            w8black.setBackgroundResource(noBorderID);
        });
        w8red.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W8 Red Button");
            wire8 = 1;
            w8none.setBackgroundResource(noBorderID);
            w8red.setBackgroundResource(borderID);
            w8blue.setBackgroundResource(noBorderID);
            w8black.setBackgroundResource(noBorderID);
        });
        w8blue.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W8 Blue Button");
            wire8 = 2;
            w8none.setBackgroundResource(noBorderID);
            w8red.setBackgroundResource(noBorderID);
            w8blue.setBackgroundResource(oBorderID);
            w8black.setBackgroundResource(noBorderID);
        });
        w8black.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W8 Black Button");
            wire8 = 3;
            w8none.setBackgroundResource(noBorderID);
            w8red.setBackgroundResource(noBorderID);
            w8blue.setBackgroundResource(noBorderID);
            w8black.setBackgroundResource(oBorderID);
        });
        // W9 Buttons
        w9none = v.findViewById(R.id.vanilla_wire_sequences_w9_none);
        w9red = v.findViewById(R.id.vanilla_wire_sequences_w9_red);
        w9blue = v.findViewById(R.id.vanilla_wire_sequences_w9_blue);
        w9black = v.findViewById(R.id.vanilla_wire_sequences_w9_black);
        w9none.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W9 None Button");
            wire9 = 0;
            w9none.setBackgroundResource(borderID);
            w9red.setBackgroundResource(noBorderID);
            w9blue.setBackgroundResource(noBorderID);
            w9black.setBackgroundResource(noBorderID);
        });
        w9red.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W9 Red Button");
            wire9 = 1;
            w9none.setBackgroundResource(noBorderID);
            w9red.setBackgroundResource(borderID);
            w9blue.setBackgroundResource(noBorderID);
            w9black.setBackgroundResource(noBorderID);
        });
        w9blue.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W9 Blue Button");
            wire9 = 2;
            w9none.setBackgroundResource(noBorderID);
            w9red.setBackgroundResource(noBorderID);
            w9blue.setBackgroundResource(oBorderID);
            w9black.setBackgroundResource(noBorderID);
        });
        w9black.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W9 Black Button");
            wire9 = 3;
            w9none.setBackgroundResource(noBorderID);
            w9red.setBackgroundResource(noBorderID);
            w9blue.setBackgroundResource(noBorderID);
            w9black.setBackgroundResource(oBorderID);
        });
        // W10 Buttons
        w10none = v.findViewById(R.id.vanilla_wire_sequences_w10_none);
        w10red = v.findViewById(R.id.vanilla_wire_sequences_w10_red);
        w10blue = v.findViewById(R.id.vanilla_wire_sequences_w10_blue);
        w10black = v.findViewById(R.id.vanilla_wire_sequences_w10_black);
        w10none.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W10 None Button");
            wire10 = 0;
            w10none.setBackgroundResource(borderID);
            w10red.setBackgroundResource(noBorderID);
            w10blue.setBackgroundResource(noBorderID);
            w10black.setBackgroundResource(noBorderID);
        });
        w10red.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W10 Red Button");
            wire10 = 1;
            w10none.setBackgroundResource(noBorderID);
            w10red.setBackgroundResource(borderID);
            w10blue.setBackgroundResource(noBorderID);
            w10black.setBackgroundResource(noBorderID);
        });
        w10blue.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W10 Blue Button");
            wire10 = 2;
            w10none.setBackgroundResource(noBorderID);
            w10red.setBackgroundResource(noBorderID);
            w10blue.setBackgroundResource(oBorderID);
            w10black.setBackgroundResource(noBorderID);
        });
        w10black.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W10 Black Button");
            wire10 = 3;
            w10none.setBackgroundResource(noBorderID);
            w10red.setBackgroundResource(noBorderID);
            w10blue.setBackgroundResource(noBorderID);
            w10black.setBackgroundResource(oBorderID);
        });
        // W11 Buttons
        w11none = v.findViewById(R.id.vanilla_wire_sequences_w11_none);
        w11red = v.findViewById(R.id.vanilla_wire_sequences_w11_red);
        w11blue = v.findViewById(R.id.vanilla_wire_sequences_w11_blue);
        w11black = v.findViewById(R.id.vanilla_wire_sequences_w11_black);
        w11none.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W11 None Button");
            wire11 = 0;
            w11none.setBackgroundResource(borderID);
            w11red.setBackgroundResource(noBorderID);
            w11blue.setBackgroundResource(noBorderID);
            w11black.setBackgroundResource(noBorderID);
        });
        w11red.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W11 Red Button");
            wire11 = 1;
            w11none.setBackgroundResource(noBorderID);
            w11red.setBackgroundResource(borderID);
            w11blue.setBackgroundResource(noBorderID);
            w11black.setBackgroundResource(noBorderID);
        });
        w11blue.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W11 Blue Button");
            wire11 = 2;
            w11none.setBackgroundResource(noBorderID);
            w11red.setBackgroundResource(noBorderID);
            w11blue.setBackgroundResource(oBorderID);
            w11black.setBackgroundResource(noBorderID);
        });
        w11black.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W11 Black Button");
            wire11 = 3;
            w11none.setBackgroundResource(noBorderID);
            w11red.setBackgroundResource(noBorderID);
            w11blue.setBackgroundResource(noBorderID);
            w11black.setBackgroundResource(oBorderID);
        });
        // W12 Buttons
        w12none = v.findViewById(R.id.vanilla_wire_sequences_w12_none);
        w12red = v.findViewById(R.id.vanilla_wire_sequences_w12_red);
        w12blue = v.findViewById(R.id.vanilla_wire_sequences_w12_blue);
        w12black = v.findViewById(R.id.vanilla_wire_sequences_w12_black);
        w12none.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W12 None Button");
            wire12 = 0;
            w12none.setBackgroundResource(borderID);
            w12red.setBackgroundResource(noBorderID);
            w12blue.setBackgroundResource(noBorderID);
            w12black.setBackgroundResource(noBorderID);
        });
        w12red.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W12 Red Button");
            wire12 = 1;
            w12none.setBackgroundResource(noBorderID);
            w12red.setBackgroundResource(borderID);
            w12blue.setBackgroundResource(noBorderID);
            w12black.setBackgroundResource(noBorderID);
        });
        w12blue.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W12 Blue Button");
            wire12 = 2;
            w12none.setBackgroundResource(noBorderID);
            w12red.setBackgroundResource(noBorderID);
            w12blue.setBackgroundResource(oBorderID);
            w12black.setBackgroundResource(noBorderID);
        });
        w12black.setOnClickListener((View view) -> {
            log.printExclog("Click listened: W12 Black Button");
            wire12 = 3;
            w12none.setBackgroundResource(noBorderID);
            w12red.setBackgroundResource(noBorderID);
            w12blue.setBackgroundResource(noBorderID);
            w12black.setBackgroundResource(oBorderID);
        });
        // Default values
        cutMsg = getResources().getString(R.string.vanilla_wire_sequences_cut);
        red = 0;
        blue = 0;
        black = 0;
        s2red = 0;
        s2blue = 0;
        s2black = 0;
        s3red = 0;
        s3blue = 0;
        s3black = 0;
        s4red = 0;
        s4blue = 0;
        s4black = 0;
        wire1 = 0;
        wire2 = 0;
        wire3 = 0;
        wire4 = 0;
        wire5 = 0;
        wire6 = 0;
        wire7 = 0;
        wire8 = 0;
        wire9 = 0;
        wire10 = 0;
        wire11 = 0;
        wire12 = 0;
        w1none.setBackgroundResource(borderID);
        w2none.setBackgroundResource(borderID);
        w3none.setBackgroundResource(borderID);
        w4none.setBackgroundResource(borderID);
        w5none.setBackgroundResource(borderID);
        w6none.setBackgroundResource(borderID);
        w7none.setBackgroundResource(borderID);
        w8none.setBackgroundResource(borderID);
        w9none.setBackgroundResource(borderID);
        w10none.setBackgroundResource(borderID);
        w11none.setBackgroundResource(borderID);
        w12none.setBackgroundResource(borderID);
        v.findViewById(R.id.vanilla_wire_sequences_line2).setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_stage2).setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_stage2_ok).setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_stage2_reset).setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_line3).setVisibility(View.INVISIBLE);
        w4none.setVisibility(View.INVISIBLE);
        w4red.setVisibility(View.INVISIBLE);
        w4blue.setVisibility(View.INVISIBLE);
        w4black.setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_w4_spin).setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_w4).setVisibility(View.INVISIBLE);
        w5none.setVisibility(View.INVISIBLE);
        w5red.setVisibility(View.INVISIBLE);
        w5blue.setVisibility(View.INVISIBLE);
        w5black.setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_w5_spin).setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_w5).setVisibility(View.INVISIBLE);
        w6none.setVisibility(View.INVISIBLE);
        w6red.setVisibility(View.INVISIBLE);
        w6blue.setVisibility(View.INVISIBLE);
        w6black.setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_w6_spin).setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_w6).setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_line4).setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_stage3).setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_stage3_ok).setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_stage3_reset).setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_line5).setVisibility(View.INVISIBLE);
        w7none.setVisibility(View.INVISIBLE);
        w7red.setVisibility(View.INVISIBLE);
        w7blue.setVisibility(View.INVISIBLE);
        w7black.setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_w7_spin).setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_w7).setVisibility(View.INVISIBLE);
        w8none.setVisibility(View.INVISIBLE);
        w8red.setVisibility(View.INVISIBLE);
        w8blue.setVisibility(View.INVISIBLE);
        w8black.setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_w8_spin).setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_w8).setVisibility(View.INVISIBLE);
        w9none.setVisibility(View.INVISIBLE);
        w9red.setVisibility(View.INVISIBLE);
        w9blue.setVisibility(View.INVISIBLE);
        w9black.setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_w9_spin).setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_w9).setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_line6).setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_stage4).setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_stage4_ok).setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_stage4_reset).setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_line7).setVisibility(View.INVISIBLE);
        w10none.setVisibility(View.INVISIBLE);
        w10red.setVisibility(View.INVISIBLE);
        w10blue.setVisibility(View.INVISIBLE);
        w10black.setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_w10_spin).setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_w10).setVisibility(View.INVISIBLE);
        w11none.setVisibility(View.INVISIBLE);
        w11red.setVisibility(View.INVISIBLE);
        w11blue.setVisibility(View.INVISIBLE);
        w11black.setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_w11_spin).setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_w11).setVisibility(View.INVISIBLE);
        w12none.setVisibility(View.INVISIBLE);
        w12red.setVisibility(View.INVISIBLE);
        w12blue.setVisibility(View.INVISIBLE);
        w12black.setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_w12_spin).setVisibility(View.INVISIBLE);
        v.findViewById(R.id.vanilla_wire_sequences_w12).setVisibility(View.INVISIBLE);
        // Stage 1
        v.findViewById(R.id.vanilla_wire_sequences_stage1_ok).setOnClickListener((View view) -> {
            log.print("Click listened: Stage 1 Button");
            // Get color selection
            String w1color = (wire1 == 0) ? "None" : (wire1 == 1) ? "Red" : (wire1 == 2) ? "Blue" : "Black";
            String w2color = (wire2 == 0) ? "None" : (wire2 == 1) ? "Red" : (wire2 == 2) ? "Blue" : "Black";
            String w3color = (wire3 == 0) ? "None" : (wire3 == 1) ? "Red" : (wire3 == 2) ? "Blue" : "Black";
            log.print("W1: " + w1color);
            log.print("W2: " + w2color);
            log.print("W3: " + w3color);
            // Get letter selection
            Spinner w1spin = v.findViewById(R.id.vanilla_wire_sequences_w1_spin);
            Spinner w2spin = v.findViewById(R.id.vanilla_wire_sequences_w2_spin);
            Spinner w3spin = v.findViewById(R.id.vanilla_wire_sequences_w3_spin);
            int w1LetterPos = w1spin.getSelectedItemPosition();
            log.printExclog("W1 Letter Position: " + w1LetterPos);
            int w2LetterPos = w2spin.getSelectedItemPosition();
            log.printExclog("W2 Letter Position: " + w2LetterPos);
            int w3LetterPos = w3spin.getSelectedItemPosition();
            log.printExclog("W3 Letter Position: " + w3LetterPos);
            String[] letterArr = getResources().getStringArray(R.array.vanilla_wire_sequences_letter);
            char w1Letter = letterArr[w1LetterPos].toCharArray()[0];
            log.print("W1 Letter: " + w1Letter);
            char w2Letter = letterArr[w2LetterPos].toCharArray()[0];
            log.print("W2 Letter: " + w2Letter);
            char w3Letter = letterArr[w3LetterPos].toCharArray()[0];
            log.print("W3 Letter: " + w3Letter);
            // TextViews
            TextView w1out = v.findViewById(R.id.vanilla_wire_sequences_w1);
            TextView w2out = v.findViewById(R.id.vanilla_wire_sequences_w2);
            TextView w3out = v.findViewById(R.id.vanilla_wire_sequences_w3);
            // Wire 1
            switch (w1color) {
                case "Red":
                    red++;
                    int logic = redLogic(red,w1Letter);
                    if (logic == 1) {
                        log.print("W1: Cut");
                        w1out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W1: Don't cut");
                        w1out.setText("");
                    }
                    break;
                case "Blue":
                    blue++;
                    logic = blueLogic(blue,w1Letter);
                    if (logic == 1) {
                        log.print("W1: Cut");
                        w1out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W1: Don't cut");
                        w1out.setText("");
                    }
                    break;
                case "Black":
                    black++;
                    logic = blackLogic(black,w1Letter);
                    if (logic == 1) {
                        log.print("W1: Cut");
                        w1out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W1: Don't cut");
                        w1out.setText("");
                    }
                    break;
            }
            switch (w2color) {
                case "Red":
                    red++;
                    int logic = redLogic(red,w2Letter);
                    if (logic == 1) {
                        log.print("W2: Cut");
                        w2out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W2: Don't cut");
                        w2out.setText("");
                    }
                    break;
                case "Blue":
                    blue++;
                    logic = blueLogic(blue,w2Letter);
                    if (logic == 1) {
                        log.print("W2: Cut");
                        w2out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W2: Don't cut");
                        w2out.setText("");
                    }
                    break;
                case "Black":
                    black++;
                    logic = blackLogic(black,w2Letter);
                    if (logic == 1) {
                        log.print("W2: Cut");
                        w2out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W2: Don't cut");
                        w2out.setText("");
                    }
                    break;
            }
            switch (w3color) {
                case "Red":
                    red++;
                    int logic = redLogic(red,w3Letter);
                    if (logic == 1) {
                        log.print("W3: Cut");
                        w3out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W3: Don't cut");
                        w3out.setText("");
                    }
                    break;
                case "Blue":
                    blue++;
                    logic = blueLogic(blue,w3Letter);
                    if (logic == 1) {
                        log.print("W3: Cut");
                        w3out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W3: Don't cut");
                        w3out.setText("");
                    }
                    break;
                case "Black":
                    black++;
                    logic = blackLogic(black,w3Letter);
                    if (logic == 1) {
                        log.print("W3: Cut");
                        w3out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W3: Don't cut");
                        w3out.setText("");
                    }
                    break;
            }
            // Print occurrences
            log.print("Red occurrences: " + red);
            log.print("Blue occurrences: " + blue);
            log.print("Black occurrences: " + black);
            // Make stage 2 visible
            v.findViewById(R.id.vanilla_wire_sequences_line2).setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage2).setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage2_ok).setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage2_reset).setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_line3).setVisibility(View.VISIBLE);
            w4none.setVisibility(View.VISIBLE);
            w4red.setVisibility(View.VISIBLE);
            w4blue.setVisibility(View.VISIBLE);
            w4black.setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w4_spin).setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w4).setVisibility(View.VISIBLE);
            w5none.setVisibility(View.VISIBLE);
            w5red.setVisibility(View.VISIBLE);
            w5blue.setVisibility(View.VISIBLE);
            w5black.setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w5_spin).setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w5).setVisibility(View.VISIBLE);
            w6none.setVisibility(View.VISIBLE);
            w6red.setVisibility(View.VISIBLE);
            w6blue.setVisibility(View.VISIBLE);
            w6black.setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w6_spin).setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w6).setVisibility(View.VISIBLE);
            // Make stage 3 and 4 invisible
            v.findViewById(R.id.vanilla_wire_sequences_line4).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage3).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage3_ok).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage3_reset).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_line5).setVisibility(View.INVISIBLE);
            w7none.setVisibility(View.INVISIBLE);
            w7red.setVisibility(View.INVISIBLE);
            w7blue.setVisibility(View.INVISIBLE);
            w7black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w7_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w7).setVisibility(View.INVISIBLE);
            w8none.setVisibility(View.INVISIBLE);
            w8red.setVisibility(View.INVISIBLE);
            w8blue.setVisibility(View.INVISIBLE);
            w8black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w8_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w8).setVisibility(View.INVISIBLE);
            w9none.setVisibility(View.INVISIBLE);
            w9red.setVisibility(View.INVISIBLE);
            w9blue.setVisibility(View.INVISIBLE);
            w9black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w9_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w9).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_line6).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage4).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage4_ok).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage4_reset).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_line7).setVisibility(View.INVISIBLE);
            w10none.setVisibility(View.INVISIBLE);
            w10red.setVisibility(View.INVISIBLE);
            w10blue.setVisibility(View.INVISIBLE);
            w10black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w10_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w10).setVisibility(View.INVISIBLE);
            w11none.setVisibility(View.INVISIBLE);
            w11red.setVisibility(View.INVISIBLE);
            w11blue.setVisibility(View.INVISIBLE);
            w11black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w11_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w11).setVisibility(View.INVISIBLE);
            w12none.setVisibility(View.INVISIBLE);
            w12red.setVisibility(View.INVISIBLE);
            w12blue.setVisibility(View.INVISIBLE);
            w12black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w12_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w12).setVisibility(View.INVISIBLE);
        });
        // Stage 2
        v.findViewById(R.id.vanilla_wire_sequences_stage2_ok).setOnClickListener((View view) -> {
            log.print("Click listened: Stage 2 Button");
            // Get color selection
            String w4color = (wire4 == 0) ? "None" : (wire4 == 1) ? "Red" : (wire4 == 2) ? "Blue" : "Black";
            String w5color = (wire5 == 0) ? "None" : (wire5 == 1) ? "Red" : (wire5 == 2) ? "Blue" : "Black";
            String w6color = (wire6 == 0) ? "None" : (wire6 == 1) ? "Red" : (wire6 == 2) ? "Blue" : "Black";
            log.print("W4: " + w4color);
            log.print("W5: " + w5color);
            log.print("W6: " + w6color);
            // Get letter selection
            Spinner w4spin = v.findViewById(R.id.vanilla_wire_sequences_w4_spin);
            Spinner w5spin = v.findViewById(R.id.vanilla_wire_sequences_w5_spin);
            Spinner w6spin = v.findViewById(R.id.vanilla_wire_sequences_w6_spin);
            int w4LetterPos = w4spin.getSelectedItemPosition();
            log.printExclog("W4 Letter Position: " + w4LetterPos);
            int w5LetterPos = w5spin.getSelectedItemPosition();
            log.printExclog("W5 Letter Position: " + w5LetterPos);
            int w6LetterPos = w6spin.getSelectedItemPosition();
            log.printExclog("W6 Letter Position: " + w6LetterPos);
            String[] letterArr = getResources().getStringArray(R.array.vanilla_wire_sequences_letter);
            char w4Letter = letterArr[w4LetterPos].toCharArray()[0];
            log.print("W4 Letter: " + w4Letter);
            char w5Letter = letterArr[w5LetterPos].toCharArray()[0];
            log.print("W5 Letter: " + w5Letter);
            char w6Letter = letterArr[w6LetterPos].toCharArray()[0];
            log.print("W6 Letter: " + w6Letter);
            // TextViews
            TextView w4out = v.findViewById(R.id.vanilla_wire_sequences_w4);
            TextView w5out = v.findViewById(R.id.vanilla_wire_sequences_w5);
            TextView w6out = v.findViewById(R.id.vanilla_wire_sequences_w6);
            // Stage 2 values
            s2red = red;
            log.printExclog("Previous stage red occurrences: " + s2red);
            s2blue = blue;
            log.printExclog("Previous stage blue occurrences: " + s2blue);
            s2black = black;
            log.printExclog("Previous stage black occurrences: " + s2black);
            // Wire 4
            switch (w4color) {
                case "Red":
                    red++;
                    int logic = redLogic(red,w4Letter);
                    if (logic == 1) {
                        log.print("W4: Cut");
                        w4out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W4: Don't cut");
                        w4out.setText("");
                    }
                    break;
                case "Blue":
                    blue++;
                    logic = blueLogic(blue,w4Letter);
                    if (logic == 1) {
                        log.print("W4: Cut");
                        w4out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W4: Don't cut");
                        w4out.setText("");
                    }
                    break;
                case "Black":
                    black++;
                    logic = blackLogic(black,w4Letter);
                    if (logic == 1) {
                        log.print("W4: Cut");
                        w4out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W4: Don't cut");
                        w4out.setText("");
                    }
                    break;
            }
            switch (w5color) {
                case "Red":
                    red++;
                    int logic = redLogic(red,w5Letter);
                    if (logic == 1) {
                        log.print("W5: Cut");
                        w5out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W5: Don't cut");
                        w5out.setText("");
                    }
                    break;
                case "Blue":
                    blue++;
                    logic = blueLogic(blue,w5Letter);
                    if (logic == 1) {
                        log.print("W5: Cut");
                        w5out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W5: Don't cut");
                        w5out.setText("");
                    }
                    break;
                case "Black":
                    black++;
                    logic = blackLogic(black,w5Letter);
                    if (logic == 1) {
                        log.print("W5: Cut");
                        w5out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W5: Don't cut");
                        w5out.setText("");
                    }
                    break;
            }
            switch (w6color) {
                case "Red":
                    red++;
                    int logic = redLogic(red,w6Letter);
                    if (logic == 1) {
                        log.print("W6: Cut");
                        w6out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W6: Don't cut");
                        w6out.setText("");
                    }
                    break;
                case "Blue":
                    blue++;
                    logic = blueLogic(blue,w6Letter);
                    if (logic == 1) {
                        log.print("W6: Cut");
                        w6out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W6: Don't cut");
                        w6out.setText("");
                    }
                    break;
                case "Black":
                    black++;
                    logic = blackLogic(black,w6Letter);
                    if (logic == 1) {
                        log.print("W6: Cut");
                        w6out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W6: Don't cut");
                        w6out.setText("");
                    }
                    break;
            }
            // Print occurrences
            log.print("Red occurrences: " + red);
            log.print("Blue occurrences: " + blue);
            log.print("Black occurrences: " + black);
            // Make stage 3 visible
            v.findViewById(R.id.vanilla_wire_sequences_line4).setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage3).setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage3_ok).setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage3_reset).setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_line5).setVisibility(View.VISIBLE);
            w7none.setVisibility(View.VISIBLE);
            w7red.setVisibility(View.VISIBLE);
            w7blue.setVisibility(View.VISIBLE);
            w7black.setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w7_spin).setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w7).setVisibility(View.VISIBLE);
            w8none.setVisibility(View.VISIBLE);
            w8red.setVisibility(View.VISIBLE);
            w8blue.setVisibility(View.VISIBLE);
            w8black.setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w8_spin).setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w8).setVisibility(View.VISIBLE);
            w9none.setVisibility(View.VISIBLE);
            w9red.setVisibility(View.VISIBLE);
            w9blue.setVisibility(View.VISIBLE);
            w9black.setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w9_spin).setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w9).setVisibility(View.VISIBLE);
            // Make stage 4 invisible
            v.findViewById(R.id.vanilla_wire_sequences_line6).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage4).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage4_ok).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage4_reset).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_line7).setVisibility(View.INVISIBLE);
            w10none.setVisibility(View.INVISIBLE);
            w10red.setVisibility(View.INVISIBLE);
            w10blue.setVisibility(View.INVISIBLE);
            w10black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w10_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w10).setVisibility(View.INVISIBLE);
            w11none.setVisibility(View.INVISIBLE);
            w11red.setVisibility(View.INVISIBLE);
            w11blue.setVisibility(View.INVISIBLE);
            w11black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w11_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w11).setVisibility(View.INVISIBLE);
            w12none.setVisibility(View.INVISIBLE);
            w12red.setVisibility(View.INVISIBLE);
            w12blue.setVisibility(View.INVISIBLE);
            w12black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w12_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w12).setVisibility(View.INVISIBLE);
        });
        // Stage 3
        v.findViewById(R.id.vanilla_wire_sequences_stage3_ok).setOnClickListener((View view) -> {
            log.print("Click listened: Stage 3 Button");
            // Get color selection
            String w7color = (wire7 == 0) ? "None" : (wire7 == 1) ? "Red" : (wire7 == 2) ? "Blue" : "Black";
            String w8color = (wire8 == 0) ? "None" : (wire8 == 1) ? "Red" : (wire8 == 2) ? "Blue" : "Black";
            String w9color = (wire9 == 0) ? "None" : (wire9 == 1) ? "Red" : (wire9 == 2) ? "Blue" : "Black";
            log.print("W7: " + w7color);
            log.print("W8: " + w8color);
            log.print("W9: " + w9color);
            // Get letter selection
            Spinner w7spin = v.findViewById(R.id.vanilla_wire_sequences_w7_spin);
            Spinner w8spin = v.findViewById(R.id.vanilla_wire_sequences_w8_spin);
            Spinner w9spin = v.findViewById(R.id.vanilla_wire_sequences_w9_spin);
            int w7LetterPos = w7spin.getSelectedItemPosition();
            log.printExclog("W7 Letter Position: " + w7LetterPos);
            int w8LetterPos = w8spin.getSelectedItemPosition();
            log.printExclog("W8 Letter Position: " + w8LetterPos);
            int w9LetterPos = w9spin.getSelectedItemPosition();
            log.printExclog("W9 Letter Position: " + w9LetterPos);
            String[] letterArr = getResources().getStringArray(R.array.vanilla_wire_sequences_letter);
            char w7Letter = letterArr[w7LetterPos].toCharArray()[0];
            log.print("W7 Letter: " + w7Letter);
            char w8Letter = letterArr[w8LetterPos].toCharArray()[0];
            log.print("W8 Letter: " + w8Letter);
            char w9Letter = letterArr[w9LetterPos].toCharArray()[0];
            log.print("W9 Letter: " + w9Letter);
            // TextViews
            TextView w7out = v.findViewById(R.id.vanilla_wire_sequences_w7);
            TextView w8out = v.findViewById(R.id.vanilla_wire_sequences_w8);
            TextView w9out = v.findViewById(R.id.vanilla_wire_sequences_w9);
            // Stage 3 values
            s3red = red;
            log.printExclog("Previous stage red occurrences: " + s3red);
            s3blue = blue;
            log.printExclog("Previous stage blue occurrences: " + s3blue);
            s3black = black;
            log.printExclog("Previous stage black occurrences: " + s3black);
            // Wire 7
            switch (w7color) {
                case "Red":
                    red++;
                    int logic = redLogic(red,w7Letter);
                    if (logic == 1) {
                        log.print("W7: Cut");
                        w7out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W7: Don't cut");
                        w7out.setText("");
                    }
                    break;
                case "Blue":
                    blue++;
                    logic = blueLogic(blue,w7Letter);
                    if (logic == 1) {
                        log.print("W7: Cut");
                        w7out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W7: Don't cut");
                        w7out.setText("");
                    }
                    break;
                case "Black":
                    black++;
                    logic = blackLogic(black,w7Letter);
                    if (logic == 1) {
                        log.print("W7: Cut");
                        w7out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W7: Don't cut");
                        w7out.setText("");
                    }
                    break;
            }
            switch (w8color) {
                case "Red":
                    red++;
                    int logic = redLogic(red,w8Letter);
                    if (logic == 1) {
                        log.print("W8: Cut");
                        w8out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W8: Don't cut");
                        w8out.setText("");
                    }
                    break;
                case "Blue":
                    blue++;
                    logic = blueLogic(blue,w8Letter);
                    if (logic == 1) {
                        log.print("W8: Cut");
                        w8out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W8: Don't cut");
                        w8out.setText("");
                    }
                    break;
                case "Black":
                    black++;
                    logic = blackLogic(black,w8Letter);
                    if (logic == 1) {
                        log.print("W8: Cut");
                        w8out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W8: Don't cut");
                        w8out.setText("");
                    }
                    break;
            }
            switch (w9color) {
                case "Red":
                    red++;
                    int logic = redLogic(red,w9Letter);
                    if (logic == 1) {
                        log.print("W9: Cut");
                        w9out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W9: Don't cut");
                        w9out.setText("");
                    }
                    break;
                case "Blue":
                    blue++;
                    logic = blueLogic(blue,w9Letter);
                    if (logic == 1) {
                        log.print("W9: Cut");
                        w9out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W9: Don't cut");
                        w9out.setText("");
                    }
                    break;
                case "Black":
                    black++;
                    logic = blackLogic(black,w9Letter);
                    if (logic == 1) {
                        log.print("W9: Cut");
                        w9out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W9: Don't cut");
                        w9out.setText("");
                    }
                    break;
            }
            // Print occurrences
            log.print("Red occurrences: " + red);
            log.print("Blue occurrences: " + blue);
            log.print("Black occurrences: " + black);
            // Make stage 4 visible
            v.findViewById(R.id.vanilla_wire_sequences_line6).setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage4).setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage4_ok).setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage4_reset).setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_line7).setVisibility(View.VISIBLE);
            w10none.setVisibility(View.VISIBLE);
            w10red.setVisibility(View.VISIBLE);
            w10blue.setVisibility(View.VISIBLE);
            w10black.setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w10_spin).setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w10).setVisibility(View.VISIBLE);
            w11none.setVisibility(View.VISIBLE);
            w11red.setVisibility(View.VISIBLE);
            w11blue.setVisibility(View.VISIBLE);
            w11black.setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w11_spin).setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w11).setVisibility(View.VISIBLE);
            w12none.setVisibility(View.VISIBLE);
            w12red.setVisibility(View.VISIBLE);
            w12blue.setVisibility(View.VISIBLE);
            w12black.setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w12_spin).setVisibility(View.VISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w12).setVisibility(View.VISIBLE);
        });
        // Stage 4
        v.findViewById(R.id.vanilla_wire_sequences_stage4_ok).setOnClickListener((View view) -> {
            log.print("Click listened: Stage 4 Button");
            // Get color selection
            String w10color = (wire10 == 0) ? "None" : (wire10 == 1) ? "Red" : (wire10 == 2) ? "Blue" : "Black";
            String w11color = (wire11 == 0) ? "None" : (wire11 == 1) ? "Red" : (wire11 == 2) ? "Blue" : "Black";
            String w12color = (wire12 == 0) ? "None" : (wire12 == 1) ? "Red" : (wire12 == 2) ? "Blue" : "Black";
            log.print("W10: " + w10color);
            log.print("W11: " + w11color);
            log.print("W12: " + w12color);
            // Get letter selection
            Spinner w10spin = v.findViewById(R.id.vanilla_wire_sequences_w10_spin);
            Spinner w11spin = v.findViewById(R.id.vanilla_wire_sequences_w11_spin);
            Spinner w12spin = v.findViewById(R.id.vanilla_wire_sequences_w12_spin);
            int w10LetterPos = w10spin.getSelectedItemPosition();
            log.printExclog("W10 Letter Position: " + w10LetterPos);
            int w11LetterPos = w11spin.getSelectedItemPosition();
            log.printExclog("W11 Letter Position: " + w11LetterPos);
            int w12LetterPos = w12spin.getSelectedItemPosition();
            log.printExclog("W12 Letter Position: " + w12LetterPos);
            String[] letterArr = getResources().getStringArray(R.array.vanilla_wire_sequences_letter);
            char w10Letter = letterArr[w10LetterPos].toCharArray()[0];
            log.print("W10 Letter: " + w10Letter);
            char w11Letter = letterArr[w11LetterPos].toCharArray()[0];
            log.print("W11 Letter: " + w11Letter);
            char w12Letter = letterArr[w12LetterPos].toCharArray()[0];
            log.print("W12 Letter: " + w12Letter);
            // TextViews
            TextView w10out = v.findViewById(R.id.vanilla_wire_sequences_w10);
            TextView w11out = v.findViewById(R.id.vanilla_wire_sequences_w11);
            TextView w12out = v.findViewById(R.id.vanilla_wire_sequences_w12);
            // Stage 4 values
            s4red = red;
            log.printExclog("Previous stage red occurrences: " + s4red);
            s4blue = blue;
            log.printExclog("Previous stage blue occurrences: " + s4blue);
            s4black = black;
            log.printExclog("Previous stage black occurrences: " + s4black);
            // Wire 10
            switch (w10color) {
                case "Red":
                    red++;
                    int logic = redLogic(red,w10Letter);
                    if (logic == 1) {
                        log.print("W10: Cut");
                        w10out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W10: Don't cut");
                        w10out.setText("");
                    }
                    break;
                case "Blue":
                    blue++;
                    logic = blueLogic(blue,w10Letter);
                    if (logic == 1) {
                        log.print("W10: Cut");
                        w10out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W10: Don't cut");
                        w10out.setText("");
                    }
                    break;
                case "Black":
                    black++;
                    logic = blackLogic(black,w10Letter);
                    if (logic == 1) {
                        log.print("W10: Cut");
                        w10out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W10: Don't cut");
                        w10out.setText("");
                    }
                    break;
            }
            switch (w11color) {
                case "Red":
                    red++;
                    int logic = redLogic(red,w11Letter);
                    if (logic == 1) {
                        log.print("W11: Cut");
                        w11out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W11: Don't cut");
                        w11out.setText("");
                    }
                    break;
                case "Blue":
                    blue++;
                    logic = blueLogic(blue,w11Letter);
                    if (logic == 1) {
                        log.print("W11: Cut");
                        w11out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W11: Don't cut");
                        w11out.setText("");
                    }
                    break;
                case "Black":
                    black++;
                    logic = blackLogic(black,w11Letter);
                    if (logic == 1) {
                        log.print("W11: Cut");
                        w11out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W11: Don't cut");
                        w11out.setText("");
                    }
                    break;
            }
            switch (w12color) {
                case "Red":
                    red++;
                    int logic = redLogic(red,w12Letter);
                    if (logic == 1) {
                        log.print("W12: Cut");
                        w12out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W12: Don't cut");
                        w12out.setText("");
                    }
                    break;
                case "Blue":
                    blue++;
                    logic = blueLogic(blue,w12Letter);
                    if (logic == 1) {
                        log.print("W12: Cut");
                        w12out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W12: Don't cut");
                        w12out.setText("");
                    }
                    break;
                case "Black":
                    black++;
                    logic = blackLogic(black,w12Letter);
                    if (logic == 1) {
                        log.print("W12: Cut");
                        w12out.setText(R.string.vanilla_wire_sequences_cut);
                    }
                    else {
                        log.print("W12: Don't cut");
                        w12out.setText("");
                    }
                    break;
            }
            // Print occurrences
            log.print("Red occurrences: " + red);
            log.print("Blue occurrences: " + blue);
            log.print("Black occurrences: " + black);
        });
        // Reset buttons
        v.findViewById(R.id.vanilla_wire_sequences_stage1_reset).setOnClickListener((View view) -> {
            log.print("Click listened: Stage 1 Reset");
            // Set visibility
            v.findViewById(R.id.vanilla_wire_sequences_line2).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage2).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage2_ok).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage2_reset).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_line3).setVisibility(View.INVISIBLE);
            w4none.setVisibility(View.INVISIBLE);
            w4red.setVisibility(View.INVISIBLE);
            w4blue.setVisibility(View.INVISIBLE);
            w4black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w4_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w4).setVisibility(View.INVISIBLE);
            w5none.setVisibility(View.INVISIBLE);
            w5red.setVisibility(View.INVISIBLE);
            w5blue.setVisibility(View.INVISIBLE);
            w5black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w5_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w5).setVisibility(View.INVISIBLE);
            w6none.setVisibility(View.INVISIBLE);
            w6red.setVisibility(View.INVISIBLE);
            w6blue.setVisibility(View.INVISIBLE);
            w6black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w6_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w6).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_line4).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage3).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage3_ok).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage3_reset).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_line5).setVisibility(View.INVISIBLE);
            w7none.setVisibility(View.INVISIBLE);
            w7red.setVisibility(View.INVISIBLE);
            w7blue.setVisibility(View.INVISIBLE);
            w7black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w7_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w7).setVisibility(View.INVISIBLE);
            w8none.setVisibility(View.INVISIBLE);
            w8red.setVisibility(View.INVISIBLE);
            w8blue.setVisibility(View.INVISIBLE);
            w8black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w8_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w8).setVisibility(View.INVISIBLE);
            w9none.setVisibility(View.INVISIBLE);
            w9red.setVisibility(View.INVISIBLE);
            w9blue.setVisibility(View.INVISIBLE);
            w9black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w9_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w9).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_line6).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage4).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage4_ok).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage4_reset).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_line7).setVisibility(View.INVISIBLE);
            w10none.setVisibility(View.INVISIBLE);
            w10red.setVisibility(View.INVISIBLE);
            w10blue.setVisibility(View.INVISIBLE);
            w10black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w10_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w10).setVisibility(View.INVISIBLE);
            w11none.setVisibility(View.INVISIBLE);
            w11red.setVisibility(View.INVISIBLE);
            w11blue.setVisibility(View.INVISIBLE);
            w11black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w11_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w11).setVisibility(View.INVISIBLE);
            w12none.setVisibility(View.INVISIBLE);
            w12red.setVisibility(View.INVISIBLE);
            w12blue.setVisibility(View.INVISIBLE);
            w12black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w12_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w12).setVisibility(View.INVISIBLE);
            // Set text
            TextView w1 = v.findViewById(R.id.vanilla_wire_sequences_w1);
            w1.setText(R.string.vanilla_wire_sequences_w1);
            TextView w2 = v.findViewById(R.id.vanilla_wire_sequences_w2);
            w2.setText(R.string.vanilla_wire_sequences_w2);
            TextView w3 = v.findViewById(R.id.vanilla_wire_sequences_w3);
            w3.setText(R.string.vanilla_wire_sequences_w3);
            TextView w4 = v.findViewById(R.id.vanilla_wire_sequences_w4);
            w4.setText(R.string.vanilla_wire_sequences_w4);
            TextView w5 = v.findViewById(R.id.vanilla_wire_sequences_w5);
            w5.setText(R.string.vanilla_wire_sequences_w5);
            TextView w6 = v.findViewById(R.id.vanilla_wire_sequences_w6);
            w6.setText(R.string.vanilla_wire_sequences_w6);
            TextView w7 = v.findViewById(R.id.vanilla_wire_sequences_w7);
            w7.setText(R.string.vanilla_wire_sequences_w7);
            TextView w8 = v.findViewById(R.id.vanilla_wire_sequences_w8);
            w8.setText(R.string.vanilla_wire_sequences_w8);
            TextView w9 = v.findViewById(R.id.vanilla_wire_sequences_w9);
            w9.setText(R.string.vanilla_wire_sequences_w9);
            TextView w10 = v.findViewById(R.id.vanilla_wire_sequences_w10);
            w10.setText(R.string.vanilla_wire_sequences_w10);
            TextView w11 = v.findViewById(R.id.vanilla_wire_sequences_w11);
            w11.setText(R.string.vanilla_wire_sequences_w11);
            TextView w12 = v.findViewById(R.id.vanilla_wire_sequences_w12);
            w12.setText(R.string.vanilla_wire_sequences_w12);
            // Set selections
            Spinner w1spin = v.findViewById(R.id.vanilla_wire_sequences_w1_spin);
            w1spin.setSelection(0);
            w1none.setBackgroundResource(borderID);
            w1red.setBackgroundResource(noBorderID);
            w1blue.setBackgroundResource(noBorderID);
            w1black.setBackgroundResource(noBorderID);
            Spinner w2spin = v.findViewById(R.id.vanilla_wire_sequences_w2_spin);
            w2spin.setSelection(0);
            w2none.setBackgroundResource(borderID);
            w2red.setBackgroundResource(noBorderID);
            w2blue.setBackgroundResource(noBorderID);
            w2black.setBackgroundResource(noBorderID);
            Spinner w3spin = v.findViewById(R.id.vanilla_wire_sequences_w3_spin);
            w3spin.setSelection(0);
            w3none.setBackgroundResource(borderID);
            w3red.setBackgroundResource(noBorderID);
            w3blue.setBackgroundResource(noBorderID);
            w3black.setBackgroundResource(noBorderID);
            Spinner w4spin = v.findViewById(R.id.vanilla_wire_sequences_w4_spin);
            w4spin.setSelection(0);
            w4none.setBackgroundResource(borderID);
            w4red.setBackgroundResource(noBorderID);
            w4blue.setBackgroundResource(noBorderID);
            w4black.setBackgroundResource(noBorderID);
            Spinner w5spin = v.findViewById(R.id.vanilla_wire_sequences_w5_spin);
            w5spin.setSelection(0);
            w5none.setBackgroundResource(borderID);
            w5red.setBackgroundResource(noBorderID);
            w5blue.setBackgroundResource(noBorderID);
            w5black.setBackgroundResource(noBorderID);
            Spinner w6spin = v.findViewById(R.id.vanilla_wire_sequences_w6_spin);
            w6spin.setSelection(0);
            w6none.setBackgroundResource(borderID);
            w6red.setBackgroundResource(noBorderID);
            w6blue.setBackgroundResource(noBorderID);
            w6black.setBackgroundResource(noBorderID);
            Spinner w7spin = v.findViewById(R.id.vanilla_wire_sequences_w7_spin);
            w7spin.setSelection(0);
            w7none.setBackgroundResource(borderID);
            w7red.setBackgroundResource(noBorderID);
            w7blue.setBackgroundResource(noBorderID);
            w7black.setBackgroundResource(noBorderID);
            Spinner w8spin = v.findViewById(R.id.vanilla_wire_sequences_w8_spin);
            w8spin.setSelection(0);
            w8none.setBackgroundResource(borderID);
            w8red.setBackgroundResource(noBorderID);
            w8blue.setBackgroundResource(noBorderID);
            w8black.setBackgroundResource(noBorderID);
            Spinner w9spin = v.findViewById(R.id.vanilla_wire_sequences_w9_spin);
            w9spin.setSelection(0);
            w9none.setBackgroundResource(borderID);
            w9red.setBackgroundResource(noBorderID);
            w9blue.setBackgroundResource(noBorderID);
            w9black.setBackgroundResource(noBorderID);
            Spinner w10spin = v.findViewById(R.id.vanilla_wire_sequences_w10_spin);
            w10spin.setSelection(0);
            w10none.setBackgroundResource(borderID);
            w10red.setBackgroundResource(noBorderID);
            w10blue.setBackgroundResource(noBorderID);
            w10black.setBackgroundResource(noBorderID);
            Spinner w11spin = v.findViewById(R.id.vanilla_wire_sequences_w11_spin);
            w11spin.setSelection(0);
            w11none.setBackgroundResource(borderID);
            w11red.setBackgroundResource(noBorderID);
            w11blue.setBackgroundResource(noBorderID);
            w11black.setBackgroundResource(noBorderID);
            Spinner w12spin = v.findViewById(R.id.vanilla_wire_sequences_w12_spin);
            w12spin.setSelection(0);
            w12none.setBackgroundResource(borderID);
            w12red.setBackgroundResource(noBorderID);
            w12blue.setBackgroundResource(noBorderID);
            w12black.setBackgroundResource(noBorderID);
            // Set variables
            red = 0;
            blue = 0;
            black = 0;
            s2red = 0;
            s2blue = 0;
            s2black = 0;
            s3red = 0;
            s3blue = 0;
            s3black = 0;
            s4red = 0;
            s4blue = 0;
            s4black = 0;
            wire1 = 0;
            wire2 = 0;
            wire3 = 0;
            wire4 = 0;
            wire5 = 0;
            wire6 = 0;
            wire7 = 0;
            wire8 = 0;
            wire9 = 0;
            wire10 = 0;
            wire11 = 0;
            wire12 = 0;
        });
        v.findViewById(R.id.vanilla_wire_sequences_stage2_reset).setOnClickListener((View view) -> {
            log.print("Click listened: Stage 2 Reset");
            // Set visibility
            v.findViewById(R.id.vanilla_wire_sequences_line4).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage3).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage3_ok).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage3_reset).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_line5).setVisibility(View.INVISIBLE);
            w7none.setVisibility(View.INVISIBLE);
            w7red.setVisibility(View.INVISIBLE);
            w7blue.setVisibility(View.INVISIBLE);
            w7black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w7_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w7).setVisibility(View.INVISIBLE);
            w8none.setVisibility(View.INVISIBLE);
            w8red.setVisibility(View.INVISIBLE);
            w8blue.setVisibility(View.INVISIBLE);
            w8black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w8_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w8).setVisibility(View.INVISIBLE);
            w9none.setVisibility(View.INVISIBLE);
            w9red.setVisibility(View.INVISIBLE);
            w9blue.setVisibility(View.INVISIBLE);
            w9black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w9_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w9).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_line6).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage4).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage4_ok).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage4_reset).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_line7).setVisibility(View.INVISIBLE);
            w10none.setVisibility(View.INVISIBLE);
            w10red.setVisibility(View.INVISIBLE);
            w10blue.setVisibility(View.INVISIBLE);
            w10black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w10_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w10).setVisibility(View.INVISIBLE);
            w11none.setVisibility(View.INVISIBLE);
            w11red.setVisibility(View.INVISIBLE);
            w11blue.setVisibility(View.INVISIBLE);
            w11black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w11_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w11).setVisibility(View.INVISIBLE);
            w12none.setVisibility(View.INVISIBLE);
            w12red.setVisibility(View.INVISIBLE);
            w12blue.setVisibility(View.INVISIBLE);
            w12black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w12_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w12).setVisibility(View.INVISIBLE);
            // Set text
            Spinner w4spin = v.findViewById(R.id.vanilla_wire_sequences_w4_spin);
            w4spin.setSelection(0);
            w4none.setBackgroundResource(borderID);
            w4red.setBackgroundResource(noBorderID);
            w4blue.setBackgroundResource(noBorderID);
            w4black.setBackgroundResource(noBorderID);
            Spinner w5spin = v.findViewById(R.id.vanilla_wire_sequences_w5_spin);
            w5spin.setSelection(0);
            w5none.setBackgroundResource(borderID);
            w5red.setBackgroundResource(noBorderID);
            w5blue.setBackgroundResource(noBorderID);
            w5black.setBackgroundResource(noBorderID);
            Spinner w6spin = v.findViewById(R.id.vanilla_wire_sequences_w6_spin);
            w6spin.setSelection(0);
            w6none.setBackgroundResource(borderID);
            w6red.setBackgroundResource(noBorderID);
            w6blue.setBackgroundResource(noBorderID);
            w6black.setBackgroundResource(noBorderID);
            TextView w7 = v.findViewById(R.id.vanilla_wire_sequences_w7);
            w7.setText(R.string.vanilla_wire_sequences_w7);
            TextView w8 = v.findViewById(R.id.vanilla_wire_sequences_w8);
            w8.setText(R.string.vanilla_wire_sequences_w8);
            TextView w9 = v.findViewById(R.id.vanilla_wire_sequences_w9);
            w9.setText(R.string.vanilla_wire_sequences_w9);
            TextView w10 = v.findViewById(R.id.vanilla_wire_sequences_w10);
            w10.setText(R.string.vanilla_wire_sequences_w10);
            TextView w11 = v.findViewById(R.id.vanilla_wire_sequences_w11);
            w11.setText(R.string.vanilla_wire_sequences_w11);
            TextView w12 = v.findViewById(R.id.vanilla_wire_sequences_w12);
            w12.setText(R.string.vanilla_wire_sequences_w12);
            // Set selections
            Spinner w4spin = v.findViewById(R.id.vanilla_wire_sequences_w4_spin);
            w4spin.setSelection(0);
            w4none.setBackgroundResource(borderID);
            w4red.setBackgroundResource(noBorderID);
            w4blue.setBackgroundResource(noBorderID);
            w4black.setBackgroundResource(noBorderID);
            Spinner w5spin = v.findViewById(R.id.vanilla_wire_sequences_w5_spin);
            w5spin.setSelection(0);
            w5none.setBackgroundResource(borderID);
            w5red.setBackgroundResource(noBorderID);
            w5blue.setBackgroundResource(noBorderID);
            w5black.setBackgroundResource(noBorderID);
            Spinner w6spin = v.findViewById(R.id.vanilla_wire_sequences_w6_spin);
            w6spin.setSelection(0);
            w6none.setBackgroundResource(borderID);
            w6red.setBackgroundResource(noBorderID);
            w6blue.setBackgroundResource(noBorderID);
            w6black.setBackgroundResource(noBorderID);
            Spinner w7spin = v.findViewById(R.id.vanilla_wire_sequences_w7_spin);
            w7spin.setSelection(0);
            w7none.setBackgroundResource(borderID);
            w7red.setBackgroundResource(noBorderID);
            w7blue.setBackgroundResource(noBorderID);
            w7black.setBackgroundResource(noBorderID);
            Spinner w8spin = v.findViewById(R.id.vanilla_wire_sequences_w8_spin);
            w8spin.setSelection(0);
            w8none.setBackgroundResource(borderID);
            w8red.setBackgroundResource(noBorderID);
            w8blue.setBackgroundResource(noBorderID);
            w8black.setBackgroundResource(noBorderID);
            Spinner w9spin = v.findViewById(R.id.vanilla_wire_sequences_w9_spin);
            w9spin.setSelection(0);
            w9none.setBackgroundResource(borderID);
            w9red.setBackgroundResource(noBorderID);
            w9blue.setBackgroundResource(noBorderID);
            w9black.setBackgroundResource(noBorderID);
            Spinner w10spin = v.findViewById(R.id.vanilla_wire_sequences_w10_spin);
            w10spin.setSelection(0);
            w10none.setBackgroundResource(borderID);
            w10red.setBackgroundResource(noBorderID);
            w10blue.setBackgroundResource(noBorderID);
            w10black.setBackgroundResource(noBorderID);
            Spinner w11spin = v.findViewById(R.id.vanilla_wire_sequences_w11_spin);
            w11spin.setSelection(0);
            w11none.setBackgroundResource(borderID);
            w11red.setBackgroundResource(noBorderID);
            w11blue.setBackgroundResource(noBorderID);
            w11black.setBackgroundResource(noBorderID);
            Spinner w12spin = v.findViewById(R.id.vanilla_wire_sequences_w12_spin);
            w12spin.setSelection(0);
            w12none.setBackgroundResource(borderID);
            w12red.setBackgroundResource(noBorderID);
            w12blue.setBackgroundResource(noBorderID);
            w12black.setBackgroundResource(noBorderID);
            // Set variables
            red = s2red;
            blue = s2blue;
            black = s2black;
            s3red = 0;
            s3blue = 0;
            s3black = 0;
            wire4 = 0;
            wire5 = 0;
            wire6 = 0;
            wire7 = 0;
            wire8 = 0;
            wire9 = 0;
            wire10 = 0;
            wire11 = 0;
            wire12 = 0;
        });
        v.findViewById(R.id.vanilla_wire_sequences_stage3_reset).setOnClickListener((View view) -> {
            log.print("Click listened: Stage 3 Reset");
            // Set visibility
            v.findViewById(R.id.vanilla_wire_sequences_line6).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage4).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage4_ok).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_stage4_reset).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_line7).setVisibility(View.INVISIBLE);
            w10none.setVisibility(View.INVISIBLE);
            w10red.setVisibility(View.INVISIBLE);
            w10blue.setVisibility(View.INVISIBLE);
            w10black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w10_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w10).setVisibility(View.INVISIBLE);
            w11none.setVisibility(View.INVISIBLE);
            w11red.setVisibility(View.INVISIBLE);
            w11blue.setVisibility(View.INVISIBLE);
            w11black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w11_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w11).setVisibility(View.INVISIBLE);
            w12none.setVisibility(View.INVISIBLE);
            w12red.setVisibility(View.INVISIBLE);
            w12blue.setVisibility(View.INVISIBLE);
            w12black.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w12_spin).setVisibility(View.INVISIBLE);
            v.findViewById(R.id.vanilla_wire_sequences_w12).setVisibility(View.INVISIBLE);
            // Set text
            TextView w7 = v.findViewById(R.id.vanilla_wire_sequences_w7);
            w7.setText(R.string.vanilla_wire_sequences_w7);
            TextView w8 = v.findViewById(R.id.vanilla_wire_sequences_w8);
            w8.setText(R.string.vanilla_wire_sequences_w8);
            TextView w9 = v.findViewById(R.id.vanilla_wire_sequences_w9);
            w9.setText(R.string.vanilla_wire_sequences_w9);
            TextView w10 = v.findViewById(R.id.vanilla_wire_sequences_w10);
            w10.setText(R.string.vanilla_wire_sequences_w10);
            TextView w11 = v.findViewById(R.id.vanilla_wire_sequences_w11);
            w11.setText(R.string.vanilla_wire_sequences_w11);
            TextView w12 = v.findViewById(R.id.vanilla_wire_sequences_w12);
            w12.setText(R.string.vanilla_wire_sequences_w12);
            // Set selections
            Spinner w7spin = v.findViewById(R.id.vanilla_wire_sequences_w7_spin);
            w7spin.setSelection(0);
            w7none.setBackgroundResource(borderID);
            w7red.setBackgroundResource(noBorderID);
            w7blue.setBackgroundResource(noBorderID);
            w7black.setBackgroundResource(noBorderID);
            Spinner w8spin = v.findViewById(R.id.vanilla_wire_sequences_w8_spin);
            w8spin.setSelection(0);
            w8none.setBackgroundResource(borderID);
            w8red.setBackgroundResource(noBorderID);
            w8blue.setBackgroundResource(noBorderID);
            w8black.setBackgroundResource(noBorderID);
            Spinner w9spin = v.findViewById(R.id.vanilla_wire_sequences_w9_spin);
            w9spin.setSelection(0);
            w9none.setBackgroundResource(borderID);
            w9red.setBackgroundResource(noBorderID);
            w9blue.setBackgroundResource(noBorderID);
            w9black.setBackgroundResource(noBorderID);
            Spinner w10spin = v.findViewById(R.id.vanilla_wire_sequences_w10_spin);
            w10spin.setSelection(0);
            w10none.setBackgroundResource(borderID);
            w10red.setBackgroundResource(noBorderID);
            w10blue.setBackgroundResource(noBorderID);
            w10black.setBackgroundResource(noBorderID);
            Spinner w11spin = v.findViewById(R.id.vanilla_wire_sequences_w11_spin);
            w11spin.setSelection(0);
            w11none.setBackgroundResource(borderID);
            w11red.setBackgroundResource(noBorderID);
            w11blue.setBackgroundResource(noBorderID);
            w11black.setBackgroundResource(noBorderID);
            Spinner w12spin = v.findViewById(R.id.vanilla_wire_sequences_w12_spin);
            w12spin.setSelection(0);
            w12none.setBackgroundResource(borderID);
            w12red.setBackgroundResource(noBorderID);
            w12blue.setBackgroundResource(noBorderID);
            w12black.setBackgroundResource(noBorderID);
            // Set variables
            red = s3red;
            blue = s3blue;
            black = s3black;
            wire7 = 0;
            wire8 = 0;
            wire9 = 0;
            wire10 = 0;
            wire11 = 0;
            wire12 = 0;
        });
        v.findViewById(R.id.vanilla_wire_sequences_stage4_reset).setOnClickListener((View view) -> {
            log.print("Click listened: Stage 4 Reset");
            // Set text
            TextView w10 = v.findViewById(R.id.vanilla_wire_sequences_w10);
            w10.setText(R.string.vanilla_wire_sequences_w10);
            TextView w11 = v.findViewById(R.id.vanilla_wire_sequences_w11);
            w11.setText(R.string.vanilla_wire_sequences_w11);
            TextView w12 = v.findViewById(R.id.vanilla_wire_sequences_w12);
            w12.setText(R.string.vanilla_wire_sequences_w12);
            // Set selections
            Spinner w10spin = v.findViewById(R.id.vanilla_wire_sequences_w10_spin);
            w10spin.setSelection(0);
            w10none.setBackgroundResource(borderID);
            w10red.setBackgroundResource(noBorderID);
            w10blue.setBackgroundResource(noBorderID);
            w10black.setBackgroundResource(noBorderID);
            Spinner w11spin = v.findViewById(R.id.vanilla_wire_sequences_w11_spin);
            w11spin.setSelection(0);
            w11none.setBackgroundResource(borderID);
            w11red.setBackgroundResource(noBorderID);
            w11blue.setBackgroundResource(noBorderID);
            w11black.setBackgroundResource(noBorderID);
            Spinner w12spin = v.findViewById(R.id.vanilla_wire_sequences_w12_spin);
            w12spin.setSelection(0);
            w12none.setBackgroundResource(borderID);
            w12red.setBackgroundResource(noBorderID);
            w12blue.setBackgroundResource(noBorderID);
            w12black.setBackgroundResource(noBorderID);
            // Set variables
            red = s4red;
            blue = s4blue;
            black = s4black;
            wire10 = 0;
            wire11 = 0;
            wire12 = 0;
        });
        long endTime = System.nanoTime();
        long calcTime = endTime - startTime;
        log.print("Done loading screen. Took " + (calcTime / 1000000) + " ms.");
        log.printExclog("startTime - " + startTime);
        log.printExclog("endTime - " + endTime);
        log.printExclog("Exact calculated time - " + calcTime);
        return v;
    }

    private int redLogic(int occurrence, char letter) {
        int out = 0;
        switch (occurrence) {
            case 1: if (letter == 'C') out = 1; break;
            case 2:
            case 5:
            case 9: if (letter == 'B') out = 1; break;
            case 3: if (letter == 'A') out = 1; break;
            case 4:
            case 6: if (letter == 'A' || letter == 'C') out = 1; break;
            case 7: out = 1; break;
            default: if (letter == 'A' || letter == 'B') out = 1; break;
        }
        return out;
    }

    private int blueLogic(int occurrence, char letter) {
        int out = 0;
        switch (occurrence) {
            case 1:
            case 3:
            case 5: if (letter == 'B') out = 1; break;
            case 2: 
            case 8: if (letter == 'A' || letter == 'C') out = 1; break;
            case 4:
            case 9: if (letter == 'A') out = 1; break;
            case 6: if (letter == 'B' || letter == 'C') out = 1; break;
            case 7: if (letter == 'C') out = 1; break;
        }
        return out;
    }
    
    private int blackLogic(int occurrence, char letter) {
        int out = 0;
        switch (occurrence) {
            case 1: out = 1; break;
            case 2:
            case 4: if (letter == 'A' || letter == 'C') out = 1; break;
            case 3:
            case 5: if (letter == 'B') out = 1; break;
            case 6: if (letter == 'B' || letter == 'C') out = 1; break;
            case 7: if (letter == 'A' || letter == 'B') out = 1; break;
            case 8:
            case 9: if (letter == 'C') out = 1; break;
        }
        return out;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Wire Sequences");
    }
}
