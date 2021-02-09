package com.example.l2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private int result=0;
    private int result2=0;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResult=findViewById(R.id.textResult);
        Button b0=findViewById(R.id.button_0);
        Button b1=findViewById(R.id.button_1);
        Button b2=findViewById(R.id.button_2);
        Button b3=findViewById(R.id.button_3);
        Button b4=findViewById(R.id.button_4);
        Button b5=findViewById(R.id.button_5);
        Button b6=findViewById(R.id.button_6);
        Button b7=findViewById(R.id.button_7);
        Button b8=findViewById(R.id.button_8);
        Button b9=findViewById(R.id.button_9);
        Button bPoint=findViewById(R.id.button_point);
        Button bEqual=findViewById(R.id.button_e);
        Button bPlus=findViewById(R.id.button_plus);
        Button bMinus=findViewById(R.id.button_minus);
        Button bDiv=findViewById(R.id.button_div);
        Button bMultiply=findViewById(R.id.button_multiply);
        Button bClear=findViewById(R.id.button_clear);

        b0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result=0;
                textResult.append(String.format(Locale.getDefault(),"%d",result));
            }
        });

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result=1;
                textResult.append(String.format(Locale.getDefault(),"%d",result));
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result=2;
                textResult.append(String.format(Locale.getDefault(),"%d",result));
            }
        });

        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result=3;
                textResult.append(String.format(Locale.getDefault(),"%d",result));
            }
        });

        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result=4;
                textResult.append(String.format(Locale.getDefault(),"%d",result));
            }
        });

        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result=5;
                textResult.append(String.format(Locale.getDefault(),"%d",result));
            }
        });

        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result=6;
                textResult.append(String.format(Locale.getDefault(),"%d",result));
            }
        });

        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result=7;
                textResult.append(String.format(Locale.getDefault(),"%d",result));
            }
        });

        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result=8;
                textResult.append(String.format(Locale.getDefault(),"%d",result));
            }
        });

        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result=9;
                textResult.append(String.format(Locale.getDefault(),"%d",result));
            }
        });

        bPlus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result2=result2+Integer.parseInt(textResult.toString());
                textResult.setText(String.format(Locale.getDefault(),"%d",result2));
            }
        });

        bMinus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result2=result2-Integer.parseInt(textResult.toString());
                textResult.append(String.format(Locale.getDefault(),"%d",result2));
            }
        });

        bDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //метод деления
                textResult.setText(String.format(Locale.getDefault(),"%d",result));
            }
        });

        bMultiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // метод умножения!
                textResult.setText(String.format(Locale.getDefault(),"%d",result));
            }
        });

        bEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result=Integer.parseInt(textResult.toString())+result2;
                textResult.setText(String.format(Locale.getDefault(),"%d",result));
            }
        });

        bClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result=0;
                result2=0;
                textResult.setText(String.format(Locale.getDefault(),"%d",result));
            }
        });

        bPoint.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //метод с точкой
                textResult.setText(String.format(Locale.getDefault(),"%d",result));
            }
        });
    }
}