package com.shool.backpack.Fragments;

import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.shool.backpack.R;

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 */
public class BanderasFragment extends Fragment {

    public BanderasFragment() {
        // Required empty public constructor
    }

    SubsamplingScaleImageView imageMapa;
    ImageView imagRevisar;
    TextView textRespuesta;
    int imMapa [] ={R.drawable.ic_mexico,R.drawable.bn_mauritius,R.drawable.bn_cyprus,
            R.drawable.bn_austria,R.drawable.bn_oman,R.drawable.bn_ethiopia,R.drawable.bn_tanzania,
            R.drawable.bn_nicaragua,R.drawable.bn_estonia,R.drawable.bn_uganda,R.drawable.bn_slovenia,
            R.drawable.bn_zimbabwe,R.drawable.bn_sao_tome_y_prince,R.drawable.bn_italy,R.drawable.bn_wales,
            R.drawable.bn_salvador,R.drawable.bn_nepal,R.drawable.bn_christmas_island,R.drawable.bn_lebanon,
            R.drawable.bn_ceuta,R.drawable.bn_iraq, R.drawable.bn_cook_islands,R.drawable.bn_syria,
            R.drawable.bn_cocos_island,R.drawable.bn_honduras, R.drawable.bn_anguilla,R.drawable.bn_american_samoa,
            R.drawable.bn_puerto_rico,R.drawable.bn_comoros, R.drawable.bn_north_korea,R.drawable.bn_corsica};
    String nombeBanderas[] = {"Mexico","Mauritius","Chipre","Austria","Oman","Ethiopia","Tanzania",
            "nicaragua","estonia","uganda","slovenia","zimbabwe","sao tome y prince","italy",
            "gales","el salvador","nepal","Isla de Navidad","lebanon","ceuta","iraq","cook islands","siria",
            "cocos island","honduras","anguilla","american samoa","puerto rico","comoros","north korea","corsica"};
    Random random;
    int opcionImg;
    Button  opcion1, opcion2, opcion3;
    ImageView  iamgeInformacion;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_banderas, container, false);
        imageMapa = view.findViewById(R.id.imageMapBanderas);
        iamgeInformacion = view.findViewById(R.id.imageIn);
        opcion1 = view.findViewById(R.id.but1);
        opcion2 = view.findViewById(R.id.but2);
        opcion3 = view.findViewById(R.id.but3);
        random = new Random();
        opcionImg = random.nextInt(imMapa.length);
        imageMapa.setImage(ImageSource.resource(imMapa[opcionImg]));
        switch (opcionImg){
            case 0:
            case 4:
            case 8:
            case 12:
            case 16:
            case 20:
            case 24:
            case 28:
                opcones(nombeBanderas[opcionImg], nombeBanderas[random.nextInt(imMapa.length)],nombeBanderas[random.nextInt(imMapa.length)]); break;
            case 1:
            case 6:
            case 10:
            case 14:
            case 18:
            case 22:
            case 26:
            case 30:
                opcones(nombeBanderas[random.nextInt(opcionImg)], nombeBanderas[opcionImg],nombeBanderas[random.nextInt(imMapa.length)]); break;
            case 2:
            case 5:
            case 9:
            case 13:
            case 17:
            case 21:
            case 25:
            case 29:
                opcones(nombeBanderas[random.nextInt(imMapa.length)], nombeBanderas[random.nextInt(imMapa.length)],nombeBanderas[opcionImg]); break;
            case 3:
            case 7:
            case 11:
            case 15:
            case 19:
            case 23:
            case 27:
                opcones(nombeBanderas[random.nextInt(imMapa.length)], nombeBanderas[opcionImg],nombeBanderas[random.nextInt(imMapa.length)]); break;

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
                if (opcion.getText().equals(nombeBanderas[opcionImg])) {
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
                if (opcion2.getText().equals(nombeBanderas[opcionImg])) {
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
                if (opcion3.getText().equals(nombeBanderas[opcionImg])) {
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
