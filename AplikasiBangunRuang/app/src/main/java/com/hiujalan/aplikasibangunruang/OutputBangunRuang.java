package com.hiujalan.aplikasibangunruang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OutputBangunRuang extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    private TextView outputLuas;
    private TextView outputVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output_bangun_ruang);

        outputLuas = (TextView) findViewById(R.id.output_luas);
        outputVolume = (TextView) findViewById(R.id.output_volume);

        Intent intent = getIntent();
        String tinggiText = intent.getStringExtra(MainActivity.EXTRA_TINGGI);
        String diameterText = intent.getStringExtra(MainActivity.EXTRA_DIAMETER);

        Integer diameterInt = Integer.parseInt(diameterText);
        Integer tinggiInt = Integer.parseInt(tinggiText);

        Integer r = diameterInt / 2;

        Double luasPermukaan = 2 * Math.PI * r * (r + tinggiInt);
        Double volume = Math.PI * r * r * tinggiInt;

        String luasPermukaanText = String.format("%.2f", luasPermukaan);
        String volumeText = String.format("%.2f", volume);

        outputLuas.setText(luasPermukaanText);
        outputVolume.setText(volumeText);

//            Log.d(LOG_TAG, String.valueOf(luasPermukaan));
    }

}