package com.shool.backpack.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.shool.backpack.Adapters.PegerAdapter;
import com.shool.backpack.Fragments.BanderasFragment;
import com.shool.backpack.Fragments.ContinenteFragment;
import com.shool.backpack.R;

import java.util.ArrayList;

public class BanderasActivity extends AppCompatActivity {

    ViewPager pager;
    BanderasFragment ban1,ban2,ban3,ban4, ban5,ban6,ban7;
    ImageView imageChek;
    ImageView imagNext;
    PegerAdapter pegerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banderas);
        pager = findViewById(R.id.viewPegBanderas);
        imagNext = findViewById(R.id.imagNextBande);
        imageChek = findViewById(R.id.imagChekBande);
        imageChek.setVisibility(View.GONE);

        ban1 = new BanderasFragment();
        ban2 = new BanderasFragment();
        ban3 = new BanderasFragment();
        ban4 = new BanderasFragment();
        ban5 = new BanderasFragment();
        ban6 = new BanderasFragment();
        ban7 = new BanderasFragment();

        final ArrayList<Fragment> lista = new ArrayList<>();
        lista.add(ban1);
        lista.add(ban2);
        lista.add(ban3);
        lista.add(ban4);
        lista.add(ban5);
        lista.add(ban6);
        lista.add(ban7);


        pegerAdapter =new PegerAdapter(getSupportFragmentManager(),lista);

        pager.setAdapter(pegerAdapter);
        imagNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pager.getCurrentItem() <6) {
                    pager.setCurrentItem(pager.getCurrentItem() + 1);
                }
                if(pager.getCurrentItem() == 6){
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
