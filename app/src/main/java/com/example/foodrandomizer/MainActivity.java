package com.example.foodrandomizer;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    public int rnd;
    final int arr1[] = {0,1,2,3,4,5,6};

    String rndstr = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button rndbtn = (Button) findViewById(R.id.button);
        final Handler handler = new Handler();
        final Runnable rnb = new Runnable() {
            @Override
            public void run() {
                GenerateRandom();
                TextView tv2 = findViewById(R.id.textView2);
                tv2.setText(rndstr);
                rndbtn.setText("STOP");
                rndbtn.setTextSize(49);
                handler.postDelayed(this, 100);
            }
        };

        rndbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(rndbtn.getText().toString() );
                if (rndbtn.getText().toString().equals("ROLL DICE") || rndbtn.getText().toString().equals("ROLL AGAIN")) {
                    TextView tv = findViewById(R.id.textView);
                    tv.setText("ROLLING");
                    handler.postDelayed(rnb,1000);  //the time is in miliseconds
                }
                if(rndbtn.getText().equals("STOP"))
                {
                    handler.removeCallbacks(rnb);
                    TextView tv = findViewById(R.id.textView);
                    tv.setText("YOU GOT : ");
                    rndbtn.setText("ROLL AGAIN");
                    rndbtn.setTextSize(35);
                    GenerateRandom();
                    TextView tv2 = findViewById(R.id.textView2);
                    tv2.setText(rndstr);
                }
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
