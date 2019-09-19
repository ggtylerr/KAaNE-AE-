package com.ggtylerr.kaane_ae;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceManager;
import androidx.preference.SwitchPreferenceCompat;

import com.ggtylerr.kaane_ae.util.Props;
import com.ggtylerr.kaane_ae.util.log;

import java.io.File;

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

    public void onBackPressed() {
        // super.onBackPressed();
        // Disabling back presses so the user doesn't accidentally break theme changes
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
            // exclog
            if (key.equals("excessive_log")) log.excessive_log = checked;
            // theme
            if (key.equals("theme")) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
            // location
            if (key.equals("storage_location")) {
                log.changed = true;
                if (checked) {
                    // Check if they have permissions
                    if (ContextCompat.checkSelfPermission(getContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(getActivity(), "You need to accept storage permissions in order to write to external storage!", Toast.LENGTH_LONG).show();
                        log.file = new File(MainActivity.context.getFilesDir(), "log.log");
                        Props.configFile = new File(MainActivity.context.getFilesDir(), "config.properties");
                    }
                    else {
                        log.file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + "/kaane-ae","log.log");
                        Props.configFile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + "/kaane-ae","config.properties");
                    }
                }
                else {
                    log.file = new File(MainActivity.context.getFilesDir(), "log.log");
                    Props.configFile = new File(MainActivity.context.getFilesDir(), "config.properties");
                }
            }
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
                pref = findPreference("version");
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