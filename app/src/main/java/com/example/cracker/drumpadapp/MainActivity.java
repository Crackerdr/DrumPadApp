package com.example.cracker.drumpadapp;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton bt_1, bt_2, bt_3, bt_4, bt_5, bt_6, bt_7, bt_8, bt_9;
    private SoundPool soundPool;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;
    private int Drum_1_id;
    private int Drum_2_id;
    private int Drum_3_id;
    private int Drum_4_id;
    private int Drum_5_id;
    private int Drum_6_id;
    private int Drum_7_id;
    private int Drum_8_id;
    private int Drum_9_id;
boolean handled = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// IDing the ImageButtons
        bt_1 = (ImageButton)findViewById(R.id.red_neon_1);
         bt_2 = (ImageButton)findViewById(R.id.dark_blue_2);
         bt_3 = (ImageButton)findViewById(R.id.neon_pink_3);
         bt_4 = (ImageButton)findViewById(R.id.mint_4);
         bt_5 = (ImageButton)findViewById(R.id.peach_5);
         bt_6 = (ImageButton)findViewById(R.id.yellow_6);
         bt_7 = (ImageButton)findViewById(R.id.blue_7);
         bt_8 = (ImageButton)findViewById(R.id.orange_8);
         bt_9 = (ImageButton)findViewById(R.id.green_9);

//Прописавается условия работы SoundPool для устаревшей и новойверсии
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            soundPool = new SoundPool.Builder()
                    .setMaxStreams(9)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(9, AudioManager.STREAM_MUSIC, 0);
        }
        //подгрузка песен для SoundPool
        Drum_1_id = soundPool.load(this, R.raw.one, 1);
        Drum_2_id = soundPool.load(this, R.raw.two, 1);
        Drum_3_id = soundPool.load(this, R.raw.three, 1);
        Drum_4_id = soundPool.load(this, R.raw.four, 1);
        Drum_5_id = soundPool.load(this, R.raw.five, 1);
        Drum_6_id = soundPool.load(this, R.raw.six, 1);
        Drum_7_id = soundPool.load(this, R.raw.seven, 1);
        Drum_8_id = soundPool.load(this, R.raw.eitgh, 1);
        Drum_9_id = soundPool.load(this, R.raw.nine, 1);

        // Functionalities - onClick

        bt_1.setOnTouchListener(new OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event)
                                    {

                                        switch (event.getAction())
                                        {

                                            case MotionEvent.ACTION_DOWN:
                                            {
                                                soundPool.play(Drum_1_id,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,-1,NORMAL_PLAY_RATE);
                                            }

                                            break;
                                            case MotionEvent.ACTION_UP:
                                            {
                                                soundPool.autoPause();
                                            }
                                            break;
                                        }

                                        return true;
                                    }
        });

        bt_2.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {

                switch (event.getAction())
                {

                    case MotionEvent.ACTION_DOWN:
                    {
                        soundPool.play(Drum_2_id,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,-1,NORMAL_PLAY_RATE);
                    }

                    break;
                    case MotionEvent.ACTION_UP:
                    {
                        soundPool.autoPause();
                    }
                    break;
                }

                return true;
            }
        });

        bt_3.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {

                switch (event.getAction())
                {

                    case MotionEvent.ACTION_DOWN:
                    {
                        soundPool.play(Drum_3_id,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,-1,NORMAL_PLAY_RATE);
                    }

                    break;
                    case MotionEvent.ACTION_UP:
                    {
                        soundPool.autoPause();
                    }
                    break;
                }

                return true;
            }
        });

        bt_4.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {

                switch (event.getAction())
                {

                    case MotionEvent.ACTION_DOWN:
                    {
                        soundPool.play(Drum_4_id,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,-1,NORMAL_PLAY_RATE);
                    }

                    break;
                    case MotionEvent.ACTION_UP:
                    {
                        soundPool.autoPause();
                    }
                    break;
                }

                return true;
            }
        });

        bt_5.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {

                switch (event.getAction())
                {

                    case MotionEvent.ACTION_DOWN:
                    {
                        soundPool.play(Drum_5_id,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,-1,NORMAL_PLAY_RATE);
                    }

                    break;
                    case MotionEvent.ACTION_UP:
                    {
                        soundPool.autoPause();
                    }
                    break;
                }

                return true;
            }
        });

        bt_6.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {

                switch (event.getAction())
                {

                    case MotionEvent.ACTION_DOWN:
                    {
                        soundPool.play(Drum_6_id,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,-1,NORMAL_PLAY_RATE);
                    }

                    break;
                    case MotionEvent.ACTION_UP:
                    {
                        soundPool.autoPause();
                    }
                    break;
                }

                return true;
            }
        });

        bt_7.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {

                switch (event.getAction())
                {

                    case MotionEvent.ACTION_DOWN:
                    {
                        soundPool.play(Drum_7_id,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,-1,NORMAL_PLAY_RATE);
                    }

                    break;
                    case MotionEvent.ACTION_UP:
                    {
                        soundPool.autoPause();
                    }
                    break;
                }

                return true;
            }
        });

        bt_8.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {

                switch (event.getAction())
                {

                    case MotionEvent.ACTION_DOWN:
                    {
                        soundPool.play(Drum_8_id,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,-1,NORMAL_PLAY_RATE);
                    }

                    break;
                    case MotionEvent.ACTION_UP:
                    {
                        soundPool.autoPause();
                    }
                    break;
                }

                return true;
            }
        });

        bt_9.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {

                switch (event.getAction())
                {

                    case MotionEvent.ACTION_DOWN:
                    {
                        soundPool.play(Drum_9_id,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,-1,NORMAL_PLAY_RATE);
                    }

                    break;
                    case MotionEvent.ACTION_UP:
                    {
                        soundPool.autoPause();
                    }
                    break;
                }

                return true;
            }
        });

    }

//Освобождает память
    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
