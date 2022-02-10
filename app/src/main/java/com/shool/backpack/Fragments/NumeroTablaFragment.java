package com.shool.backpack.Fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.shool.backpack.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NumeroTablaFragment extends Fragment {
    int opcion;
    ImageView imageTabla;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments() != null){
            opcion = getArguments().getInt("t");
            //Toast.makeText(getContext(),"La opcion es "+opcion,Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getContext(),"Eror",Toast.LENGTH_SHORT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_uno, container, false);
        imageTabla = view.findViewById(R.id.imageTabla);

        switch (opcion){
            case 1: imageTabla.setImageResource(R.drawable.ic_tabla_1); break;
            case 2:imageTabla.setImageResource(R.drawable.ic_tabla_2); break;
            case 3:imageTabla.setImageResource(R.drawable.ic_tabla_3); break;
            case 4:imageTabla.setImageResource(R.drawable.ic_tabla_4); break;
            case 5:imageTabla.setImageResource(R.drawable.ic_tabla_5); break;
            case 6:imageTabla.setImageResource(R.drawable.ic_tabla_6); break;
            case 7:imageTabla.setImageResource(R.drawable.ic_tabla_7); break;
            case 8:imageTabla.setImageResource(R.drawable.ic_tabla_8); break;
            case 9:imageTabla.setImageResource(R.drawable.ic_tabla_9); break;
            case 10:imageTabla.setImageResource(R.drawable.ic_tabla_10); break;
            default: //Toast.makeText(getContext(),"Error en la imagen de la tabla",Toast.LENGTH_SHORT).show();
        }

        return view;
    }
}
