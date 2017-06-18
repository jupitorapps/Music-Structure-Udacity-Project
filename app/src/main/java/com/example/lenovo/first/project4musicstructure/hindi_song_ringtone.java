package com.example.lenovo.first.project4musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class hindi_song_ringtone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_song_ringtone);

        Button homeButton = (Button) findViewById(R.id.buttonToHomeScreen);

        homeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent homeScreenIntent = new Intent(hindi_song_ringtone.this,MainActivity.class);
                startActivity(homeScreenIntent);
            }
        });

        Button djmixButton = (Button) findViewById(R.id.buttonDJMix);

        djmixButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent djmixIntent = new Intent(hindi_song_ringtone.this,djmix.class);
                startActivity(djmixIntent);
            }
        });

        Button buyButton = (Button) findViewById(R.id.paymentButton);
        buyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent buyIntent = new Intent(hindi_song_ringtone.this, PaymentActivity.class);
                startActivity(buyIntent);
            }
        });
    }
}
