package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    int scoreA =0;
    int scoreB=0;
//
//    TextView B3 =(TextView) findViewById(R.id.threeB);

    private void displayA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreA);
        scoreView.setText(String.valueOf(score));
    }

    private void displayB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreB);
        scoreView.setText(String.valueOf(score));
    }




    public void plusThreeA(View view) {
        scoreA+=3;
        displayA(scoreA);
    }


    public void plusTwoA(View view) {
        scoreA+=2;
        displayA(scoreA);
    }

    public void plusOneA(View view) {
        scoreA+=1;
        displayA(scoreA);
    }

    public void plusThreeB(View view) {
        scoreB+=3;
        displayB(scoreB);
    }
    public void plusTwoB(View view) {
        scoreB+=2;
        displayB(scoreB);
    }

    public void plusOneB(View view) {
        scoreB+=1;
        displayB(scoreB);
    }


    public void reset(View view){
        scoreA =0;
        scoreB=0;
        displayB(scoreA);
        displayA(scoreB);
    }


}