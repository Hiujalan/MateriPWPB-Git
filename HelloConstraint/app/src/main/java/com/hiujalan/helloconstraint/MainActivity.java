package com.hiujalan.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Membuat Variabel mCount dengan niali 0
    private int mCount = 0;
    // memuat referensi TextView untuk di masukkan dalam variabel mShowCount
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    // Untuk menampilkan popup message Hello Toast
    public void showToast(View view) {
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, R.string.message_toast, Toast.LENGTH_LONG);
        toast.show();
    }

    // Untuk menampilkan angka yang telah di tambah
    public void countUp(View view) {
        mCount++;
        if (mCount <= 10) {
            if (mShowCount != null) {
                mShowCount.setText(Integer.toString(mCount));
            }
        }
    }

    // Untuk mereset Nilai mCount menjadi 0
    public void reset(View view) {
        mCount = 0;
        if (mCount == 0) {
            if (mShowCount != null) {
                mShowCount.setText(Integer.toString(mCount));
            }
        }
    }

    // untuk mengurangi Nilai mCount
    public void unCount(View view) {
        mCount--;
        if (mCount >= -10) {
            if (mShowCount != null) {
                mShowCount.setText(Integer.toString(mCount));
            }
        }
    }
}
