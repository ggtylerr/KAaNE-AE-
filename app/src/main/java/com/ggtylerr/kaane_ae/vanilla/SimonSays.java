package com.ggtylerr.kaane_ae.vanilla;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ggtylerr.kaane_ae.R;
import com.ggtylerr.kaane_ae.util.Props;
import com.ggtylerr.kaane_ae.util.log;

import java.util.Properties;

public class SimonSays extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_vanilla_simon_says, container, false);
        log.print("Current Screen: Vanilla Simon Says");
        // Logic
        View button = v.findViewById(R.id.vanilla_simon_says_btn);
        button.setOnClickListener((View view) -> {
            // Get vowel + strikes
            Properties props = Props.load(new Properties());
            boolean vowel = props.getProperty("snVowel").equals("t");
            Spinner spinner = v.findViewById(R.id.vanilla_simon_says_spin);
            int strikes = spinner.getSelectedItemPosition();
            ImageView output = v.findViewById(R.id.vanilla_simon_says_output);
            // Check strikes, then vowel, then set image appropriately
            if (strikes == 0) {
                if (vowel) output.setImageDrawable(getResources().getDrawable(R.drawable.simon_says_vowel_zero));
                else output.setImageDrawable(getResources().getDrawable(R.drawable.simon_says_nowel_zero));
            } else if (strikes == 1) {
                if (vowel) output.setImageDrawable(getResources().getDrawable(R.drawable.simon_says_vowel_one_nowel_two));
                else output.setImageDrawable(getResources().getDrawable(R.drawable.simon_says_nowel_one));
            } else {
                if (vowel) output.setImageDrawable(getResources().getDrawable(R.drawable.simon_says_vowel_two));
                else output.setImageDrawable(getResources().getDrawable(R.drawable.simon_says_vowel_one_nowel_two));
            }
            // log
            log.print("Vowel - " + vowel);
            log.print("Strikes - " + strikes);
        });
        return v;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Simon Says");
    }
}
