package com.example.smarthome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

public class Dashboard extends AppCompatActivity {

    RecyclerView recyclerView ;
    String s1[];
    int images[] ={R.drawable.laamp,R.drawable.condition,R.drawable.tv,R.drawable.gaarage,R.drawable.dooor,R.drawable.caamera};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dashboard);


        recyclerView = findViewById(R.id.recyclerView);
        s1 =getResources().getStringArray(R.array.Devices);
    }
}