package com.example.polivanovgym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class step4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step4);
    }
    public void GoToStepFive(View view){
        Intent intent = new Intent(this, step5.class);
        startActivity(intent);
    }

}