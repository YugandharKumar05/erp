package com.example.erp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.tabs.TabItem;

public class OwnerScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.owner_screen);

        TabItem addEmployee = findViewById(R.id.Employee);
//        addEmployee.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//            addEmployee();
//            }
//        });
    }
//    public void addEmployee() {
//        Intent addemployee = new Intent(OwnerScreen.this, AddEmploee.class);
//        startActivity(addemployee);
//    }


}
