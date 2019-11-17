package com.example.tt3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class first1 extends AppCompatActivity {

    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first1);

        t1=findViewById(R.id.textView5);

        Intent intent=getIntent();
        String aa= intent.getStringExtra("b");
        t1.setText(aa);
        Toast.makeText(first1.this, aa, Toast.LENGTH_LONG).show();


    }
}
