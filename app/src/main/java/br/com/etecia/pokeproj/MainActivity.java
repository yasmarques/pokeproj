package br.com.etecia.pokeproj;

import androidx.appcompat.app.AppCompatActivity;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //criando base de dados para carregamento da lista
        ListaPokemon = new ArrayList<>();

        ListaPokemon.add(
                new Pokemon("Charmander",
                        "Pokemon fofo que parece uma largatixa",
                        "Fogo e Largatixa",
                        R.drawable.largatixa));

        //criando a classe adaptadora e passando os paramentros
        MyAdapter adapter = new MyAdapter(getApplicationContext(), ListaPokemon);

    }
    public class MyAdapter extends BaseAdapter{

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