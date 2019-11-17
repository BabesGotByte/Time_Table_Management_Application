package com.example.tt3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

import com.felipecsl.gifimageview.library.GifImageView;

import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.io.InputStream;

public class splash extends AppCompatActivity {

    private GifImageView gifImageView;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        gifImageView = (GifImageView) findViewById(R.id.gifimage);
        progressBar = (ProgressBar) findViewById(R.id.progress);
//        progressBar.setVisibility(progressBar.VISIBLE);

        try {
            InputStream inputStream = getAssets().open("move2.gif");
            byte[] bytes = IOUtils.toByteArray(inputStream);
            gifImageView.setBytes(bytes);
            gifImageView.startAnimation();
        } catch (IOException ex) {

        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                splash.this.startActivity(new Intent(splash.this, MainActivity.class));
                splash.this.finish();
            }
        },5000);
    }
}
