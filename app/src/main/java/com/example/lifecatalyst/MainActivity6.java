package com.example.lifecatalyst;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;




public class MainActivity6 extends AppCompatActivity {
    TextView titlechef;
    ImageView imageView4;
    SurfaceView surfaceView3, surfaceView4, surfaceView5;
    Button button8, button9, button10;
    SeekBar seekBar5, seekBar6, seekBar7;
    TextView textView12, textView13, textView14;

    private MediaPlayer mediaPlayer1, mediaPlayer2, mediaPlayer3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Intent intent = getIntent();
        titlechef = findViewById(R.id.textView6);
        imageView4 = findViewById(R.id.imageView4);
        surfaceView3 = findViewById(R.id.surfaceView3);
        surfaceView4 = findViewById(R.id.surfaceView4);
        surfaceView5 = findViewById(R.id.surfaceView5);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        seekBar5 = findViewById(R.id.seekBar5);
        seekBar6 = findViewById(R.id.seekBar6);
        seekBar7 = findViewById(R.id.seekBar7);
        mediaPlayer1 = MediaPlayer.create(this, R.raw.food1);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.food2);
        mediaPlayer3 = MediaPlayer.create(this, R.raw.food3);
        textView12 = findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);
        textView14 = findViewById(R.id.textView14);
        textView12.setText("Fun Recipes To Try When You're Bored _ #StayHome _ Lockdown Cooking");
        textView13.setText("6 easy party snacks recipe _ must try party snacks.");
        textView14.setText("Potato Lollipop _ Easy Snacks To Make At Home _ Lockdown Recipes At Home _ Birthday Special Recipes");
        surfaceView3.setKeepScreenOn(true);
        SurfaceHolder surfaceHolder = surfaceView3.getHolder();
        surfaceHolder.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(@NonNull SurfaceHolder holder) {
                mediaPlayer1.setDisplay(surfaceHolder);
            }

            @Override
            public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {

            }

            @Override
            public void surfaceDestroyed(@NonNull SurfaceHolder holder) {

            }
        });
        seekBar5.setMax(mediaPlayer1.getDuration());
        seekBar5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar5, int progress, boolean fromUser) {
                if (fromUser) {
                    mediaPlayer1.seekTo(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar5) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar5) {

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer1.isPlaying()) {
                    mediaPlayer1.pause();
                    button8.setText("Play");
                } else {
                    mediaPlayer1.start();
                    button8.setText("Pause");
                }
            }
        });
        if (mediaPlayer1.isPlaying() == false) {
            surfaceView4.setKeepScreenOn(true);
            SurfaceHolder surfaceHolder1 = surfaceView4.getHolder();
            surfaceHolder1.addCallback(new SurfaceHolder.Callback() {
                @Override
                public void surfaceCreated(@NonNull SurfaceHolder holder) {
                    mediaPlayer2.setDisplay(surfaceHolder1);
                }

                @Override
                public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {

                }

                @Override
                public void surfaceDestroyed(@NonNull SurfaceHolder holder) {

                }
            });
            seekBar6.setMax(mediaPlayer2.getDuration());
            seekBar6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar6, int progress, boolean fromUser) {
                    if (fromUser) {
                        mediaPlayer2.seekTo(progress);
                    }
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar6) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar6) {

                }
            });
            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mediaPlayer2.isPlaying()) {
                        mediaPlayer2.pause();
                        button9.setText("Play");
                    } else {
                        mediaPlayer2.start();
                        button9.setText("Pause");
                    }
                }
            });
        }
        if (mediaPlayer1.isPlaying() == false && mediaPlayer2.isPlaying() == false) {
            surfaceView5.setKeepScreenOn(true);
            SurfaceHolder surfaceHolder2 = surfaceView5.getHolder();
            surfaceHolder2.addCallback(new SurfaceHolder.Callback() {
                @Override
                public void surfaceCreated(@NonNull SurfaceHolder holder) {
                    mediaPlayer3.setDisplay(surfaceHolder2);
                }

                @Override
                public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {

                }

                @Override
                public void surfaceDestroyed(@NonNull SurfaceHolder holder) {

                }
            });
            seekBar7.setMax(mediaPlayer3.getDuration());
            seekBar7.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar7, int progress, boolean fromUser) {
                    if (fromUser) {
                        mediaPlayer3.seekTo(progress);
                    }
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar7) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar7) {

                }
            });
            button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mediaPlayer3.isPlaying()) {
                        mediaPlayer3.pause();
                        button10.setText("Play");
                    } else {
                        mediaPlayer3.start();
                        button10.setText("Pause");
                    }
                }
            });
        }
    }
}

