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
        rndbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(rndbtn.getText().toString() );
                if (rndbtn.getText().toString() == "ROLL DICE") {
                    TextView tv = findViewById(R.id.textView);
                    tv.setText("YOU GOT");
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            GenerateRandom();
                            TextView tv2 = findViewById(R.id.textView2);
                            tv2.setText(rndstr);
                            rndbtn.setText("STOP");
                            handler.postDelayed(this, 100);

                        }
                    }, 1000);  //the time is in miliseconds
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
