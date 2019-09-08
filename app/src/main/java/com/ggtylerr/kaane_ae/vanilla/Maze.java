package com.ggtylerr.kaane_ae.vanilla;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ggtylerr.kaane_ae.MainActivity;
import com.ggtylerr.kaane_ae.R;
import com.ggtylerr.kaane_ae.util.log;

public class Maze extends Fragment {
    private Drawable dot;
    private Drawable mark;
    private boolean[][] mazeDot_marked = 
            {{false,false,false,false,false,false},
            {false,false,false,false,false,false},
            {false,false,false,false,false,false},
            {false,false,false,false,false,false},
            {false,false,false,false,false,false},
            {false,false,false,false,false,false}};
    private ImageView mazeDot1_1;
    private ImageView mazeDot1_2;
    private ImageView mazeDot1_3;
    private ImageView mazeDot1_4;
    private ImageView mazeDot1_5;
    private ImageView mazeDot1_6;
    private ImageView mazeDot2_1;
    private ImageView mazeDot2_2;
    private ImageView mazeDot2_3;
    private ImageView mazeDot2_4;
    private ImageView mazeDot2_5;
    private ImageView mazeDot2_6;
    private ImageView mazeDot3_1;
    private ImageView mazeDot3_2;
    private ImageView mazeDot3_3;
    private ImageView mazeDot3_4;
    private ImageView mazeDot3_5;
    private ImageView mazeDot3_6;
    private ImageView mazeDot4_1;
    private ImageView mazeDot4_2;
    private ImageView mazeDot4_3;
    private ImageView mazeDot4_4;
    private ImageView mazeDot4_5;
    private ImageView mazeDot4_6;
    private ImageView mazeDot5_1;
    private ImageView mazeDot5_2;
    private ImageView mazeDot5_3;
    private ImageView mazeDot5_4;
    private ImageView mazeDot5_5;
    private ImageView mazeDot5_6;
    private ImageView mazeDot6_1;
    private ImageView mazeDot6_2;
    private ImageView mazeDot6_3;
    private ImageView mazeDot6_4;
    private ImageView mazeDot6_5;
    private ImageView mazeDot6_6;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_vanilla_maze, container, false);
        log.print("Current Screen: Vanilla Maze");
        // Defining Image Views
        mazeDot1_1 = v.findViewById(R.id.vanilla_maze_dot_1_1);
        mazeDot1_2 = v.findViewById(R.id.vanilla_maze_dot_1_2);
        mazeDot1_3 = v.findViewById(R.id.vanilla_maze_dot_1_3);
        mazeDot1_4 = v.findViewById(R.id.vanilla_maze_dot_1_4);
        mazeDot1_5 = v.findViewById(R.id.vanilla_maze_dot_1_5);
        mazeDot1_6 = v.findViewById(R.id.vanilla_maze_dot_1_6);
        mazeDot2_1 = v.findViewById(R.id.vanilla_maze_dot_2_1);
        mazeDot2_2 = v.findViewById(R.id.vanilla_maze_dot_2_2);
        mazeDot2_3 = v.findViewById(R.id.vanilla_maze_dot_2_3);
        mazeDot2_4 = v.findViewById(R.id.vanilla_maze_dot_2_4);
        mazeDot2_5 = v.findViewById(R.id.vanilla_maze_dot_2_5);
        mazeDot2_6 = v.findViewById(R.id.vanilla_maze_dot_2_6);
        mazeDot3_1 = v.findViewById(R.id.vanilla_maze_dot_3_1);
        mazeDot3_2 = v.findViewById(R.id.vanilla_maze_dot_3_2);
        mazeDot3_3 = v.findViewById(R.id.vanilla_maze_dot_3_3);
        mazeDot3_4 = v.findViewById(R.id.vanilla_maze_dot_3_4);
        mazeDot3_5 = v.findViewById(R.id.vanilla_maze_dot_3_5);
        mazeDot3_6 = v.findViewById(R.id.vanilla_maze_dot_3_6);
        mazeDot4_1 = v.findViewById(R.id.vanilla_maze_dot_4_1);
        mazeDot4_2 = v.findViewById(R.id.vanilla_maze_dot_4_2);
        mazeDot4_3 = v.findViewById(R.id.vanilla_maze_dot_4_3);
        mazeDot4_4 = v.findViewById(R.id.vanilla_maze_dot_4_4);
        mazeDot4_5 = v.findViewById(R.id.vanilla_maze_dot_4_5);
        mazeDot4_6 = v.findViewById(R.id.vanilla_maze_dot_4_6);
        mazeDot5_1 = v.findViewById(R.id.vanilla_maze_dot_5_1);
        mazeDot5_2 = v.findViewById(R.id.vanilla_maze_dot_5_2);
        mazeDot5_3 = v.findViewById(R.id.vanilla_maze_dot_5_3);
        mazeDot5_4 = v.findViewById(R.id.vanilla_maze_dot_5_4);
        mazeDot5_5 = v.findViewById(R.id.vanilla_maze_dot_5_5);
        mazeDot5_6 = v.findViewById(R.id.vanilla_maze_dot_5_6);
        mazeDot6_1 = v.findViewById(R.id.vanilla_maze_dot_6_1);
        mazeDot6_2 = v.findViewById(R.id.vanilla_maze_dot_6_2);
        mazeDot6_3 = v.findViewById(R.id.vanilla_maze_dot_6_3);
        mazeDot6_4 = v.findViewById(R.id.vanilla_maze_dot_6_4);
        mazeDot6_5 = v.findViewById(R.id.vanilla_maze_dot_6_5);
        mazeDot6_6 = v.findViewById(R.id.vanilla_maze_dot_6_6);
        // Dot + Mark drawables
        dot = getResources().getDrawable(R.drawable.ic_maze_dot);
        mark = getResources().getDrawable(R.drawable.ic_maze_mark);
        // Theme stuff
        if (MainActivity.grabThemePreference()) {
            dot = getResources().getDrawable(R.drawable.ic_maze_dot_dark);
            mark = getResources().getDrawable(R.drawable.ic_maze_mark_dark);
            // Dots
            mazeDot1_1.setImageDrawable(dot);
            mazeDot1_2.setImageDrawable(dot);
            mazeDot1_3.setImageDrawable(dot);
            mazeDot1_4.setImageDrawable(dot);
            mazeDot1_5.setImageDrawable(dot);
            mazeDot1_6.setImageDrawable(dot);
            mazeDot2_1.setImageDrawable(dot);
            mazeDot2_2.setImageDrawable(dot);
            mazeDot2_3.setImageDrawable(dot);
            mazeDot2_4.setImageDrawable(dot);
            mazeDot2_5.setImageDrawable(dot);
            mazeDot2_6.setImageDrawable(dot);
            mazeDot3_1.setImageDrawable(dot);
            mazeDot3_2.setImageDrawable(dot);
            mazeDot3_3.setImageDrawable(dot);
            mazeDot3_4.setImageDrawable(dot);
            mazeDot3_5.setImageDrawable(dot);
            mazeDot3_6.setImageDrawable(dot);
            mazeDot4_1.setImageDrawable(dot);
            mazeDot4_2.setImageDrawable(dot);
            mazeDot4_3.setImageDrawable(dot);
            mazeDot4_4.setImageDrawable(dot);
            mazeDot4_5.setImageDrawable(dot);
            mazeDot4_6.setImageDrawable(dot);
            mazeDot5_1.setImageDrawable(dot);
            mazeDot5_2.setImageDrawable(dot);
            mazeDot5_3.setImageDrawable(dot);
            mazeDot5_4.setImageDrawable(dot);
            mazeDot5_5.setImageDrawable(dot);
            mazeDot5_6.setImageDrawable(dot);
            mazeDot6_1.setImageDrawable(dot);
            mazeDot6_2.setImageDrawable(dot);
            mazeDot6_3.setImageDrawable(dot);
            mazeDot6_4.setImageDrawable(dot);
            mazeDot6_5.setImageDrawable(dot);
            mazeDot6_6.setImageDrawable(dot);
            // Borders
            Drawable border = getResources().getDrawable(R.drawable.white_border);
            mazeDot1_1.setBackground(border);
            mazeDot1_2.setBackground(border);
            mazeDot1_3.setBackground(border);
            mazeDot1_4.setBackground(border);
            mazeDot1_5.setBackground(border);
            mazeDot1_6.setBackground(border);
            mazeDot2_1.setBackground(border);
            mazeDot2_2.setBackground(border);
            mazeDot2_3.setBackground(border);
            mazeDot2_4.setBackground(border);
            mazeDot2_5.setBackground(border);
            mazeDot2_6.setBackground(border);
            mazeDot3_1.setBackground(border);
            mazeDot3_2.setBackground(border);
            mazeDot3_3.setBackground(border);
            mazeDot3_4.setBackground(border);
            mazeDot3_5.setBackground(border);
            mazeDot3_6.setBackground(border);
            mazeDot4_1.setBackground(border);
            mazeDot4_2.setBackground(border);
            mazeDot4_3.setBackground(border);
            mazeDot4_4.setBackground(border);
            mazeDot4_5.setBackground(border);
            mazeDot4_6.setBackground(border);
            mazeDot5_1.setBackground(border);
            mazeDot5_2.setBackground(border);
            mazeDot5_3.setBackground(border);
            mazeDot5_4.setBackground(border);
            mazeDot5_5.setBackground(border);
            mazeDot5_6.setBackground(border);
            mazeDot6_1.setBackground(border);
            mazeDot6_2.setBackground(border);
            mazeDot6_3.setBackground(border);
            mazeDot6_4.setBackground(border);
            mazeDot6_5.setBackground(border);
            mazeDot6_6.setBackground(border);
        }
        // The mass copy-and-paste code for click listeners
        mazeDot1_1.setOnClickListener((View view) -> {
            if (!mazeDot_marked[0][0]) mazeDot1_1.setImageDrawable(mark);
            else mazeDot1_1.setImageDrawable(dot);
            mazeDot_marked[0][0] = !mazeDot_marked[0][0];
        });
        mazeDot1_2.setOnClickListener((View view) -> {
            if (!mazeDot_marked[0][1]) mazeDot1_2.setImageDrawable(mark);
            else mazeDot1_2.setImageDrawable(dot);
            mazeDot_marked[0][1] = !mazeDot_marked[0][1];
        });
        mazeDot1_3.setOnClickListener((View view) -> {
            if (!mazeDot_marked[0][2]) mazeDot1_3.setImageDrawable(mark);
            else mazeDot1_3.setImageDrawable(dot);
            mazeDot_marked[0][2] = !mazeDot_marked[0][2];
        });
        mazeDot1_4.setOnClickListener((View view) -> {
            if (!mazeDot_marked[0][3]) mazeDot1_4.setImageDrawable(mark);
            else mazeDot1_4.setImageDrawable(dot);
            mazeDot_marked[0][3] = !mazeDot_marked[0][3];
        });
        mazeDot1_5.setOnClickListener((View view) -> {
            if (!mazeDot_marked[0][4]) mazeDot1_5.setImageDrawable(mark);
            else mazeDot1_5.setImageDrawable(dot);
            mazeDot_marked[0][4] = !mazeDot_marked[0][4];
        });
        mazeDot1_6.setOnClickListener((View view) -> {
            if (!mazeDot_marked[0][5]) mazeDot1_6.setImageDrawable(mark);
            else mazeDot1_6.setImageDrawable(dot);
            mazeDot_marked[0][5] = !mazeDot_marked[0][5];
        });
        mazeDot2_1.setOnClickListener((View view) -> {
            if (!mazeDot_marked[1][0]) mazeDot2_1.setImageDrawable(mark);
            else mazeDot2_1.setImageDrawable(dot);
            mazeDot_marked[1][0] = !mazeDot_marked[1][0];
        });
        mazeDot2_2.setOnClickListener((View view) -> {
            if (!mazeDot_marked[1][1]) mazeDot2_2.setImageDrawable(mark);
            else mazeDot2_2.setImageDrawable(dot);
            mazeDot_marked[1][1] = !mazeDot_marked[1][1];
        });
        mazeDot2_3.setOnClickListener((View view) -> {
            if (!mazeDot_marked[1][2]) mazeDot2_3.setImageDrawable(mark);
            else mazeDot2_3.setImageDrawable(dot);
            mazeDot_marked[1][2] = !mazeDot_marked[1][2];
        });
        mazeDot2_4.setOnClickListener((View view) -> {
            if (!mazeDot_marked[1][3]) mazeDot2_4.setImageDrawable(mark);
            else mazeDot2_4.setImageDrawable(dot);
            mazeDot_marked[1][3] = !mazeDot_marked[1][3];
        });
        mazeDot2_5.setOnClickListener((View view) -> {
            if (!mazeDot_marked[1][4]) mazeDot2_5.setImageDrawable(mark);
            else mazeDot2_5.setImageDrawable(dot);
            mazeDot_marked[1][4] = !mazeDot_marked[1][4];
        });
        mazeDot2_6.setOnClickListener((View view) -> {
            if (!mazeDot_marked[1][5]) mazeDot2_6.setImageDrawable(mark);
            else mazeDot2_6.setImageDrawable(dot);
            mazeDot_marked[1][5] = !mazeDot_marked[1][5];
        });
        mazeDot3_1.setOnClickListener((View view) -> {
            if (!mazeDot_marked[2][0]) mazeDot3_1.setImageDrawable(mark);
            else mazeDot3_1.setImageDrawable(dot);
            mazeDot_marked[2][0] = !mazeDot_marked[2][0];
        });
        mazeDot3_2.setOnClickListener((View view) -> {
            if (!mazeDot_marked[2][1]) mazeDot3_2.setImageDrawable(mark);
            else mazeDot3_2.setImageDrawable(dot);
            mazeDot_marked[2][1] = !mazeDot_marked[2][1];
        });
        mazeDot3_3.setOnClickListener((View view) -> {
            if (!mazeDot_marked[2][2]) mazeDot3_3.setImageDrawable(mark);
            else mazeDot3_3.setImageDrawable(dot);
            mazeDot_marked[2][2] = !mazeDot_marked[2][2];
        });
        mazeDot3_4.setOnClickListener((View view) -> {
            if (!mazeDot_marked[2][3]) mazeDot3_4.setImageDrawable(mark);
            else mazeDot3_4.setImageDrawable(dot);
            mazeDot_marked[2][3] = !mazeDot_marked[2][3];
        });
        mazeDot3_5.setOnClickListener((View view) -> {
            if (!mazeDot_marked[2][4]) mazeDot3_5.setImageDrawable(mark);
            else mazeDot3_5.setImageDrawable(dot);
            mazeDot_marked[2][4] = !mazeDot_marked[2][4];
        });
        mazeDot3_6.setOnClickListener((View view) -> {
            if (!mazeDot_marked[2][5]) mazeDot3_6.setImageDrawable(mark);
            else mazeDot3_6.setImageDrawable(dot);
            mazeDot_marked[2][5] = !mazeDot_marked[2][5];
        });
        mazeDot4_1.setOnClickListener((View view) -> {
            if (!mazeDot_marked[3][0]) mazeDot4_1.setImageDrawable(mark);
            else mazeDot4_1.setImageDrawable(dot);
            mazeDot_marked[3][0] = !mazeDot_marked[3][0];
        });
        mazeDot4_2.setOnClickListener((View view) -> {
            if (!mazeDot_marked[3][1]) mazeDot4_2.setImageDrawable(mark);
            else mazeDot4_2.setImageDrawable(dot);
            mazeDot_marked[3][1] = !mazeDot_marked[3][1];
        });
        mazeDot4_3.setOnClickListener((View view) -> {
            if (!mazeDot_marked[3][2]) mazeDot4_3.setImageDrawable(mark);
            else mazeDot4_3.setImageDrawable(dot);
            mazeDot_marked[3][2] = !mazeDot_marked[3][2];
        });
        mazeDot4_4.setOnClickListener((View view) -> {
            if (!mazeDot_marked[3][3]) mazeDot4_4.setImageDrawable(mark);
            else mazeDot4_4.setImageDrawable(dot);
            mazeDot_marked[3][3] = !mazeDot_marked[3][3];
        });
        mazeDot4_5.setOnClickListener((View view) -> {
            if (!mazeDot_marked[3][4]) mazeDot4_5.setImageDrawable(mark);
            else mazeDot4_5.setImageDrawable(dot);
            mazeDot_marked[3][4] = !mazeDot_marked[3][4];
        });
        mazeDot4_6.setOnClickListener((View view) -> {
            if (!mazeDot_marked[3][5]) mazeDot4_6.setImageDrawable(mark);
            else mazeDot4_6.setImageDrawable(dot);
            mazeDot_marked[3][5] = !mazeDot_marked[3][5];
        });
        mazeDot5_1.setOnClickListener((View view) -> {
            if (!mazeDot_marked[4][0]) mazeDot5_1.setImageDrawable(mark);
            else mazeDot5_1.setImageDrawable(dot);
            mazeDot_marked[4][0] = !mazeDot_marked[4][0];
        });
        mazeDot5_2.setOnClickListener((View view) -> {
            if (!mazeDot_marked[4][1]) mazeDot5_2.setImageDrawable(mark);
            else mazeDot5_2.setImageDrawable(dot);
            mazeDot_marked[4][1] = !mazeDot_marked[4][1];
        });
        mazeDot5_3.setOnClickListener((View view) -> {
            if (!mazeDot_marked[4][2]) mazeDot5_3.setImageDrawable(mark);
            else mazeDot5_3.setImageDrawable(dot);
            mazeDot_marked[4][2] = !mazeDot_marked[4][2];
        });
        mazeDot5_4.setOnClickListener((View view) -> {
            if (!mazeDot_marked[4][3]) mazeDot5_4.setImageDrawable(mark);
            else mazeDot5_4.setImageDrawable(dot);
            mazeDot_marked[4][3] = !mazeDot_marked[4][3];
        });
        mazeDot5_5.setOnClickListener((View view) -> {
            if (!mazeDot_marked[4][4]) mazeDot5_5.setImageDrawable(mark);
            else mazeDot5_5.setImageDrawable(dot);
            mazeDot_marked[4][4] = !mazeDot_marked[4][4];
        });
        mazeDot5_6.setOnClickListener((View view) -> {
            if (!mazeDot_marked[4][5]) mazeDot5_6.setImageDrawable(mark);
            else mazeDot5_6.setImageDrawable(dot);
            mazeDot_marked[4][5] = !mazeDot_marked[4][5];
        });
        mazeDot6_1.setOnClickListener((View view) -> {
            if (!mazeDot_marked[5][0]) mazeDot6_1.setImageDrawable(mark);
            else mazeDot6_1.setImageDrawable(dot);
            mazeDot_marked[5][0] = !mazeDot_marked[5][0];
        });
        mazeDot6_2.setOnClickListener((View view) -> {
            if (!mazeDot_marked[5][1]) mazeDot6_2.setImageDrawable(mark);
            else mazeDot6_2.setImageDrawable(dot);
            mazeDot_marked[5][1] = !mazeDot_marked[5][1];
        });
        mazeDot6_3.setOnClickListener((View view) -> {
            if (!mazeDot_marked[5][2]) mazeDot6_3.setImageDrawable(mark);
            else mazeDot6_3.setImageDrawable(dot);
            mazeDot_marked[5][2] = !mazeDot_marked[5][2];
        });
        mazeDot6_4.setOnClickListener((View view) -> {
            if (!mazeDot_marked[5][3]) mazeDot6_4.setImageDrawable(mark);
            else mazeDot6_4.setImageDrawable(dot);
            mazeDot_marked[5][3] = !mazeDot_marked[5][3];
        });
        mazeDot6_5.setOnClickListener((View view) -> {
            if (!mazeDot_marked[5][4]) mazeDot6_5.setImageDrawable(mark);
            else mazeDot6_5.setImageDrawable(dot);
            mazeDot_marked[5][4] = !mazeDot_marked[5][4];
        });
        mazeDot6_6.setOnClickListener((View view) -> {
            if (!mazeDot_marked[5][5]) mazeDot6_6.setImageDrawable(mark);
            else mazeDot6_6.setImageDrawable(dot);
            mazeDot_marked[5][5] = !mazeDot_marked[5][5];
        });
        // Logic
        v.findViewById(R.id.vanilla_maze_btn).setOnClickListener((View view) -> {
            log.printExclog("Click listened: btn");
            // Print maze
            String[] print = printMaze();
            log.print(print[0]);
            log.print(print[1]);
            log.print(print[2]);
            log.print(print[3]);
            log.print(print[4]);
            log.print(print[5]);
            // find maze
            ImageView maze = v.findViewById(R.id.vanilla_maze_out);
            View error = v.findViewById(R.id.vanilla_maze_out_error);
            if (mazeDot_marked[1][0] && mazeDot_marked[2][5]) {
                error.setVisibility(View.INVISIBLE);
                log.print("Maze found. Outputting.");
                log.printExclog("Maze #0");
                maze.setImageDrawable(getResources().getDrawable(R.drawable.maze0));
                maze.setVisibility(View.VISIBLE);
            } else if (mazeDot_marked[3][1] && mazeDot_marked[1][4]) {
                error.setVisibility(View.INVISIBLE);
                log.print("Maze found. Outputting.");
                log.printExclog("Maze #1");
                maze.setImageDrawable(getResources().getDrawable(R.drawable.maze1));
                maze.setVisibility(View.VISIBLE);
            } else if (mazeDot_marked[3][3] && mazeDot_marked[3][5]) {
                error.setVisibility(View.INVISIBLE);
                log.print("Maze found. Outputting.");
                log.printExclog("Maze #2");
                maze.setImageDrawable(getResources().getDrawable(R.drawable.maze2));
                maze.setVisibility(View.VISIBLE);
            } else if (mazeDot_marked[0][0] && mazeDot_marked[3][0]) {
                error.setVisibility(View.INVISIBLE);
                log.print("Maze found. Outputting.");
                log.printExclog("Maze #3");
                maze.setImageDrawable(getResources().getDrawable(R.drawable.maze3));
                maze.setVisibility(View.VISIBLE);
            } else if (mazeDot_marked[2][4] && mazeDot_marked[5][3]) {
                error.setVisibility(View.INVISIBLE);
                log.print("Maze found. Outputting.");
                log.printExclog("Maze #4");
                maze.setImageDrawable(getResources().getDrawable(R.drawable.maze4));
                maze.setVisibility(View.VISIBLE);
            } else if (mazeDot_marked[0][4] && mazeDot_marked[4][2]) {
                error.setVisibility(View.INVISIBLE);
                log.print("Maze found. Outputting.");
                log.printExclog("Maze #5");
                maze.setImageDrawable(getResources().getDrawable(R.drawable.maze5));
                maze.setVisibility(View.VISIBLE);
            } else if (mazeDot_marked[0][1] && mazeDot_marked[5][1]) {
                error.setVisibility(View.INVISIBLE);
                log.print("Maze found. Outputting.");
                log.printExclog("Maze #6");
                maze.setImageDrawable(getResources().getDrawable(R.drawable.maze6));
                maze.setVisibility(View.VISIBLE);
            } else if (mazeDot_marked[0][3] && mazeDot_marked[3][2]) {
                error.setVisibility(View.INVISIBLE);
                log.print("Maze found. Outputting.");
                log.printExclog("Maze #7");
                maze.setImageDrawable(getResources().getDrawable(R.drawable.maze7));
                maze.setVisibility(View.VISIBLE);
            } else if (mazeDot_marked[1][2] && mazeDot_marked[4][0]) {
                error.setVisibility(View.INVISIBLE);
                log.print("Maze found. Outputting.");
                log.printExclog("Maze #8");
                maze.setImageDrawable(getResources().getDrawable(R.drawable.maze8));
                maze.setVisibility(View.VISIBLE);
            } else {
                log.print("Maze could not be found.");
                maze.setVisibility(View.INVISIBLE);
                error.setVisibility(View.VISIBLE);
            }
        });
        return v;
    }

    public String[] printMaze() {
        String[] out = {"","","","","",""};
        String a = mazeDot_marked[0][0] ? "X" : " ";
        String b = mazeDot_marked[0][1] ? "X" : " ";
        String c = mazeDot_marked[0][2] ? "X" : " ";
        String d = mazeDot_marked[0][3] ? "X" : " ";
        String e = mazeDot_marked[0][4] ? "X" : " ";
        String f = mazeDot_marked[0][5] ? "X" : " ";
        out[0] = "[" + a + "][" + b + "][" + c + "][" + d + "][" + e + "][" + f + "]";
        a = mazeDot_marked[1][0] ? "X" : " ";
        b = mazeDot_marked[1][1] ? "X" : " ";
        c = mazeDot_marked[1][2] ? "X" : " ";
        d = mazeDot_marked[1][3] ? "X" : " ";
        e = mazeDot_marked[1][4] ? "X" : " ";
        f = mazeDot_marked[1][5] ? "X" : " ";
        out[1] = "[" + a + "][" + b + "][" + c + "][" + d + "][" + e + "][" + f + "]";
        a = mazeDot_marked[2][0] ? "X" : " ";
        b = mazeDot_marked[2][1] ? "X" : " ";
        c = mazeDot_marked[2][2] ? "X" : " ";
        d = mazeDot_marked[2][3] ? "X" : " ";
        e = mazeDot_marked[2][4] ? "X" : " ";
        f = mazeDot_marked[2][5] ? "X" : " ";
        out[2] = "[" + a + "][" + b + "][" + c + "][" + d + "][" + e + "][" + f + "]";
        a = mazeDot_marked[3][0] ? "X" : " ";
        b = mazeDot_marked[3][1] ? "X" : " ";
        c = mazeDot_marked[3][2] ? "X" : " ";
        d = mazeDot_marked[3][3] ? "X" : " ";
        e = mazeDot_marked[3][4] ? "X" : " ";
        f = mazeDot_marked[3][5] ? "X" : " ";
        out[3] = "[" + a + "][" + b + "][" + c + "][" + d + "][" + e + "][" + f + "]";
        a = mazeDot_marked[4][0] ? "X" : " ";
        b = mazeDot_marked[4][1] ? "X" : " ";
        c = mazeDot_marked[4][2] ? "X" : " ";
        d = mazeDot_marked[4][3] ? "X" : " ";
        e = mazeDot_marked[4][4] ? "X" : " ";
        f = mazeDot_marked[4][5] ? "X" : " ";
        out[4] = "[" + a + "][" + b + "][" + c + "][" + d + "][" + e + "][" + f + "]";
        a = mazeDot_marked[5][0] ? "X" : " ";
        b = mazeDot_marked[5][1] ? "X" : " ";
        c = mazeDot_marked[5][2] ? "X" : " ";
        d = mazeDot_marked[5][3] ? "X" : " ";
        e = mazeDot_marked[5][4] ? "X" : " ";
        f = mazeDot_marked[5][5] ? "X" : " ";
        out[5] = "[" + a + "][" + b + "][" + c + "][" + d + "][" + e + "][" + f + "]";
        return out;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle(getResources().getString(R.string.menu_vanilla_maze));
    }
}
