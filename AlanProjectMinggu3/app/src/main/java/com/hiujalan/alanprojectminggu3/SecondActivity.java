package com.hiujalan.alanprojectminggu3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textName,textNumber;
    private ImageView pokemonImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textName = (TextView) findViewById(R.id.item_text);
        textNumber = (TextView) findViewById(R.id.number_text);
        pokemonImg = (ImageView) findViewById(R.id.pokemon_img);


        Intent intent = getIntent();
        String name = intent.getStringExtra(PokemonAdapter.PokemonViewHolder.EXTRA_NAME);
        String number = intent.getStringExtra(PokemonAdapter.PokemonViewHolder.EXTRA_NUMBER);
        int img = Integer.valueOf(intent.getStringExtra(PokemonAdapter.PokemonViewHolder.EXTRA_IMG));
        textName.setText(name);
        textNumber.setText(number);
//        pokemonImg.setImageResource(img);
    }
}