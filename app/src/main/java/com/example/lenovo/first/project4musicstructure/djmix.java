package com.example.lenovo.first.project4musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class djmix extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_djmix);


        Button homeButton = (Button) findViewById(R.id.buttonToHomeScreen);

        homeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent homeScreenIntent = new Intent(djmix.this,MainActivity.class);
                startActivity(homeScreenIntent);
            }
        });

        Button buttonToAnimalSound = (Button) findViewById(R.id.buttonToAnimalSound);
        buttonToAnimalSound.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intentToAnimalSound = new Intent(djmix.this, animalSound.class);
                startActivity(intentToAnimalSound);
            }
        });

        Button buyButton = (Button) findViewById(R.id.paymentButton);
        buyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent buyIntent = new Intent(djmix.this, PaymentActivity.class);
                startActivity(buyIntent);
            }
        });
    }
}
