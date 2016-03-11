package android.bignerdranch.com.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Archer on 2016/3/7.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
