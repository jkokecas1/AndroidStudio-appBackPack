package com.shool.backpack.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.shool.backpack.Adapters.PegerAdapter;
import com.shool.backpack.R;
import com.shool.backpack.activities.ContenedorActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class TablasFragment extends Fragment {
    ViewPager peger;
    NumeroTablaFragment tabla;
    PruebaTablasFragment pruebaFragment;
    PegerAdapter pegerAdapter;
    ImageView butNext, buttchek;
    int opcion;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments() != null){
            opcion = getArguments().getInt("n");
            //Toast.makeText(getContext(),"La opcion es "+opcion,Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getContext(),"Eror",Toast.LENGTH_SHORT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tablas, container, false);


        peger = view.findViewById(R.id.viweP);
        butNext = view.findViewById(R.id.butNext);
        buttchek =  view.findViewById(R.id.imageChek);
        buttchek.setVisibility(View.INVISIBLE);

        tabla =new NumeroTablaFragment();
        final Bundle bundle = new Bundle();
        final Bundle bundle1 = new Bundle();

        pruebaFragment =new PruebaTablasFragment();
        List<Fragment> list =new ArrayList<>();
        if(opcion == 1){
            bundle.putInt("o",1);
            pruebaFragment.setArguments(bundle);
            bundle1.putInt("t",1);
            tabla.setArguments(bundle1);
            list.add(tabla);
            list.add(pruebaFragment);
        }else if(opcion == 2){
            bundle.putInt("o",2);
            pruebaFragment.setArguments(bundle);
            bundle1.putInt("t",2);
            tabla.setArguments(bundle1);
            list.add(tabla);
            list.add(pruebaFragment);
        }else  if(opcion == 3){
            bundle.putInt("o",3);
            pruebaFragment.setArguments(bundle);
            bundle1.putInt("t",3);
            tabla.setArguments(bundle1);
            list.add(tabla);
            list.add(pruebaFragment);
        }else if(opcion == 4){
            bundle.putInt("o",4);
            pruebaFragment.setArguments(bundle);
            bundle1.putInt("t",4);
            tabla.setArguments(bundle1);
            list.add(tabla);
            list.add(pruebaFragment);
        } else if(opcion == 5){
            bundle.putInt("o",5);
            pruebaFragment.setArguments(bundle);
            bundle1.putInt("t",5);
            tabla.setArguments(bundle1);
            list.add(tabla);
            list.add(pruebaFragment);
        }else if(opcion == 6){
            bundle.putInt("o",6);
            pruebaFragment.setArguments(bundle);
            bundle1.putInt("t",6);
            tabla.setArguments(bundle1);
            list.add(tabla);
            list.add(pruebaFragment);
        }else  if(opcion == 7){
            bundle.putInt("o",7);
            pruebaFragment.setArguments(bundle);
            bundle1.putInt("t",7);
            tabla.setArguments(bundle1);
            list.add(tabla);
            list.add(pruebaFragment);
        }else if(opcion == 8){
            bundle.putInt("o",8);
            pruebaFragment.setArguments(bundle);
            bundle1.putInt("t",8);
            tabla.setArguments(bundle1);
            list.add(tabla);
            list.add(pruebaFragment);
        } else if(opcion == 9){
            bundle.putInt("o",9);
            pruebaFragment.setArguments(bundle);
            bundle1.putInt("t",9);
            tabla.setArguments(bundle1);
            list.add(tabla);
            list.add(pruebaFragment);
        }else if(opcion == 10){
            bundle.putInt("o",10);
            pruebaFragment.setArguments(bundle);
            bundle1.putInt("t",10);
            tabla.setArguments(bundle1);
            list.add(tabla);
            list.add(pruebaFragment);
        }

            pegerAdapter =new PegerAdapter(getActivity().getSupportFragmentManager(),list);

        peger.setAdapter(pegerAdapter);


        butNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peger.setCurrentItem(peger.getCurrentItem()+1);
                if(peger.getCurrentItem() == 1){
                    butNext.setVisibility(View.GONE);
                    buttchek.setVisibility(View.VISIBLE);
                }else{
                    butNext.setVisibility(View.VISIBLE);
                    buttchek.setVisibility(View.GONE);
                }
            }
        });
        buttchek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), ContenedorActivity.class);
                intent.putExtra("tipo",1);
                startActivity(intent);
                getActivity().finish();
            }
        });


        return view;
    }

}
