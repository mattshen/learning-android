package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by shenm on 13/05/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
