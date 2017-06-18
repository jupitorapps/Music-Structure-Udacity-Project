package com.example.lenovo.first.project4musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView hindiSongImageView = (ImageView) findViewById(R.id.hindiSongCardImage);
        hindiSongImageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent hindiSongIntent = new Intent(MainActivity.this, hindi_song_ringtone.class);
                startActivity(hindiSongIntent);
            }
        });
        ImageView djmixImageView = (ImageView) findViewById(R.id.djmixCardImage);
        djmixImageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent djmixIntent = new Intent(MainActivity.this, djmix.class);
                startActivity(djmixIntent);
            }
        });

        ImageView animalSoundImageView = (ImageView) findViewById(R.id.animalSoundCardImage);
        animalSoundImageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent animalSoundIntent = new Intent(MainActivity.this, animalSound.class);
                startActivity(animalSoundIntent);
            }
        });
        ImageView otherSoundImageView = (ImageView) findViewById(R.id.otherSoundCardImage);
        otherSoundImageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent otherSoundIntent = new Intent(MainActivity.this, otherSounds.class);
                startActivity(otherSoundIntent);
            }
        });
    }
}
