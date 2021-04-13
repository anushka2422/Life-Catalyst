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

public class MainActivity10 extends AppCompatActivity {
    TextView heading;
    ImageView imageView6;
    SurfaceView surfaceView, surfaceView2, surfaceView9;
    Button button15, button16, button17;
    SeekBar seekBar11, seekBar12, seekBar13;
    TextView textView18, textView19, textView20;
    private MediaPlayer mediaPlayer1, mediaPlayer2, mediaPlayer3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        Intent intent = getIntent();


        heading = findViewById(R.id.heading);
        imageView6 = findViewById(R.id.imageView6);
        surfaceView = findViewById(R.id.surfaceView);
        surfaceView2 = findViewById(R.id.surfaceView2);
        surfaceView9 = findViewById(R.id.surfaceView9);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        button17 = findViewById(R.id.button17);
        seekBar11 = findViewById(R.id.seekBar11);
        seekBar12 = findViewById(R.id.seekBar12);
        seekBar13 = findViewById(R.id.seekBar13);
        mediaPlayer1 = MediaPlayer.create(this, R.raw.mentalhealth1);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.mentalhealth2);
        mediaPlayer3 = MediaPlayer.create(this, R.raw.mentalhealth3);
        textView18 = findViewById(R.id.textView18);
        textView19 = findViewById(R.id.textView19);
        textView20 = findViewById(R.id.textView20);
        textView18.setText("6 Tips to protect your mental health during COVID-19 - Sparkol");
        textView19.setText("Mental health self care during the COVID-19 pandemic");
        textView20.setText("Coronavirus - Dealing with anxiety & mental health during a pandemic");
        surfaceView.setKeepScreenOn(true);
        SurfaceHolder surfaceHolder = surfaceView.getHolder();
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
        seekBar11.setMax(mediaPlayer1.getDuration());
        seekBar11.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar11, int progress, boolean fromUser) {
                if (fromUser) {
                    mediaPlayer1.seekTo(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar11) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar11) {

            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer1.isPlaying()) {
                    mediaPlayer1.pause();
                    button15.setText("Play");
                } else {
                    mediaPlayer1.start();
                    button15.setText("Pause");
                }
            }
        });
        if (mediaPlayer1.isPlaying() == false) {
            surfaceView2.setKeepScreenOn(true);
            SurfaceHolder surfaceHolder1 = surfaceView2.getHolder();
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
            seekBar12.setMax(mediaPlayer2.getDuration());
            seekBar12.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar12, int progress, boolean fromUser) {
                    if (fromUser) {
                        mediaPlayer2.seekTo(progress);
                    }
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar12) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar12) {

                }
            });
            button16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mediaPlayer2.isPlaying()) {
                        mediaPlayer2.pause();
                        button16.setText("Play");
                    } else {
                        mediaPlayer2.start();
                        button16.setText("Pause");
                    }
                }
            });
        }
        if (mediaPlayer1.isPlaying() == false && mediaPlayer2.isPlaying() == false) {
            surfaceView9.setKeepScreenOn(true);
            SurfaceHolder surfaceHolder2 = surfaceView9.getHolder();
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
            seekBar13.setMax(mediaPlayer3.getDuration());
            seekBar13.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar13, int progress, boolean fromUser) {
                    if (fromUser) {
                        mediaPlayer3.seekTo(progress);
                    }
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar13) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar13) {

                }
            });
            button17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mediaPlayer3.isPlaying()) {
                        mediaPlayer3.pause();
                        button17.setText("Play");
                    } else {
                        mediaPlayer3.start();
                        button17.setText("Pause");
                    }
                }
            });
        }
    }
}