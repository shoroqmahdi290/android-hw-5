package com.example.cvapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final TextView g = findViewById(R.id.textView4);
        final TextView i = findViewById(R.id.text1);
        final EditText w = findViewById(R.id.text2);
        final TextView s = findViewById(R.id.text3);
        final EditText  e = findViewById(R.id.text4);
        final TextView r = findViewById(R.id.text5);
        final EditText  q = findViewById(R.id.text6);
        final TextView y = findViewById(R.id.text7);
        final EditText  t = findViewById(R.id.text8);
        final TextView u = findViewById(R.id.text9);
        final EditText p = findViewById(R.id.text10);

        final Button check = findViewById(R.id.button);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = w.getText().toString();
                String age = e.getText().toString();
                String job = q.getText().toString();
                String n = t.getText().toString();
                String mail = p.getText().toString();
                if (name.equals("")||age.equals("")||job.equals("")||n.equals("")||mail.equals("")){
                    Toast.makeText(MainActivity2.this,"Please fill in empty form.",Toast.LENGTH_LONG).show();
                }else {

                Intent s = new Intent(MainActivity2.this,MainActivity3.class);
                s.putExtra("name",name);
                s.putExtra("age",age);
                s.putExtra("job",job);
                s.putExtra("n",n);
                s.putExtra("mail",mail);
                startActivity(s);
            }}
        });






    }
}