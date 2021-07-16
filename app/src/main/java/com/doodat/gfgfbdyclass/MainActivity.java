package com.doodat.gfgfbdyclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.facebook.device.yearclass.YearClass;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);

        // getting the device year class
        int year = YearClass.get(getApplicationContext());
        if (year > 2013) {
            // if device year class is greater than 2013 --> load animation
            Animation animation = AnimationUtils.loadAnimation(this, R.anim.animation);
            textView.startAnimation(animation);
        } else {
            // load no animation if device year class is less than 2013
        }
    }
}