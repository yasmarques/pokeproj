package br.com.etecia.pokeproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ApresentaPokemonActivity extends AppCompatActivity {

    TextView mNomePokemon, mCategoria, mDescricao;
    ImageView mImagemPokemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apresenta_pokemon_layout);

        mNomePokemon = findViewById(R.id.mNomePokemon);
        mCategoria = findViewById(R.id.mCategoria);
        mDescricao = findViewById(R.id.mDescricao);
        mImagemPokemon = findViewById(R.id.mImagemPokemon);

        Intent intent = getIntent();

        String descricao, categoria;
        int imagempokemon;

        String nomepokemon = intent.getExtras().getString("NomePokemon");
        descricao = intent.getExtras().getString("Descricao");
        categoria = intent.getExtras().getString("Categoria");
        imagempokemon = intent.getExtras().getInt("ImagemPokemon");

        mNomePokemon.setText(nomepokemon);
        mDescricao.setText(descricao);
        mCategoria.setText(categoria);
        mImagemPokemon.setImageResource(imagempokemon);
    }
}