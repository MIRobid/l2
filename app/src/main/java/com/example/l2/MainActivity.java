package com.example.l2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.radiobutton.MaterialRadioButton;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private int result = 0;
    private int result2 = 0;
    private TextView textResult;
    private static final String NameSharedPreference = "LOGIN";
    private static final String theme="THEME";
    private static final int ThemeLight=0;
    private static final int ThemeDark=1;
    Calc calc = new Calc();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(getAppTheme(R.style.CalcTheme));
        setContentView(R.layout.activity_main);

        initThemeChooser();

        textResult = findViewById(R.id.textResult);
        Button b0 = findViewById(R.id.button_0);
        Button b1 = findViewById(R.id.button_1);
        Button b2 = findViewById(R.id.button_2);
        Button b3 = findViewById(R.id.button_3);
        Button b4 = findViewById(R.id.button_4);
        Button b5 = findViewById(R.id.button_5);
        Button b6 = findViewById(R.id.button_6);
        Button b7 = findViewById(R.id.button_7);
        Button b8 = findViewById(R.id.button_8);
        Button b9 = findViewById(R.id.button_9);
        Button bPoint = findViewById(R.id.button_point);
        Button bEqual = findViewById(R.id.button_e);
        Button bPlus = findViewById(R.id.button_plus);
        Button bMinus = findViewById(R.id.button_minus);
        Button bDiv = findViewById(R.id.button_div);
        Button bMultiply = findViewById(R.id.button_multiply);
        Button bClear = findViewById(R.id.button_clear);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = 0;
                calc.calcTextAppend(textResult, result);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = 1;
                calc.calcTextAppend(textResult, result);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = 2;
                calc.calcTextAppend(textResult, result);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = 3;
                calc.calcTextAppend(textResult, result);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = 4;
                calc.calcTextAppend(textResult, result);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = 5;
                calc.calcTextAppend(textResult, result);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = 6;
                calc.calcTextAppend(textResult, result);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = 7;
                calc.calcTextAppend(textResult, result);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = 8;
                calc.calcTextAppend(textResult, result);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = 9;
                calc.calcTextAppend(textResult, result);
            }
        });

        bPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result2 = result2 + Integer.parseInt(textResult.toString());
                calc.calcTextAppend(textResult, result);
            }
        });

        bMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result2 = result2 - Integer.parseInt(textResult.toString());
                calc.calcTextAppend(textResult, result);
            }
        });

        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //метод деления
                calc.calcTextSet(textResult, result);
            }
        });

        bMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // метод умножения!
                calc.calcTextSet(textResult, result);
            }
        });

        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Integer.parseInt(textResult.toString()) + result2;
                calc.calcTextSet(textResult, result);
            }
        });

        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = 0;
                result2 = 0;
                calc.calcTextSet(textResult, result);
            }
        });

        bPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //метод с точкой
                calc.calcTextSet(textResult, result);
            }
        });
    }
    private void initThemeChooser() {
        initRadioButton(findViewById(R.id.radioButtonMaterialLight),
                0);
        initRadioButton(findViewById(R.id.radioButtonMaterialDark),
                1);
        RadioGroup rg = findViewById(R.id.radioButtons);
        ((MaterialRadioButton)rg.getChildAt(getCodeStyle(0))).setChecked(true);
    }

    private void initRadioButton(View button, final int codeStyle){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAppTheme(codeStyle);
                recreate();
            }
        });
    }

    private int getAppTheme(int codeStyle) {
        return codeStyleToStyleId(getCodeStyle(codeStyle));
    }

    private int getCodeStyle(int codeStyle){
        SharedPreferences sharedPref = getSharedPreferences(NameSharedPreference, MODE_PRIVATE);
        return sharedPref.getInt(theme, codeStyle);
    }

    private void setAppTheme(int codeStyle) {
        SharedPreferences sharedPref = getSharedPreferences(NameSharedPreference, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(theme, codeStyle);
        editor.apply();
    }

    private int codeStyleToStyleId(int codeStyle){
        switch(codeStyle){
            case 0:
                return R.style.CalcTheme;
            case 1:
                return R.style.AppThemeDark;
            default:
                return R.style.CalcTheme;
        }
    }

}