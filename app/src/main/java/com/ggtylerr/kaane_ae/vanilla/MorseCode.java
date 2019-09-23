package com.ggtylerr.kaane_ae.vanilla;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ggtylerr.kaane_ae.MainActivity;
import com.ggtylerr.kaane_ae.R;
import com.ggtylerr.kaane_ae.util.log;
import com.ggtylerr.kaane_ae.util.string;

public class MorseCode extends Fragment {
    private boolean theme = MainActivity.grabThemePreference();
    private String dot;
    private String dash;
    private char firstChar = ' ';
    private char secondChar = ' ';
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        log.print("Current Screen: Morse Code");
        View v = inflater.inflate(R.layout.fragment_vanilla_morse_code, container, false);
        TextView out = v.findViewById(R.id.vanilla_morse_code_out);
        // Dot + Dash strings
        dot = getResources().getString(R.string.vanilla_morse_code_dot);
        dash = getResources().getString(R.string.vanilla_morse_code_dash);
        // Theme stuff
        TextView char1 = v.findViewById(R.id.vanilla_morse_code_char1);
        TextView char2 = v.findViewById(R.id.vanilla_morse_code_char2);
        TextView char3 = v.findViewById(R.id.vanilla_morse_code_char3);
        if (theme) {
            char1.setBackground(getResources().getDrawable(R.drawable.white_border));
            char2.setBackground(getResources().getDrawable(R.drawable.white_border));
            char3.setBackground(getResources().getDrawable(R.drawable.white_border));
        }
        // Disable other buttons
        v.findViewById(R.id.vanilla_morse_code_dot_btn2).setEnabled(false);
        v.findViewById(R.id.vanilla_morse_code_dash_btn2).setEnabled(false);
        v.findViewById(R.id.vanilla_morse_code_backspace_btn2).setEnabled(false);
        v.findViewById(R.id.vanilla_morse_code_btn2).setEnabled(false);
        v.findViewById(R.id.vanilla_morse_code_dot_btn3).setEnabled(false);
        v.findViewById(R.id.vanilla_morse_code_dash_btn3).setEnabled(false);
        v.findViewById(R.id.vanilla_morse_code_backspace_btn3).setEnabled(false);
        v.findViewById(R.id.vanilla_morse_code_btn3).setEnabled(false);
        // 1st char buttons
        v.findViewById(R.id.vanilla_morse_code_dot_btn1).setOnClickListener((View view) -> {
            log.printExclog("Dot BTN 1 Click Listened");
            if (char1.getText().length() <= 5) char1.setText(char1.getText() + dot);
        });
        v.findViewById(R.id.vanilla_morse_code_dash_btn1).setOnClickListener((View view) -> {
            log.printExclog("Dash BTN 1 Click Listened");
            if (char1.getText().length() <= 5) char1.setText(char1.getText() + dash);
        });
        v.findViewById(R.id.vanilla_morse_code_backspace_btn1).setOnClickListener((View view) -> {
            log.printExclog("Backspace BTN 1 Click Listened");
            char1.setText(string.removeLast(char1.getText().toString()));
        });
        v.findViewById(R.id.vanilla_morse_code_btn1).setOnClickListener((View view) -> {
            log.printExclog("BTN 1 Click Listened");
            // Disable other buttons
            v.findViewById(R.id.vanilla_morse_code_dot_btn2).setEnabled(false);
            v.findViewById(R.id.vanilla_morse_code_dash_btn2).setEnabled(false);
            v.findViewById(R.id.vanilla_morse_code_backspace_btn2).setEnabled(false);
            v.findViewById(R.id.vanilla_morse_code_btn2).setEnabled(false);
            v.findViewById(R.id.vanilla_morse_code_dot_btn3).setEnabled(false);
            v.findViewById(R.id.vanilla_morse_code_dash_btn3).setEnabled(false);
            v.findViewById(R.id.vanilla_morse_code_backspace_btn3).setEnabled(false);
            v.findViewById(R.id.vanilla_morse_code_btn3).setEnabled(false);
            // Translate morse code
            log.print("1st char: " + char1.getText().toString());
            char c = translate(char1.getText().toString());
            log.print("1st char translated: " + c);
            // Interpret
            if (c == 'B' || c == 'S') {
                log.print("Char is either B or S - Need other characters.");
                firstChar = c;
                out.setText(getResources().getString(R.string.vanilla_morse_code_info,String.valueOf(c)));
                v.findViewById(R.id.vanilla_morse_code_dot_btn2).setEnabled(true);
                v.findViewById(R.id.vanilla_morse_code_dash_btn2).setEnabled(true);
                v.findViewById(R.id.vanilla_morse_code_backspace_btn2).setEnabled(true);
                v.findViewById(R.id.vanilla_morse_code_btn2).setEnabled(true);
            } else if (c == 'F') {
                log.print("Char is F - Determining word as \"FLICK\"");
                out.setText(getResources().getString(R.string.vanilla_morse_code_flick));
            } else if (c == 'H') {
                log.print("Char is H - Determining word as \"HALLS\"");
                out.setText(getResources().getString(R.string.vanilla_morse_code_halls));
            } else if (c == 'L') {
                log.print("Char is L - Determining word as \"LEAKS\"");
                out.setText(getResources().getString(R.string.vanilla_morse_code_leaks));
            } else if (c == 'T') {
                log.print("Char is T - Determining word as \"TRICK\"");
                out.setText(getResources().getString(R.string.vanilla_morse_code_trick));
            } else if (c == 'V') {
                log.print("Char is V - Determining word as \"VECTOR\"");
                out.setText(getResources().getString(R.string.vanilla_morse_code_vector));
            } else {
                log.print("Incorrect Starting Char.");
                out.setText(getResources().getString(R.string.vanilla_morse_code_error));
            }
        });
        // 2nd char buttons
        v.findViewById(R.id.vanilla_morse_code_dot_btn2).setOnClickListener((View view) -> {
            log.printExclog("Dot BTN 2 Click Listened");
            if (char2.getText().length() <= 5) char2.setText(char2.getText() + dot);
        });
        v.findViewById(R.id.vanilla_morse_code_dash_btn2).setOnClickListener((View view) -> {
            log.printExclog("Dash BTN 2 Click Listened");
            if (char2.getText().length() <= 5) char2.setText(char2.getText() + dash);
        });
        v.findViewById(R.id.vanilla_morse_code_backspace_btn2).setOnClickListener((View view) -> {
            log.printExclog("Backspace BTN 2 Click Listened");
            char2.setText(string.removeLast(char2.getText().toString()));
        });
        v.findViewById(R.id.vanilla_morse_code_btn2).setOnClickListener((View view) -> {
            log.printExclog("BTN 2 Click Listened");
            // Disable other buttons
            v.findViewById(R.id.vanilla_morse_code_dot_btn3).setEnabled(false);
            v.findViewById(R.id.vanilla_morse_code_dash_btn3).setEnabled(false);
            v.findViewById(R.id.vanilla_morse_code_backspace_btn3).setEnabled(false);
            v.findViewById(R.id.vanilla_morse_code_btn3).setEnabled(false);
            // Translate morse code
            log.print("2nd char: " + char2.getText().toString());
            char c = translate(char2.getText().toString());
            log.print("2nd char translated: " + c);
            // Interpret
            if ((firstChar == 'B' && c == 'O') || (firstChar == 'B' && c == 'R') || (firstChar == 'S' && c == 'T')) {
                log.print("Chars are either BO, BR, or ST - Need other characters.");
                String str = firstChar + String.valueOf(c);
                out.setText(getResources().getString(R.string.vanilla_morse_code_info,str));
                v.findViewById(R.id.vanilla_morse_code_dot_btn3).setEnabled(true);
                v.findViewById(R.id.vanilla_morse_code_dash_btn3).setEnabled(true);
                v.findViewById(R.id.vanilla_morse_code_backspace_btn3).setEnabled(true);
                v.findViewById(R.id.vanilla_morse_code_btn3).setEnabled(true);
                secondChar = c;
            } else if (firstChar == 'B' && c == 'E') {
                log.print("1st char is B and 2nd is E - Determining word as \"BEATS\"");
                out.setText(getResources().getString(R.string.vanilla_morse_code_beats));
            } else if (firstChar == 'B' && c == 'I') {
                log.print("1st char is B and 2nd is I - Determining word as \"BISTRO\"");
                out.setText(getResources().getString(R.string.vanilla_morse_code_bistro));
            } else if (firstChar == 'S' && c == 'H') {
                log.print("1st char is S and 2nd is H - Determining word as \"SHELL\"");
                out.setText(getResources().getString(R.string.vanilla_morse_code_shell));
            } else if (firstChar == 'S' && c == 'L') {
                log.print("1st char is S and 2nd is L - Determining word as \"SLICK\"");
                out.setText(getResources().getString(R.string.vanilla_morse_code_slick));
            } else {
                log.print("Incorrect Char Used");
                out.setText(getResources().getString(R.string.vanilla_morse_code_error));
            }
        });
        // 3rd char buttons
        v.findViewById(R.id.vanilla_morse_code_dot_btn3).setOnClickListener((View view) -> {
            log.printExclog("Dot BTN 3 Click Listened");
            if (char3.getText().length() <= 5) char3.setText(char3.getText() + dot);
        });
        v.findViewById(R.id.vanilla_morse_code_dash_btn3).setOnClickListener((View view) -> {
            log.printExclog("Dash BTN 3 Click Listened");
            if (char3.getText().length() <= 5) char3.setText(char3.getText() + dash);
        });
        v.findViewById(R.id.vanilla_morse_code_backspace_btn3).setOnClickListener((View view) -> {
            log.printExclog("Backspace BTN 3 Click Listened");
            char3.setText(string.removeLast(char3.getText().toString()));
        });
        v.findViewById(R.id.vanilla_morse_code_btn3).setOnClickListener((View view) -> {
            log.printExclog("BTN 3 Click Listened");
            // Translate morse code
            log.print("3rd char: " + char3.getText().toString());
            char c = translate(char3.getText().toString());
            log.print("3rd char translated: " + c);
            // Interpret
            if (firstChar == 'B' && secondChar == 'O' && c == 'M') {
                log.print("Chars are BOM - Determining word as \"BOMBS\"");
                out.setText(getResources().getString(R.string.vanilla_morse_code_bombs));
            } else if (firstChar == 'B' && secondChar == 'O' && c == 'X') {
                log.print("Chars are BOX - Determining word as \"BOXES\"");
                out.setText(getResources().getString(R.string.vanilla_morse_code_boxes));
            } else if (firstChar == 'B' && secondChar == 'R' && c == 'E') {
                log.print("Chars are BRE - Determining word as \"BREAK\"");
                out.setText(getResources().getString(R.string.vanilla_morse_code_break));
            } else if (firstChar == 'B' && secondChar == 'R' && c == 'I') {
                log.print("Chars are BRI - Determining word as \"BRICK\"");
                out.setText(getResources().getString(R.string.vanilla_morse_code_brick));
            } else if (firstChar == 'S' && secondChar == 'T' && c == 'E') {
                log.print("Chars are STE - Determining word as \"STEAK\"");
                out.setText(getResources().getString(R.string.vanilla_morse_code_steak));
            } else if (firstChar == 'S' && secondChar == 'T' && c == 'I') {
                log.print("Chars are STI - Determining word as \"STING\"");
                out.setText(getResources().getString(R.string.vanilla_morse_code_sting));
            } else if (firstChar == 'S' && secondChar == 'T' && c == 'R') {
                log.print("Chars are STR - Determining word as \"STROBE\"");
                out.setText(getResources().getString(R.string.vanilla_morse_code_strobe));
            } else {
                log.print("Incorrect Char Used");
                out.setText(getResources().getString(R.string.vanilla_morse_code_error));
            }
        });
        return v;
    }
    private char translate(String s) {
        char out = ' ';
        String Dot = String.valueOf(dot.toCharArray()[0]);
        String Dash = String.valueOf(dash.toCharArray()[0]);
        // Shoutouts to Google for making their shit not usable for static objects!
        // Now I can't use switch statements!
        if (s.equals(Dash)) out = 'A';
        if (s.equals(Dash + Dot + Dot + Dot)) out = 'B';
        if (s.equals(Dash + Dot + Dash + Dot)) out = 'C';
        if (s.equals(Dot)) out = 'E';
        if (s.equals(Dot + Dot + Dash + Dot)) out = 'F';
        if (s.equals(Dot + Dot + Dot + Dot)) out = 'H';
        if (s.equals(Dot + Dot)) out = 'I';
        if (s.equals(Dash + Dot + Dash)) out = 'K';
        if (s.equals(Dot + Dash + Dot + Dot)) out = 'L';
        if (s.equals(Dash + Dash)) out = 'M';
        if (s.equals(Dash + Dot)) out = 'N';
        if (s.equals(Dash + Dash + Dash)) out = 'O';
        if (s.equals(Dot + Dash + Dot)) out = 'R';
        if (s.equals(Dot + Dot + Dot)) out = 'S';
        if (s.equals(Dash)) out = 'T';
        if (s.equals(Dot + Dot + Dot + Dash)) out = 'V';
        if (s.equals(Dash + Dot + Dot + Dash)) out = 'X';
        return out;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle(getResources().getString(R.string.menu_vanilla_morse_code));
    }
}