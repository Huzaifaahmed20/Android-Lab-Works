package com.example.masho.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.concurrent.ConcurrentLinkedDeque;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editText;
    private static final String MESSAGE_KEY= "SHADY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.SendBtn);
        editText = (EditText)findViewById(R.id.Name);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Second_Activity.class);
                String text = editText.getText().toString();
                i.putExtra(MESSAGE_KEY,text);
                startActivity(i);
            }
        });
    }
}
