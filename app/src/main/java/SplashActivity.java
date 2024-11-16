package com.example.pembukuan;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Find the ImageView for the logo
        ImageView logoImageView = findViewById(R.id.logoImageView);

        // Load the fade-in animation for the logo
        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        // Start the fade-in animation on the logo
        logoImageView.startAnimation(fadeIn);

        // Delay for 2 seconds, then launch MainActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start MainActivity
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);

                // Apply fade-in and fade-out transition effects
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

                // Finish the splash activity so it doesn't remain in the back stack
                finish();
            }
        }, 2000); // 2000ms = 2 seconds
    }
}
