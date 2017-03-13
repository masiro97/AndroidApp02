package com.android.masiro.proj021;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("나이 계산");
        b1 = (Button)findViewById(R.id.b11);
        b2 = (Button)findViewById(R.id.b12);

        e1 = (EditText)findViewById(R.id.editText1);
        e2 = (EditText)findViewById(R.id.editText2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String in_year = e1.getText().toString();
                int out_age = 2017 - Integer.parseInt(in_year) + 1;

                Toast.makeText(getApplicationContext(),"당신의 나이는 " + out_age + " 입니다.",Toast.LENGTH_SHORT).show();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String in_age = e2.getText().toString();
                int out_year = 2017 - Integer.parseInt(in_age) + 1;
                Toast.makeText(getApplicationContext(),"당신의 태어난 년도는 " +  out_year + " 입니다.",Toast.LENGTH_SHORT).show();

            }
        });
    }

}
