package com.example.smarthome;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class SignUp extends AppCompatActivity {

    Button backLogIn , signupbtn;
    TextInputLayout fullname , username , phoneNo , email ,password ;
    String FullNames ,UserNames , Emails,Passwords ,PhoneNumers;

    usersDatabase database ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_up);

        backLogIn = findViewById(R.id.login_screen);
        signupbtn = findViewById(R.id.SignUpbtn);
        fullname = findViewById(R.id.name);
        username = findViewById(R.id.username);
        phoneNo = findViewById(R.id.phoneNo);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);



        backLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUp.this, login.class);
                startActivity(intent);
            }

            ;
        });
        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getinfo();
                users user = new users(FullNames ,UserNames ,PhoneNumers ,Emails ,Passwords);
                MainActivity.userDatabase.usersDao().insertusers(user);
            }


        });
    }
    public void getinfo(){
        FullNames = fullname.getEditText().getText().toString();
        UserNames = username.getEditText().getText().toString();
        PhoneNumers = phoneNo.getEditText().getText().toString();
        Emails = email.getEditText().getText().toString();
        Passwords = password.getEditText().getText().toString();

    }
}