package com.example.smarthome;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.List;


public class login extends AppCompatActivity {

    Button callSignUp ,login_btn ;
    ImageView image1 ,image2;
    TextView sloganText;
    TextInputLayout username ,password ;
    List<users> user ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        callSignUp = findViewById(R.id.signup_screen);
        image1 = findViewById(R.id.imageView);
        image2 = findViewById(R.id.imageView2);
        login_btn = findViewById(R.id.login_btn);
        sloganText = findViewById(R.id.slogan_name);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);


        callSignUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this ,SignUp.class);
                Pair[] pairs = new Pair[7];
                pairs[0] = new Pair<View,String>(image1 ,"logo_image");
                pairs[1] = new Pair<View,String>(image2 ,"logo_text");
                pairs[2] = new Pair<View,String>(login_btn ,"Button_tran");
                pairs[3] = new Pair<View,String>(sloganText ,"logo_desc");
                pairs[4] = new Pair<View,String>(username ,"username_tran");
                pairs[5] = new Pair<View,String>(password ,"password_tran");
                pairs[6] = new Pair<View,String>(callSignUp ,"login_signup_tran");


                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(login.this,pairs);
                    startActivity(intent,options.toBundle());
                }; }


    });
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name =username.getEditText().getText().toString();
                String pass =password.getEditText().getText().toString();
                user = MainActivity.userDatabase.usersDao().getUsers(name,pass);
                if (user.isEmpty()){
                    Toast.makeText(login.this, "User not found,Please SignUp ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(login.this, Devices.class);
                    Pair[] pairs = new Pair[2];
                    pairs[0] = new Pair<View,String>(image1 ,"logo_image");
                    pairs[1] = new Pair<View,String>(image2 ,"logo_text");
                    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(login.this,pairs);
                        startActivity(intent,options.toBundle());
                    };
                }

            }
        });
    }
}