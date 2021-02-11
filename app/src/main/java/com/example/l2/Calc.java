package com.example.l2;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class Calc extends AppCompatActivity {

    public void calcTextAppend(TextView textResult, int result) {
        textResult.append(String.format(Locale.getDefault(), "%d", result));
    }

    public void calcTextSet(TextView textResult, int result) {
        textResult.setText(String.format(Locale.getDefault(), "%d", result));
    }
}
