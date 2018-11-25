package com.example.myfirstlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button logIn = (Button) findViewById(R.id.button);
        final EditText userName = (EditText) findViewById(R.id.editText);
        final EditText passWord = (EditText) findViewById(R.id.editText2);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userName.getText().toString().equalsIgnoreCase("alma") && passWord.getText().toString().equalsIgnoreCase("alma")) {
                    Intent intent = new Intent(getApplicationContext(), GreetingActivity.class);
                    startActivity(intent);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Incorrect Password or Username", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
}
