package com.example.lenovo.first.project4musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class animalSound extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_sound);

        Button homeButton = (Button) findViewById(R.id.buttonToHomeScreen);

        homeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent homeScreenIntent = new Intent(animalSound.this,MainActivity.class);
                startActivity(homeScreenIntent);
            }
        });

        Button buttonToOtherSound = (Button) findViewById(R.id.buttonToOtherSound);
        buttonToOtherSound.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intentToOtherSound = new Intent(animalSound.this, otherSounds.class);
                startActivity(intentToOtherSound);
            }
        });

        Button buyButton = (Button) findViewById(R.id.paymentButton);
        buyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent buyIntent = new Intent(animalSound.this, PaymentActivity.class);
                startActivity(buyIntent);
            }
        });
    }
}
