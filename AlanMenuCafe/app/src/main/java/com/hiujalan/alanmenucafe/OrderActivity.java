package com.hiujalan.alanmenucafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class OrderActivity extends AppCompatActivity {
    private TextView menuPesanan,menuHarga,menuNoPesanan,menuTanggal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        menuPesanan = (TextView) findViewById(R.id.menu_pesanan);
        menuHarga = (TextView) findViewById(R.id.menu_harga);
        menuNoPesanan = (TextView) findViewById(R.id.menu_noPesanan);
        menuTanggal = (TextView) findViewById(R.id.menu_tanggal);

        Intent getIntent = getIntent();
        String pesanan = getIntent.getStringExtra("nama");
        menuPesanan.setText(pesanan);

        String harga = getIntent.getStringExtra("harga");
        menuHarga.setText(harga);

//        buat angka random untuk nomor pesanan
        Random random = new Random();
        int noPesanan = random.nextInt(100000);
        menuNoPesanan.setText(String.valueOf(noPesanan));

//        set tanggal
        Date date = new Date();
//        set format tanggal
        SimpleDateFormat ft = new SimpleDateFormat ("E yyyy MM dd");
        menuTanggal.setText(ft.format(date));

    }

    public void launchMainActivity(View view) {
        Intent startIntent = new Intent(this,MainActivity.class);
        startActivity(startIntent);
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