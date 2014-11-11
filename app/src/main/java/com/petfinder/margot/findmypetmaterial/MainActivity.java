package com.petfinder.margot.findmypetmaterial;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

import com.petfinder.margot.findmypetmaterial.fragmentos.Fragmento1;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
        getSupportFragmentManager().beginTransaction()
                    .add(R.id.container,   new Fragmento1())
                    .commit();
        }
    }




}
