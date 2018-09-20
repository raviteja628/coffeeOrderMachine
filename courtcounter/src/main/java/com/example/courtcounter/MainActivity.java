package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeForTeamA(View v){

        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoForTeamA(View v){

        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void addFreeThrowForTeamA(View v){

        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamA(int scoreTeamA){
        TextView scoreView = findViewById(R.id.teamA_score);
            scoreView.setText(String.valueOf(scoreTeamA));
    }

    public void addThreeForTeamB(View v){

        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoForTeamB(View v){

        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void addFreeThrowForTeamB(View v){

        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamB(int scoreTeamB){
        TextView scoreView = findViewById(R.id.teamB_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }
    public void resetTheScore(View v){
        displayForTeamA(0);
        displayForTeamB(0);
    }
}
