package com.example.erp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        EditText username = findViewById(R.id.username);
//        EditText password = findViewById(R.id.password);
//        Button login = findViewById(R.id.login);
        Button signup = findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            openSignup();
            }
        });
    }

    private void openSignup() {
        Intent i = new Intent(MainActivity.this, Signup.class );
        i.putExtra("username","sandeep");
        i.putExtra("age",23);
        startActivity(i);
        finish();
    }
}