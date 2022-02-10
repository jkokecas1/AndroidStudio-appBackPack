package com.shool.backpack.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shool.backpack.Adapters.RecycleViewAdaptadorLinea;
import com.shool.backpack.Adapters.RecycleViewAdaptadorPersonajes;
import com.shool.backpack.Class.Linea;
import com.shool.backpack.Class.Personaje;
import com.shool.backpack.MainActivity;
import com.shool.backpack.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class LineTiempoFragment extends Fragment {

    RecyclerView recyclerView;
    List<Linea> listLinea;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_line_tiempo, container, false);
        recyclerView = view.findViewById(R.id.recycleLinea);
        listLinea = new ArrayList<>();
        listLinea.add(new Linea("Epoca Prehispanica","2500 a.C - 1492 d.C",R.drawable.img_mx_contetemporaneo));
        listLinea.add(new Linea("La Conquista","1492 d.C - 1521 d.c",R.drawable.imag_conquista));
        listLinea.add(new Linea("Mexico Independiente","1821 - 1876",R.drawable.img_independiente));
        listLinea.add(new Linea("Porfiriato","1876 - 1910",R.drawable.img_porfiriato));
        listLinea.add(new Linea("Revolucion","1910 - 1917 d.c",R.drawable.img_revolucion));
        listLinea.add(new Linea("Mexico Contemporaneo","1917 - 2000",R.drawable.img_contemporanio));

        RecycleViewAdaptadorLinea adaptador = new RecycleViewAdaptadorLinea(this.getActivity(),listLinea);
        recyclerView.setLayoutManager(new GridLayoutManager(this.getContext(), 1 ));
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
