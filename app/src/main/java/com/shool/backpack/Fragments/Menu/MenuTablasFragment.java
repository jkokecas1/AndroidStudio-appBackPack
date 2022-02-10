package com.shool.backpack.Fragments.Menu;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.shool.backpack.Fragments.TablasFragment;
import com.shool.backpack.MainActivity;
import com.shool.backpack.R;

public class MenuTablasFragment extends Fragment {
    CardView cardUno;
    TablasFragment tablasFragment;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        tablasFragment = new TablasFragment();
        FragmentManager  fragmentManager   = getFragmentManager();
        final FragmentTransaction  transaction = fragmentManager.beginTransaction();
        final Bundle bundle = new Bundle();


        view.findViewById(R.id.cardUno).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putInt("n",1);
                tablasFragment.setArguments(bundle);
                transaction.replace(R.id.contenedora,tablasFragment).commit();
            }
        });
        view.findViewById(R.id.cadDos).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putInt("n",2);
                tablasFragment.setArguments(bundle);
                transaction.replace(R.id.contenedora,tablasFragment).commit();
            }
        });
        view.findViewById(R.id.cardTres).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putInt("n",3);
                tablasFragment.setArguments(bundle);
                transaction.replace(R.id.contenedora,tablasFragment).commit();
            }
        });
        view.findViewById(R.id.cardCuatro).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putInt("n",4);
                tablasFragment.setArguments(bundle);
                transaction.replace(R.id.contenedora,tablasFragment).commit();
            }
        });
        view.findViewById(R.id.cardCinco).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putInt("n",5);
                tablasFragment.setArguments(bundle);
                transaction.replace(R.id.contenedora,tablasFragment).commit();
            }
        });
        view.findViewById(R.id.cardSeis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putInt("n",6);
                tablasFragment.setArguments(bundle);
                transaction.replace(R.id.contenedora,tablasFragment).commit();
            }
        });
        view.findViewById(R.id.cardSieto).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putInt("n",7);
                tablasFragment.setArguments(bundle);
                transaction.replace(R.id.contenedora,tablasFragment).commit();
            }
        });
        view.findViewById(R.id.cardOcho).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putInt("n",8);
                tablasFragment.setArguments(bundle);
                transaction.replace(R.id.contenedora,tablasFragment).commit();
            }
        });
        view.findViewById(R.id.cardNueve).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putInt("n",9);
                tablasFragment.setArguments(bundle);
                transaction.replace(R.id.contenedora,tablasFragment).commit();
            }
        });
        view.findViewById(R.id.cardDiez).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putInt("n",10);
                tablasFragment.setArguments(bundle);
                transaction.replace(R.id.contenedora,tablasFragment).commit();
            }
        });
        view.findViewById(R.id.floatingActionButton).setOnClickListener(new View.OnClickListener() {
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
