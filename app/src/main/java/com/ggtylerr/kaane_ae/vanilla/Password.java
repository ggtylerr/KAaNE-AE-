package com.ggtylerr.kaane_ae.vanilla;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ggtylerr.kaane_ae.R;
import com.ggtylerr.kaane_ae.util.log;

import java.util.ArrayList;
import java.util.Arrays;

public class Password extends Fragment {
    private EditText thirdTxt1;
    private EditText thirdTxt2;
    private EditText thirdTxt3;
    private EditText thirdTxt4;
    private EditText thirdTxt5;
    private EditText thirdTxt6;
    private EditText fifthTxt1;
    private EditText fifthTxt2;
    private EditText fifthTxt3;
    private EditText fifthTxt4;
    private EditText fifthTxt5;
    private EditText fifthTxt6;
    private TextView out;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_vanilla_password, container, false);
        log.print("Current screen: Vanilla Password");
        // Define views
        thirdTxt1 = v.findViewById(R.id.vanilla_password_3rd_txt1);
        thirdTxt2 = v.findViewById(R.id.vanilla_password_3rd_txt2);
        thirdTxt3 = v.findViewById(R.id.vanilla_password_3rd_txt3);
        thirdTxt4 = v.findViewById(R.id.vanilla_password_3rd_txt4);
        thirdTxt5 = v.findViewById(R.id.vanilla_password_3rd_txt5);
        thirdTxt6 = v.findViewById(R.id.vanilla_password_3rd_txt6);
        fifthTxt1 = v.findViewById(R.id.vanilla_password_5th_txt1);
        fifthTxt2 = v.findViewById(R.id.vanilla_password_5th_txt2);
        fifthTxt3 = v.findViewById(R.id.vanilla_password_5th_txt3);
        fifthTxt4 = v.findViewById(R.id.vanilla_password_5th_txt4);
        fifthTxt5 = v.findViewById(R.id.vanilla_password_5th_txt5);
        fifthTxt6 = v.findViewById(R.id.vanilla_password_5th_txt6);
        out = v.findViewById(R.id.vanilla_password_out);
        // Logic
        v.findViewById(R.id.vanilla_password_btn).setOnClickListener((View view) -> {
            log.printExclog("Click listened: OK Button");
            // Redefine views (just in case)
            thirdTxt1 = v.findViewById(R.id.vanilla_password_3rd_txt1);
            thirdTxt2 = v.findViewById(R.id.vanilla_password_3rd_txt2);
            thirdTxt3 = v.findViewById(R.id.vanilla_password_3rd_txt3);
            thirdTxt4 = v.findViewById(R.id.vanilla_password_3rd_txt4);
            thirdTxt5 = v.findViewById(R.id.vanilla_password_3rd_txt5);
            thirdTxt6 = v.findViewById(R.id.vanilla_password_3rd_txt6);
            fifthTxt1 = v.findViewById(R.id.vanilla_password_5th_txt1);
            fifthTxt2 = v.findViewById(R.id.vanilla_password_5th_txt2);
            fifthTxt3 = v.findViewById(R.id.vanilla_password_5th_txt3);
            fifthTxt4 = v.findViewById(R.id.vanilla_password_5th_txt4);
            fifthTxt5 = v.findViewById(R.id.vanilla_password_5th_txt5);
            fifthTxt6 = v.findViewById(R.id.vanilla_password_5th_txt6);
            // Convert to chars
            char thirdChar1 = thirdTxt1.getText().toString().toCharArray()[0];
            char thirdChar2 = thirdTxt2.getText().toString().toCharArray()[0];
            char thirdChar3 = thirdTxt3.getText().toString().toCharArray()[0];
            char thirdChar4 = thirdTxt4.getText().toString().toCharArray()[0];
            char thirdChar5 = thirdTxt5.getText().toString().toCharArray()[0];
            char thirdChar6 = thirdTxt6.getText().toString().toCharArray()[0];
            char fifthChar1 = fifthTxt1.getText().toString().toCharArray()[0];
            char fifthChar2 = fifthTxt2.getText().toString().toCharArray()[0];
            char fifthChar3 = fifthTxt3.getText().toString().toCharArray()[0];
            char fifthChar4 = fifthTxt4.getText().toString().toCharArray()[0];
            char fifthChar5 = fifthTxt5.getText().toString().toCharArray()[0];
            char fifthChar6 = fifthTxt6.getText().toString().toCharArray()[0];
            ArrayList<Character> thirdChars = new ArrayList<>();
            thirdChars.add(thirdChar1); thirdChars.add(thirdChar2); thirdChars.add(thirdChar3);
            thirdChars.add(thirdChar4); thirdChars.add(thirdChar5); thirdChars.add(thirdChar6);
            ArrayList<Character> fifthChars = new ArrayList<>();
            fifthChars.add(fifthChar1); fifthChars.add(fifthChar2); fifthChars.add(fifthChar3);
            fifthChars.add(fifthChar4); fifthChars.add(fifthChar5); fifthChars.add(fifthChar6);
            // Print
            log.print("3rd characters: " + thirdChar1 + " " + thirdChar2 + " " + thirdChar3 + " "
                    + thirdChar4 + " " + thirdChar5 + " " + thirdChar6);
            log.print("5th characters: " + fifthChar1 + " " + fifthChar2 + " " + fifthChar3 + " "
                    + fifthChar4 + " " + fifthChar5 + " " + fifthChar6);
            // Find words
            ArrayList<String> outputList = new ArrayList<>();
            if (thirdChars.contains('A')) {
                if (fifthChars.contains('E')) {
                    log.print("PLACE");
                    outputList.add("PLACE");
                }
                if (fifthChars.contains('N')) {
                    log.print("AGAIN");
                    log.print("LEARN");
                    outputList.add("AGAIN");
                    outputList.add("LEARN");
                }
                if (fifthChars.contains('L')) {
                    log.print("SMALL");
                    outputList.add("SMALL");
                }
                if (fifthChars.contains('T')) {
                    log.print("PLANT");
                    outputList.add("PLANT");
                }
            }
            if (thirdChars.contains('E')) {
                if (fifthChars.contains('E')) {
                    log.print("THERE");
                    log.print("THESE");
                    log.print("WHERE");
                    outputList.add("THERE");
                    outputList.add("THESE");
                    outputList.add("WHERE");
                }
                if (fifthChars.contains('L')) {
                    log.print("SPELL");
                    outputList.add("SPELL");
                }
                if (fifthChars.contains('R')) {
                    log.print("THEIR");
                    outputList.add("THEIR");
                }
                if (fifthChars.contains('T')) {
                    log.print("GREAT");
                    outputList.add("GREAT");
                }
                if (fifthChars.contains('Y')) {
                    log.print("EVERY");
                    outputList.add("EVERY");
                }
            }
            if (thirdChars.contains('G')) {
                if (fifthChars.contains('T')) {
                    log.print("RIGHT");
                    outputList.add("RIGHT");
                }
            }
            if (thirdChars.contains('H')) {
                if (fifthChars.contains('R')) {
                    log.print("OTHER");
                    outputList.add("OTHER");
                }
            }
            if (thirdChars.contains('I')) {
                if (fifthChars.contains('E')) {
                    log.print("WRITE");
                    outputList.add("WRITE");
                }
                if (fifthChars.contains('G')) {
                    log.print("THING");
                    outputList.add("THING");
                }
                if (fifthChars.contains('H')) {
                    log.print("WHICH");
                    outputList.add("WHICH");
                }
                if (fifthChars.contains('K')) {
                    log.print("THINK");
                    outputList.add("THINK");
                }
                if (fifthChars.contains('L')) {
                    log.print("STILL");
                    outputList.add("STILL");
                }
                if (fifthChars.contains('T')) {
                    log.print("POINT");
                    outputList.add("POINT");
                }
            }
            if (thirdChars.contains('L')) {
                if (fifthChars.contains('W')) {
                    log.print("BELOW");
                    outputList.add("BELOW");
                }
            }
            if (thirdChars.contains('O')) {
                if (fifthChars.contains('T')) {
                    log.print("ABOUT");
                    outputList.add("ABOUT");
                }
            }
            if (thirdChars.contains('R')) {
                if (fifthChars.contains('D')) {
                    log.print("WORLD");
                    outputList.add("WORLD");
                }
                if (fifthChars.contains('E')) {
                    log.print("LARGE");
                    log.print("THREE");
                    outputList.add("LARGE");
                    outputList.add("THREE");
                }
                if (fifthChars.contains('T')) {
                    log.print("FIRST");
                    outputList.add("FIRST");
                }
            }
            if (thirdChars.contains('T')) {
                if (fifthChars.contains('R')) {
                    log.print("WATER");
                    log.print("AFTER");
                    outputList.add("WATER");
                    outputList.add("AFTER");
                }
            }
            if (thirdChars.contains('U')) {
                if (fifthChars.contains('D')) {
                    log.print("COULD");
                    log.print("FOUND");
                    log.print("SOUND");
                    log.print("WOULD");
                    outputList.add("COULD");
                    outputList.add("FOUND");
                    outputList.add("SOUND");
                    outputList.add("WOULD");
                }
                if (fifthChars.contains('E')) {
                    log.print("HOUSE");
                    outputList.add("HOUSE");
                }
                if (fifthChars.contains('Y')) {
                    log.print("STUDY");
                    outputList.add("STUDY");
                }
            }
            if (thirdChars.contains('V')) {
                if (fifthChars.contains('R')) {
                    log.print("NEVER");
                    outputList.add("NEVER");
                }
            }
            // Convert to string
            String[] outputArr = outputList.toArray(new String[0]);
            String outputString = Arrays.toString(outputArr);
            // Remove [ and ] characters
            String regx = "[]";
            char[] ca = regx.toCharArray();
            for (char c : ca) {
                outputString = outputString.replace(""+c, "");
            }
            // Output
            out.setText(outputString);
        });
        // Reset
        v.findViewById(R.id.vanilla_password_reset).setOnClickListener((View view) -> {
            log.printExclog("Click listened: Reset");
            thirdTxt1.setText("");
            thirdTxt2.setText("");
            thirdTxt3.setText("");
            thirdTxt4.setText("");
            thirdTxt5.setText("");
            thirdTxt6.setText("");
            fifthTxt1.setText("");
            fifthTxt2.setText("");
            fifthTxt3.setText("");
            fifthTxt4.setText("");
            fifthTxt5.setText("");
            fifthTxt6.setText("");
            out.setText("");
        });
        return v;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle(getResources().getString(R.string.menu_vanilla_password));
    }
}
