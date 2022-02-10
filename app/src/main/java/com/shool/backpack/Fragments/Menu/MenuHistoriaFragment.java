package com.shool.backpack.Fragments.Menu;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shool.backpack.Fragments.LineTiempoFragment;
import com.shool.backpack.Fragments.PersonajesFragment;
import com.shool.backpack.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MenuHistoriaFragment extends Fragment {

    public MenuHistoriaFragment() {
        // Required empty public constructor
    }
    CardView cardLinea, cardPersonajes;
    FragmentTransaction transaction;
    PersonajesFragment personajesFragment;
    LineTiempoFragment lineTiempoFragment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu_historia, container, false);
        cardLinea = view.findViewById(R.id.cardLineaTiempo);
        cardPersonajes = view.findViewById(R.id.cardPersonajes);

        FragmentManager fragmentManager   = getFragmentManager();
        transaction = fragmentManager.beginTransaction();

        personajesFragment = new PersonajesFragment();
        cardPersonajes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transaction.replace(R.id.contenedora,personajesFragment).commit();
            }
        });

        lineTiempoFragment = new LineTiempoFragment();
        cardLinea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transaction.replace(R.id.contenedora,lineTiempoFragment).commit();
            }
        });

        return  view;
    }
}
