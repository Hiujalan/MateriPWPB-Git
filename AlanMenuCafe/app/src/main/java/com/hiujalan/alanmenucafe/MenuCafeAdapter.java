package com.hiujalan.alanmenucafe;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MenuCafeAdapter extends RecyclerView.Adapter<MenuCafeAdapter.MenuCafeViewHolder> {

    public class MenuCafeViewHolder extends RecyclerView.ViewHolder {
        private ConstraintLayout containerView;
        private TextView menuNama,menuCategory;
        private ImageView menuImage;

//        public static final String EXTRA_NAMA = "com.hiujalan.alanmenucafe.extra.NAMA";
//        public static final String EXTRA_DETAIL = "com.hiujalan.alanmenucafe.extra.DETAIL";
//        public static final String EXTRA_HARGA = "com.hiujalan.alanmenucafe.extra.HARGA";
//        public static final String EXTRA_IMG = "com.hiujalan.alanmenucafe.extra.IMG";

        public MenuCafeViewHolder(@NonNull View itemView) {
            super(itemView);

            containerView = itemView.findViewById(R.id.menu_cafe_layout);
            menuNama = itemView.findViewById(R.id.menu_cafe_nama);
            menuCategory = itemView.findViewById(R.id.menu_cafe_category);
            menuImage = itemView.findViewById(R.id.menu_image);
//            menuRating = itemView.findViewById(R.id.menu_cafe_rating);

            containerView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MenuCafe menus = (MenuCafe) containerView.getTag();
                    Intent intent = new Intent(view.getContext(),DetailMenu.class);
                    intent.putExtra("nama", menus.getNama());
                    intent.putExtra("detail", menus.getDetail());
                    intent.putExtra("category", menus.getCategory());
                    intent.putExtra("img", menus.getImg());
                    intent.putExtra("area",menus.getArea());
                    view.getContext().startActivity(intent);
                }
            });
        }
    }



    @NonNull
    @Override
    public MenuCafeAdapter.MenuCafeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_cafe_row,parent, false);
        return new MenuCafeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuCafeAdapter.MenuCafeViewHolder holder, int position) {
        MenuCafe current = menus.get(position);
        holder.menuNama.setText(current.getNama());
//        holder.menuImage.setImageResource(current.getImg());
        Picasso.get().load(current.getImg()).into(holder.menuImage);
        holder.menuCategory.setText(current.getCategory());

        holder.containerView.setTag(current);
    }

    @Override
    public int getItemCount() {
        return menus.size();
    }

    private List<MenuCafe> menus = new ArrayList<>();
    private RequestQueue requestQueue;

    MenuCafeAdapter(Context context){
        requestQueue = Volley.newRequestQueue(context);
        loadMenu();
    }

    public void loadMenu(){
        String url = "https://www.themealdb.com/api/json/v1/1/search.php?f=b";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {

                    JSONArray results = response.getJSONArray("meals");
                    JSONObject resultsData = results.getJSONObject(1);

                    for (int i=0; i <= resultsData.length(); i++){
                        JSONObject result = results.getJSONObject(i);
                        menus.add(new MenuCafe(
                                result.getString("strMeal"),
                                result.getString("strCategory"),
                                result.getString("strMealThumb"),
                                result.getString("strArea"),
                                result.getString("strInstructions")
                        ));

                        notifyDataSetChanged();
                    }
                } catch (JSONException e) {
                    Log.e("ERRORS", "Json Error ", e);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("ERRORS","Menu List Errors");
            }
        });

        requestQueue.add(request);
    }

}


