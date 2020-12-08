package com.example.polivanovgym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.TintableBackgroundView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class step2 extends AppCompatActivity {

    public static int MaleOfFemale;
    private ImageButton imageButton, femaleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step2);

        imageButton = (ImageButton) findViewById(R.id.imageButton);
        femaleButton = (ImageButton) findViewById(R.id.femaleButton);
        MaleOfFemale = 2;
    }
    public void PressMale(View view){
        MaleOfFemale = 1;
    }
    public void PressFemale(View view){
        MaleOfFemale = 0;
    }
    public void GoToStepThree(View view){
        if (MaleOfFemale == 1){
            Intent intent = new Intent(this, step3male.class);
            startActivity(intent);
        }
        else if(MaleOfFemale == 0){
            Intent intent = new Intent(this, step3female.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(getApplicationContext(), "You have not chosen a gender!", Toast.LENGTH_LONG).show();
        }

    }
}