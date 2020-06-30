package com.example.cvapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView i = findViewById(R.id.textView);
        TextView r = findViewById(R.id.textView2);
        TextView f = findViewById(R.id.text);
        Button u = findViewById(R.id.button);


        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(MainActivity.this,MainActivity2.class);
               startActivity(s);
            }
        });
    }
}