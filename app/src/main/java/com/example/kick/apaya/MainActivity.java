package com.example.kick.apaya;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private YoutubePlayer youtubePlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.youtubeImg);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youtubePlayer.geturl("PLTZQ-nkXkxwS7WyMUaScACie6Ftc5UzeV");
                Intent i = new Intent(MainActivity.this, YoutubePlayer.class);
                startActivity(i);
            }
        });
    }
}