package com.example.secondexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText szam1 = (EditText)findViewById(R.id.editText);
        final EditText szam2 = (EditText)findViewById(R.id.editText2);
        Button szamol = (Button)findViewById(R.id.button);
        final TextView tv = (TextView)findViewById(R.id.textView);

        szamol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double eredmeny = Double.parseDouble(szam1.getText().toString()) + Double.parseDouble(szam2.getText().toString());
                tv.setText(Double.toString(eredmeny));
            }
        });
    }
}
