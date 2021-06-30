package com.example.smarthome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ControlSetting extends AppCompatActivity {

    TextView desplay ;
    ImageButton offBtn , onBtn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_setting);

        offBtn=findViewById(R.id.of_Btn);
        onBtn=findViewById(R.id.onbtn);
        desplay =findViewById(R.id.textView);

        desplay.setText("OFF");

        offBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desplay.setText("OFF");
            }
        });

        onBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desplay.setText("ON");
            }
        });

    }
}