package com.shool.backpack.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnDrawListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.listener.OnPageErrorListener;
import com.github.barteksc.pdfviewer.listener.OnRenderListener;
import com.github.barteksc.pdfviewer.listener.OnTapListener;
import com.shool.backpack.R;

public class PersonajesActivity extends AppCompatActivity {
    ImageView personaje;
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personajes);

        personaje = (ImageView) findViewById(R.id.imagePersonaje);
        pdfView =(PDFView) findViewById(R.id.pdfV);

        Bundle dato = getIntent().getExtras();

        int numero = dato.getInt("1");

        switch (numero){
            case 1:personaje(R.drawable.img_cuauhtemoc,"Cuauhtemoc.pdf");break;
            case 2:personaje(R.drawable.img_hernan_cortes,"HernanCortes.pdf");break;
            case 3:personaje(R.drawable.img_miguel_hidalgo,"MiguelHidalgo.pdf");break;
            case 4:personaje(R.drawable.img_morelos,"Morelos.pdf");break;
            case 5:personaje(R.drawable.img_guerrero_estado,"Guerrero.pdf");break;
            case 6:personaje(R.drawable.img_iturbide,"iturbide.pdf");break;
            case 7:personaje(R.drawable.img_victoria_guadalupe,"Guadalupe.pdf");break;
            case 8:personaje(R.drawable.img_porfirio_diaz,"PorfirioDiaz.pdf");break;
            case 9:personaje(R.drawable.img_emiliano_zapata,"EmilianoZapata.pdf");break;
            case 10:personaje(R.drawable.img_cristobal_colon,"CristobalColon.pdf");break;
            case 11:personaje(R.drawable.img_francisco,"IMadero.pdf");break;
            case 12:personaje(R.drawable.img_francisco_villa,"PanchoVilla.pdf");break;
            case 13:personaje(R.drawable.img_venustiano_carranz,"Venustiano.pdf"); break;
            case 14:personaje(R.drawable.img_heroes,"Heroes.pdf"); break;
            default:personaje(R.drawable.img_cuauhtemoc,"Cuauhtemoc.pdf"); break;
        }

    }
    public void personaje(int imagen, String nombre){
        personaje.setImageResource(imagen);
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
                Toast.makeText(getApplication(), "Erorr al abri el pdf",Toast.LENGTH_SHORT).show();
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
    }

}
