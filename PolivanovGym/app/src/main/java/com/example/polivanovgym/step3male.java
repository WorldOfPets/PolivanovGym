package com.example.polivanovgym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class step3male extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step3male);
    }
    public void GoToStepFour(View view){
        Intent intent = new Intent(this, step4.class);
        startActivity(intent);
    }
}