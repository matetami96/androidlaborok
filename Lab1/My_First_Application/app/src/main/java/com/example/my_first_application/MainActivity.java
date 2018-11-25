package com.example.my_first_application;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv = (TextView)findViewById(R.id.textView);
        final Button btn = (Button)findViewById(R.id.button);
        final Button btn2 = (Button)findViewById(R.id.button2);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.append("\n" + tv.getText());
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setTextColor(Color.GREEN);
                Toast.makeText(getApplicationContext(), "Megnyomtad a gombot", Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setTextColor(Color.BLUE);
                Toast.makeText(getApplicationContext(), "Na eztes megnyomtad", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
