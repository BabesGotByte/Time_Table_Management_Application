package com.example.tt3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final Spinner spinner2 = (Spinner)findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(second.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.spin2));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                if(spinner2.getSelectedItem().toString().equals("Sonali Agarwal")){
                    Intent intent = new Intent(second.this,first1.class);
                    intent.putExtra("a",spinner2.getSelectedItem().toString());
                    startActivity(intent);
                }
                if(spinner2.getSelectedItem().toString().equals("Abhishek Vaish")){
                    Intent intent = new Intent(second.this,first1.class);
                    intent.putExtra("a",spinner2.getSelectedItem().toString());
                    startActivity(intent);
                }
                if(spinner2.getSelectedItem().toString().equals("Pavan Chakraborty")){
                    Intent intent = new Intent(second.this,first1.class);
                    intent.putExtra("a",spinner2.getSelectedItem().toString());
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
