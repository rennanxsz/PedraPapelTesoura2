package com.example.pedrapapeltesoura2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

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
        System.out.println(selectedOption);

        int number = new Random().nextInt(3);
        String[] options = { "stone", "paper", "scissors"};
        String appOption = options[ number ];

        System.out.println(appOption);


    }

}