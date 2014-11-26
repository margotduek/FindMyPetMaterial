package com.petfinder.margot.findmypetmaterial.fragmentos;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.petfinder.margot.findmypetmaterial.R;

/**
 * Created by RayPK on 20/11/14.
 */
public class BotonEncontrePerdi extends android.support.v4.app.Fragment{
    public Button btn_perdi_perro;
    public Button btn_encontre_perro;

    public static BotonEncontrePerdi newInstance(int position) {

        BotonEncontrePerdi botonEncontrePerdi = new BotonEncontrePerdi();
        Bundle extraArguments = new Bundle();
        botonEncontrePerdi.setArguments(extraArguments);
        return botonEncontrePerdi;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_btn_reportar, container, false);

       /* Button btn_perdi_perro = (Button) LinearLayout.findViewById(R.id.btn_perdi_perro);
        btn_perdi_perro.setOnClickListener(new View.OnClickListener()  {

            @Override
            public void onClick(View v) {

                Toast.makeText(BotonEncontrePerdi.this, "Ayudanos a buscar a tu mascota con sus datos.", Toast.LENGTH_SHORT).show();

                // cambio: instance en vez de intent. Intent intentoperdido = new Intent(BotonEncontrePerdi.this, PerdiRegistro.class);
                // startActivity(intentoperdido);
            }
        });

        btn_encontre_perro = (Button) findViewById(R.id.btn_encontre_perro);
        btn_encontre_perro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Toast.makeText(BotonEncontrePerdi.this, "Comparte los datos de la mascota.", Toast.LENGTH_SHORT).show();

                // cambio: instance en vez de intent. Intent intentoperdido = new Intent(BotonEncontrePerdi.this, PerdiRegistro.class);
                // startActivity(intentoperdido);
            }
        });


            return LinearLayout; */
        return v;
    }

}
