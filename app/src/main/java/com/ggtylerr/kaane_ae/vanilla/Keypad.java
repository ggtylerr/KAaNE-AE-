package com.ggtylerr.kaane_ae.vanilla;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceManager;

import com.ggtylerr.kaane_ae.MainActivity;
import com.ggtylerr.kaane_ae.R;
import com.ggtylerr.kaane_ae.util.log;
import com.ggtylerr.kaane_ae.util.string;

public class Keypad extends Fragment {
    private boolean theme = MainActivity.grabThemePreference();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_vanilla_keypad, container, false);
        log.print("Current Screen: Vanilla Keypad");
        // Spinner image setup
        int[] imgs = {R.drawable.keypad_28_balloon,R.drawable.keypad_13_at,
                R.drawable.keypad_30_upsidedowny,R.drawable.keypad_12_squigglyn,
                R.drawable.keypad_7_squidknife,R.drawable.keypad_9_hookn,
                R.drawable.keypad_23_leftc,R.drawable.keypad_16_euro,
                R.drawable.keypad_26_cursive,R.drawable.keypad_3_hollowstar,
                R.drawable.keypad_20_questionmark,R.drawable.keypad_1_copyright,
                R.drawable.keypad_8_pumpkin,R.drawable.keypad_5_doublek,
                R.drawable.keypad_15_meltedthree,R.drawable.keypad_11_six,
                R.drawable.keypad_21_paragraph,R.drawable.keypad_31_bt,
                R.drawable.keypad_4_smileyface,R.drawable.keypad_24_pitchfork,
                R.drawable.keypad_22_rightc,R.drawable.keypad_19_dragon,
                R.drawable.keypad_2_filledstar,R.drawable.keypad_27_tracks,
                R.drawable.keypad_14_ae,R.drawable.keypad_18_nwithhat,
                R.drawable.keypad_6_omega};
        Adapter adapter = new Adapter(getContext(),imgs);
        Spinner spin1 = v.findViewById(R.id.vanilla_keypad_spin1);
        spin1.setAdapter(adapter);
        spin1.setSelection(0);
        Spinner spin2 = v.findViewById(R.id.vanilla_keypad_spin2);
        spin2.setAdapter(adapter);
        spin2.setSelection(0);
        Spinner spin3 = v.findViewById(R.id.vanilla_keypad_spin3);
        spin3.setAdapter(adapter);
        spin3.setSelection(0);
        Spinner spin4 = v.findViewById(R.id.vanilla_keypad_spin4);
        spin4.setAdapter(adapter);
        spin4.setSelection(0);
        // Fix up tinting (for dark theme)
        if (theme) {
            int[][] state = new int[][]{
                    new int[]{-android.R.attr.state_enabled},
                    new int[]{android.R.attr.state_enabled},
                    new int[]{-android.R.attr.state_checked},
                    new int[]{android.R.attr.state_pressed}
            };
            int[] color = new int[]{
                    Color.WHITE,
                    Color.WHITE,
                    Color.WHITE,
                    Color.WHITE
            };
            ColorStateList cs = new ColorStateList(state, color);
            ImageView currImg = v.findViewById(R.id.vanilla_keypad_img1);
            currImg.setImageTintList(cs);
            currImg = v.findViewById(R.id.vanilla_keypad_img2);
            currImg.setImageTintList(cs);
            currImg = v.findViewById(R.id.vanilla_keypad_img3);
            currImg.setImageTintList(cs);
            currImg = v.findViewById(R.id.vanilla_keypad_img4);
            currImg.setImageTintList(cs);
        }
        // Logic
        View button = v.findViewById(R.id.vanilla_keypad_button);
        button.setOnClickListener((View view) -> {
            log.printExclog("Click Listened: Button");
            // Get selected index
            int item1 = spin1.getSelectedItemPosition() + 1;
            int item2 = spin2.getSelectedItemPosition() + 1;
            int item3 = spin3.getSelectedItemPosition() + 1;
            int item4 = spin4.getSelectedItemPosition() + 1;
            int[] itemArr = {item1,item2,item3,item4};
            log.printExclog("itemArr: " + itemArr.toString());
            log.print("Selected Item 1: " + item1);
            log.print("Selected Item 2: " + item2);
            log.print("Selected Item 3: " + item3);
            log.print("Selected Item 4: " + item4);
            // Solve
            int[] solved = solve(itemArr);
            log.printExclog("Solved array: " + solved.toString());
            log.print("Solved Item 1: " + (solved[0] + 1));
            log.print("Solved Item 2: " + (solved[1] + 1));
            log.print("Solved Item 3: " + (solved[2] + 1));
            log.print("Solved Item 4: " + (solved[3] + 1));
            // Output
            ImageView currImg = v.findViewById(R.id.vanilla_keypad_img1);
            currImg.setImageDrawable(getResources().getDrawable(imgs[solved[0]]));
            currImg = v.findViewById(R.id.vanilla_keypad_img2);
            currImg.setImageDrawable(getResources().getDrawable(imgs[solved[1]]));
            currImg = v.findViewById(R.id.vanilla_keypad_img3);
            currImg.setImageDrawable(getResources().getDrawable(imgs[solved[2]]));
            currImg = v.findViewById(R.id.vanilla_keypad_img4);
            currImg.setImageDrawable(getResources().getDrawable(imgs[solved[3]]));
        });
        return v;
    }

    private static String[][] list = {
        { "1",  "2",  "3",  "4",  "5",  "6",  "7"},
        { "8",  "1",  "7",  "9", "10",  "6", "11"},
        {"12", "13",  "9", "14", "15",  "3", "10"},
        {"16", "17", "18",  "5", "14", "11", "19"},
        {"20", "19", "18", "21", "17", "22", "23"},
        {"16",  "8", "24", "25", "20", "26", "27"}
    };

    // Mostly from OBACHSK KTANE's code
    private static int[] solve(int[] symbols) {
        // find the column
        int column = 0;
        int occurrences = 0;
        String[] tempSymbols = intToString(symbols);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++)
                occurrences += (string.arrHas(list[i],tempSymbols[j])) ? 1 : 0;

            if (occurrences == 4) {
                column = i;
                break;
            }
            occurrences = 0;
        }
        // order it
        int[] order = new int[4];
        int items = 0;
        for (int i = 0; i < 7; i++)
            for (int j = 0; j < 4; j++)
                if (list[column][i].equals(tempSymbols[j])) {
                    order[items] = symbols[j];
                    items++;
                }
        // Minus all by one (order is in indexes while current output is in normal)
        order[0] -= 1;
        order[1] -= 1;
        order[2] -= 1;
        order[3] -= 1;
        return order;
    }

    private static String[] intToString(int[] arr) {
        String[] strArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++)
            strArr[i] = String.valueOf(arr[i]);
        return strArr;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle(getResources().getString(R.string.menu_vanilla_keypad));
    }

    private class Adapter extends BaseAdapter {
        Context context;
        int images[];
        LayoutInflater inflater;

        public Adapter(Context applicationContext, int[] imgs) {
            this.context = applicationContext;
            this.images = imgs;
            inflater = (LayoutInflater.from(applicationContext));
        }

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = inflater.inflate(R.layout.spinner_image_layout, null);
            ImageView icon = (ImageView) view.findViewById(R.id.imageView);
            icon.setImageResource(images[i]);
            // Fix up tinting (for dark theme)
            if (theme) {
                int[][] state = new int[][]{
                        new int[]{-android.R.attr.state_enabled},
                        new int[]{android.R.attr.state_enabled},
                        new int[]{-android.R.attr.state_checked},
                        new int[]{android.R.attr.state_pressed}
                };
                int[] color = new int[]{
                        Color.WHITE,
                        Color.WHITE,
                        Color.WHITE,
                        Color.WHITE
                };
                ColorStateList cs = new ColorStateList(state, color);
                icon.setImageTintList(cs);
            }
            return view;
        }
    }
}
