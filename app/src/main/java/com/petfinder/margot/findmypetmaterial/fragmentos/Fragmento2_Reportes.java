package com.petfinder.margot.findmypetmaterial.fragmentos;

import android.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.petfinder.margot.findmypetmaterial.R;

/**
 * Created by RayPK on 20/11/14.
 */
public class Fragmento2_Reportes extends android.support.v4.app.Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_btn_reportar, container, false);


        Button button = (Button) v.findViewById(R.id.btn_perdi_perro);
        button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getFragmentManager().beginTransaction()
                            .replace(R.id.container, new ReportePerdido())
                            .commit();
                }
            });
        Button button2 = (Button) v.findViewById(R.id.btn_encontre_perro);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction()
                        .replace(R.id.container, new ReporteEncontrado())
                        .commit();
            }
        });

        return v;
    }


}