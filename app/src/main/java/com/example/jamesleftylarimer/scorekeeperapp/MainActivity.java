package com.example.jamesleftylarimer.scorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {
    int barcaScore = 0;
    int madridScore = 0;
    int barcaFouls = 0;
    int madridFouls = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * This method adds 1 to Barcelona's score.
     */
    public void setBarcaScore(View view) {
        barcaScore = barcaScore + 1;
        displayBarcaScore(barcaScore);
    }

    /**
     * This method adds 1 to Barcelona's score.
     */
    public void setMadridScore(View view) {
        madridScore = madridScore + 1;
        displayMadridScore(madridScore);
    }

    /**
     * This method adds 1 to Barcelona's fouls.
     */
    public void setBarcaFouls(View view) {
        barcaFouls = barcaFouls + 1;
        displayBarcaFouls(barcaFouls);
    }

    /**
     * This method adds 1 to Madrid's fouls.
     */
    public void setMadridFouls(View view) {
        madridFouls = madridFouls + 1;
        displayMadridFouls(madridFouls);
    }
    /**
     * This method sets both teams's score and fouls to 0.
     */
    public void resetAll(View view) {

        barcaScore =  0;
        madridScore = 0;
        barcaFouls = 0;
        madridFouls = 0;
        displayBarcaScore(barcaScore);
        displayMadridScore(madridScore);
        displayBarcaFouls(barcaFouls);
        displayMadridFouls(madridFouls);
    }

    /**
     * These method's display the updated value's for goals and fouls on the screen.
     */
    private void displayBarcaScore(int number) {
        TextView barcaScoreTextView = (TextView) findViewById(R.id.barcaScore_text_view);
        barcaScoreTextView.setText("" + number);
    }

    private void displayMadridScore(int number) {
        TextView madridScoreTextView = (TextView) findViewById(R.id.madridScore_text_view);
        madridScoreTextView.setText("" + number);
    }

    private void displayBarcaFouls(int number) {
        TextView barcaFoulsTextView = (TextView) findViewById(R.id.barcaFouls_text_view);
        barcaFoulsTextView.setText("" + number);
    }

    private void displayMadridFouls(int number) {
        TextView madridFoulsTextView = (TextView) findViewById(R.id.madridFouls_text_view);
        madridFoulsTextView.setText("" + number);
    }


}
