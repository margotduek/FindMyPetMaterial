package com.petfinder.margot.findmypetmaterial;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Toast;

import com.petfinder.margot.findmypetmaterial.fragmentos.Fragmento1;
import com.petfinder.margot.findmypetmaterial.fragmentos.Fragmento2_Reportes;
import com.petfinder.margot.findmypetmaterial.fragmentos.ReportePerdido;


public class MainActivity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (savedInstanceState == null) {
        getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new Fragmento1())
                    .commit();
        }
    }

    // Crear una opción en el menu que nos permita reportar.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.boton_report, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

        }

        if (R.id.boton_report == item.getItemId()) {

           Log.wtf("pressed " + item.getItemId(), "REPORT!");


            Toast.makeText(this, "¿encontraste o perdiste una mascota?", Toast.LENGTH_SHORT).show();

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, new Fragmento2_Reportes())
                    .commit();

            return true;

        }


        else {
            return super.onOptionsItemSelected(item);
        }


    }



}
