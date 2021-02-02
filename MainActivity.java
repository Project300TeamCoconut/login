package edu.zahra.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSignup(View view) {
        //switch to First page
        Intent signupActivity = new Intent(view.getContext(), signup.class);
        startActivity(signupActivity);
    }
}