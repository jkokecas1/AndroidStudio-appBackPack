package com.shool.backpack.activities;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnDrawListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.listener.OnPageErrorListener;
import com.github.barteksc.pdfviewer.listener.OnRenderListener;
import com.github.barteksc.pdfviewer.listener.OnTapListener;
import com.shool.backpack.MainActivity;
import com.shool.backpack.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CuentosActivity extends AppCompatActivity {


    public PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuentos);

        pdfView = findViewById(R.id.pdfView);
        Bundle nombreCuento = getIntent().getExtras();

        String nombre = nombreCuento.getString("1");

        switch (nombre){
            case "Debayle.pdf": mostraPdf("Debayle.pdf");break;
            case "BarbaAzul.pdf": mostraPdf("BarbaAzul.pdf");break;
            case "Durmiente.pdf": mostraPdf("Durmiente.pdf");break;
            case "Cenicienta.pdf": mostraPdf("Cenicienta.pdf");break;
            case "Caperucita.pdf": mostraPdf("Caperucita.pdf");break;
            case "Principito.pdf": mostraPdf("Principito.pdf");break;
            case "JulioVerne.pdf": mostraPdf("JulioVerne.pdf");break;
            case "Cloe.pdf": mostraPdf("Cloe.pdf");break;
            case "Losinvencibles.pdf": mostraPdf("Losinvencibles.pdf");break;
            case "fragmentos.pdf": mostraPdf("fragmentos.pdf");break;
            case "Inventamos_nosotros.pdf": mostraPdf("Inventamos_nosotros.pdf");break;
            case "Corazon_de_idea.pdf": mostraPdf("Corazon_de_idea.pdf");break;
            case "El_amuleto_de_la_momia.pdf": mostraPdf("El_amuleto_de_la_momia.pdf");break;
            case "La_piedra_de_los_1000_colores.pdf": mostraPdf("La_piedra_de_los_1000_colores.pdf");break;
            default:mostraPdf("Debayle.pdf");break;
        }

    }
    public void mostraPdf(String nombre){
        pdfView.fromAsset(nombre)
                .password(null)
                .defaultPage(0)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableDoubletap(true).onDraw(new OnDrawListener() {
            @Override
            public void onLayerDrawn(Canvas canvas, float pageWidth, float pageHeight, int displayedPage) {

            }
        }).onDraw(new OnDrawListener() {
            @Override
            public void onLayerDrawn(Canvas canvas, float pageWidth, float pageHeight, int displayedPage) {

            }
        }).onDrawAll(new OnDrawListener() {
            @Override
            public void onLayerDrawn(Canvas canvas, float pageWidth, float pageHeight, int displayedPage) {

            }
        }).onPageError(new OnPageErrorListener() {
            @Override
            public void onPageError(int page, Throwable t) {
                Toast.makeText(CuentosActivity.this, "Erorr al abri el pdf",Toast.LENGTH_SHORT).show();
            }
        }).onPageChange(new OnPageChangeListener() {
            @Override
            public void onPageChanged(int page, int pageCount) {

            }
        }).onTap(new OnTapListener() {
            @Override
            public boolean onTap(MotionEvent e) {
                return false;
            }
        }).onRender(new OnRenderListener() {
            @Override
            public void onInitiallyRendered(int nbPages, float pageWidth, float pageHeight) {
                pdfView.fitToWidth();
            }
        }).enableAnnotationRendering(true).invalidPageColor(Color.WHITE).load();

        findViewById(R.id.buttHouse).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CuentosActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
