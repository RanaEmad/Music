package com.example.android.music;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Song> songs= new ArrayList<Song>();
        songs.add(new Song("Song 1","Artist 1"));
        songs.add(new Song("Song 2","Artist 2"));

        SongAdaptor songAd= new SongAdaptor(this,songs);

        ListView listView=(ListView) findViewById(R.id.listview_song);
        listView.setAdapter(songAd);

    }
}
