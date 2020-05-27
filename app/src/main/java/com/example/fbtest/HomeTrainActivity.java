package com.example.fbtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeTrainActivity extends AppCompatActivity {
    Button high;
    Button medi;
    Button low;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hometrain);

        high = (Button)findViewById(R.id.high);
        high.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HighActivity.class);
                startActivity(intent);
            }
        });

        medi = (Button)findViewById(R.id.medi);
        medi.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MediActivity.class);
                startActivity(intent);
            }
        });

        low = (Button)findViewById(R.id.low);
        low.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LowActivity.class);
                startActivity(intent);
            }
        });
    }

}