package com.android.masiro.proj021;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
    Button b1, b2, b3, b4;
    EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        setTitle("계산기");
        b1 = (Button) findViewById(R.id.b41);
        b2 = (Button) findViewById(R.id.b42);
        b3 = (Button) findViewById(R.id.b43);
        b4 = (Button) findViewById(R.id.b44);

        e1 = (EditText) findViewById(R.id.editText8);
        e2 = (EditText) findViewById(R.id.editText9);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean input1 = e1.getText().toString().length() ==0;
                boolean input2 = e2.getText().toString().length() ==0;

                if(input1 || input2) {Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
                  if(!input1 && input2) {e2.requestFocus(); e2.setCursorVisible(true);}
                    else {e1.requestFocus();e1.setCursorVisible(true);}
                    return;}

                String num1 = e1.getText().toString();
                String num2 = e2.getText().toString();

                int result = Integer.parseInt(num1) + Integer.parseInt(num2);
                Toast.makeText(getApplicationContext(), "더하기 계산 결과는 " + result + "입니다.", Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean input1 = e1.getText().toString().length() ==0;
                boolean input2 = e2.getText().toString().length() ==0;

                if(input1 || input2) {Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
                    if(!input1 && input2) {e2.requestFocus(); e2.setCursorVisible(true);}
                    else {e1.requestFocus();e1.setCursorVisible(true);}
                    return;}
                String num1 = e1.getText().toString();
                String num2 = e2.getText().toString();

                int result = Integer.parseInt(num1) - Integer.parseInt(num2);
                Toast.makeText(getApplicationContext(), "빼기 계산 결과는 " + result + "입니다.", Toast.LENGTH_SHORT).show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean input1 = e1.getText().toString().length() ==0;
                boolean input2 = e2.getText().toString().length() ==0;

                if(input1 || input2) {Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
                    if(!input1 && input2) {e2.requestFocus(); e2.setCursorVisible(true);}
                    else {e1.requestFocus();e1.setCursorVisible(true);}
                    return;}
                String num1 = e1.getText().toString();
                String num2 = e2.getText().toString();

                int result = Integer.parseInt(num1) * Integer.parseInt(num2);
                Toast.makeText(getApplicationContext(), "곱셈 계산 결과는 " + result + "입니다.", Toast.LENGTH_SHORT).show();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean input1 = e1.getText().toString().length() ==0;
                boolean input2 = e2.getText().toString().length() ==0;

                if(input1 || input2) {Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
                    if(!input1 && input2) {e2.requestFocus(); e2.setCursorVisible(true);}
                    else {e1.requestFocus();e1.setCursorVisible(true);}
                    return;}
                String num1 = e1.getText().toString();
                String num2 = e2.getText().toString();

                int result =(int) (Float.parseFloat(num1) / Float.parseFloat(num2));
                Toast.makeText(getApplicationContext(), "나누기 계산 결과는 " + result + "입니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
