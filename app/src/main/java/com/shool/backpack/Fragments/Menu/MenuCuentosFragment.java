package com.shool.backpack.Fragments.Menu;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shool.backpack.Adapters.RecycleViewAdaptador;
import com.shool.backpack.Class.Cuento;
import com.shool.backpack.MainActivity;
import com.shool.backpack.R;
import com.shool.backpack.activities.CuentosActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MenuCuentosFragment extends Fragment {

    public MenuCuentosFragment() {
        // Required empty public constructor
    }
    List<Cuento> listCuentos;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_menu_cuentos, container, false);
        listCuentos = new ArrayList<>();
        listCuentos.add(new Cuento("A Marguita Debayle",R.drawable.a_marguita_debayle));
        listCuentos.add(new Cuento("Barba Azul",R.drawable.barba_azul));
        listCuentos.add(new Cuento("La bella durmiente",R.drawable.la_bella_durmiente_del_bosque));
        listCuentos.add(new Cuento("Cenicienta",R.drawable.cenicienta));
        listCuentos.add(new Cuento("Barba Azul",R.drawable.caperusita_roja));
        listCuentos.add(new Cuento("El famoso cohete",R.drawable.elfamosocohete));
        listCuentos.add(new Cuento("El Principito",R.drawable.elprincipito));
        listCuentos.add(new Cuento("Julio Verne",R.drawable.julioverne));
        listCuentos.add(new Cuento("Cloe",R.drawable.cloe));
        listCuentos.add(new Cuento("Los invencibles",R.drawable.losinvencibles));
        listCuentos.add(new Cuento("fragmentos del pasado",R.drawable.fragmentosdelpasado));
        listCuentos.add(new Cuento("Inventamos Nosotros",R.drawable.inventamos));
        listCuentos.add(new Cuento("Corazon de ideas",R.drawable.corazondeindeas));
        listCuentos.add(new Cuento("El amuleto de la momia",R.drawable.amuleto));
        listCuentos.add(new Cuento("La piedra de los 100 colores",R.drawable.piedra));


        RecyclerView recyclerView = view.findViewById(R.id.recy_id);
        RecycleViewAdaptador adaptador = new RecycleViewAdaptador(this.getActivity(),listCuentos);
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
