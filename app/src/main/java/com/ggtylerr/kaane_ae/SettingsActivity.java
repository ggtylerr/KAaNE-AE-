package com.ggtylerr.kaane_ae;

import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceManager;
import androidx.preference.SwitchPreferenceCompat;

import com.ggtylerr.kaane_ae.util.log;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.settings, new SettingsFragment())
                .commit();
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        // dark theme
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (sharedPrefs.getBoolean("theme",false)) {
            setTheme(R.style.AppTheme_Dark);
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.darkColorPrimaryDark)));
        }
    }

    public static class SettingsFragment extends PreferenceFragmentCompat
        implements SharedPreferences.OnSharedPreferenceChangeListener {
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey);
        }
        @Override
        public void onSharedPreferenceChanged(SharedPreferences sharedPrefs, String key) {
            SharedPreferences.Editor editor = sharedPrefs.edit();
            Preference pref = findPreference(key);
            boolean checked = ((SwitchPreferenceCompat) pref).isChecked();
            editor.putBoolean(key,checked);
            editor.apply();
            if (key.equals("excessive_log")) log.excessive_log = checked;
        }
        @Override
        public void onResume() {
            super.onResume();
            getPreferenceManager().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
        }
        @Override
        public void onPause() {
            getPreferenceManager().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
            super.onPause();
        }
        @Override
        public void onViewCreated(View view, Bundle savedInstanceState) {
            super.onViewCreated(view,savedInstanceState);
            Preference pref = findPreference("github");
            Drawable icon = pref.getIcon();
            icon.setTint(getResources().getColor(R.color.black));
            SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(getContext());
            if (sharedPrefs.getBoolean("theme",false)) {
                pref = findPreference("log_menu");
                icon = pref.getIcon();
                icon.setTint(getResources().getColor(R.color.white));
                pref = findPreference("excessive_log");
                icon = pref.getIcon();
                icon.setTint(getResources().getColor(R.color.white));
                pref = findPreference("theme");
                icon = pref.getIcon();
                icon.setTint(getResources().getColor(R.color.white));
                pref = findPreference("github");
                icon = pref.getIcon();
                icon.setTint(getResources().getColor(R.color.white));
                pref = findPreference("discord");
                icon = pref.getIcon();
                icon.setTint(getResources().getColor(R.color.white));
                pref = findPreference("wiki");
                icon = pref.getIcon();
                icon.setTint(getResources().getColor(R.color.white));
                pref = findPreference("blog");
                icon = pref.getIcon();
                icon.setTint(getResources().getColor(R.color.white));
            }
        }
    }
}