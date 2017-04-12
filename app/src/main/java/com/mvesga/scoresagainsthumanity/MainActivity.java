package com.mvesga.scoresagainsthumanity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Tracks score for Person A
    int scorePersonA = 0;

    //Tracks score for Person B
    int scorePersonB = 0;

    //Tracks score for Person C
    int scorePersonC = 0;

    //Tracks score for Person D
    int scorePersonD = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displayForPersonA(8);
    }

    /**
     * This method is called when the Reset button is clicked and resets the score for Person A, B, C and D to 0 points..
     */
    public void reset(View view) {
        int score = 0;
        scorePersonA = scorePersonA * score;
        scorePersonB = scorePersonB * score;
        scorePersonC = scorePersonC * score;
        scorePersonD = scorePersonC * score;
        displayForPersonA(scorePersonA); /** don't forget to update the android:onClick="reset"; button activity_main.xml */
        displayForPersonB(scorePersonB);
        displayForPersonC(scorePersonC);
        displayForPersonD(scorePersonD);
    }

    /**
     * This method is called when the +1point button is clicked and increases score for Person A by 1 points..
     */
    public void addOne(View view) {
        int score = 1;
        scorePersonA = scorePersonA + score;
        displayForPersonA(scorePersonA); /** don't forget to update the android:onClick="addOne"; button activity_main.xml */
    }

    /**
     * This method is called when the +2points button is clicked and increases score for Person A by 2 points..
     */
    public void substractOneA(View view) {
        int score = 1;
        scorePersonA = scorePersonA - score;
        displayForPersonA(scorePersonA); /** don't forget to update the android:onClick="substractOneA"; button activity_main.xml */
    }

     /**
     * This method is called when the +1points button is clicked and increases score for Person B by 1 points..
     */
    public void addOne2B(View view) {
        int score = 1;
        scorePersonB = scorePersonB + score;
        displayForPersonB(scorePersonB); /** don't forget to update the android:onClick="addOne2B"; button activity_main.xml */
    }

     /**
     * This method is called when the +2points button is clicked and increases score for Person B by 2 points..
     */
    public void substractOneB(View view) {
        int score = 1;
        scorePersonB = scorePersonB - score;
        displayForPersonB(scorePersonB); /** don't forget to update the android:onClick="substractOneB"; button activity_main.xml */
    }

     /**
     * This method is called when the +1points button is clicked and increases score for Person C by 1 points..
     */
    public void addOne2C(View view) {
        int score = 1;
        scorePersonC = scorePersonC + score;
        displayForPersonC(scorePersonC); /** don't forget to update the android:onClick="addOne2C"; button activity_main.xml */
    }

     /**
     * This method is called when the +2points button is clicked and increases score for Person C by 2 points..
     */
    public void substractOneC(View view) {
        int score = 1;
        scorePersonC = scorePersonC - score;
        displayForPersonC(scorePersonC); /** don't forget to update the android:onClick="substractOneC"; button activity_main.xml */
    }

     /**
     * This method is called when the +1points button is clicked and increases score for Person B by 1 points..
     */
    public void addOne2D(View view) {
        int score = 1;
        scorePersonD = scorePersonD + score;
        displayForPersonD(scorePersonD); /** don't forget to update the android:onClick="addOne2D"; button activity_main.xml */
    }

     /**
     * This method is called when the +2points button is clicked and increases score for Person D by 2 points..
     */
    public void substractOneD(View view) {
        int score = 1;
        scorePersonD = scorePersonD - score;
        displayForPersonD(scorePersonD); /** don't forget to update the android:onClick="substractOneD"; button activity_main.xml */
    }

    /**
     * Displays the given score for Person A.
     */
    public void displayForPersonA(int tempScore) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(tempScore));
    }

    /**
     * Displays the given score for Person B.
     */
    public void displayForPersonB(int tempScore) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(tempScore));
    }

    /**
     * Displays the given score for Person C.
     */
    public void displayForPersonC(int tempScore) {
        TextView scoreView = (TextView) findViewById(R.id.team_c_score);
        scoreView.setText(String.valueOf(tempScore));
    }

    /**
     * Displays the given score for Person D.
     */
    public void displayForPersonD(int tempScore) {
        TextView scoreView = (TextView) findViewById(R.id.team_d_score);
        scoreView.setText(String.valueOf(tempScore));
    }
}
