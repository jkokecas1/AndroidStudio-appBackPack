package com.shool.backpack.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shool.backpack.R;
import com.shool.backpack.activities.ContenedorActivity;

public class InicioFragment extends Fragment {

    CardView cardTablas, cardCuentos, cardOperaciones, cardHistoria, cardGrografia, cardAnatomia;

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inicio, container, false);

        cardTablas=view.findViewById(R.id.cardTablas);
        cardCuentos = view.findViewById(R.id.cardCuentos);
        cardOperaciones = view.findViewById(R.id.cardOperaciones);
        cardHistoria = view.findViewById(R.id.cardHistoria);
        cardGrografia = view.findViewById(R.id.cardGeografia);
        cardAnatomia = view.findViewById(R.id.cardAnatomia);

        cardTablas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), ContenedorActivity.class);
                intent.putExtra("tipo",1);
                startActivity(intent);
            }
        });
        cardCuentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), ContenedorActivity.class);
                intent.putExtra("tipo",2);
                startActivity(intent);
            }
        });
        cardOperaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), ContenedorActivity.class);
                intent.putExtra("tipo",3);
                startActivity(intent);
            }
        });

        cardHistoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), ContenedorActivity.class);
                intent.putExtra("tipo",4);
                startActivity(intent);
            }
        });
        cardGrografia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), ContenedorActivity.class);
                intent.putExtra("tipo",5);
                startActivity(intent);
            }
        });
        cardAnatomia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), ContenedorActivity.class);
                intent.putExtra("tipo",6);
                startActivity(intent);
            }
        });


        return  view;
    }
}
