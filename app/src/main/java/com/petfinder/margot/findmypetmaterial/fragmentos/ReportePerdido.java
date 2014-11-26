package com.petfinder.margot.findmypetmaterial.fragmentos;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.petfinder.margot.findmypetmaterial.R;

/**
 * Created by RayPK on 20/11/14.
 */
public class ReportePerdido extends android.support.v4.app.Fragment{

    EditText editText;
    Button perdido;

    public static ReportePerdido newInstance(int position) {

        ReportePerdido reportePerdido = new ReportePerdido();
        Bundle extraArguments = new Bundle();
        reportePerdido.setArguments(extraArguments);
        return reportePerdido;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_reportar_perdi, container, false);



        return v;

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        editText = (EditText) getActivity().findViewById(R.id.editPerro);
        perdido = (Button) getActivity().findViewById(R.id.btn_reportar_perdi);


        perdido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = editText.getText().toString();
                Toast.makeText(getActivity(),s,Toast.LENGTH_LONG).show();
            }
        });



    }
}



