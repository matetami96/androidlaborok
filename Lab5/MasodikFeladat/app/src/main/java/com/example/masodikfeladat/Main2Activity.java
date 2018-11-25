package com.example.masodikfeladat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String fname = getIntent().getExtras().getString("fname");
        String lname = getIntent().getExtras().getString("lname");
        textView = (TextView)findViewById(R.id.textView3) ;
        textView.append(" ");
        textView.append(fname);
        textView.append(" ");
        textView.append(lname);
    }
}
