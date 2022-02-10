package com.shool.backpack.Fragments.Menu;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shool.backpack.R;
import com.shool.backpack.activities.BanderasActivity;
import com.shool.backpack.activities.ContenedorActivity;
import com.shool.backpack.activities.ContinentesActivity;
import com.shool.backpack.activities.GeoMexicoActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class MenuGeografiaFragment extends Fragment {

    public MenuGeografiaFragment() {
        // Required empty public constructor
    }
    CardView cardView, cardContinentes, cardBandera;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu_geografia, container, false);
        cardView = view.findViewById(R.id.cardMexico);
        cardContinentes = view.findViewById(R.id.cardContinentes);
        cardBandera = view.findViewById(R.id.cardBanderas);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), GeoMexicoActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });
        cardContinentes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ContinentesActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });
        cardBandera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), BanderasActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });

        return view;
    }
}
