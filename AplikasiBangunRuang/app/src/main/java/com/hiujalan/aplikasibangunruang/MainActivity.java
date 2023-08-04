package com.hiujalan.aplikasibangunruang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    public static final String EXTRA_DIAMETER = "com.hiujalan.android.aplikasibangunruang.extra.DIAMETER";
    public static final String EXTRA_TINGGI = "com.hiujalan.android.aplikasibangunruang.extra.TINGGI";

    public static EditText Diameter;
    public static EditText Tinggi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Diameter = (EditText) findViewById(R.id.plain_diameter);
        Tinggi = (EditText) findViewById(R.id.plain_tinggi);
    }

    public void launchOutputBangunRuang(View view) {
        Log.d(LOG_TAG, "button clicked");

        Intent intent = new Intent(this, OutputBangunRuang.class);
        String tinggiText = Tinggi.getText().toString();
        String diameterText = Diameter.getText().toString();

        intent.putExtra(EXTRA_DIAMETER, diameterText);
        intent.putExtra(EXTRA_TINGGI, tinggiText);

        startActivity(intent);

//        if (diameterText != null) {
//            if (tinggiText != null ) {
//
//                Integer diameterInt = Integer.parseInt(diameterText);
//                Integer tinggiInt = Integer.parseInt(tinggiText);
//
//                Integer r = diameterInt / 2;
//
//                 if (r % 7 == 0) {
//                    Integer Phi = 22/7;
//                     intent.putExtra(EXTRA_PHI, Phi);
//                     startActivity(intent);
//                } else if (r % 7 != 0) {
//                     Double Phi = 3.14;
//                     intent.putExtra(EXTRA_PHI, Phi);
//                     startActivity(intent);
//                 }
//            }
//        }







    }
}