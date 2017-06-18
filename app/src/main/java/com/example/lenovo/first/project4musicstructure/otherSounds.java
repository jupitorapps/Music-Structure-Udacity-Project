package com.example.lenovo.first.project4musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class otherSounds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_sounds);

        Button homeButton = (Button) findViewById(R.id.buttonToHomeScreen);

        homeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent homeScreenIntent = new Intent(otherSounds.this,MainActivity.class);
                startActivity(homeScreenIntent);
            }
        });

        Button buttonToHindiSong = (Button) findViewById(R.id.buttonToHindiSong);
        buttonToHindiSong.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intentToHindiSong = new Intent(otherSounds.this, animalSound.class);
                startActivity(intentToHindiSong);
            }
        });

        Button buyButton = (Button) findViewById(R.id.paymentButton);
        buyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent buyIntent = new Intent(otherSounds.this, PaymentActivity.class);
                startActivity(buyIntent);
            }
        });
    }
}
