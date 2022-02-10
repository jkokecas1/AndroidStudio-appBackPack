package com.shool.backpack.Fragments;

import android.app.AlertDialog;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

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
import com.shool.backpack.activities.GeoMexicoActivity;

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 */
public class MapasFragment extends Fragment {

    public MapasFragment() {
        // Required empty public constructor
    }

    SubsamplingScaleImageView imageMapa;
    ImageView imagRevisar;
    TextView textRespuesta;
    int imMapa [] ={R.drawable.img_baja_california_norte,R.drawable.img_baja_california_sur,R.drawable.img_chihuahua,
            R.drawable.img_coahuila,R.drawable.img_durango,R.drawable.img_nuevo_leon,R.drawable.img_sinaloa,
            R.drawable.img_sonora,R.drawable.img_tamaulipas,R.drawable.img_zacatecas,R.drawable.img_san_luis_potosi,R.drawable.img_aguas_calientes,
            R.drawable.img_campeche,R.drawable.img_chiapas,R.drawable.img_ciudad_de_mexico,R.drawable.img_colima,R.drawable.img_guanajuato,
            R.drawable.img_guerrero_estado,R.drawable.img_hidalgo,R.drawable.img_jalisco,R.drawable.img_michoacan,R.drawable.img_morelos_estado,
            R.drawable.img_nayarit,R.drawable.img_oaxaca,R.drawable.img_puebla,R.drawable.img_queretaro,R.drawable.img_quintana_roo,
            R.drawable.img_tabasco,R.drawable.img_tlaxcala,R.drawable.img_veracruz,R.drawable.img_yucatan};
    String nombeEstados[] = {"Baja california Norte","Baja california Sur","Chihuahua","Coahuila","Durango","Nuevo Leon","Sinaloa",
                             "Sonora","Tamaulipas","Zacatecas","San Luis Potosi","Aguas Calientes","Campeche","Chiapas","Ciudad de mexico","Colima",
    "Guanajuato","Guerrero","Hidalgo","Jalisco","Michoacan","Morelos","Nayarit","Oaxaca","Puebla","Queretaro","Quintana Roo","Tabasco","Tlaxcala",
    "Veracruz","Yucatan"};
    Random random;
    int opcionImg;
    Button opcion1, opcion2, opcion3, opcion4;
    RadioGroup radioGrup;
    ImageView  iamgeInformacion;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_mapas, container, false);
        imageMapa = view.findViewById(R.id.imageMapas);
        iamgeInformacion = view.findViewById(R.id.imageInfor);
        radioGrup = view.findViewById(R.id.radioGrup);
        opcion1 = view.findViewById(R.id.radioButton);
        opcion2 = view.findViewById(R.id.radioButton2);
        opcion3 = view.findViewById(R.id.radioButton3);
        opcion4 = view.findViewById(R.id.radioButton4);
        random = new Random();
        opcionImg = random.nextInt(30);
        imageMapa.setImage(ImageSource.resource(imMapa[opcionImg]));
        switch (opcionImg){
            case 0:
            case 4:
            case 9:
            case 13:
            case 17:
            case 21:
            case 25:
            case 29:
                opcones(nombeEstados[opcionImg], nombeEstados[random.nextInt(30)],nombeEstados[random.nextInt(30)],nombeEstados[random.nextInt(30)]); break;
            case 1:
            case 5:
            case 10:
            case 14:
            case 18:
            case 22:
            case 26:
            case 30:
                opcones(nombeEstados[random.nextInt(30)], nombeEstados[opcionImg],nombeEstados[random.nextInt(30)],nombeEstados[random.nextInt(30)]); break;
            case 2:
            case 6:
            case 11:
            case 15:
            case 19:
            case 23:
            case 27:
                opcones(nombeEstados[random.nextInt(30)], nombeEstados[1+random.nextInt(8)],nombeEstados[opcionImg],nombeEstados[random.nextInt(30)]); break;
            case 3:
            case 7:
            case 8:
            case 12:
            case 16:
            case 20:
            case 24:
            case 28:
                opcones(nombeEstados[random.nextInt(30)], nombeEstados[random.nextInt(30)],nombeEstados[random.nextInt(30)],nombeEstados[opcionImg]); break;


        }
        validarOpciones(opcion1,opcion2,opcion3,opcion4);
        iamgeInformacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoPersonalizado("Informacion \n 1. Puedes responder las veces que quieras \n 2. Si te equivocas puedes corregir \n 3. Lo importante es que aprendas");
            }
        });

        return view;
    }
    public void validarOpciones(final Button opcion,final Button opcion2,final Button opcion3,final Button opcion4){
            opcion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (opcion.getText().equals(nombeEstados[opcionImg])) {;
                        opcion.setBackgroundColor(Color.rgb(99, 229, 76 ));
                        opcion2.setClickable(false);
                        opcion3.setClickable(false);
                        opcion4.setClickable(false);
                    } else {
                        opcion.setBackgroundColor(Color.rgb(247, 47, 5));
                    }
                }
            });
            opcion2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (opcion2.getText().equals(nombeEstados[opcionImg])) {
                        opcion2.setBackgroundColor(Color.rgb(99, 229, 76 ));
                        opcion.setClickable(false);
                        opcion3.setClickable(false);
                        opcion4.setClickable(false);
                    } else {
                        opcion2.setBackgroundColor(Color.rgb(247, 47, 5));
                    }
                }
            });

            opcion3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (opcion3.getText().equals(nombeEstados[opcionImg])) {
                        opcion3.setBackgroundColor(Color.rgb(99, 229, 76 ));
                        opcion.setClickable(false);
                        opcion2.setClickable(false);
                        opcion4.setClickable(false);
                    } else {
                        opcion3.setBackgroundColor(Color.rgb(247, 47, 5));
                    }
                }
            });
        opcion4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (opcion4.getText().equals(nombeEstados[opcionImg])) {
                    opcion4.setBackgroundColor(Color.rgb(99, 229, 76 ));
                    opcion.setClickable(false);
                    opcion2.setClickable(false);
                    opcion3.setClickable(false);
                } else {
                    opcion4.setBackgroundColor(Color.rgb(247, 47, 5));
                }
            }
        });
    }

    public void opcones(String opcio1,String opcio2,String opcio3,String opcio4){

        opcion1.setText(opcio1);
        opcion2.setText(opcio2);
        opcion3.setText(opcio3);
        opcion4.setText(opcio4);

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
