package com.example.foodrandomizer;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public int rnd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int arr1[] = {0,1,2,3,4};
        final Button rndbtn = findViewById(R.id.button);

        rndbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rnd = new Random().nextInt(arr1.length);
                final String rndstr = Integer.toString(rnd);
                System.out.println(rnd);
                TextView tv = findViewById(R.id.textView);
                tv.setText(rndstr);
            }
        });
        }



}
