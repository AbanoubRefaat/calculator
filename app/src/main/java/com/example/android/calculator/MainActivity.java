package com.example.android.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView   result;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,
            btEqual,btPlus,btMinus,btDiv,btClear,btDel,btDot,btMulti,btplus_minus,btPersentage;
     double value1, value2;

     double answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.textView);

        bt1 = (Button)findViewById(R.id.bt1);
        bt2 = (Button)findViewById(R.id.bt2);
        bt3 = (Button)findViewById(R.id.bt3);
        bt4 = (Button)findViewById(R.id.bt4);
        bt5 = (Button)findViewById(R.id.bt5);
        bt6 = (Button)findViewById(R.id.bt6);
        bt7 = (Button)findViewById(R.id.bt7);
        bt8 = (Button)findViewById(R.id.bt8);
        bt9 = (Button)findViewById(R.id.bt9);
        bt0 = (Button)findViewById(R.id.bt0);


        btEqual = (Button)findViewById(R.id.btEqual);
        btPlus = (Button)findViewById(R.id.btPlus);
        btplus_minus = (Button)findViewById(R.id.btMix);
        btMinus = (Button)findViewById(R.id.btMinus);
        btMulti = (Button)findViewById(R.id.btMulti);
        btDiv = (Button)findViewById(R.id.btDivid);


        btClear = (Button)findViewById(R.id.btClear);
        btDel = (Button)findViewById(R.id.btDel);
        btDot = (Button)findViewById(R.id.btDot);
        btPersentage = (Button)findViewById(R.id.btPercentage);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        bt0.setOnClickListener(this);



        btDot.setOnClickListener(this);
        btDel.setOnClickListener(this);
        btPersentage.setOnClickListener(this);
        btClear.setOnClickListener(this);

        btEqual.setOnClickListener(this);
        btplus_minus.setOnClickListener(this);
        btPlus.setOnClickListener(this);
        btMinus.setOnClickListener(this);
        btDiv.setOnClickListener(this);
        btMulti.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.bt0:

                result.setText(result.getText() + "0");

                break;

            case R.id.bt1:

                result.setText(result.getText() + "1");

                break;

            case R.id.bt2:

                result.setText(result.getText() + "2");

                break;

            case R.id.bt3:

                result.setText(result.getText() + "3");

                break;

            case R.id.bt4:

                result.setText(result.getText() + "4");

                break;

            case R.id.bt5:

                result.setText(result.getText() + "5");

                break;

            case R.id.bt6:

                result.setText(result.getText() + "6");

                break;

            case R.id.bt7:

                result.setText(result.getText() + "7");

                break;

            case R.id.bt8:

                result.setText(result.getText() + "8");

                break;

            case R.id.bt9:

                result.setText(result.getText() + "9");


                break;

            case R.id.btPlus:

                addition();

                break;
        }


    }
    public void addition (){

        Scanner scanner = new Scanner(System.in);
        value1 = scanner.nextDouble();
        value2 = scanner.nextDouble();
        answer = value1 + value2;


    }
}
