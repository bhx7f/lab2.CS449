package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int ball = 0;
    int strike = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ballButton = (Button) findViewById(R.id.ballButton);
        Button strikeButton = (Button) findViewById(R.id.strikeButton);
        Button resetButton = (Button) findViewById(R.id.resetButton);

        ballButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ball<4) {
                    TextView ballCounter = (TextView) findViewById(R.id.ballButton);
                    ball = ball + 1;
                    ballCounter.setText(String.valueOf(ball));
                }
                else {
                    startActivity(new Intent(MainActivity.this,Popball.class));

                }

            }
        });
        strikeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (strike<3) {
                    TextView strikeCounter = (TextView) findViewById(R.id.strikeButton);
                    strike = strike + 1;
                    strikeCounter.setText(String.valueOf(strike));
                }
                else{
                    startActivity(new Intent(MainActivity.this,Popstrike.class));
                }
            }
        });
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ball = 0;
                strike = 0;
                TextView ballCounter = (TextView) findViewById(R.id.ballButton);
                TextView strikeCounter = (TextView) findViewById(R.id.strikeButton);
                ballCounter.setText(String.valueOf(String.valueOf(ball)));
                strikeCounter.setText(String.valueOf(strike));

            }
        });




    }
}
