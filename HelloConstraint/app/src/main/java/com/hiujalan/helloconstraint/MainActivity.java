package com.hiujalan.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, R.string.message_toast, Toast.LENGTH_LONG);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mCount <= 10) {
            if (mShowCount != null) {
                mShowCount.setText(Integer.toString(mCount));
            }
        }
    }

    public void reset(View view) {
        mCount = 0;
        if (mCount == 0) {
            if (mShowCount != null) {
                mShowCount.setText(Integer.toString(mCount));
            }
        }
    }

    public void unCount(View view) {
        mCount--;
        if (mCount >= -10) {
            if (mShowCount != null) {
                mShowCount.setText(Integer.toString(mCount));
            }
        }
    }
}