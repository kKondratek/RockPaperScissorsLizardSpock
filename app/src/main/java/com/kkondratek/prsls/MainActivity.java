package com.kkondratek.prsls;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playButtonPressed(View view) {
        Intent intent = new Intent(this, GameplayActivity.class);
        startActivity(intent);
    }
}

