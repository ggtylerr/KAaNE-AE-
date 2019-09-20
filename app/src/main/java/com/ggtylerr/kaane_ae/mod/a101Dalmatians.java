package com.ggtylerr.kaane_ae.mod;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ggtylerr.kaane_ae.R;

public class a101Dalmatians extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_mod_101_dalmatians, container, false);
        // Images
        ImageView out = v.findViewById(R.id.mod_101_dalmatians_img);
        Drawable dot3Img = getResources().getDrawable(R.drawable.a101_dalmatians_list_three);
        Drawable dot4Img = getResources().getDrawable(R.drawable.a101_dalmatians_list_four);
        Drawable allImg = getResources().getDrawable(R.drawable.a101_dalmatians_list_all);
        Drawable noneImg = getResources().getDrawable(R.drawable.a101_dalmatians_list);
        // Buttons
        v.findViewById(R.id.mod_101_dalmatians_3_dots_btn).setOnClickListener((View view) -> out.setImageDrawable(dot3Img));
        v.findViewById(R.id.mod_101_dalmatians_4_dots_btn).setOnClickListener((View view) -> out.setImageDrawable(dot4Img));
        v.findViewById(R.id.mod_101_dalmatians_all).setOnClickListener((View view) -> out.setImageDrawable(allImg));
        v.findViewById(R.id.mod_101_dalmatians_none).setOnClickListener((View view) -> out.setImageDrawable(noneImg));
        return v;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle(getResources().getString(R.string.menu_mod_101_dalmatians));
    }
}
