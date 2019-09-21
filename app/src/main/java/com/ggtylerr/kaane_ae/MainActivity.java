package com.ggtylerr.kaane_ae;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.ggtylerr.kaane_ae.mod.a101Dalmatians;
import com.ggtylerr.kaane_ae.vanilla.*;
import com.google.android.material.navigation.NavigationView;
import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.preference.PreferenceManager;

import android.view.Menu;

/**
 * KAaNE [AE]
 *
 * The KTaNE assistant program for Androids
 *
 * Alpha [α] v0.3
 *
 * ~~~developed by ggtylerr~~~
 */

public class MainActivity extends AppCompatActivity 
        implements NavigationView.OnNavigationItemSelectedListener {
    private static SharedPreferences sharedPrefs;
    public static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        if(savedInstanceState == null) displaySelectedScreen(R.id.nav_home);
        navigationView.setCheckedItem(R.id.nav_home);

        // dark theme
        sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (sharedPrefs.getBoolean("theme",false)) {
            setTheme(R.style.AppTheme_Dark);
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.darkColorPrimaryDark)));
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
            navigationView.setItemTextColor(cs);
            navigationView.setItemIconTintList(cs);
            navigationView.setBackgroundColor(getResources().getColor(R.color.darkColorPrimary));
        }
        // log option
        if (!sharedPrefs.getBoolean("log_menu",false)) {
            Menu menu = navigationView.getMenu();
            MenuItem devMenuItem = menu.getItem(3);
            Menu subMenu = devMenuItem.getSubMenu();
            MenuItem item = subMenu.getItem(0);
            item.setVisible(false);
        }

        context = getApplicationContext();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
//            super.onBackPressed();
            // Disabling back presses so the user doesn't accidentally break theme changes
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void displaySelectedScreen(int id) {
        //creating fragment object
        Fragment fragment = null;

        //initializing the fragment object which is selected
        switch (id) {
            // Normal Menu Options
            case R.id.nav_home: fragment = new HomeScreen(); break;
            case R.id.nav_bomb_settings: fragment = new BombSettings(); break;
            // Vanilla Modules
            case R.id.nav_vanilla_wires: fragment = new Wires(); break;
            case R.id.nav_vanilla_button: fragment = new Button(); break;
            case R.id.nav_vanilla_keypad: fragment = new Keypad(); break;
            case R.id.nav_vanilla_simon_says: fragment = new SimonSays(); break;
            case R.id.nav_vanilla_whos_on_first: fragment = new WhosOnFirst(); break;
            case R.id.nav_vanilla_memory: fragment = new Memory(); break;
            case R.id.nav_vanilla_morse_code: fragment = new MorseCode(); break;
            case R.id.nav_vanilla_complicated_wires: fragment = new ComplicatedWires(); break;
            case R.id.nav_vanilla_wire_sequences: fragment = new WireSequences(); break;
            case R.id.nav_vanilla_maze: fragment = new Maze(); break;
            case R.id.nav_vanilla_password: fragment = new Password(); break;
            case R.id.nav_vanilla_gas: fragment = new Gas(); break;
            case R.id.nav_vanilla_discharge: fragment = new Discharge(); break;
            case R.id.nav_vanilla_knob: fragment = new Knob(); break;
            // Mod Modules
//            case R.id.nav_mod_101_dalmatians: fragment = new a101Dalmatians(); break;
//            case R.id.nav_mod_3d_maze: break;
//            case R.id.nav_mod_3d_tunnels: break;
//            case R.id.nav_mod_aa: break;
//            case R.id.nav_mod_accumulation: break;
//            case R.id.nav_mod_adjacent_letters: break;
//            case R.id.nav_mod_adv_venting_gas: break;
//            case R.id.nav_mod_adventure_game: break;
//            case R.id.nav_mod_alchemy: break;
//            case R.id.nav_mod_atc: break;
            // Dev Screens
            case R.id.nav_dev_log: fragment = new LogFragment(); break;
        }

        //replacing the fragment
        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragment);
            ft.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        displaySelectedScreen(item.getItemId());
        return true;
    }
    public static boolean grabExclogPreference() {
        return sharedPrefs.getBoolean("excessive_log",false);
    }
    public static boolean grabThemePreference() {
        return sharedPrefs.getBoolean("theme",false);
    }
    public static boolean grabLocationPreference() {
        return sharedPrefs.getBoolean("storage_location",false);
    }
}
