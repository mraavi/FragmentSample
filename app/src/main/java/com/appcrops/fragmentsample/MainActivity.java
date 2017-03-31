package com.appcrops.fragmentsample;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends Activity implements Fragment1.OnFragment1Listener{

    private String mCurrentFragmentTag = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addFragment(new Fragment1());
    }

    private void addFragment(Fragment fragment) {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
       // Fragment fragment = new Fragment1();
        ft.replace(R.id.fragment_container, fragment);
        ft.commit();
    }

    @Override
    public void showItem(int id) {
        addFragment(new Fragment2());
    }
}
