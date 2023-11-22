package com.hiujalan.alanmenucafe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycleView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycleView = findViewById(R.id.recycle_view);
        adapter = new MenuCafeAdapter(getApplicationContext());
//        layoutManager = new LinearLayoutManager(this);

//        membuat item menjadi 2
        layoutManager = new GridLayoutManager(this, 2);
        recycleView.setLayoutManager(layoutManager);

        recycleView.setAdapter(adapter);
        recycleView.setLayoutManager(layoutManager);
    }

//    membuat option dengan layout menu_main
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