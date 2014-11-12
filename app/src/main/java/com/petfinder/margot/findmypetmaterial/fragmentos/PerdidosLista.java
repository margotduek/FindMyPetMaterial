package com.petfinder.margot.findmypetmaterial.fragmentos;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.petfinder.margot.findmypetmaterial.R;

/**
 * Created by Margot on 10/11/2014.
 */
public class PerdidosLista extends android.support.v4.app.Fragment{

    public static PerdidosLista newInstance(int position) {

        PerdidosLista perdidos = new PerdidosLista();
        Bundle extraArguments = new Bundle();
        perdidos.setArguments(extraArguments);
        return perdidos;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_perdidos_lista,container,false);






        return v;
    }


}
