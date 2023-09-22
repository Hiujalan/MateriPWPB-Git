package com.hiujalan.alanmenucafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailMenu extends AppCompatActivity {
    private TextView menuNama, menuHarga, menuDetail,menuRating;
    private ImageView menuImage;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        menuNama = (TextView) findViewById(R.id.menu_cafe_nama);
        menuHarga = (TextView) findViewById(R.id.menu_cafe_harga);
        menuImage = (ImageView) findViewById(R.id.menu_image);
        menuDetail = (TextView) findViewById(R.id.menu_cafe_detail);
        menuRating = (TextView) findViewById(R.id.menu_cafe_rating_data);

        intent = getIntent();
        String nama = intent.getStringExtra("nama");
        menuNama.setText(nama);

        String harga = intent.getStringExtra("harga");
        menuHarga.setText("Rp " + harga);

        int image = intent.getIntExtra("img",0);
        menuImage.setImageResource(image);

        String detail = intent.getStringExtra("detail");
        menuDetail.setText(detail);

        String rating = intent.getStringExtra("rating");
        menuRating.setText(rating);
    }

    public void launchOrderActivity(View view) {
        Intent intentOrder = new Intent(this,OrderActivity.class);
        intentOrder.putExtra("nama", intent.getStringExtra("nama"));
        intentOrder.putExtra("harga", intent.getStringExtra("harga"));
        intentOrder.putExtra("imgOrder", intent.getIntExtra("img",0));
        startActivity(intentOrder);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.option_about :
                launchAboutActivity();
                return true;
            case R.id.option_help:
                showHelp();
                return true;
            case R.id.option_exit:
                System.exit(0);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void showHelp() {
        Context context =getApplicationContext();
        Toast toast =Toast.makeText(context,"Silahkan Hubungi nomor 089520040070", Toast.LENGTH_LONG);
        toast.show();
    }

    private void launchAboutActivity(){
        Intent intent = new Intent(this,AboutActivity.class);
        startActivity(intent);
    }
}