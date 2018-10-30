package fdn.f.f.fragmentpracticezhouquan.activity;

import android.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.NavigableMap;

import fdn.f.f.fragmentpracticezhouquan.R;
import fdn.f.f.fragmentpracticezhouquan.fragment.NavigationFragment;


public class MainActivity extends BaseActivity {
    private NavigationFragment navigationFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationFragment = new NavigationFragment();

        FragmentTransaction
                fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.main_frame, navigationFragment).commit();

    }
}
