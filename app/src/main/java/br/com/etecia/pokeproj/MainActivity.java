package br.com.etecia.pokeproj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Pokemon> ListaPokemon;

    //Declarar o recycle view
    RecyclerView idRecycleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Apresentando o xml para o java
        idRecycleView = findViewById(R.id.idListaPokemon);

        //Criando base de dados para carregamento da lista
        ListaPokemon = new ArrayList<>();

        ListaPokemon.add(
                new Pokemon("Charmander",
                        "Pokemon fofo que parece uma largatixa",
                        "Fogo e Largatixa",
                        R.drawable.largatixa));
        ListaPokemon.add(
                new Pokemon("Squirtle",
                        "Pokemon fofo que parece uma tartaruga",
                        "Água e tartaruga",
                        R.drawable.tartaruga));
        ListaPokemon.add(
                new Pokemon("Bulbasaur",
                        "Pokemon fofo que parece um sapo",
                        "Terra e sapo",
                        R.drawable.sapo));

        ListaPokemon.add(
                new Pokemon("Charmander",
                        "Pokemon fofo que parece uma largatixa",
                        "Fogo e Largatixa",
                        R.drawable.largatixa));

        ListaPokemon.add(
                new Pokemon("Charmander",
                        "Pokemon fofo que parece uma largatixa",
                        "Fogo e Largatixa",
                        R.drawable.largatixa));

        ListaPokemon.add(
                new Pokemon("Charmander",
                        "Pokemon fofo que parece uma largatixa",
                        "Fogo e Largatixa",
                        R.drawable.largatixa));

        //Criando a classe adaptadora e passando os paramentros
        MyAdapter adapter = new MyAdapter(getApplicationContext(), ListaPokemon);

        //Tipo layout de a lista irá seguir
        idRecycleView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        //Fixador de tamanho da lista - deixar a lista mais rapida
        idRecycleView.setHasFixedSize(true);

        //Ligar o recyclerview ao adaptador
        idRecycleView.setAdapter(adapter);

    }

    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }
    }
}