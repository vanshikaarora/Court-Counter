package com.example.android.courtcounter;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
int scoreTeamA=0,scoreTeamB=0;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    public void displayForTeamA( int score ) {
        TextView scoreView = (TextView) findViewById( R.id.team_a_score );
        scoreView.setText( String.valueOf( score ) );
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void add3pointsA(View v){
        scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }
    public void add2pointsA(View v){
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }
    public void addfreethrowA(View v){
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }
    public void add3pointsB(View v){
        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }
    public void add2pointsB(View v){
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }
    public void addfreethrowB(View v){
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }
    public void resetscore(View v){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}

