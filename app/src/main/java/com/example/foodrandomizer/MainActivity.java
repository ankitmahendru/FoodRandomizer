package com.example.foodrandomizer;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public int rnd;
    final int arr1[] = {0,1,2,3,4};

    String rndstr = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rndbtn = (Button) findViewById(R.id.button);
        rndbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView tv = findViewById(R.id.textView);
                tv.setText("Randomized No. is");
                GenerateRandom();
                TextView tv2 = findViewById(R.id.textView2);
                tv2.setText(rndstr);
            }
        });
        }
        public void GenerateRandom()
        {
            rnd = new Random().nextInt(arr1.length);
            System.out.println(rnd);
            rndstr = Integer.toString(rnd);
        }



}
