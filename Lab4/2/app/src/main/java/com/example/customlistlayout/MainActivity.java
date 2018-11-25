package com.example.customlistlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] nameArray = {"Octopus","Pig","Sheep","Rabbit",
            "Snake","Spider","Spider","Spider","Spider" };

    String[] infoArray = {
            "8 tentacled monster",
            "Delicious in rolls",
            "Great for jumpers",
            "Nice in a stew",
            "Great for shoes",
            "Scary",
            "Scary",
            "Scary",
            "Scary"
    };

    Integer[] imageArray = {R.drawable.cat,
            R.drawable.disznyo,
            R.drawable.dog,
            R.drawable.giraffe,
            R.drawable.horse,
            R.drawable.lion,
            R.drawable.octopus3,
            R.drawable.rabbit,
            R.drawable.sheep
    };

    String[] numberArray = {"25", "10", "5", "3", "6", "8", "9" , "14", "11"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter whatever = new CustomListAdapter(this, nameArray, infoArray, imageArray, numberArray);
        listView = (ListView) findViewById(R.id.listviewID);
        listView.setAdapter(whatever);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                String message = nameArray[position];
                intent.putExtra("animal", message);
                startActivity(intent);
            }
        });
    }
}