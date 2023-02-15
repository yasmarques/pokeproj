package br.com.etecia.pokeproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView list;

    String titulo[] = {"Bubasaur", "Charmander", "Squirtel"};
    String descricao[] = {"While it is young, it uses the nutrients that are stored in the seed on its back in order to grow.", "From the time it is born, a flame burns at the tip of its tail. Its life would end if the flame were to go out. It has a preference for hot things.", "When it feels threatened, it draws its limbs inside its shell and sprays water from its mouth. When it retracts its long neck into its shell, it squirts out"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);
        MyAdapter adapter = new MyAdapter();
        list.setAdapter(adapter);
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