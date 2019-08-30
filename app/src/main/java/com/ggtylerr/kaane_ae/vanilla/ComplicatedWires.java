package com.ggtylerr.kaane_ae.vanilla;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ggtylerr.kaane_ae.R;
import com.ggtylerr.kaane_ae.util.Props;
import com.ggtylerr.kaane_ae.util.log;

import java.util.Properties;

public class ComplicatedWires extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        log.print("Current Screen: Complicated Wires");
        View v = inflater.inflate(R.layout.fragment_vanilla_complicated_wires, container, false);
        v.findViewById(R.id.vanilla_complicated_wires_btn).setOnClickListener((View view) -> {
            log.printExclog("Click listened: Button");
            // Checks
            CheckBox temp = v.findViewById(R.id.vanilla_complicated_wires_red);
            boolean red = temp.isChecked();
            temp = v.findViewById(R.id.vanilla_complicated_wires_blue);
            boolean blue = temp.isChecked();
            temp = v.findViewById(R.id.vanilla_complicated_wires_led);
            boolean led = temp.isChecked();
            temp = v.findViewById(R.id.vanilla_complicated_wires_star);
            boolean star = temp.isChecked();
            // Edgework
            Properties props = Props.load(new Properties());
            boolean parallel = Integer.parseInt(props.getProperty("parallel")) == 1;
            boolean batteries = Integer.parseInt(props.getProperty("batteriesTotal")) > 1;
            boolean evenDigit = Integer.parseInt(props.getProperty("snLastDig")) % 2 == 0;
            log.print("Parallel - " + parallel);
            log.print("Batteries - " + props.getProperty("batteriesTotal"));
            log.printExclog(">1 Batteries - " + batteries);
            log.print("Last digit - " + props.getProperty("snLastDig"));
            log.printExclog("Even Digit - " + evenDigit);
            // Output
            TextView out = v.findViewById(R.id.vanilla_complicated_wires_out);
            String cut = getResources().getString(R.string.vanilla_complicated_wires_cut);
            String dontCut = getResources().getString(R.string.vanilla_complicated_wires_dont_cut);
            // Logic
            if (!red) {
                if (!blue) {
                    if (!led) {
                        log.print("CUT");
                        log.printExclog("Plain white");
                        out.setText(cut);
                    } else if (!star || !batteries) {
                        log.print("DON'T CUT");
                        log.printExclog("Led + (No Star / < 2 batts)");
                        out.setText(dontCut);
                    } else {
                        log.print("CUT");
                        log.printExclog("Led + >2 batts");
                        out.setText(cut);
                    }
                } else if (!led) {
                    if (!star) {
                        if (!evenDigit) {
                            log.print("DON'T CUT");
                            log.printExclog("Only blue but last digit odd");
                            out.setText(dontCut);
                        } else {
                            log.print("CUT");
                            log.printExclog("Only blue but last digit even");
                            out.setText(cut);
                        }
                    } else {
                        log.print("DON'T CUT");
                        log.printExclog("Only blue + star");
                        out.setText(dontCut);
                    }
                } else if (!parallel) {
                    log.print("DON'T CUT");
                    log.printExclog("Only blue + led but no parallel");
                    out.setText(dontCut);
                } else {
                    log.print("CUT");
                    log.printExclog("Only blue + led but parallel");
                    out.setText(cut);
                }
            } else if (!blue) {
                if (!star) {
                    if (!led) {
                        if (!evenDigit) {
                            log.print("DON'T CUT");
                            log.printExclog("Only red but last digit odd");
                            out.setText(dontCut);
                        } else {
                            log.print("CUT");
                            log.printExclog("Only red but last digit even");
                            out.setText(cut);
                        }
                    } else if (!batteries) {
                        log.print("DON'T CUT");
                        log.printExclog("Red + led but < 2 batts");
                        out.setText(dontCut);
                    } else {
                        log.print("CUT");
                        log.printExclog("Red + led but > 2 batts");
                        out.setText(cut);
                    }
                } else if (!led) {
                    log.print("CUT");
                    log.printExclog("Red + Star");
                    out.setText(cut);
                } else if (!batteries) {
                    log.print("DON'T CUT");
                    log.printExclog("Red + Star + Led but < 2 batts");
                    out.setText(dontCut);
                } else {
                    log.print("CUT");
                    log.printExclog("Red + Star + Led but > 2 batts");
                    out.setText(cut);
                }
            } else if (!star) {
                if (!evenDigit) {
                    log.print("DON'T CUT");
                    log.printExclog("Red + Blue but last digit odd");
                    out.setText(dontCut);
                } else {
                    log.print("CUT");
                    log.printExclog("Red + Blue but last digit even");
                    out.setText(cut);
                }
            } else if (!led) {
                if (!parallel) {
                    log.print("DON'T CUT");
                    log.printExclog("Red + Blue + Star but no parallel");
                    out.setText(dontCut);
                } else {
                    log.print("CUT");
                    log.printExclog("Red + Blue + Star but parallel");
                    out.setText(cut);
                }
            } else {
                log.print("DON'T CUT");
                log.printExclog("All");
                out.setText(dontCut);
            }
        });
        return v;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Complicated Wires");
    }
}
