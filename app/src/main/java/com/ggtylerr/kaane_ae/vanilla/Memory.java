package com.ggtylerr.kaane_ae.vanilla;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ggtylerr.kaane_ae.R;
import com.ggtylerr.kaane_ae.util.log;

public class Memory extends Fragment {
    private int stage1pos;
    private int stage2pos;
    private int stage1label;
    private int stage2label;
    private int stage3label;
    private boolean stage3islabel;
    private int stage4pos;
    private int stage4label;
    private Spinner stage1BtnSpin;
    private Spinner stage2DisplaySpin;
    private Spinner stage2BtnSpin;
    private Spinner stage3DisplaySpin;
    private Spinner stage3BtnSpin;
    private Spinner stage4DisplaySpin;
    private Spinner stage4BtnSpin;
    private Spinner stage5DisplaySpin;
    private int VISIBLE = View.VISIBLE;
    private int INVISIBLE = View.INVISIBLE;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        long startTime = System.nanoTime();
        log.print("Current Screen: Memory");
        View v = inflater.inflate(R.layout.fragment_vanilla_memory, container, false);
        // Set default visibility
        stage1BtnSpin = v.findViewById(R.id.vanilla_memory_stage1_btn_spin);
        stage1BtnSpin.setVisibility(INVISIBLE);
        TextView stage1BtnText = v.findViewById(R.id.vanilla_memory_stage1_btn_text);
        stage1BtnText.setVisibility(INVISIBLE);
        View stage1Next = v.findViewById(R.id.vanilla_memory_stage1_next);
        stage1Next.setVisibility(INVISIBLE);
        View stage1Line = v.findViewById(R.id.vanilla_memory_line2);
        stage1Line.setVisibility(INVISIBLE);
        TextView stage2 = v.findViewById(R.id.vanilla_memory_stage2);
        stage2.setVisibility(INVISIBLE);
        View stage2Reset = v.findViewById(R.id.vanilla_memory_stage2_reset);
        stage2Reset.setVisibility(INVISIBLE);
        View stage2Line1 = v.findViewById(R.id.vanilla_memory_line3);
        stage2Line1.setVisibility(INVISIBLE);
        stage2DisplaySpin = v.findViewById(R.id.vanilla_memory_stage2_display_spin);
        stage2DisplaySpin.setVisibility(INVISIBLE);
        TextView stage2DisplayText = v.findViewById(R.id.vanilla_memory_stage2_text);
        stage2DisplayText.setVisibility(INVISIBLE);
        View stage2DisplayBtn = v.findViewById(R.id.vanilla_memory_stage2_display_btn);
        stage2DisplayBtn.setVisibility(INVISIBLE);
        stage2BtnSpin = v.findViewById(R.id.vanilla_memory_stage2_btn_spin);
        stage2BtnSpin.setVisibility(INVISIBLE);
        TextView stage2BtnText = v.findViewById(R.id.vanilla_memory_stage2_btn_text);
        stage2BtnText.setVisibility(INVISIBLE);
        View stage2Next = v.findViewById(R.id.vanilla_memory_stage2_next);
        stage2Next.setVisibility(INVISIBLE);
        View stage2Line2 = v.findViewById(R.id.vanilla_memory_line4);
        stage2Line2.setVisibility(INVISIBLE);
        TextView stage3 = v.findViewById(R.id.vanilla_memory_stage3);
        stage3.setVisibility(INVISIBLE);
        View stage3Reset = v.findViewById(R.id.vanilla_memory_stage3_reset);
        stage3Reset.setVisibility(INVISIBLE);
        View stage3Line1 = v.findViewById(R.id.vanilla_memory_line5);
        stage3Line1.setVisibility(INVISIBLE);
        stage3DisplaySpin = v.findViewById(R.id.vanilla_memory_stage3_display_spin);
        stage3DisplaySpin.setVisibility(INVISIBLE);
        TextView stage3DisplayText = v.findViewById(R.id.vanilla_memory_stage3_text);
        stage3DisplayText.setVisibility(INVISIBLE);
        View stage3DisplayBtn = v.findViewById(R.id.vanilla_memory_stage3_display_btn);
        stage3DisplayBtn.setVisibility(INVISIBLE);
        stage3BtnSpin = v.findViewById(R.id.vanilla_memory_stage3_btn_spin);
        stage3BtnSpin.setVisibility(INVISIBLE);
        TextView stage3BtnText = v.findViewById(R.id.vanilla_memory_stage3_btn_text);
        stage3BtnText.setVisibility(INVISIBLE);
        View stage3Next = v.findViewById(R.id.vanilla_memory_stage3_next);
        stage3Next.setVisibility(INVISIBLE);
        View stage3Line2 = v.findViewById(R.id.vanilla_memory_line6);
        stage3Line2.setVisibility(INVISIBLE);
        TextView stage4 = v.findViewById(R.id.vanilla_memory_stage4);
        stage4.setVisibility(INVISIBLE);
        View stage4Reset = v.findViewById(R.id.vanilla_memory_stage4_reset);
        stage4Reset.setVisibility(INVISIBLE);
        View stage4Line1 = v.findViewById(R.id.vanilla_memory_line7);
        stage4Line1.setVisibility(INVISIBLE);
        stage4DisplaySpin = v.findViewById(R.id.vanilla_memory_stage4_display_spin);
        stage4DisplaySpin.setVisibility(INVISIBLE);
        TextView stage4DisplayText = v.findViewById(R.id.vanilla_memory_stage4_text);
        stage4DisplayText.setVisibility(INVISIBLE);
        View stage4DisplayBtn = v.findViewById(R.id.vanilla_memory_stage4_display_btn);
        stage4DisplayBtn.setVisibility(INVISIBLE);
        stage4BtnSpin = v.findViewById(R.id.vanilla_memory_stage4_btn_spin);
        stage4BtnSpin.setVisibility(INVISIBLE);
        TextView stage4BtnText = v.findViewById(R.id.vanilla_memory_stage4_btn_text);
        stage4BtnText.setVisibility(INVISIBLE);
        View stage4Next = v.findViewById(R.id.vanilla_memory_stage4_next);
        stage4Next.setVisibility(INVISIBLE);
        View stage4Line2 = v.findViewById(R.id.vanilla_memory_line8);
        stage4Line2.setVisibility(INVISIBLE);
        TextView stage5 = v.findViewById(R.id.vanilla_memory_stage5);
        stage5.setVisibility(INVISIBLE);
        View stage5Line = v.findViewById(R.id.vanilla_memory_line9);
        stage5Line.setVisibility(INVISIBLE);
        stage5DisplaySpin = v.findViewById(R.id.vanilla_memory_stage5_display_spin);
        stage5DisplaySpin.setVisibility(INVISIBLE);
        TextView stage5DisplayText = v.findViewById(R.id.vanilla_memory_stage5_text);
        stage5DisplayText.setVisibility(INVISIBLE);
        View stage5DisplayBtn = v.findViewById(R.id.vanilla_memory_stage5_display_btn);
        stage5DisplayBtn.setVisibility(INVISIBLE);
        // Define other views
        TextView stage1out = v.findViewById(R.id.vanilla_memory_stage1_out);
        TextView stage2out = v.findViewById(R.id.vanilla_memory_stage2_out);
        TextView stage3out = v.findViewById(R.id.vanilla_memory_stage3_out);
        TextView stage4out = v.findViewById(R.id.vanilla_memory_stage4_out);
        TextView stage5out = v.findViewById(R.id.vanilla_memory_stage5_out);
        // Stage 1 display btn
        View stage1DisplayBtn = v.findViewById(R.id.vanilla_memory_stage1_display_btn);
        stage1DisplayBtn.setOnClickListener((View view) -> {
            log.printExclog("Click listened: Stage 1 Display Btn");
            // Get spinner choice
            Spinner stage1DisplaySpin = v.findViewById(R.id.vanilla_memory_stage1_display_spin);
            int displayIndex = stage1DisplaySpin.getSelectedItemPosition();
            log.print("Stage 1 Display: " + (displayIndex + 1));
            // Logic
            String[] logic = logic(1,displayIndex);
            log.printExclog("Logic Array: " + logic);
            log.printExclog("Logic Array [index 0]: " + logic[0]);
            log.printExclog("Logic Array [index 1]: " + logic[1]);
            // Set text
            log.print("Stage 1 Btn Text: Position " + logic[1]);
            stage1BtnText.setText(getResources().getString(R.string.vanilla_memory_position,parse(logic[1])));
            // Set vars
            stage1pos = Integer.parseInt(logic[1]);
            // Set enabled
            stage1DisplaySpin.setEnabled(false);
            stage1DisplayBtn.setEnabled(false);
            // Set visibility
            stage1BtnSpin.setVisibility(VISIBLE);
            stage1BtnText.setVisibility(VISIBLE);
            stage1Next.setVisibility(VISIBLE);
        });
        // Stage 1 next btn
        stage1Next.setOnClickListener((View view) -> {
            log.printExclog("Click listened: Stage 1 Next Btn");
            // Get spinner choice
            stage1BtnSpin = v.findViewById(R.id.vanilla_memory_stage1_btn_spin);
            int label = stage1BtnSpin.getSelectedItemPosition() + 1;
            // Set text
            log.print("Stage 1: Press Position " + stage1pos + " / Label " + label);
            stage1out.setText(getResources().getString(R.string.vanilla_memory_out,parse(stage1pos),parse(label)));
            // Set vars
            stage1label = label;
            log.print("Stage 1 Label: " + label);
            // Set enabled
            stage1BtnSpin.setEnabled(false);
            stage1Next.setEnabled(false);
            // Set visibility
            stage1Line.setVisibility(VISIBLE);
            stage2.setVisibility(VISIBLE);
            stage2Reset.setVisibility(VISIBLE);
            stage2Line1.setVisibility(VISIBLE);
            stage2DisplaySpin.setVisibility(VISIBLE);
            stage2DisplayText.setVisibility(VISIBLE);
            stage2DisplayBtn.setVisibility(VISIBLE);
        });
        // Stage 1 reset btn
        View stage1Reset = v.findViewById(R.id.vanilla_memory_stage1_reset);
        stage1Reset.setOnClickListener((View view) -> {
            log.printExclog("Click listened: Stage 1 Reset Btn");
            // Set enabled
            Spinner stage1DisplaySpin = v.findViewById(R.id.vanilla_memory_stage1_display_spin);
            stage1DisplaySpin.setEnabled(true);
            stage1DisplayBtn.setEnabled(true);
            stage1BtnSpin.setEnabled(true);
            stage1Next.setEnabled(true);
            stage2DisplaySpin.setEnabled(true);
            stage2DisplayBtn.setEnabled(true);
            stage2BtnSpin.setEnabled(true);
            stage2Next.setEnabled(true);
            stage3DisplaySpin.setEnabled(true);
            stage3DisplayBtn.setEnabled(true);
            stage3BtnSpin.setEnabled(true);
            stage3Next.setEnabled(true);
            stage4DisplaySpin.setEnabled(true);
            stage4DisplayBtn.setEnabled(true);
            stage4BtnSpin.setEnabled(true);
            stage4Next.setEnabled(true);
            stage5DisplaySpin.setEnabled(true);
            stage5DisplayBtn.setEnabled(true);
            // Set visibility
            stage1BtnSpin.setVisibility(INVISIBLE);
            stage1Next.setVisibility(INVISIBLE);
            stage1Line.setVisibility(INVISIBLE);
            stage2.setVisibility(INVISIBLE);
            stage2Reset.setVisibility(INVISIBLE);
            stage2Line1.setVisibility(INVISIBLE);
            stage2DisplaySpin.setVisibility(INVISIBLE);
            stage2DisplayText.setVisibility(INVISIBLE);
            stage2DisplayBtn.setVisibility(INVISIBLE);
            stage2BtnSpin.setVisibility(INVISIBLE);
            stage2BtnText.setVisibility(INVISIBLE);
            stage2Next.setVisibility(INVISIBLE);
            stage2Line2.setVisibility(INVISIBLE);
            stage3.setVisibility(INVISIBLE);
            stage3Reset.setVisibility(INVISIBLE);
            stage3Line1.setVisibility(INVISIBLE);
            stage3DisplaySpin.setVisibility(INVISIBLE);
            stage3DisplayText.setVisibility(INVISIBLE);
            stage3DisplayBtn.setVisibility(INVISIBLE);
            stage3BtnSpin.setVisibility(INVISIBLE);
            stage3BtnText.setVisibility(INVISIBLE);
            stage3Next.setVisibility(INVISIBLE);
            stage3Line2.setVisibility(INVISIBLE);
            stage4.setVisibility(INVISIBLE);
            stage4Reset.setVisibility(INVISIBLE);
            stage4Line1.setVisibility(INVISIBLE);
            stage4DisplaySpin.setVisibility(INVISIBLE);
            stage4DisplayText.setVisibility(INVISIBLE);
            stage4DisplayBtn.setVisibility(INVISIBLE);
            stage4BtnSpin.setVisibility(INVISIBLE);
            stage4BtnText.setVisibility(INVISIBLE);
            stage4Next.setVisibility(INVISIBLE);
            stage4Line2.setVisibility(INVISIBLE);
            stage5.setVisibility(INVISIBLE);
            stage5Line.setVisibility(INVISIBLE);
            stage5DisplaySpin.setVisibility(INVISIBLE);
            stage5DisplayText.setVisibility(INVISIBLE);
            stage5DisplayBtn.setVisibility(INVISIBLE);
            // Set text
            stage1out.setText("");
            stage1BtnText.setText("");
            stage2out.setText("");
            stage2BtnText.setText("");
            stage3out.setText("");
            stage3BtnText.setText("");
            stage4out.setText("");
            stage4BtnText.setText("");
            stage5out.setText("");
            // Set selected
            stage1DisplaySpin.setSelection(0);
            stage1BtnSpin.setSelection(0);
            stage2DisplaySpin.setSelection(0);
            stage2BtnSpin.setSelection(0);
            stage3DisplaySpin.setSelection(0);
            stage3BtnSpin.setSelection(0);
            stage4DisplaySpin.setSelection(0);
            stage4BtnSpin.setSelection(0);
            stage5DisplaySpin.setSelection(0);
        });
        // Stage 2 display btn
        stage2DisplayBtn.setOnClickListener((View view) -> {
            log.printExclog("Click listened: Stage 2 Display Btn");
            // Get spinner choice
            stage2DisplaySpin = v.findViewById(R.id.vanilla_memory_stage2_display_spin);
            int displayIndex = stage2DisplaySpin.getSelectedItemPosition();
            log.print("Stage 2 Display: " + (displayIndex + 1));
            // Logic
            String[] logic = logic(2,displayIndex);
            log.printExclog("Logic Array: " + logic);
            log.printExclog("Logic Array [index 0]: " + logic[0]);
            log.printExclog("Logic Array [index 1]: " + logic[1]);
            // Set vars
            stage2pos = (logic[1].equals("s1")) ? stage1pos : Integer.parseInt(logic[1]);
            // Set text
            log.print("Stage 2 Btn Text: Position " + stage2pos);
            stage2BtnText.setText(getResources().getString(R.string.vanilla_memory_position,parse(stage2pos)));
            // Set enabled
            stage2DisplaySpin.setEnabled(false);
            stage2DisplayBtn.setEnabled(false);
            // Set visibility
            stage2BtnSpin.setVisibility(VISIBLE);
            stage2BtnText.setVisibility(VISIBLE);
            stage2Next.setVisibility(VISIBLE);
        });
        // Stage 2 next btn
        stage2Next.setOnClickListener((View view) -> {
            log.printExclog("Click listened: Stage 2 Next Btn");
            // Get spinner choice
            stage2BtnSpin = v.findViewById(R.id.vanilla_memory_stage2_btn_spin);
            int label = stage2BtnSpin.getSelectedItemPosition() + 1;
            // Set text
            log.print("Stage 2: Press Position " + stage2pos + " / Label " + label);
            stage2out.setText(getResources().getString(R.string.vanilla_memory_out,parse(stage2pos),parse(label)));
            // Set vars
            stage2label = label;
            log.print("Stage 2 Label: " + label);
            // Set enabled
            stage2BtnSpin.setEnabled(false);
            stage2Next.setEnabled(false);
            // Set visibility
            stage2Line2.setVisibility(VISIBLE);
            stage3.setVisibility(VISIBLE);
            stage3Reset.setVisibility(VISIBLE);
            stage3Line1.setVisibility(VISIBLE);
            stage3DisplaySpin.setVisibility(VISIBLE);
            stage3DisplayText.setVisibility(VISIBLE);
            stage3DisplayBtn.setVisibility(VISIBLE);
        });
        // Stage 2 reset btn
        stage2Reset.setOnClickListener((View view) -> {
            log.printExclog("Click listened: Stage 2 Reset Btn");
            // Set enabled
            stage2DisplaySpin.setEnabled(true);
            stage2DisplayBtn.setEnabled(true);
            stage2BtnSpin.setEnabled(true);
            stage2Next.setEnabled(true);
            stage3DisplaySpin.setEnabled(true);
            stage3DisplayBtn.setEnabled(true);
            stage3BtnSpin.setEnabled(true);
            stage3Next.setEnabled(true);
            stage4DisplaySpin.setEnabled(true);
            stage4DisplayBtn.setEnabled(true);
            stage4BtnSpin.setEnabled(true);
            stage4Next.setEnabled(true);
            stage5DisplaySpin.setEnabled(true);
            stage5DisplayBtn.setEnabled(true);
            // Set visibility
            stage2BtnSpin.setVisibility(INVISIBLE);
            stage2BtnText.setVisibility(INVISIBLE);
            stage2Next.setVisibility(INVISIBLE);
            stage2Line2.setVisibility(INVISIBLE);
            stage3.setVisibility(INVISIBLE);
            stage3Reset.setVisibility(INVISIBLE);
            stage3Line1.setVisibility(INVISIBLE);
            stage3DisplaySpin.setVisibility(INVISIBLE);
            stage3DisplayText.setVisibility(INVISIBLE);
            stage3DisplayBtn.setVisibility(INVISIBLE);
            stage3BtnSpin.setVisibility(INVISIBLE);
            stage3BtnText.setVisibility(INVISIBLE);
            stage3Next.setVisibility(INVISIBLE);
            stage3Line2.setVisibility(INVISIBLE);
            stage4.setVisibility(INVISIBLE);
            stage4Reset.setVisibility(INVISIBLE);
            stage4Line1.setVisibility(INVISIBLE);
            stage4DisplaySpin.setVisibility(INVISIBLE);
            stage4DisplayText.setVisibility(INVISIBLE);
            stage4DisplayBtn.setVisibility(INVISIBLE);
            stage4BtnSpin.setVisibility(INVISIBLE);
            stage4BtnText.setVisibility(INVISIBLE);
            stage4Next.setVisibility(INVISIBLE);
            stage4Line2.setVisibility(INVISIBLE);
            stage5.setVisibility(INVISIBLE);
            stage5Line.setVisibility(INVISIBLE);
            stage5DisplaySpin.setVisibility(INVISIBLE);
            stage5DisplayText.setVisibility(INVISIBLE);
            stage5DisplayBtn.setVisibility(INVISIBLE);
            // Set text
            stage2out.setText("");
            stage2BtnText.setText("");
            stage3out.setText("");
            stage3BtnText.setText("");
            stage4out.setText("");
            stage4BtnText.setText("");
            stage5out.setText("");
            // Set selected
            stage2DisplaySpin.setSelection(0);
            stage2BtnSpin.setSelection(0);
            stage3DisplaySpin.setSelection(0);
            stage3BtnSpin.setSelection(0);
            stage4DisplaySpin.setSelection(0);
            stage4BtnSpin.setSelection(0);
            stage5DisplaySpin.setSelection(0);
        });
        // Stage 3 display btn
        stage3DisplayBtn.setOnClickListener((View view) -> {
            log.printExclog("Click listened: Stage 3 Display Btn");
            // Get spinner choice
            stage3DisplaySpin = v.findViewById(R.id.vanilla_memory_stage3_display_spin);
            int displayIndex = stage3DisplaySpin.getSelectedItemPosition();
            log.print("Stage 3 Display: " + (displayIndex + 1));
            // Logic
            String[] logic = logic(3,displayIndex);
            log.printExclog("Logic Array: " + logic);
            log.printExclog("Logic Array [index 0]: " + logic[0]);
            log.printExclog("Logic Array [index 1]: " + logic[1]);
            // Set vars and text
            if (logic[0].equals("l")) {
                stage3islabel = true;
                stage3label = (logic[1].equals("s1")) ? stage1label : (logic[1].equals("s2")) ? stage2label : Integer.parseInt(logic[1]);
                log.print("Stage 3 Btn Text: Label " + stage3label);
                stage3BtnText.setText(getResources().getString(R.string.vanilla_memory_label,parse(stage3label)));
            } else {
                stage3islabel = false;
                log.print("Stage 3 Btn Text: Position " + logic[1]);
                stage3BtnText.setText(getResources().getString(R.string.vanilla_memory_position,parse(logic[1])));
            }
            // Set enabled
            stage3DisplaySpin.setEnabled(false);
            stage3DisplayBtn.setEnabled(false);
            // Set visibility
            stage3BtnSpin.setVisibility(VISIBLE);
            stage3BtnText.setVisibility(VISIBLE);
            stage3Next.setVisibility(VISIBLE);
        });
        // Stage 3 next btn
        stage3Next.setOnClickListener((View view) -> {
            log.printExclog("Click listened: Stage 3 Next Btn");
            if (stage3islabel) {
                // Get spinner choice
                stage3BtnSpin = v.findViewById(R.id.vanilla_memory_stage3_btn_spin);
                int position = stage3BtnSpin.getSelectedItemPosition() + 1;
                // Set text
                log.print("Stage 3: Press Position " + position + " / Label " + stage3label);
                stage3out.setText(getResources().getString(R.string.vanilla_memory_out, parse(position), parse(stage3label)));
            } else {
                // Get spinner choice
                stage3BtnSpin = v.findViewById(R.id.vanilla_memory_stage3_btn_spin);
                stage3label = stage3BtnSpin.getSelectedItemPosition() + 1;
                // Set text
                log.print("Stage 3: Press Position 3 / Label " + stage3label);
                stage3out.setText(getResources().getString(R.string.vanilla_memory_out, parse(3), parse(stage3label)));
            }
            // Set enabled
            stage3BtnSpin.setEnabled(false);
            stage3Next.setEnabled(false);
            // Set visibility
            stage3Line2.setVisibility(VISIBLE);
            stage4.setVisibility(VISIBLE);
            stage4Reset.setVisibility(VISIBLE);
            stage4Line1.setVisibility(VISIBLE);
            stage4DisplaySpin.setVisibility(VISIBLE);
            stage4DisplayText.setVisibility(VISIBLE);
            stage4DisplayBtn.setVisibility(VISIBLE);
        });
        // Stage 3 reset btn
        stage3Reset.setOnClickListener((View view) -> {
            log.printExclog("Click listened: Stage 3 Reset Btn");
            // Set enabled
            stage3DisplaySpin.setEnabled(true);
            stage3DisplayBtn.setEnabled(true);
            stage3BtnSpin.setEnabled(true);
            stage3Next.setEnabled(true);
            stage4DisplaySpin.setEnabled(true);
            stage4DisplayBtn.setEnabled(true);
            stage4BtnSpin.setEnabled(true);
            stage4Next.setEnabled(true);
            stage5DisplaySpin.setEnabled(true);
            stage5DisplayBtn.setEnabled(true);
            // Set visibility
            stage3BtnSpin.setVisibility(INVISIBLE);
            stage3BtnText.setVisibility(INVISIBLE);
            stage3Next.setVisibility(INVISIBLE);
            stage3Line2.setVisibility(INVISIBLE);
            stage4.setVisibility(INVISIBLE);
            stage4Reset.setVisibility(INVISIBLE);
            stage4Line1.setVisibility(INVISIBLE);
            stage4DisplaySpin.setVisibility(INVISIBLE);
            stage4DisplayText.setVisibility(INVISIBLE);
            stage4DisplayBtn.setVisibility(INVISIBLE);
            stage4BtnSpin.setVisibility(INVISIBLE);
            stage4BtnText.setVisibility(INVISIBLE);
            stage4Next.setVisibility(INVISIBLE);
            stage4Line2.setVisibility(INVISIBLE);
            stage5.setVisibility(INVISIBLE);
            stage5Line.setVisibility(INVISIBLE);
            stage5DisplaySpin.setVisibility(INVISIBLE);
            stage5DisplayText.setVisibility(INVISIBLE);
            stage5DisplayBtn.setVisibility(INVISIBLE);
            // Set text
            stage3out.setText("");
            stage3BtnText.setText("");
            stage4out.setText("");
            stage4BtnText.setText("");
            stage5out.setText("");
            // Set selected
            stage3DisplaySpin.setSelection(0);
            stage3BtnSpin.setSelection(0);
            stage4DisplaySpin.setSelection(0);
            stage4BtnSpin.setSelection(0);
            stage5DisplaySpin.setSelection(0);
        });
        // Stage 4 display btn
        stage4DisplayBtn.setOnClickListener((View view) -> {
            log.printExclog("Click listened: Stage 4 Display Btn");
            // Get spinner choice
            stage4DisplaySpin = v.findViewById(R.id.vanilla_memory_stage4_display_spin);
            int displayIndex = stage4DisplaySpin.getSelectedItemPosition();
            log.print("Stage 4 Display: " + (displayIndex + 1));
            // Logic
            String[] logic = logic(4,displayIndex);
            log.printExclog("Logic Array: " + logic);
            log.printExclog("Logic Array [index 0]: " + logic[0]);
            log.printExclog("Logic Array [index 1]: " + logic[1]);
            stage4pos = (logic[1].equals("s1")) ? stage1pos : (logic[1].equals("s2")) ? stage2pos : Integer.parseInt(logic[1]);
            // Set vars and text
            log.print("Stage 4 Btn Text: Position " + stage4pos);
            stage4BtnText.setText(getResources().getString(R.string.vanilla_memory_position,parse(stage4pos)));
            // Set enabled
            stage4DisplaySpin.setEnabled(false);
            stage4DisplayBtn.setEnabled(false);
            // Set visibility
            stage4BtnSpin.setVisibility(VISIBLE);
            stage4BtnText.setVisibility(VISIBLE);
            stage4Next.setVisibility(VISIBLE);
        });
        // Stage 4 next btn
        stage4Next.setOnClickListener((View view) -> {
            log.printExclog("Click listened: Stage 4 Next Btn");
            // Get spinner choice
            stage4BtnSpin = v.findViewById(R.id.vanilla_memory_stage4_btn_spin);
            stage4label = stage4BtnSpin.getSelectedItemPosition() + 1;
            // Set text
            log.print("Stage 4: Press Position " + stage4pos + " / Label " + stage4label);
            stage4out.setText(getResources().getString(R.string.vanilla_memory_out, parse(stage4pos), parse(stage4label)));
            // Set enabled
            stage4BtnSpin.setEnabled(false);
            stage4Next.setEnabled(false);
            // Set visibility
            stage4Line2.setVisibility(VISIBLE);
            stage5.setVisibility(VISIBLE);
            stage5Line.setVisibility(VISIBLE);
            stage5DisplaySpin.setVisibility(VISIBLE);
            stage5DisplayText.setVisibility(VISIBLE);
            stage5DisplayBtn.setVisibility(VISIBLE);
        });
        // Stage 4 reset btn
        stage4Reset.setOnClickListener((View view) -> {
            log.printExclog("Click listened: Stage 4 Reset Btn");
            // Set enabled
            stage4DisplaySpin.setEnabled(true);
            stage4DisplayBtn.setEnabled(true);
            stage4BtnSpin.setEnabled(true);
            stage4Next.setEnabled(true);
            stage5DisplaySpin.setEnabled(true);
            stage5DisplayBtn.setEnabled(true);
            // Set visibility
            stage4BtnSpin.setVisibility(INVISIBLE);
            stage4BtnText.setVisibility(INVISIBLE);
            stage4Next.setVisibility(INVISIBLE);
            stage4Line2.setVisibility(INVISIBLE);
            stage5.setVisibility(INVISIBLE);
            stage5Line.setVisibility(INVISIBLE);
            stage5DisplaySpin.setVisibility(INVISIBLE);
            stage5DisplayText.setVisibility(INVISIBLE);
            stage5DisplayBtn.setVisibility(INVISIBLE);
            // Set text
            stage4out.setText("");
            stage4BtnText.setText("");
            stage5out.setText("");
            // Set selected
            stage4DisplaySpin.setSelection(0);
            stage4BtnSpin.setSelection(0);
            stage5DisplaySpin.setSelection(0);
        });
        // Stage 5 display btn
        stage5DisplayBtn.setOnClickListener((View view) -> {
            log.printExclog("Click listened: Stage 5 Display Btn");
            // Get spinner choice
            stage5DisplaySpin = v.findViewById(R.id.vanilla_memory_stage5_display_spin);
            int displayIndex = stage5DisplaySpin.getSelectedItemPosition();
            log.print("Stage 5 Display: " + (displayIndex + 1));
            // Logic
            String[] logic = logic(5,displayIndex);
            log.printExclog("Logic Array: " + logic);
            log.printExclog("Logic Array [index 0]: " + logic[0]);
            log.printExclog("Logic Array [index 1]: " + logic[1]);
            int finalBtn = (logic[1].equals("s1")) ? stage1label : (logic[1].equals("s2")) ? stage2label : (logic[1].equals("s3")) ? stage3label : stage4label;
            // Set vars and text
            log.print("Stage 5: Press Label " + finalBtn);
            stage5out.setText(getResources().getString(R.string.vanilla_memory_out_s5,parse(finalBtn)));
        });
        return v;
    }

    // Display Logic
    private String[] logic(int stage, int display) {
        String[] out = new String[2];
        switch (stage) {
            // Stage 1
            case 1:
                out[0] = "p";
                switch (display) {
                    case 0:
                    case 1:
                        out[1] = "2";
                        break;
                    case 2:
                        out[1] = "3";
                        break;
                    default:
                        out[1] = "4";
                        break;
                }
                break;
            // Stage 2
            case 2:
                out[0] = "p";
                switch (display) {
                    case 0:
                        out[0] = "l";
                        out[1] = "4";
                        break;
                    case 1:
                    case 3:
                        out[1] = "s1";
                        break;
                    default:
                        out[1] = "1";
                        break;
                }
                break;
            // Stage 3
            case 3:
                out[0] = "l";
                switch (display) {
                    case 0:
                        out[1] = "s2";
                        break;
                    case 1:
                        out[1] = "s1";
                        break;
                    case 2:
                        out[0] = "p";
                        out[1] = "3";
                        break;
                    default:
                        out[1] = "4";
                        break;
                }
                break;
            // Stage 4
            case 4:
                out[0] = "p";
                switch (display) {
                    case 0:
                        out[1] = "s1";
                        break;
                    case 1:
                        out[1] = "1";
                        break;
                    default:
                        out[1] = "s2";
                        break;
                }
                break;
            // Stage 5
            default:
                out[0] = "l";
                switch (display) {
                    case 0:
                        out[1] = "s1";
                        break;
                    case 1:
                        out[1] = "s2";
                        break;
                    case 2:
                        out[1] = "s4";
                        break;
                    default:
                        out[1] = "s3";
                        break;
                }
                break;
        }
        return out;
    }
    private String parse(int i) {
        return getResources().getStringArray(R.array.vanilla_memory_numbers)[i-1];
    }
    private String parse(String s) {
        return parse(Integer.parseInt(s));
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle(getResources().getString(R.string.menu_vanilla_memory));
    }
}
