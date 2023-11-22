package com.hiujalan.alanvisible;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText angka1,angka2,jawaban,showJawabanEdit;
    private TextView showJawaban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = getApplicationContext();

        angka1 = (EditText) findViewById(R.id.angka_1);
        angka2 = (EditText) findViewById(R.id.angka_2);
        jawaban = (EditText) findViewById(R.id.jawaban);
        showJawaban = (TextView) findViewById(R.id.jawaban_hasil);

        showJawabanEdit = (EditText) findViewById(R.id.jawaban_hasil_edit);


        if (savedInstanceState != null) {
            boolean isVisible = savedInstanceState.getBoolean("reply_visible");
            if (isVisible) {
                angka1.setText(savedInstanceState.getString("save_text_angka_1"));
                angka1.setVisibility(View.VISIBLE);
                angka2.setText(savedInstanceState.getString("save_text_angka_2"));
                angka2.setVisibility(View.VISIBLE);
                jawaban.setText(savedInstanceState.getString("save_text_jawaban"));
                jawaban.setVisibility(View.VISIBLE);
                showJawaban.setText(savedInstanceState.getString("save_text_jawaban_show"));
                showJawaban.setVisibility(View.VISIBLE);

//                if (TextUtils.isEmpty(angka1.getText().toString()) || TextUtils.isEmpty(angka2.getText().toString()) || TextUtils.isEmpty(jawaban.getText().toString())){
//                    Toast.makeText(context, "Silahkan isi terlebih dahulu", Toast.LENGTH_LONG).show();
//                } else {
//                    Integer intAngka1 = Integer.valueOf(angka1.getText().toString());
//                    Integer intAngka2 = Integer.valueOf(angka2.getText().toString());
//                    Integer intJawaban = Integer.valueOf(jawaban.getText().toString());
//
//                    Integer totalJawabanUser = intAngka1 + intAngka2;
//                    if (totalJawabanUser == intJawaban) {
//                        showJawaban.setText("Jawaban kamu Benar");
//                        showJawaban.setVisibility(View.VISIBLE);
//                        showJawabanEdit.setVisibility(View.VISIBLE);
//                    } else {
//                        showJawaban.setText("Jawaban kamu Salah");
//                        showJawaban.setVisibility(View.VISIBLE);
//                        showJawabanEdit.setVisibility(View.VISIBLE);
//                    }
//                }

            }
        }

    }

//    @Override
//    protected void onStop() {
//        super.onStop();
//        Context context = getApplicationContext();
//
//        if (TextUtils.isEmpty(angka1.getText().toString()) || TextUtils.isEmpty(angka2.getText().toString()) || TextUtils.isEmpty(jawaban.getText().toString())){
//            Toast.makeText(context, "Silahkan isi terlebih dahulu", Toast.LENGTH_LONG).show();
//        } else {
//            Integer intAngka1 = Integer.valueOf(angka1.getText().toString());
//            Integer intAngka2 = Integer.valueOf(angka2.getText().toString());
//            Integer intJawaban = Integer.valueOf(jawaban.getText().toString());
//
//            Integer totalJawabanUser = intAngka1 + intAngka2;
//            if (totalJawabanUser == intJawaban) {
//                showJawabanEdit.setText("Jawaban kamu Benar");
//            } else {
//                showJawabanEdit.setText("Jawaban kamu Salah");
//            }
//        }
//
//    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (angka1.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("save_text_angka_1", angka1.getText().toString());
            outState.putString("save_text_angka_2", angka2.getText().toString());
            outState.putString("save_text_jawaban", jawaban.getText().toString());
            outState.putString("save_text_jawaban_show", showJawaban.getText().toString());
        }
    }

    public void launchPopup(View view) {
        Context context = getApplicationContext();

        if (TextUtils.isEmpty(angka1.getText().toString()) || TextUtils.isEmpty(angka2.getText().toString()) || TextUtils.isEmpty(jawaban.getText().toString())){
            Toast.makeText(context, "Silahkan isi terlebih dahulu", Toast.LENGTH_LONG).show();
        } else {
            Integer intAngka1 = Integer.valueOf(angka1.getText().toString());
            Integer intAngka2 = Integer.valueOf(angka2.getText().toString());
            Integer intJawaban = Integer.valueOf(jawaban.getText().toString());

            Integer totalJawabanUser = intAngka1 + intAngka2;

            if (totalJawabanUser == intJawaban){
                Toast.makeText(context, "jawaban kamu "+ intJawaban + " dan jawaban tersebut benar", Toast.LENGTH_LONG).show();
                showJawaban.setText("Jawaban kamu Benar");
                showJawaban.setVisibility(View.VISIBLE);

            } else {
                Toast.makeText(context, "jawaban kamu " + intJawaban + " dan jawaban tersebut salah", Toast.LENGTH_LONG).show();
                showJawaban.setText("Jawaban kamu salah");
                showJawaban.setVisibility(View.VISIBLE);
            }
        }

    }
}