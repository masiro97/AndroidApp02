package com.android.masiro.proj021;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main4Activity extends AppCompatActivity {

    Button b1;
    EditText e1,e2,e3;
    CheckBox c1;
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        setTitle("레스토랑메뉴주문");
        b1 =(Button)findViewById(R.id.b31);
        e1 = (EditText)findViewById(R.id.editText5);
        e2 = (EditText)findViewById(R.id.editText6);
        e3 = (EditText)findViewById(R.id.editText7);
        c1 = (CheckBox)findViewById(R.id.checkBox);
        t1 = (TextView)findViewById(R.id.textView9);
        t2 = (TextView)findViewById(R.id.textView11);



        t1.setText("0개");
        t2.setText("0원");


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String pizza = e1.getText().toString();
                String spaghetti = e2.getText().toString();
                String sallad = e3.getText().toString();

                int count = Integer.parseInt(pizza) + Integer.parseInt(spaghetti) + Integer.parseInt(sallad);
                int total = Integer.parseInt(pizza) * 15000 + Integer.parseInt(spaghetti) * 13000 + Integer.parseInt(sallad) * 9000;

                if(c1.isChecked() == true) total *= 0.9;

                t1.setText(count + "개");
                t2.setText(total + "원");

            }
        });
    }
}
