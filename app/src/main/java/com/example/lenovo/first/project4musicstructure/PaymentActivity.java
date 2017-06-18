package com.example.lenovo.first.project4musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        Button backToHoemButton = (Button) findViewById(R.id.backToHome);
        backToHoemButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent backToHomeIntent = new Intent(PaymentActivity.this, MainActivity.class);
                startActivity(backToHomeIntent);
            }
        });
    }
}
