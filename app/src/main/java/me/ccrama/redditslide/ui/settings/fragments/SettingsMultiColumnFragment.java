package me.ccrama.redditslide.ui.settings.fragments;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.SeekBarPreference;

import me.ccrama.redditslide.R;
import me.ccrama.redditslide.Reddit;
import me.ccrama.redditslide.ui.settings.SettingsActivity;
import me.ccrama.redditslide.util.PreferenceHelper.Key;

/**
 * Created by TacoTheDank on 05/12/2021.
 */
public class SettingsMultiColumnFragment extends PreferenceFragmentCompat {

    private SeekBarPreference landscapeSeekbar;

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.preferences_multicolumn);

        landscapeSeekbar = findPreference(getString(Key.PREF_LANDSCAPE_SEEKBAR));
        if (landscapeSeekbar != null) {
            landscapeSeekbar.setValue(Reddit.dpWidth - 1);

            // NOTE: Could this be improved?
            landscapeSeekbar.setTitle(getResources().getQuantityString(
                    R.plurals.landscape_columns,
                    landscapeSeekbar.getValue() + 1,
                    landscapeSeekbar.getValue() + 1));

            landscapeSeekbar.setOnPreferenceChangeListener((preference, newValue) -> {
                landscapeSeekbar.setTitle(getResources().getQuantityString(
                        R.plurals.landscape_columns,
                        landscapeSeekbar.getValue() + 1,
                        landscapeSeekbar.getValue() + 1));
                SettingsActivity.changed = true;
                return true;
            });
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        final int landscapeValue = landscapeSeekbar.getValue() + 1;
        Reddit.dpWidth = landscapeValue;
        Reddit.colors.edit()
                .putInt("tabletOVERRIDE", landscapeValue)
                .apply();
    }

    @Override
    public void onStart() {
        super.onStart();
        ((SettingsActivity) getActivity()).getSupportActionBar().setTitle(R.string.settings_title_multi_column);
    }
}
