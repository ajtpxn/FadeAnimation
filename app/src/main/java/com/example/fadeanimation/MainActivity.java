package com.example.fadeanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean phineasIsShowing = true;

    public void fade(View view) {
        Log.i("Info", "Image tapped.");
        ImageView phineasImageView = (ImageView) findViewById(R.id.phineasImageView);
        ImageView ferbImageView = (ImageView) findViewById(R.id.ferbImageView);

        if (phineasIsShowing) {
            phineasImageView.animate().alpha(0).setDuration(2000);
            ferbImageView.animate().alpha(1).setDuration(2000);
            phineasIsShowing = false;
        }
        else {
            ferbImageView.animate().alpha(0).setDuration(2000);
            phineasImageView.animate().alpha(1).setDuration(2000);
            phineasIsShowing = true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
