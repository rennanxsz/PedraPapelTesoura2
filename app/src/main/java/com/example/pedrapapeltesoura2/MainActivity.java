package com.example.pedrapapeltesoura2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.SQLOutput;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void selectedStone(View view){
        this.selectedOption("Stone");

    }

    public void selectedPaper(View view){
        this.selectedOption("Paper");

    }

    public void selectedScissors(View view){
        this.selectedOption("Scissors");

    }

    public void selectedOption(String selectedOption){

        ImageView imageResult = findViewById(R.id.imageResult);
        TextView textResult = findViewById(R.id.textResult);

        int number = new Random().nextInt(3);
        String[] options = { "Stone", "Paper", "Scissors"};
        String appOptions = options[ number ];

        switch ( appOptions ){
            case "Stone":
                imageResult.setImageResource(R.drawable.pedra);
                break;
            case "Paper":
                imageResult.setImageResource(R.drawable.papel);
                break;
            case "Scissors":
                imageResult.setImageResource(R.drawable.tesoura);
                break;
        }

        if (
                (appOptions == "Paper" && selectedOption == "Stone")||
                (appOptions == "Stone" && selectedOption == "Scissors")||
                (appOptions == "Scissors" && selectedOption == "Paper")
        ){//App Winner
            textResult.setText("Você perdeu !");

        }else if (
                (selectedOption == "Paper" && appOptions == "Stone")||
                (selectedOption == "Stone" && appOptions == "Scissors")||
                (selectedOption == "Scissors" && appOptions == "Paper")
        ){//User Winner
            textResult.setText("Você Ganhou !");
        }else{// Draw
            textResult.setText("Empatou !");
        }

        System.out.println("item selecionado: "+ textResult);


    }

}