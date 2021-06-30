package com.example.smarthome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.lang.annotation.Annotation;

public class MainActivity extends AppCompatActivity {

    private  static int SPLASH_SCREEN = 5000 ;
    //variables
    Animation topAnim;
    Animation bottomAnim ;
    ImageView image1 ;
    ImageView image2 ;
    public static usersDatabase userDatabase ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        userDatabase = Room.databaseBuilder(this,usersDatabase.class ,"family").allowMainThreadQueries().build();

        //Animations
        topAnim =  AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim =  AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        image1 = findViewById(R.id.imageView);
        image2 = findViewById(R.id.imageView2);

        image1.setAnimation(topAnim);
        image2.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent (MainActivity.this,login.class);
                Pair[] pairs = new Pair[2];
                pairs[0] = new Pair<View,String>(image1 ,"logo_image");
                pairs[1] = new Pair<View,String>(image2 ,"logo_text");

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
                    startActivity(intent,options.toBundle());
                }
            }
        },SPLASH_SCREEN);
    }

}