package com.ggtylerr.kaane_ae.vanilla;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ggtylerr.kaane_ae.R;
import com.ggtylerr.kaane_ae.util.log;

public class Wires extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vanilla_wires, container, false);
        View button = view.findViewById(R.id.vanilla_wires_okBtn);
        button.setOnClickListener((View v) -> {
            TextView output = view.findViewById(R.id.vanilla_wires_output);
            String outputString = getResources().getString(R.string.vanilla_wires_cut_msg,"1st");
            output.setText(outputString);
            log.printExclog(outputString);
        });
        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Wires");
    }
}