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

    Button b;
    String sem,day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        final Spinner spinner = (Spinner)findViewById(R.id.spinner);
        final Spinner spinner1 = (Spinner)findViewById(R.id.spinner4);
        b = findViewById(R.id.button3);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(first.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.spin));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(first.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.spin1));
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override

            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                sem=spinner.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
            });


        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override

        public void onItemSelected(AdapterView<?> parent, View view,
        int position, long id) {
            day=spinner1.getSelectedItem().toString();
//            if(spinner1.getSelectedItem().toString().equals("MONDAY")){
//                Intent intent = new Intent(first.this,first1.class);
//                intent.putExtra("a",spinner1.getSelectedItem().toString());
//                //startActivity(intent);
//            }
//            if(spinner1.getSelectedItem().toString().equals("TUESDAY")){
//                Intent intent = new Intent(first.this,first1.class);
//                intent.putExtra("a",spinner1.getSelectedItem().toString());
//                //startActivity(intent);
//            }
//            if(spinner1.getSelectedItem().toString().equals("WEDNESDAY")){
//                Intent intent = new Intent(first.this,first1.class);
//                intent.putExtra("a",spinner1.getSelectedItem().toString());
//                //startActivity(intent);
//            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
        }
    });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first.this,first1.class);
                intent.putExtra("sem",sem);
                intent.putExtra("day",day);
                startActivity(intent);
            }
        });

}
}
