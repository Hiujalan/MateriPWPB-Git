package com.hiujalan.alanprojectminggu3;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder> {


    public class PokemonViewHolder extends RecyclerView.ViewHolder  {
        private ConstraintLayout containerView;
        private TextView textView;

        public static final String EXTRA_NAME = "com.hiujalan.alanprojectminggu3.extra.NAME";
        public static final String EXTRA_NUMBER = "com.hiujalan.alanprojectminggu3.extra.NUMBER";
        public static final String EXTRA_IMG = "com.hiujalan.alanprojectminggu3.extra.IMG";

        public PokemonViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.pokemon_text_row);
            containerView = itemView.findViewById(R.id.pokemon_layout_row);

            containerView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Pokemon current = (Pokemon) containerView.getTag();
                    Intent intent = new Intent(view.getContext(),SecondActivity.class);
                    intent.putExtra(EXTRA_NAME,current.getName());
                    intent.putExtra(EXTRA_NUMBER, String.valueOf(current.getNumber()));
                    intent.putExtra(EXTRA_IMG,String.valueOf(current.getImg()));
                    view.getContext().startActivity(intent);
                }
            });
        }
    }

    private List<Pokemon> pokemons = Arrays.asList(
            new Pokemon("Bulbasaur", 1,R.drawable.bulbasaur),
            new Pokemon("Ho'oh", 2, R.drawable.hooh),
            new Pokemon("Venusaur", 3,R.drawable.venusaur)
    );

    @NonNull
    @Override
    public PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon_row,parent, false);
        return new PokemonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonViewHolder holder, int position) {
        Pokemon current = pokemons.get(position);
        holder.textView.setText(current.getName());
        holder.containerView.setTag(current);
    }

    @Override
    public int getItemCount() {
        return pokemons.size();
    }


}
