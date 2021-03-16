package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rockSelected(View view){
        this.optionSelected("rock");
    }
    public void paperSelected(View view){
        this.optionSelected("paper");
    }
    public void scissorSelected(View view){
        this.optionSelected("scissor");
    }
    public void optionSelected(String optionSelected){

    }
}