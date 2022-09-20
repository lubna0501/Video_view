package com.example.videoview;



import androidx.appcompat.app.AppCompatActivity;

import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {
VideoView video;

    private static final String path ="https://monsterone.com/after-effects-templates/legends-blockbuster-trailer-after-effects-template-o38766/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFormat(PixelFormat.TRANSLUCENT);
        video= findViewById(R.id.videoview);
        video.setVideoPath(path);
      //  Uri uri = Uri.parse(path);
        MediaController media = new MediaController(this);
        media.setMediaPlayer(video);
        video.setMediaController(media);
        video.requestFocus();

//        Uri uri = Uri.parse(videoUrl);
//        videoView.setVideoURI(uri);
//        MediaController mediaController = new MediaController(this);
//        mediaController.setAnchorView(videoView);
//        mediaController.setMediaPlayer(videoView);
//        videoView.setMediaController(mediaController);
        video.start();
    }
}