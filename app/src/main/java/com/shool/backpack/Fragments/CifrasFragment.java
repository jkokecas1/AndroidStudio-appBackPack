package com.shool.backpack.Fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.shool.backpack.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CifrasFragment extends Fragment {
    CardView cardCif1,cardCif2,cardCif3,cardCif4,cardCif5,cardCif6;
    OperacionesFragment operacionesFragment;
    Bundle bundle;
    FragmentTransaction transaction;
    int opcion;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments() != null){
            opcion = getArguments().getInt("operacion");
            //Toast.makeText(getContext(),"La opcion es "+opcion,Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getContext(),"Eror",Toast.LENGTH_SHORT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cifras, container, false);
        cardCif1 = view.findViewById(R.id.card_cif1);
        cardCif2 = view.findViewById(R.id.card_cif2);
        cardCif3 = view.findViewById(R.id.card_cif3);
        cardCif4 = view.findViewById(R.id.card_cif4);
        cardCif5 = view.findViewById(R.id.card_cif5);
        cardCif6 = view.findViewById(R.id.card_cif6);

        operacionesFragment = new OperacionesFragment();
        bundle = new Bundle();
        FragmentManager fragmentManager   = getFragmentManager();
        transaction = fragmentManager.beginTransaction();

        cardCif1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               transferencia(1);
            }
        });
        cardCif2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transferencia(2);
            }
        });
        cardCif3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transferencia(3);
            }
        });
        cardCif4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transferencia(4);
            }
        });
        cardCif5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transferencia(5);
            }
        });
        cardCif6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transferencia(6);
            }
        });


        return  view;
    }
    public void transferencia(int n){
        bundle.putInt("q",n);
        bundle.putInt("opcion",opcion);
        operacionesFragment.setArguments(bundle);
        transaction.replace(R.id.contenedora,operacionesFragment).commit();

    }
}
