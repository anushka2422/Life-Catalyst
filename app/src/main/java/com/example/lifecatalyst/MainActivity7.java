package com.example.lifecatalyst;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {

    TextView titleworkout;
    ImageView imageView7;
    SurfaceView surfaceView6, surfaceView7, surfaceView8;
    Button button11, button12, button13;
    SeekBar seekBar8, seekBar9, seekBar10;
    TextView textView15, textView16, textView17;
    private MediaPlayer mediaPlayer1, mediaPlayer2, mediaPlayer3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Intent intent = getIntent();
        titleworkout = findViewById(R.id.textView6);
        imageView7 = findViewById(R.id.imageView7);
        surfaceView6 = findViewById(R.id.surfaceView6);
        surfaceView7 = findViewById(R.id.surfaceView7);
        surfaceView8 = findViewById(R.id.surfaceView8);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        seekBar8 = findViewById(R.id.seekBar8);
        seekBar9 = findViewById(R.id.seekBar9);
        seekBar10 = findViewById(R.id.seekBar10);
        mediaPlayer1 = MediaPlayer.create(this, R.raw.workout1);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.workout2);
        mediaPlayer3 = MediaPlayer.create(this, R.raw.workout3);
        textView15 = findViewById(R.id.textView15);
        textView16 = findViewById(R.id.textView16);
        textView17 = findViewById(R.id.textView17);
        textView15.setText("Do This Everyday To Lose Weight _ 2 Weeks Shred Challenge");
        textView16.setText("Get Shredded 12 Min Full Body HIIT Workout _ Summer Shred Challenge");
        textView17.setText("Abs Workout Get that 11 Line Abs in 35 days");
        surfaceView6.setKeepScreenOn(true);
        SurfaceHolder surfaceHolder = surfaceView6.getHolder();
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
        seekBar8.setMax(mediaPlayer1.getDuration());
        seekBar8.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar8, int progress, boolean fromUser) {
                if (fromUser) {
                    mediaPlayer1.seekTo(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar8) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar8) {

            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer1.isPlaying()) {
                    mediaPlayer1.pause();
                    button11.setText("Play");
                } else {
                    mediaPlayer1.start();
                    button11.setText("Pause");
                }
            }
        });
        if (mediaPlayer1.isPlaying() == false) {
            surfaceView7.setKeepScreenOn(true);
            SurfaceHolder surfaceHolder1 = surfaceView7.getHolder();
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
            seekBar9.setMax(mediaPlayer2.getDuration());
            seekBar9.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar9, int progress, boolean fromUser) {
                    if (fromUser) {
                        mediaPlayer2.seekTo(progress);
                    }
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar9) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar9) {

                }
            });
            button12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mediaPlayer2.isPlaying()) {
                        mediaPlayer2.pause();
                        button12.setText("Play");
                    } else {
                        mediaPlayer2.start();
                        button12.setText("Pause");
                    }
                }
            });
        }
        if (mediaPlayer1.isPlaying() == false && mediaPlayer2.isPlaying() == false) {
            surfaceView8.setKeepScreenOn(true);
            SurfaceHolder surfaceHolder2 = surfaceView8.getHolder();
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
            seekBar10.setMax(mediaPlayer3.getDuration());
            seekBar10.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar10, int progress, boolean fromUser) {
                    if (fromUser) {
                        mediaPlayer3.seekTo(progress);
                    }
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar10) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar10) {

                }
            });
            button13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mediaPlayer3.isPlaying()) {
                        mediaPlayer3.pause();
                        button13.setText("Play");
                    } else {
                        mediaPlayer3.start();
                        button13.setText("Pause");
                    }
                }
            });
        }
    }

    }