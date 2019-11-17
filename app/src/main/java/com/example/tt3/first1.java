package com.example.tt3;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

import static android.support.constraint.Constraints.TAG;

public class first1 extends AppCompatActivity {

    private FirebaseFirestore db;
    private CollectionReference timeSlot;
    ArrayList<DaySchedule> daySchedules;
    TextView t1,t2,t3;
    ListView listView;
    ProgressBar pg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first1);
        pg = findViewById(R.id.pg);
        listView = findViewById(R.id.listview);
        t1=findViewById(R.id.textView5);
        t2=findViewById(R.id.textView6);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Intent intent=getIntent();
        String semester= intent.getStringExtra("sem");
        String day= intent.getStringExtra("day");
        t1.setText(semester);
        t2.setText(day);

        String x=semester;
        if(x.charAt(0)=='B'){
            x="btech"+x.charAt(6);
        }

        if(x.equals("btech1")||x.equals("btech3")||x.equals("btech5")) {

            daySchedules = new ArrayList<>();
            db = FirebaseFirestore.getInstance();
            timeSlot = db.collection(x).document(day).collection("Time_slot");

            timeSlot.get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                @Override
                public void onComplete(@NonNull Task<QuerySnapshot> task) {
                    pg.setVisibility(View.VISIBLE);
                    if (task.isSuccessful()) {
                        int count = 0;
                        for (DocumentSnapshot document : task.getResult()) {
                            DaySchedule h = document.toObject(DaySchedule.class);
                            daySchedules.add(h);
                        }

                    } else {
                        Log.d(TAG, "Error getting documents: ", task.getException());
                    }


                    if (daySchedules == null)
                        Toast.makeText(first1.this, "empty view", Toast.LENGTH_SHORT).show();
//
//
                    pg.setVisibility(View.GONE);
//
//
//                String x="";
//                for(int i=0;i<daySchedulex.size();i++){
//                    x=x+daySchedulex.get(i).toString()+"\n\n";
//                }
                    customlist customlist = new customlist(first1.this, daySchedules);
                    listView.setAdapter(customlist);
//                t1.setText(x);
                }
            });

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_option, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if(id == R.id.newsfeed){
            startActivity(new Intent(getApplicationContext(),news.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }




}

