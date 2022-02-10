package com.shool.backpack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.shool.backpack.Fragments.InicioFragment;

public class MainActivity extends AppCompatActivity {
    InicioFragment inicioFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        inicioFragment = new InicioFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragments,inicioFragment).commit();

    }


}


