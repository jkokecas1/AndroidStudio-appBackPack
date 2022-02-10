package com.shool.backpack.Fragments.Menu;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shool.backpack.Fragments.CifrasFragment;
import com.shool.backpack.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MenuOperacionesFragment extends Fragment {

    public MenuOperacionesFragment() {
        // Required empty public constructor
    }
    CardView cardSuma, cardResta, cardMultiplicacion,cardDivicion;
    CifrasFragment cifrasFragment;
    FragmentTransaction transaction;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_menu_operaciones, container, false);
        cardSuma = view.findViewById(R.id.cardSuma);
        cardResta = view.findViewById(R.id.cardResta);
        cardMultiplicacion = view.findViewById(R.id.cardMultiplicasion);
        cardDivicion = view.findViewById(R.id.cardDiviciones);
        cifrasFragment = new CifrasFragment();

        FragmentManager fragmentManager   = getFragmentManager();
        transaction = fragmentManager.beginTransaction();
        final Bundle bundle = new Bundle();

        cardSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putInt("operacion",1);
                cifrasFragment.setArguments(bundle);
                transaction.replace(R.id.contenedora,cifrasFragment).commit();
            }
        });
        cardResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putInt("operacion",2);
                cifrasFragment.setArguments(bundle);
                transaction.replace(R.id.contenedora, cifrasFragment).commit();
            }
        });
        cardMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putInt("operacion",3);
                cifrasFragment.setArguments(bundle);
                transaction.replace(R.id.contenedora,cifrasFragment).commit();
            }
        });
        cardDivicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putInt("operacion",4);
                cifrasFragment.setArguments(bundle);
                transaction.replace(R.id.contenedora,cifrasFragment).commit();
            }
        });
        return  view;
    }

}
