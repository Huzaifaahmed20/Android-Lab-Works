package com.example.masho.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class Second_Activity extends AppCompatActivity {

    public final static String MESSAGE_KEY = "SHADY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);

        Intent i = getIntent();
        String text = i.getStringExtra(MESSAGE_KEY);
        TextView txt = new TextView(this);
        txt.setText(text);
        setContentView(txt);
    }
}
