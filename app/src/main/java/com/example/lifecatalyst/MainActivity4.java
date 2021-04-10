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

public class MainActivity4 extends AppCompatActivity {

    TextView textView6;
    ImageView imageView5;
    SurfaceView vid1, vid2,vid3;
    Button button5, button6, button7;
    SeekBar seekBar, seekBar2, seekBar4;
    TextView textV,textView8,textView11;

    private MediaPlayer mediaPlayer1, mediaPlayer2,mediaPlayer3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent intent = getIntent();
        textView6 = findViewById(R.id.textView6);
        imageView5 = findViewById(R.id.imageView5);
        vid1 = findViewById(R.id.vid1);
        vid2 = findViewById(R.id.vid2);
        vid3 = findViewById(R.id.vid3);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        seekBar = findViewById(R.id.seekBar);
        seekBar2 = findViewById(R.id.seekBar2);
        seekBar4 = findViewById(R.id.seekBar4);
        mediaPlayer1 = MediaPlayer.create(this, R.raw.medvid1);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.medvid2);
        mediaPlayer3 = MediaPlayer.create(this, R.raw.medvid3);
        textV = findViewById(R.id.textV);
        textView8 = findViewById(R.id.textView8);
        textView11 = findViewById(R.id.textView11);
       textV.setText("How meditation can help you cope with the anxiety caused by the pandemic");
        textView8.setText("Isha Kriya- Guided Meditation by Sadhguru - 12-min #MeditateWithSadhguru");
        textView11.setText("Pandemic anxiety meditation");
        vid1.setKeepScreenOn(true);
        SurfaceHolder surfaceHolder = vid1.getHolder();
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
        seekBar.setMax(mediaPlayer1.getDuration());
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(fromUser){
                    mediaPlayer1.seekTo(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer1.isPlaying()){
                    mediaPlayer1.pause();
                    button5.setText("Play");
                }
                else{
                    mediaPlayer1.start();
                    button5.setText("Pause");
                }
            }
        });
        if(mediaPlayer1.isPlaying()==false)
        {
            vid2.setKeepScreenOn(true);
            SurfaceHolder surfaceHolder1 = vid2.getHolder();
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
            seekBar2.setMax(mediaPlayer2.getDuration());
            seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar2, int progress, boolean fromUser) {
                    if(fromUser){
                        mediaPlayer2.seekTo(progress);
                    }
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar2) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar2) {

                }
            });
            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mediaPlayer2.isPlaying()){
                        mediaPlayer2.pause();
                        button6.setText("Play");
                    }
                    else{
                        mediaPlayer2.start();
                        button6.setText("Pause");
                    }
                }
            });
        }
        if(mediaPlayer1.isPlaying()==false&&mediaPlayer2.isPlaying()==false)
        {
            vid3.setKeepScreenOn(true);
            SurfaceHolder surfaceHolder2 = vid3.getHolder();
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
            seekBar4.setMax(mediaPlayer3.getDuration());
            seekBar4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar4, int progress, boolean fromUser) {
                    if(fromUser){
                        mediaPlayer3.seekTo(progress);
                    }
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar4) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar4) {

                }
            });
            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mediaPlayer3.isPlaying()){
                        mediaPlayer3.pause();
                        button7.setText("Play");
                    }
                    else{
                        mediaPlayer3.start();
                        button7.setText("Pause");
                    }
                }
            });
        }
    }
}