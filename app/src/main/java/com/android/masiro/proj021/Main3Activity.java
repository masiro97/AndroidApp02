package com.android.masiro.proj021;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setTitle("온도변환기");
        b1 = (Button)findViewById(R.id.b21);
        b2 = (Button)findViewById(R.id.b22);
        e1 = (EditText)findViewById(R.id.editText3);
        e2 = (EditText)findViewById(R.id.editText4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = e1.getText().toString();
                double result1 = Integer.parseInt(f) * 1.8 +32;
                Toast.makeText(getApplicationContext(),"화씨온도는 " + result1 + "도 입니다.",Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String c = e2.getText().toString();
                double result2 = (Integer.parseInt(c) - 32) / 1.8;
                Toast.makeText(getApplicationContext(),"섭씨온도는 " + result2 + "도 입니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
