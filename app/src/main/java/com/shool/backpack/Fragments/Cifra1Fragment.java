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

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 */
public class Cifra1Fragment extends Fragment {
    int oper;
    ImageView imagesuma1,imagesuma2,imagesuma3,imagesuma4, uno,dos,tres,cuatro,cinco,seis,siete,ocho;
    Random azar1, azar2,azar3,azar4;
    int [] numeros= {R.drawable.ic_uno_negro,R.drawable.ic_dos_negro,R.drawable.ic_tres_negro,R.drawable.ic_cuatro_negro,R.drawable.ic_cinco_negro,R.drawable.ic_seis_negro,R.drawable.ic_seis_negro,R.drawable.ic_ocho_negro,R.drawable.ic_nueve_negro};
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments() != null){
            oper = getArguments().getInt("op");
            //Toast.makeText(getContext(),"La opcion es "+opcion,Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getContext(),"Eror",Toast.LENGTH_SHORT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_cifra1, container, false);
        imagesuma1= view.findViewById(R.id.imagesuma1);
        imagesuma2= view.findViewById(R.id.imagesuma2);
        imagesuma3= view.findViewById(R.id.imagesuma3);
        imagesuma4= view.findViewById(R.id.imagesuma4);
        uno = view.findViewById(R.id.image1);
        dos = view.findViewById(R.id.image2);
        tres = view.findViewById(R.id.image3);
        cuatro = view.findViewById(R.id.image4);
        cinco = view.findViewById(R.id.image5);
        seis = view.findViewById(R.id.image6);
        siete = view.findViewById(R.id.image7);
        ocho = view.findViewById(R.id.image8);

        azar1 = new Random();

        if(oper == 1){
            imagesuma1.setImageResource(R.drawable.ic_mas);
            imagesuma2.setImageResource(R.drawable.ic_mas);
            imagesuma3.setImageResource(R.drawable.ic_mas);
            imagesuma4.setImageResource(R.drawable.ic_mas);
            sumaAleatorio();
        }
        if(oper == 2){
            imagesuma1.setImageResource(R.drawable.ic_menos);
            imagesuma2.setImageResource(R.drawable.ic_menos);
            imagesuma3.setImageResource(R.drawable.ic_menos);
            imagesuma4.setImageResource(R.drawable.ic_menos);
            restaAleatorio();
        }
        if(oper == 3){
            imagesuma1.setImageResource(R.drawable.ic_multiplicasion);
            imagesuma2.setImageResource(R.drawable.ic_multiplicasion);
            imagesuma3.setImageResource(R.drawable.ic_multiplicasion);
            imagesuma4.setImageResource(R.drawable.ic_multiplicasion);
            multiplicaionAleatorio();
        }

        if(oper == 4){
            imagesuma1.setImageResource(R.drawable.ic_divicion);
            imagesuma2.setImageResource(R.drawable.ic_divicion);
            imagesuma3.setImageResource(R.drawable.ic_divicion);
            imagesuma4.setImageResource(R.drawable.ic_divicion);
            divicionAleatorio();
        }
        return view;
    }
    public void sumaAleatorio(){
        uno.setImageResource(numeros[azar1.nextInt(8)]);
        dos.setImageResource(numeros[azar1.nextInt(8)]);
        tres.setImageResource(numeros[azar1.nextInt(8)]);
        cuatro.setImageResource(numeros[azar1.nextInt(8)]);
        cinco.setImageResource(numeros[azar1.nextInt(8)]);
        seis.setImageResource(numeros[azar1.nextInt(8)]);
        siete.setImageResource(numeros[azar1.nextInt(8)]);
        ocho.setImageResource(numeros[azar1.nextInt(8)]);
    }
    public void restaAleatorio(){
        uno.setImageResource(numeros[4+azar1.nextInt(4)]);
        dos.setImageResource(numeros[azar1.nextInt(4)]);
        tres.setImageResource(numeros[4+azar1.nextInt(4)]);
        cuatro.setImageResource(numeros[azar1.nextInt(4)]);
        cinco.setImageResource(numeros[4+azar1.nextInt(4)]);
        seis.setImageResource(numeros[azar1.nextInt(4)]);
        siete.setImageResource(numeros[4+azar1.nextInt(4)]);
        ocho.setImageResource(numeros[azar1.nextInt(4)]);
    }
    public void multiplicaionAleatorio(){
        uno.setImageResource(numeros[azar1.nextInt(8)]);
        dos.setImageResource(numeros[azar1.nextInt(8)]);
        tres.setImageResource(numeros[azar1.nextInt(8)]);
        cuatro.setImageResource(numeros[azar1.nextInt(8)]);
        cinco.setImageResource(numeros[azar1.nextInt(8)]);
        seis.setImageResource(numeros[azar1.nextInt(8)]);
        siete.setImageResource(numeros[azar1.nextInt(8)]);
        ocho.setImageResource(numeros[azar1.nextInt(8)]);
    }
    public void divicionAleatorio(){
        uno.setImageResource(numeros[4+azar1.nextInt(4)]);
        dos.setImageResource(numeros[azar1.nextInt(4)]);
        tres.setImageResource(numeros[4+azar1.nextInt(4)]);
        cuatro.setImageResource(numeros[azar1.nextInt(4)]);
        cinco.setImageResource(numeros[4+azar1.nextInt(4)]);
        seis.setImageResource(numeros[azar1.nextInt(4)]);
        siete.setImageResource(numeros[4+azar1.nextInt(4)]);
        ocho.setImageResource(numeros[azar1.nextInt(4)]);
    }
}
