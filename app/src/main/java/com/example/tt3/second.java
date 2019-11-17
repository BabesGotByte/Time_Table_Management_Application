package com.example.tt3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class second extends AppCompatActivity {

    Button b1;
    String teacher,day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        b1=findViewById(R.id.button4);
        final Spinner spinner2 = (Spinner)findViewById(R.id.spinner2);
        final Spinner spinner4 = (Spinner)findViewById(R.id.spinner4);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(second.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.spin2));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(second.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.spin1));
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter2);

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                teacher=spinner2.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                day=spinner4.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(second.this,second1.class);
                intent.putExtra("teacher",teacher);
                intent.putExtra("day",day);
                startActivity(intent);
            }
        });
    }
}
