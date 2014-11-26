package com.petfinder.margot.findmypetmaterial.fragmentos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.petfinder.margot.findmypetmaterial.R;

/**
 * Created by RayPK on 20/11/14.
 */
public class ReporteEncontrado extends android.support.v4.app.Fragment {

    public static ReporteEncontrado newInstance(int position) {

        ReporteEncontrado reporteEncontrado = new ReporteEncontrado();
        Bundle extraArguments = new Bundle();
        reporteEncontrado.setArguments(extraArguments);
        return reporteEncontrado;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_reportar_encontre, container, false);



        return v;

    }
}
