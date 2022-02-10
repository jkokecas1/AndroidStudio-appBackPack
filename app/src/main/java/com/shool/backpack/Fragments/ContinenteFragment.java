package com.shool.backpack.Fragments;

import android.app.AlertDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.shool.backpack.R;

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContinenteFragment extends Fragment {

    public ContinenteFragment() {
        // Required empty public constructor
    }

    SubsamplingScaleImageView imageMapa;
    ImageView imagRevisar;
    TextView textRespuesta;
    int imMapa [] ={R.drawable.img_america,R.drawable.img_africa,R.drawable.img_europa,
            R.drawable.img_asia,R.drawable.img_australia,R.drawable.img_antartica};
    String nombeContinentes[] = {"America","Africa","Europa","Asia","Australia","Antartica"};
    Random random;
    int opcionImg;
    Button  opcion1, opcion2, opcion3, validar;
    RadioGroup radioGrup;
    ImageView  iamgeInformacion;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_continente, container, false);
        imageMapa = view.findViewById(R.id.imageMapContinente );
        iamgeInformacion = view.findViewById(R.id.imageInform);
        radioGrup = view.findViewById(R.id.radioGrupo);
        opcion1 = view.findViewById(R.id.radioB1);
        opcion2 = view.findViewById(R.id.radioB2);
        opcion3 = view.findViewById(R.id.radioB3);
        random = new Random();
        opcionImg = random.nextInt(5);
        imageMapa.setImage(ImageSource.resource(imMapa[opcionImg]));
        switch (opcionImg){
            case 0:
            case 4:
                opcones(nombeContinentes[opcionImg], nombeContinentes[1+random.nextInt(4)],nombeContinentes[2+random.nextInt(3)]); break;
            case 1:
                opcones(nombeContinentes[random.nextInt(opcionImg)], nombeContinentes[opcionImg],nombeContinentes[opcionImg+random.nextInt(5-opcionImg)]); break;
            case 2:
            case 5:
                opcones(nombeContinentes[random.nextInt(5)], nombeContinentes[random.nextInt(5)],nombeContinentes[opcionImg]); break;
            case 3:
                opcones(nombeContinentes[random.nextInt(5)], nombeContinentes[random.nextInt(5)],nombeContinentes[random.nextInt(5)]); break;


        }
        validarOpciones(opcion1, opcion2,opcion3);



        iamgeInformacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoPersonalizado("Informacion \n 1. Puedes responder las veces que quieras \n 2. Si te equivocas puedes corregir \n 3. Lo importante es que aprendas");
            }
        });

        return view;
    }
    public void opcones(String opci1,String opci2,String opci3){

        opcion1.setText(opci1);
        opcion2.setText(opci2);
        opcion3.setText(opci3);

    }
    public void validarOpciones(final Button opcion,final Button opcion2,final Button opcion3){
        opcion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (opcion.getText().equals(nombeContinentes[opcionImg])) {
                    opcion.setBackgroundColor(Color.rgb(99, 229, 76 ));
                    opcion2.setClickable(false);
                    opcion3.setClickable(false);
                } else {
                    opcion.setBackgroundColor(Color.rgb(247, 47, 5));
                }
            }
        });
        opcion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (opcion2.getText().equals(nombeContinentes[opcionImg])) {
                    opcion2.setBackgroundColor(Color.rgb(99, 229, 76 ));
                    opcion.setClickable(false);
                    opcion3.setClickable(false);
                } else {
                    opcion2.setBackgroundColor(Color.rgb(247, 47, 5));
                }
            }
        });

        opcion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (opcion3.getText().equals(nombeContinentes[opcionImg])) {
                    opcion3.setBackgroundColor(Color.rgb(99, 229, 76 ));
                    opcion.setClickable(false);
                    opcion2.setClickable(false);
                } else {
                    opcion3.setBackgroundColor(Color.rgb(247, 47, 5));
                }
            }
        });
    }
    private void dialogoPersonalizado(String texto){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.mensaje_dialogo_informacion,null);
        builder.setView(view);
        final AlertDialog dialog = builder.create();
        dialog.show();
        TextView txt = view.findViewById(R.id.text_dialog);
        txt.setText(texto);

        Button btnReintentar = view.findViewById(R.id.btnReintentar);
        btnReintentar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }
}
