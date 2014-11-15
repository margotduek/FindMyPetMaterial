package com.petfinder.margot.findmypetmaterial.fragmentos;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.astuetz.PagerSlidingTabStrip;
import com.petfinder.margot.findmypetmaterial.R;
import com.petfinder.margot.findmypetmaterial.adapters.TabPager;

import java.util.ArrayList;

/**
 * Created by Margot on 10/11/2014.
 */
public class Fragmento1 extends android.support.v4.app.Fragment {

    ArrayList<android.support.v4.app.Fragment> listaFragments;
    TabPager tabPager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_main,container,false);


        listaFragments = new ArrayList<android.support.v4.app.Fragment>();


        listaFragments.add(EncontradosLista.newInstance(0));
        listaFragments.add(TodosLista.newInstance(0));
        listaFragments.add(PerdidosLista.newInstance(0));


        // Creamos nuestro Adapter
        tabPager = new TabPager(getFragmentManager(), listaFragments);


        // Initialize the ViewPager and set an adapter
        final ViewPager pager = (ViewPager) v.findViewById(R.id.pager);


        pager.setAdapter(tabPager);

        PagerSlidingTabStrip tabs = (PagerSlidingTabStrip) v.findViewById(R.id.tabs);


        //amarillo --->
        tabs.setIndicatorColor(getResources().getColor(R.color.accent));

        tabs.setShouldExpand(true);
        tabs.setViewPager(pager);
        


        return v;
    }
}
