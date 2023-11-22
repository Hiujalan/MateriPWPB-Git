package com.hiujalan.alanprojectminggu3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private  RecyclerView recycleView;
    private  RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycleView = findViewById(R.id.recycle_viewer);
        adapter = new PokemonAdapter();
        layoutManager = new LinearLayoutManager(this);

        recycleView.setAdapter(adapter);
        recycleView.setLayoutManager(layoutManager);

//        List<Pokemon> pokemons = new ArrayList<>();
//        pokemons.add(new Pokemon("Pikachu", 1));
//        pokemons.add(new Pokemon("Bulbasaur", 2));
//        pokemons.add(new Pokemon("Ho'oh", 3));
//
//        List<String> students = Arrays.asList("aksa", "aska", "bagus");
//        Map<String, Pokemon> assignment = new HashMap<>();
//
//        Random random = new Random();
//        for (String student : students) {
//            int index = random.nextInt(Pokemons.size());
//            assignment.put(student, pokemons.get(index));
//        }
//
//        for (Map.Entry<String, Pokemon> entry : assignment.entrySet()) {
//            Pokemon pokemon = entry.getValue();
//            Log.d("Alan Herva", entry.getKey() + " Temanya " + pokemon.getName() + " Dengan Nomor " + pokemon.getNumber());
//        }
    }
}