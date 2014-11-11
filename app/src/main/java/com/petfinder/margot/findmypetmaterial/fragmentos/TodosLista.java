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
public class TodosLista extends android.support.v4.app.Fragment {


    public static TodosLista newInstance(int position) {

        TodosLista fragmentCercanos = new TodosLista();
        Bundle extraArguments = new Bundle();
        fragmentCercanos.setArguments(extraArguments);
        return fragmentCercanos;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_todos_lista,container,false);






        return v;


    }
}