package com.example.lifecatalyst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;



public class PlaySong extends AppCompatActivity {
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mediaPlayerl.stop();
        mediaPlayerl.release();
        updateSeek.interrupt();
    }

    TextView textView2;
    ImageView previous, play, next;
    ArrayList<File> songs;
    MediaPlayer mediaPlayerl;
    String textContent;
    int position;
    SeekBar seekBar3;
    Thread updateSeek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song);
        textView2 = findViewById(R.id.textView2);
        previous = findViewById(R.id.previous);
        play = findViewById(R.id.play);
        next = findViewById(R.id.next);
        seekBar3 = findViewById(R.id.seekBar3);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        songs = (ArrayList) bundle.getParcelableArrayList("songList");
        textContent = intent.getStringExtra("currentSong");
        textView2.setText(textContent);
        textView2.setSelected(true);
        position = intent.getIntExtra("position", 0);
        Uri uri = Uri.parse(songs.get(position).toString());
        mediaPlayerl = MediaPlayer.create(this, uri);
        mediaPlayerl.start();
        seekBar3.setMax(mediaPlayerl.getDuration());
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                mediaPlayerl.seekTo(seekBar.getProgress());
            }
        });
        updateSeek = new Thread() {
            public void run() {
                int currentPosition = 0;
                try {
                    while (currentPosition < mediaPlayerl.getDuration()) {
                        currentPosition = mediaPlayerl.getCurrentPosition();
                        seekBar3.setProgress(currentPosition);
                        sleep(800);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        updateSeek.start();

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayerl.isPlaying()) {
                    play.setImageResource(R.drawable.play);
                    mediaPlayerl.pause();
                } else {
                    play.setImageResource(R.drawable.pause);
                    mediaPlayerl.start();
                }

            }
        });
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayerl.stop();
                mediaPlayerl.release();
                if (position != 0) {
                    position--;
                } else {
                    position = songs.size() - 1;
                }
                Uri uri = Uri.parse(songs.get(position).toString());
                mediaPlayerl = MediaPlayer.create(getApplicationContext(), uri);
                mediaPlayerl.start();
                play.setImageResource(R.drawable.pause);
                seekBar3.setMax(mediaPlayerl.getDuration());
                textContent = songs.get(position).getName().toString();
                textView2.setText(textContent);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayerl.stop();
                mediaPlayerl.release();
                if (position != songs.size() - 1) {
                    position++;
                } else {
                    position = 0;
                }
                Uri uri = Uri.parse(songs.get(position).toString());
                mediaPlayerl = MediaPlayer.create(getApplicationContext(), uri);
                mediaPlayerl.start();
                play.setImageResource(R.drawable.pause);
                seekBar3.setMax(mediaPlayerl.getDuration());
                textContent = songs.get(position).getName().toString();
                textView2.setText(textContent);
            }
        });

    }
}
