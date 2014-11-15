package com.petfinder.margot.findmypetmaterial.fragmentos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.petfinder.margot.findmypetmaterial.R;

import java.util.ArrayList;

/**
 * Created by Margot on 12/11/2014.
 */
public class AdapterPerros extends BaseAdapter {

    public ArrayList<Perros> listaPerros;
    public Context context;

    //Constructor para el adaptador
    public AdapterPerros(Context context, ArrayList<Perros> listaPerros) {
        this.listaPerros = listaPerros;
        this.context = context;
    }



    @Override
    public int getCount() {
        return listaPerros.size();
    }

    @Override
    public Object getItem(int i) {
        return listaPerros.get(i);
    }

    //No usaras este metodo, seguramente
    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder holder;

        if(view == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(R.layout.fragment_item_lista,viewGroup,false);
            holder = new ViewHolder();

            holder.txtNombrePerrito = (TextView)view.findViewById(R.id.textnombreperrito);
            holder.txtCaracteristicas = (TextView)view.findViewById(R.id.textocaracteristica);
            holder.fotoPerrito = (ImageView)view.findViewById(R.id.fotoperrito);
            holder.btnUbicacion = (Button)view.findViewById(R.id.btn_ubicacion);

            view.setTag(holder);


        }else {
            holder = (ViewHolder)view.getTag();
        }

        //Aqui se asignan los datos de cada perro

        holder.txtNombrePerrito.setText(listaPerros.get(position).getNombre());
        holder.txtCaracteristicas.setText(listaPerros.get(position).getCaracteristicas());

        return view;
    }

    public class ViewHolder {
        TextView txtNombrePerrito;
        TextView txtCaracteristicas;
        ImageView fotoPerrito;
        Button btnUbicacion;
    }
}
