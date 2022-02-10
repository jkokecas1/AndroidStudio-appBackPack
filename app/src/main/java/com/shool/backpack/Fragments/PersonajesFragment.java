package com.shool.backpack.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shool.backpack.Adapters.RecycleViewAdaptadorPersonajes;
import com.shool.backpack.Class.Personaje;
import com.shool.backpack.MainActivity;
import com.shool.backpack.R;

import java.util.ArrayList;
import java.util.List;


public class PersonajesFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    List<Personaje> listPersonajes;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_personajes, container, false);

        listPersonajes = new ArrayList<>();
        listPersonajes.add(new Personaje("Cuauhtémoc",R.drawable.img_cuauhtemoc));
        listPersonajes.add(new Personaje("Hernán Cortés",R.drawable.img_hernan_cortes));
        listPersonajes.add(new Personaje("Miguel Hidalgo",R.drawable.img_miguel_hidalgo));
        listPersonajes.add(new Personaje("José María Morelos",R.drawable.img_morelos));
        listPersonajes.add(new Personaje("Vicente Guerrero",R.drawable.img_guerrero));
        listPersonajes.add(new Personaje("Agustín de Iturbide",R.drawable.img_iturbide));
        listPersonajes.add(new Personaje("Guadalupe Victoria",R.drawable.img_victoria_guadalupe));
        listPersonajes.add(new Personaje("Porfirio Díaz",R.drawable.img_porfirio_diaz));
        listPersonajes.add(new Personaje("Emiliano Zapata",R.drawable.img_emiliano_zapata));
        listPersonajes.add(new Personaje("Cristóbal Colón",R.drawable.img_cristobal_colon));
        listPersonajes.add(new Personaje("Francisco I. Madero",R.drawable.img_francisco));
        listPersonajes.add(new Personaje("Francisco Villa",R.drawable.img_francisco_villa));
        listPersonajes.add(new Personaje("Venustiano Carranza",R.drawable.img_venustiano_carranz));
        listPersonajes.add(new Personaje("Los Niños Heroes",R.drawable.img_heroes));


        RecyclerView recyclerView = view.findViewById(R.id.recyViewPersonajes);
        RecycleViewAdaptadorPersonajes adaptador = new RecycleViewAdaptadorPersonajes(this.getActivity(),listPersonajes);
        recyclerView.setLayoutManager(new GridLayoutManager(this.getContext(), 2 ));
        recyclerView.setAdapter(adaptador);

        view.findViewById(R.id.buttHouse).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MainActivity.class);
                startActivity(i);
                getActivity().finish();
            }
        });

        return view;
    }
}
