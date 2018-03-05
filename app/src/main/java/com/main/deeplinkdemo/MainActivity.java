package com.main.deeplinkdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_user).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, UserActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.btn_timeline).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, TimelineActivity.class);
            startActivity(intent);
        });
    }
}
