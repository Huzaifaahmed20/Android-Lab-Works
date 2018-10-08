package com.example.masho.list_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String array[] = {"abc","def","ghi","jkl","jkl","jkl","jkl","jkl","jkl","jkl","jkl","jkl","jkl","jkl","jkl","jkl","jkl","jkl","jkl"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_items,R.id.textview,array);
        ListView listView = (ListView) listView.findViewById(R.id.list_item);
        listView.setAdapter(adapter);
    }
}
