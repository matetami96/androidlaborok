package com.example.masodikfeladat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editFname;
    EditText editLname;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editFname = (EditText) findViewById(R.id.editText);
        editLname = (EditText) findViewById(R.id.editText2);
        btnSubmit = (Button)findViewById(R.id.button);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("fname",editFname.getText().toString());
                intent.putExtra("lname",editLname.getText().toString());
                startActivity(intent);
            }
        });
    }
}
