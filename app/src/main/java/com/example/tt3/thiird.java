package com.example.tt3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class thiird extends AppCompatActivity {

    EditText e1,e2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_thiird);
        e1=findViewById(R.id.editText);
        e2=findViewById(R.id.editText2);
        b1=findViewById(R.id.button4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((e1.equals("sonali@iiita.ac.in"))&&(e2.equals("sonali"))) {
                    startActivity(new Intent(thiird.this, thiird1.class));
                }
                else if((e1.equals("rkala@iiita.ac.in"))&&(e2.equals("rkala"))) {
                    startActivity(new Intent(thiird.this, thiird1.class));
                }
                else if((e1.equals("vaish@iiita.ac.in"))&&(e2.equals("vaish"))) {
                    startActivity(new Intent(thiird.this, thiird1.class));
                }
                startActivity(new Intent(thiird.this, thiird1.class));
            }
        });

    }
}