package me.ccrama.redditslide.ui.settings.fragments;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.SwitchPreferenceCompat;

import me.ccrama.redditslide.R;
import me.ccrama.redditslide.SettingValues;
import me.ccrama.redditslide.ui.settings.SettingsActivity;
import me.ccrama.redditslide.util.PreferenceHelper.Key;

/**
 * Created by TacoTheDank on 05/12/2021.
 */
public class SettingsCommentsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.preferences_comments);

        final SwitchPreferenceCompat coloredTimeBubblePref
                = findPreference(Key.PREF_COLORED_TIME_BUBBLE);
        if (coloredTimeBubblePref != null) {
            coloredTimeBubblePref.setEnabled(SettingValues.commentLastVisit);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        ((SettingsActivity) getActivity()).getSupportActionBar().setTitle(R.string.settings_title_comments);
    }
}
