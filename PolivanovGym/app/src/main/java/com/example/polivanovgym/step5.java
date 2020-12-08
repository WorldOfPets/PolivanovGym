package com.example.polivanovgym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class step5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step5);
    }
    public void GoToRegistr(View view){
        Intent intent = new Intent(this, registration.class);
        startActivity(intent);
    }
}