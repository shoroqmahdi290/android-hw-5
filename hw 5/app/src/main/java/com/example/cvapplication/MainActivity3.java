package com.example.cvapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CallLog;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView h;
    TextView k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        final TextView i = findViewById(R.id.text1);
        final TextView r = findViewById(R.id.text2);
        final TextView t = findViewById(R.id.text3);
        final TextView e = findViewById(R.id.text4);
        final TextView p = findViewById(R.id.text5);

        final TextView w = findViewById(R.id.text6);
        final TextView f = findViewById(R.id.text7);
        final TextView h = findViewById(R.id.text8);
        final TextView k = findViewById(R.id.text9);


        final Bundle ho = getIntent().getExtras();
        i.setText(ho.getString("name"));
        w.setText(ho.getString("age"));
        f.setText(ho.getString("job"));
        h.setText(ho.getString("n"));
        k.setText(ho.getString("mail"));

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri call = Uri.parse("tel:" + ho.getString("n"));
                Intent callintent = new Intent(Intent.ACTION_DIAL, call);
                startActivity(callintent);
            }
        });

        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri mymail = Uri.parse("mailto:"+ ho.getString("mail"));
                Intent mail = new Intent(Intent.ACTION_SENDTO,mymail);
                startActivity(mail);

            }
        });



    }
}