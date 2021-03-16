package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

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
    public void optionSelected(String optionUser){
        ImageView imageResult = findViewById(R.id.imageview_escolha_do_app);
        TextView textResult = findViewById(R.id.texview_resultado);
         int randomAppPlayer = new Random().nextInt(3);//0, 1, 2
        String[] options = {"rock", "paper", "scissor"};
        String optionApp =  options[randomAppPlayer];

        switch (optionApp){
            case "rock":
                imageResult.setImageResource(R.drawable.pedra);
                break;
            case "paper":
                imageResult.setImageResource(R.drawable.papel);
                break;
            case "scissor":
                imageResult.setImageResource(R.drawable.tesoura);
                break;
        }

        //app wins
        if(optionApp == "paper" && optionUser == "rock" ||
                optionApp == "rock" && optionUser == "scissor" ||
                optionApp == "scissor" && optionUser == "paper"){
            textResult.setText(R.string.voce_perdeu);
        //user wins
        }else if(optionUser == "paper" && optionApp == "rock" ||
                optionUser == "rock" && optionApp == "scissor" ||
                optionUser == "scissor" && optionApp == "paper"){
            textResult.setText(R.string.voce_venceu);

        //tie
        }else{
            textResult.setText(R.string.empate);
        }
    }
}