package com.michaelhat.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    private String tabTitles[] = new String[]{"Delicacies", "Places", "Emergency"};

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment switchToFragment = null;
        switch (position) {
            case (0):
                switchToFragment = new LocalDelicacies();
                break;
            case (1):
                switchToFragment = new PlacesInterest();
                break;
            case (2):
                switchToFragment = new EmergencyContact();
        }
        return switchToFragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return 3;
    }
}
