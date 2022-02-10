package com.shool.backpack.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.shool.backpack.Fragments.Menu.MenuAnatomiaFragment;
import com.shool.backpack.Fragments.Menu.MenuCuentosFragment;
import com.shool.backpack.Fragments.Menu.MenuGeografiaFragment;
import com.shool.backpack.Fragments.Menu.MenuHistoriaFragment;
import com.shool.backpack.Fragments.Menu.MenuOperacionesFragment;
import com.shool.backpack.Fragments.Menu.MenuTablasFragment;
import com.shool.backpack.R;

public class ContenedorActivity extends AppCompatActivity {

    MenuTablasFragment menuTablasFragment;
    MenuCuentosFragment menuCuentosFragment;
    MenuOperacionesFragment menuOperacionesFragment;
    MenuHistoriaFragment menuHistoriaFragment;
    MenuGeografiaFragment menuGeografiaFragment;
    MenuAnatomiaFragment menuAnatomiaFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor);

        Bundle bundle = getIntent().getExtras();
        menuTablasFragment = new MenuTablasFragment();
        menuCuentosFragment = new MenuCuentosFragment();
        menuOperacionesFragment = new MenuOperacionesFragment();
        menuHistoriaFragment = new MenuHistoriaFragment();
        menuGeografiaFragment = new MenuGeografiaFragment();
        menuAnatomiaFragment = new MenuAnatomiaFragment();

        int tipo = bundle.getInt("tipo");
       if(tipo == 1){
           getSupportFragmentManager().beginTransaction().replace(R.id.contenedora,menuTablasFragment).commit();
       }
        if(tipo == 2){
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedora,menuCuentosFragment).commit();
        }
        if(tipo == 3){
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedora,menuOperacionesFragment).commit();
        }
        if(tipo == 4){
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedora,menuHistoriaFragment).commit();
        }
        if(tipo == 5){
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedora,menuGeografiaFragment).commit();
        }
        if(tipo == 6){
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedora,menuAnatomiaFragment).commit();
        }




    }



}