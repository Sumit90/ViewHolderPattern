package com.practise.http.viewholderpattern;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager =getSupportFragmentManager();
        Fragment fragment =fragmentManager.findFragmentById(R.id.fragmentContainer);

        if(fragment==null)
        {
            FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragmentContainer,new MyFragment());
            fragmentTransaction.commit();
        }

    }


}
