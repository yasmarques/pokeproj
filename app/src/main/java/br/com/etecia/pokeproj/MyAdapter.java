package br.com.etecia.pokeproj;

import android.content.Context;
import android.view.LayoutInflater;
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

    public MyAdapter(Context mContexto, List<Pokemon> listaPokemon) {
        this.mContexto = mContexto;
        ListaPokemon = listaPokemon;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater inflater = LayoutInflater.from(mContexto);
        view = inflater.inflate(R.layout.modelo_pokedex, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.idTituloPk.setText(ListaPokemon.get(position).getTitulo());
        holder.idImgPokemon.setImageResource(ListaPokemon.get(position).getImagem());

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
