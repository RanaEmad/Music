package com.example.android.music;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<Song> songs= new ArrayList<Song>();
        songs.add(new Song("Yellow Submarine","The Beatles"));
        songs.add(new Song("Don't Stop Me Now","Queen"));

        SongAdaptor songAd= new SongAdaptor(this,songs);

        ListView listView=(ListView) findViewById(R.id.listview_song);

        listView.setAdapter(songAd);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, SongActivity.class);
                intent.putExtra("name", songs.get(i).name);
                intent.putExtra("artist", songs.get(i).artist);
                startActivity(intent);
            }
        });

    }

}
