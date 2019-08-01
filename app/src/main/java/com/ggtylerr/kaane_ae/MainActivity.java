package com.ggtylerr.kaane_ae;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.ggtylerr.kaane_ae.vanilla.Button;
import com.ggtylerr.kaane_ae.vanilla.Keypad;
import com.ggtylerr.kaane_ae.vanilla.Wires;
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
 * Alpha [α] v0.1
 *
 * ~~~developed by ggtylerr~~~
 */

public class MainActivity extends AppCompatActivity 
        implements NavigationView.OnNavigationItemSelectedListener {

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

        // dark theme
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
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
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        displaySelectedScreen(item.getItemId());
        return true;
    }
}
