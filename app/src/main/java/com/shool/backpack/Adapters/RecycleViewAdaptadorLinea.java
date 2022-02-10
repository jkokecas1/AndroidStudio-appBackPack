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

import com.shool.backpack.Class.Linea;
import com.shool.backpack.R;
import com.shool.backpack.activities.PersonajesActivity;

import java.util.List;

public class RecycleViewAdaptadorLinea extends RecyclerView.Adapter<RecycleViewAdaptadorLinea.MyViewHolder> {

    private Context context;
    private List<Linea> listLinea;

    public RecycleViewAdaptadorLinea(Context context, List<Linea> listLinea) {
        this.context = context;
        this.listLinea = listLinea;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.card_linea,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.textNombre.setText(listLinea.get(position).getTitulo());
        holder.imageView.setImageResource(listLinea.get(position).getImagen());
        holder.textAno.setText(listLinea.get(position).getAño());

        final Intent intent = new Intent(context, PersonajesActivity.class);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Cargando...",Toast.LENGTH_SHORT).show();
                switch (position+1){
                    case 1: intent.putExtra("1",1);
                    context.startActivity(intent); break;
                    case 2:intent.putExtra("1",2);
                        context.startActivity(intent); break;
                    case 3:intent.putExtra("1",3);
                        context.startActivity(intent); break;
                    case 4:intent.putExtra("1",4);
                        context.startActivity(intent); break;
                    case 5:intent.putExtra("1",5);
                        context.startActivity(intent); break;
                    case 6:intent.putExtra("1",6);
                        context.startActivity(intent); break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return listLinea.size();
    }

    public  static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView textNombre, textAno;
        ImageView imageView;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textNombre = (TextView) itemView.findViewById(R.id.line_titulo_id);
            textAno = (TextView) itemView.findViewById(R.id.line_ano_id);
            imageView = (ImageView) itemView.findViewById(R.id.imagen_linea_id);
            cardView = (CardView) itemView.findViewById(R.id.card_linea_id);

        }
    }
}
