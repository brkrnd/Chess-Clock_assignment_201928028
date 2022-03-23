package com.example.chess_clock_201928028;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.seng_405_chess_clock_201928028.ChessClock;

public class MainActivity extends AppCompatActivity {

    private Button enterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterButton = findViewById(R.id.enterTimeButton);
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openChessClock();
            }
        });

    }
    private void openChessClock(){
        Intent intent = new Intent(this, ChessClock.class);
        startActivity(intent);
    }
}