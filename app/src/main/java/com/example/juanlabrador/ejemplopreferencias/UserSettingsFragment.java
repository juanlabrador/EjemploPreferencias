package com.example.juanlabrador.ejemplopreferencias;


import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by juanlabrador on 06/10/14.
 */
public class UserSettingsFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.settings);
    }
}
