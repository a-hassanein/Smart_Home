package com.example.smarthome;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Devices extends AppCompatActivity {
    ImageView settingLed , TVsetting ,projector , door , camera , raditor ,garage ,condition ,image1 ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devices);

        settingLed = findViewById(R.id.led);
        image1 = findViewById(R.id.imageView);
        settingLed.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Devices.this, ControlSetting.class);
            Pair[] pairs = new Pair[1];
            pairs[0] = new Pair<View,String>(image1 ,"logo_image");
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Devices.this,pairs);
                startActivity(intent,options.toBundle());
            };
        }


    });

        TVsetting = findViewById(R.id.tv);
        image1 = findViewById(R.id.imageView);
        TVsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Devices.this, ControlSetting.class);
                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View,String>(image1 ,"logo_image");
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Devices.this,pairs);
                    startActivity(intent,options.toBundle());
                };

            }
        });

        projector = findViewById(R.id.projector);
        image1 = findViewById(R.id.imageView);
        projector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Devices.this, ControlSetting.class);
                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View,String>(image1 ,"logo_image");
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Devices.this,pairs);
                    startActivity(intent,options.toBundle());
                };

            }
        });

        door = findViewById(R.id.door);
        image1 = findViewById(R.id.imageView);
        door.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Devices.this, ControlSetting.class);
                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View,String>(image1 ,"logo_image");
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Devices.this,pairs);
                    startActivity(intent,options.toBundle());
                };

            }
        });

        camera = findViewById(R.id.camera);
        image1 = findViewById(R.id.imageView);
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Devices.this, ControlSetting.class);
                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View,String>(image1 ,"logo_image");
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Devices.this,pairs);
                    startActivity(intent,options.toBundle());
                };

            }
        });

        raditor = findViewById(R.id.raditor);
        image1 = findViewById(R.id.imageView);
        raditor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Devices.this, ControlSetting.class);
                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View,String>(image1 ,"logo_image");
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Devices.this,pairs);
                    startActivity(intent,options.toBundle());
                };

            }
        });

        garage = findViewById(R.id.garage);
        image1 = findViewById(R.id.imageView);
        garage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Devices.this, ControlSetting.class);
                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View,String>(image1 ,"logo_image");
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Devices.this,pairs);
                    startActivity(intent,options.toBundle());
                };

            }
        });

        condition = findViewById(R.id.aircondition);
        image1 = findViewById(R.id.imageView);
        condition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Devices.this, ControlSetting.class);
                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View,String>(image1 ,"logo_image");
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Devices.this,pairs);
                    startActivity(intent,options.toBundle());
                };

            }
        });

    }}