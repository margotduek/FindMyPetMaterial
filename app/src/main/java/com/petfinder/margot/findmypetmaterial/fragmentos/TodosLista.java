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
public class TodosLista extends android.support.v4.app.Fragment {


    ListView listViewPerros;


    public static TodosLista newInstance(int position) {

        TodosLista fragmentCercanos = new TodosLista();
        Bundle extraArguments = new Bundle();
        fragmentCercanos.setArguments(extraArguments);
        return fragmentCercanos;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_todos_lista,container,false);
        listViewPerros =(ListView) v.findViewById(R.id.listView);

        //Aqui alimentamos de datos la lista de todos.
        ArrayList<Perros> listaPerros = new ArrayList<Perros>();

        for (int contador = 0; contador <7; contador ++) {
            Perros nuevoPerro = new Perros();
            nuevoPerro.setNombre("Margotcilla");
            nuevoPerro.setCaracteristicas("sexy ;)");


            listaPerros.add(nuevoPerro);
        }
        this.listViewPerros.setAdapter(new AdapterPerros(getActivity(),listaPerros));

        return v;


    }
}