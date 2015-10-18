package com.cabatuan.playvideo;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playVideo();
    }

    private void playVideo(){
        VideoView videoview = (VideoView) findViewById(R.id.video);
        videoview.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lovestory));
        videoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {

            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
            }
        });
    }
}
