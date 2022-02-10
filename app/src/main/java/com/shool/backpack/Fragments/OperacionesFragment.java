package com.shool.backpack.Fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.shool.backpack.Adapters.PegerAdapter;
import com.shool.backpack.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class OperacionesFragment extends Fragment {
    int opcion, operacion;
    ViewPager pager;
    Cifra1Fragment cifrasFragment,fragment;
    PegerAdapter pegerAdapter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // transaction.remove(fragment);
        if(getArguments() != null){
            opcion = getArguments().getInt("q");
            operacion = getArguments().getInt("opcion");
            //Toast.makeText(getContext(),"La opcion es "+opcion,Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getContext(),"Eror",Toast.LENGTH_SHORT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_operaciones, container, false);
        pager = view.findViewById(R.id.idViewP);

        Bundle bundle = new Bundle();
        cifrasFragment = new Cifra1Fragment();
        fragment = new Cifra1Fragment();
        ArrayList<Fragment> list = new ArrayList<>();
        if(opcion == 1){
            bundle.putInt("op",operacion);
            cifrasFragment.setArguments(bundle);
            list.add(cifrasFragment);
        }
        pegerAdapter =new PegerAdapter(getActivity().getSupportFragmentManager(),list);

        pager.setAdapter(pegerAdapter);
        return view;
    }
}
