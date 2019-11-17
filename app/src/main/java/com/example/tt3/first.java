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

public class first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        final Spinner spinner = (Spinner)findViewById(R.id.spinner);
        final String a="";

        ArrayAdapter<String> adapter = new ArrayAdapter<>(first.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.spin));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override

            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                if(spinner.getSelectedItem().toString().equals("BTECH 1ST SEMESTER")){
                    Intent intent = new Intent(first.this,first1.class);
                    intent.putExtra("a",spinner.getSelectedItem().toString());
                    startActivity(intent);
                }
                if(spinner.getSelectedItem().toString().equals("BTECH 2ND SEMESTER")){
                    Intent intent = new Intent(first.this,first1.class);
                    intent.putExtra("a",spinner.getSelectedItem().toString());
                    startActivity(intent);
                }
                if(spinner.getSelectedItem().toString().equals("BTECH 3RD SEMESTER")){
                    Intent intent = new Intent(first.this,first1.class);
                    intent.putExtra("a",spinner.getSelectedItem().toString());
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
            });

        }
}
