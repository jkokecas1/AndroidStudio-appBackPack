package com.shool.backpack.Fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.shool.backpack.R;

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 */
public class PruebaTablasFragment extends Fragment {

    public PruebaTablasFragment() {
        // Required empty public constructor
    }

    EditText resultado, resultado2, resultado3;
    ImageView numero,numero2,numero3, b1, m1, b2, m2, b3, m3, N1,N2,N3;
    ImageButton revisar;
    int n1,n2,n3 , azar1,azar2,azar3;
    int [] arrImagNum = {R.drawable.ic_uno,R.drawable.ic_dos,R.drawable.ic_tres,R.drawable.ic_cuatro,R.drawable.ic_cinco,R.drawable.ic_seis,R.drawable.ic_siete,R.drawable.ic_ocho,R.drawable.ic_nueve,R.drawable.ic_diez};
    Random random, random2, random3;
    int opcion;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments() != null){
            opcion = getArguments().getInt("o");
            //Toast.makeText(getContext(),"LA "+opcion,Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getContext(),"Eror",Toast.LENGTH_SHORT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pruebas, container, false);
        resultado = view.findViewById(R.id.textResultado);
        resultado2 = view.findViewById(R.id.textResultado2);
        resultado3 = view.findViewById(R.id.textResultado3);
        N1 = view.findViewById(R.id.imageN1);
        N2 = view.findViewById(R.id.imageN2);
        N3 = view.findViewById(R.id.imageN3);
        numero = view.findViewById(R.id.imageNumer);
        numero2 = view.findViewById(R.id.imageNumer2);
        numero3 = view.findViewById(R.id.imageNumer3);
        b1 = view.findViewById(R.id.imagB1);
        m1 = view.findViewById(R.id.imagI1);
        b2 = view.findViewById(R.id.imagB2);
        m2 = view.findViewById(R.id.imagI2);
        b3 = view.findViewById(R.id.imagB3);
        m3 = view.findViewById(R.id.imagI3);
        revisar = view.findViewById(R.id.imageRevisar);
        switch (opcion){
            case 1: asignarN(R.drawable.ic_uno);break;
            case 2: asignarN(R.drawable.ic_dos);break;
            case 3: asignarN(R.drawable.ic_tres);break;
            case 4: asignarN(R.drawable.ic_cuatro);break;
            case 5:asignarN(R.drawable.ic_cinco); break;
            case 6: asignarN(R.drawable.ic_seis);break;
            case 7: asignarN(R.drawable.ic_siete);break;
            case 8: asignarN(R.drawable.ic_ocho);break;
            case 9: asignarN(R.drawable.ic_nueve);break;
            case 10: asignarN(R.drawable.ic_diez);break;
        }
        asignarValores();

        if(opcion == 1){
            validacionResultados(1);
        }else if(opcion == 2){
            validacionResultados(2);
        }else if(opcion == 3){
            validacionResultados(3);
        }else if(opcion == 4){
            validacionResultados(4);
        } else if(opcion == 5){
            validacionResultados(5);
        }else if(opcion == 6){
            validacionResultados(6);
        }else if(opcion == 7){
            validacionResultados(7);
        }else if(opcion == 8){
            validacionResultados(8);
        }else if(opcion == 9){
            validacionResultados(9);
        }else if(opcion == 10){
            validacionResultados(10);
        }

        return  view;
    }
    public void validacionResultados(final int numer){

        revisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultado.getText().toString().equals("") || resultado2.getText().toString().equals("") || resultado3.getText().toString().equals("")){
                    Toast.makeText(getContext(),"Campos vacios",Toast.LENGTH_SHORT).show();
                }else{
                    if(Integer.parseInt(resultado.getText()+"") == numer * n1){
                        //Toast.makeText(getContext()," "+(1*n1),Toast.LENGTH_SHORT).show();
                        b1.setVisibility(View.VISIBLE);
                        m1.setVisibility(View.GONE);
                    }else{
                        m1.setVisibility(View.VISIBLE);
                        b1.setVisibility(View.GONE);
                    }
                    if(Integer.parseInt(resultado2.getText()+"") == numer*n2){
                        b2.setVisibility(View.VISIBLE);
                        m2.setVisibility(View.GONE);
                    }else{
                        m2.setVisibility(View.VISIBLE);
                        b2.setVisibility(View.GONE);
                    }
                    if(Integer.parseInt(resultado3.getText()+"") == numer*n3){
                        b3.setVisibility(View.VISIBLE);
                        m3.setVisibility(View.GONE);
                    }else{
                        m3.setVisibility(View.VISIBLE);
                        b3.setVisibility(View.GONE);
                    }

                }
            }
        });

    }
    public  void asignarN(int i){
        N1.setImageResource(i);
        N2.setImageResource(i);
        N3.setImageResource(i);
    }
    public void asignarValores(){

        b1.setVisibility(View.GONE);
        m1.setVisibility(View.GONE);
        b2.setVisibility(View.GONE);
        m2.setVisibility(View.GONE);
        b3.setVisibility(View.GONE);
        m3.setVisibility(View.GONE);

        random = new Random();
        random2 = new Random();
        random3 = new Random();

        azar1 = random.nextInt(3);
        azar2 = 3+random2.nextInt(3);
        azar3 = 6+random3.nextInt(3);

        numero.setImageResource(arrImagNum[azar1]);
        n1 = azar1+1;
        numero2.setImageResource(arrImagNum[azar2]);
        n2 = azar2+1;
        numero3.setImageResource(arrImagNum[azar3]);
        n3 = azar3+1;
    }
}
