package br.com.etecia.pokeproj;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context mContexto;
    private List<Pokemon> ListaPokemon;


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    //criar a classe ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView idTituloPk;
        ImageView idImgPokemon;
        CardView idCardPokemon;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idTituloPk = itemView.findViewById(R.id.idTituloPk);
            idImgPokemon = itemView.findViewById(R.id.idImgPokemon);
            idCardPokemon = itemView.findViewById(R.id.idCardPokemon);
        }
    }
}
