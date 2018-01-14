package com.example.anshul.dicee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);

        Button roll1= (Button) findViewById(R.id.rollbutton);
       final ImageView left= (ImageView) findViewById(R.id.left_dice);
      final  ImageView right= (ImageView) findViewById(R.id.right_dice);
       final int[] dicearray={R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        };
        roll1.setOnClickListener(new View.OnClickListener(){
              @Override
            public void onClick(View v){
                Log.d("Dicee","Ze button has been pressed");
                Random randomnumbergenerator= new Random();
                int number= randomnumbergenerator.nextInt(6);
                Log.d("Dicee","The random number is:"+number);
                left.setImageResource(dicearray[number]);
                number= randomnumbergenerator.nextInt(6);
                right.setImageResource(dicearray[number]);



            }
        });
    }
}
