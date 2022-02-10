package com.shool.backpack.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.shool.backpack.Class.Cuento;
import com.shool.backpack.R;
import com.shool.backpack.activities.CuentosActivity;

import java.util.List;

public class RecycleViewAdaptador extends RecyclerView.Adapter<RecycleViewAdaptador.MyViewHolder> {

    private Context context;
    private List<Cuento> listCuentos;

    public RecycleViewAdaptador(Context context, List<Cuento> listCuentos) {
        this.context = context;
        this.listCuentos = listCuentos;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.card_cuento,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.textNombre.setText(listCuentos.get(position).getTitulo());
        holder.imageView.setImageResource(listCuentos.get(position).getImagen());


        final Intent intent = new Intent(context, CuentosActivity.class);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Cargando...",Toast.LENGTH_SHORT).show();
                switch (position+1){
                    case 1: intent.putExtra("1","Debayle.pdf");
                    context.startActivity(intent); break;
                    case 2:intent.putExtra("1","BarbaAzul.pdf");
                        context.startActivity(intent); break;
                    case 3:intent.putExtra("1","Durmiente.pdf");
                        context.startActivity(intent); break;
                    case 4:intent.putExtra("1","Cenicienta.pdf");
                        context.startActivity(intent); break;
                    case 5:intent.putExtra("1","Caperucita.pdf");
                        context.startActivity(intent); break;
                    case 6:intent.putExtra("1","Cohete.pdf");
                        context.startActivity(intent); break;
                    case 7:intent.putExtra("1","Principito.pdf");
                        context.startActivity(intent); break;
                    case 8:intent.putExtra("1","JulioVerne.pdf");
                        context.startActivity(intent); break;
                    case 9:intent.putExtra("1","Cloe.pdf");
                        context.startActivity(intent); break;
                    case 10:intent.putExtra("1","Losinvencibles.pdf");
                        context.startActivity(intent); break;
                    case 11:intent.putExtra("1","fragmentos.pdf");
                        context.startActivity(intent); break;
                    case 12:intent.putExtra("1","Inventamos_nosotros.pdf");
                        context.startActivity(intent); break;
                    case 13:intent.putExtra("1","Corazon_de_idea.pdf");
                    context.startActivity(intent); break;
                    case 14:intent.putExtra("1","El_amuleto_de_la_momia.pdf");
                        context.startActivity(intent); break;
                    case  15: intent.putExtra("1","La_piedra_de_los_1000_colores.pdf");
                    context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return listCuentos.size();
    }

    public  static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView textNombre;
        ImageView imageView;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textNombre = (TextView) itemView.findViewById(R.id.cuento_titulo_id);
            imageView = (ImageView) itemView.findViewById(R.id.cento_imagen_id);
            cardView = (CardView) itemView.findViewById(R.id.card_id);

        }
    }
}
