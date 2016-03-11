package android.bignerdranch.com.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

/**
 * Created by Archer on 2016/3/7.
 */
public abstract class SingleFragmentActivity extends FragmentActivity {

    protected abstract Fragment createFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        android.support.v4.app.FragmentManager fm=getSupportFragmentManager();
        Fragment fragment=fm.findFragmentById(R.id.fragmentContainer);
        if (fragment==null){
            fragment=createFragment();
            fm.beginTransaction()
                    .add(R.id.fragmentContainer,fragment)
                    .commit();

        }
    }
}
