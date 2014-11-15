package com.petfinder.margot.findmypetmaterial.fragmentos;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.petfinder.margot.findmypetmaterial.R;

import java.util.ArrayList;

/**
 * Created by Margot on 10/11/2014.
 */
public class PerdidosLista extends android.support.v4.app.Fragment{
    ListView listViewPerros;


    public static PerdidosLista newInstance(int position) {

        PerdidosLista perdidos = new PerdidosLista();
        Bundle extraArguments = new Bundle();
        perdidos.setArguments(extraArguments);
        return perdidos;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_perdidos_lista,container,false);
        listViewPerros =(ListView) v.findViewById(R.id.listView);

        //Aqui alimentamos la lista con datos.
        ArrayList<Perros> listaPerros = new ArrayList<Perros>();

        for (int contador = 0; contador < 7; contador ++){
            Perros nuevoPerro = new Perros();
            nuevoPerro.setNombre("Raycillo");
            nuevoPerro.setCaracteristicas("buena vibra ;)");

            listaPerros.add(nuevoPerro);
        }
        this.listViewPerros.setAdapter(new AdapterPerros(getActivity(),listaPerros));



        return v;
    }


}
