package com.shool.backpack.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.shool.backpack.Adapters.PegerAdapter;
import com.shool.backpack.Fragments.MapasFragment;
import com.shool.backpack.R;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;


public class GeoMexicoActivity extends AppCompatActivity {
    ViewPager pager;
    MapasFragment mapa1, mapa2,mapa3,mapa4, mapa5;
    ImageView imageChek;
    ImageView imagNext;
    PegerAdapter pegerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo_mexico);
        pager =(ViewPager) findViewById(R.id.viewPegMapas);
        imagNext = findViewById(R.id.imagNext);
        imageChek = findViewById(R.id.imageChek);
        imageChek.setVisibility(View.GONE);
        mapa1 = new MapasFragment();
        mapa2 = new MapasFragment();
        mapa3 = new MapasFragment();
        mapa4 = new MapasFragment();
        mapa5 = new MapasFragment();


        ArrayList<Fragment> lista = new ArrayList<>();
        lista.add(mapa1);
        lista.add(mapa2);
        lista.add(mapa3);
        lista.add(mapa4);
        lista.add(mapa5);

        pegerAdapter =new PegerAdapter(getSupportFragmentManager(),lista);

        pager.setAdapter(pegerAdapter);
        imagNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pager.getCurrentItem() <4) {
                    pager.setCurrentItem(pager.getCurrentItem() + 1);
                }
                if(pager.getCurrentItem() == 4){
                    imagNext.setVisibility(View.GONE);
                    imageChek.setVisibility(View.VISIBLE);
                }
            }
        });
        imageChek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), ContenedorActivity.class);
                intent.putExtra("tipo",5);
                startActivity(intent);
                finish();
            }
        });
    }

}
