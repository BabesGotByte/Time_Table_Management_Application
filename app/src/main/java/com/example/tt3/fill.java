package com.example.tt3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class fill extends AppCompatActivity {

    EditText e;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill);
        e=findViewById(R.id.editText3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        b=findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(fill.this,MainActivity.class));
            }
        });

//        t1=findViewById(R.id.textView5);
//        t2=findViewById(R.id.textView6);
//        Intent intent=getIntent();
//
//        String semester= intent.getStringExtra("sem");
//        String day= intent.getStringExtra("day");
//        t1.setText(semester);
//        t2.setText(day);
    }
}
