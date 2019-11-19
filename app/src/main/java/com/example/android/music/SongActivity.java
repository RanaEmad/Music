package com.example.android.music;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        TextView name = findViewById(R.id.name);
        name.setText(getIntent().getStringExtra("name"));

        TextView artist = findViewById(R.id.artist);
        artist.setText(getIntent().getStringExtra("artist"));

        final Button button = (Button) findViewById(R.id.play);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               if(button.getText().equals("PLAY")){
                   button.setText("PAUSE");
               }
               else{
                   button.setText("PLAY");
               }
            }
        });
    }
}
