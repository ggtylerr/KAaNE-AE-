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

public class WhosOnFirst extends Fragment {
    private View curr;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        log.print("Current Screen: Vanilla Who's on First");
        View v = inflater.inflate(R.layout.fragment_vanilla_whos_on_first, container, false);
        curr = v.findViewById(R.id.vanilla_whos_on_first_position_spin);
        curr.setVisibility(View.INVISIBLE);
        curr = v.findViewById(R.id.vanilla_whos_on_first_position_button);
        curr.setVisibility(View.INVISIBLE);
        curr = v.findViewById(R.id.vanilla_whos_on_first_position_text);
        curr.setVisibility(View.INVISIBLE);
        // Display Logic
        View displayBtn = v.findViewById(R.id.vanilla_whos_on_first_display_button);
        displayBtn.setOnClickListener((View view) -> {
            log.printExclog("Click listened: Display Button");
            Spinner display = v.findViewById(R.id.vanilla_whos_on_first_display_spin);
            log.print("Display Text: " + display.getSelectedItem());
            int displayIndex = display.getSelectedItemPosition();
            log.printExclog("Display Index: " + displayIndex);
            TextView posText = v.findViewById(R.id.vanilla_whos_on_first_position_text);
            String pos;
            if (displayIndex == 22) {
                pos = "1";
            } else if (displayIndex == 5 || displayIndex == 12 || displayIndex == 2) {
                pos = "2";
            } else if (displayIndex == 23 || displayIndex == 11 || displayIndex == 8 || displayIndex == 20) {
                pos = "3";
            } else if (displayIndex == 1 || displayIndex == 13 || displayIndex == 14 || displayIndex == 24 ||
                displayIndex == 27 || displayIndex == 26 || displayIndex == 18) {
                pos = "4";
            } else if (displayIndex == 0 || displayIndex == 15 || displayIndex == 9 || displayIndex == 21) {
                pos = "5";
            } else {
                pos = "6";
            }
            log.print("Position " + pos);
            posText.setText(getResources().getString(R.string.vanilla_whos_on_first_position,pos));
            curr = v.findViewById(R.id.vanilla_whos_on_first_position_spin);
            curr.setVisibility(View.VISIBLE);
            curr = v.findViewById(R.id.vanilla_whos_on_first_position_button);
            curr.setVisibility(View.VISIBLE);
            curr = v.findViewById(R.id.vanilla_whos_on_first_position_text);
            curr.setVisibility(View.VISIBLE);
        });
        // Position Logic
        View posBtn = v.findViewById(R.id.vanilla_whos_on_first_position_button);
        posBtn.setOnClickListener((View view) -> {
            log.printExclog("Click listened: Position Button");
            Spinner position = v.findViewById(R.id.vanilla_whos_on_first_position_spin);
            log.print("Position Text: " + position.getSelectedItem());
            int positionIndex = position.getSelectedItemPosition();
            log.printExclog("Position Index: " + positionIndex);
            TextView out = v.findViewById(R.id.vanilla_whos_on_first_output);
            switch (positionIndex) {
                case 0:  out.setText(R.string.vanilla_whos_on_first_out_blank);   break;
                case 1:  out.setText(R.string.vanilla_whos_on_first_out_done);    break;
                case 2:  out.setText(R.string.vanilla_whos_on_first_out_first);   break;
                case 3:  out.setText(R.string.vanilla_whos_on_first_out_hold);    break;
                case 4:  out.setText(R.string.vanilla_whos_on_first_out_left);    break;
                case 5:  out.setText(R.string.vanilla_whos_on_first_out_like);    break;
                case 6:  out.setText(R.string.vanilla_whos_on_first_out_middle);  break;
                case 7:  out.setText(R.string.vanilla_whos_on_first_out_next);    break;
                case 8:  out.setText(R.string.vanilla_whos_on_first_out_no);      break;
                case 9:  out.setText(R.string.vanilla_whos_on_first_out_nothing); break;
                case 10: out.setText(R.string.vanilla_whos_on_first_out_okay);    break;
                case 11: out.setText(R.string.vanilla_whos_on_first_out_press);   break;
                case 12: out.setText(R.string.vanilla_whos_on_first_out_ready);   break;
                case 13: out.setText(R.string.vanilla_whos_on_first_out_right);   break;
                case 14: out.setText(R.string.vanilla_whos_on_first_out_sure);    break;
                case 15: out.setText(R.string.vanilla_whos_on_first_out_u);       break;
                case 16: out.setText(R.string.vanilla_whos_on_first_out_uh_huh);  break;
                case 17: out.setText(R.string.vanilla_whos_on_first_out_uh_uh);   break;
                case 18: out.setText(R.string.vanilla_whos_on_first_out_uhhh);    break;
                case 19: out.setText(R.string.vanilla_whos_on_first_out_ur);      break;
                case 20: out.setText(R.string.vanilla_whos_on_first_out_wait);    break;
                case 21: out.setText(R.string.vanilla_whos_on_first_out_what);    break;
                case 22: out.setText(R.string.vanilla_whos_on_first_out_what_q);  break;
                case 23: out.setText(R.string.vanilla_whos_on_first_out_yes);     break;
                case 24: out.setText(R.string.vanilla_whos_on_first_out_you);     break;
                case 25: out.setText(R.string.vanilla_whos_on_first_out_you_are); break;
                case 26: out.setText(R.string.vanilla_whos_on_first_out_you_re);  break;
                case 27: out.setText(R.string.vanilla_whos_on_first_out_your);    break;
            }
        });
        return v;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Who\'s On First");
    }
}
