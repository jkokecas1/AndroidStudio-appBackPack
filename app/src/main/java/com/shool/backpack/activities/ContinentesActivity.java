package com.shool.backpack.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.shool.backpack.Adapters.PegerAdapter;
import com.shool.backpack.Fragments.ContinenteFragment;
import com.shool.backpack.Fragments.MapasFragment;
import com.shool.backpack.R;

import java.util.ArrayList;

public class ContinentesActivity extends AppCompatActivity {
    ViewPager pager;
    ContinenteFragment cont1,cont2,cont3;
    ImageView imageChek;
    ImageView imagNext;
    PegerAdapter pegerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continentes);
        pager =(ViewPager) findViewById(R.id.viewPegContinente);
        imagNext = findViewById(R.id.imagNextCont);
        imageChek = findViewById(R.id.imagChekCont);
        imageChek.setVisibility(View.GONE);

        cont1 = new ContinenteFragment();
        cont2 = new ContinenteFragment();
        cont3 = new ContinenteFragment();


        ArrayList<Fragment> lista = new ArrayList<>();
        lista.add(cont1);
        lista.add(cont2);
        lista.add(cont3);


        pegerAdapter =new PegerAdapter(getSupportFragmentManager(),lista);

        pager.setAdapter(pegerAdapter);
        imagNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pager.getCurrentItem() <2) {
                    pager.setCurrentItem(pager.getCurrentItem() + 1);
                }
                if(pager.getCurrentItem() == 2){
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
