package com.example.tt3;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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

    TextView t1;
    private CollectionReference timeSlot;
    ArrayList<DaySchedule> daySchedules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first1);

        t1=findViewById(R.id.textView5);

        Intent intent=getIntent();
        String aa= intent.getStringExtra("b");
        t1.setText(aa);
        Toast.makeText(first1.this, aa, Toast.LENGTH_LONG).show();

        daySchedules = new ArrayList<>();
        db=FirebaseFirestore.getInstance();
        timeSlot = db.collection("btech5").document("Monday").collection("Time_slot");

        timeSlot.get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
//                pg.setVisibility(View.VISIBLE);
                if (task.isSuccessful()) {
                    int count = 0;
                    for (DocumentSnapshot document : task.getResult()) {
                        DaySchedule h = document.toObject(DaySchedule.class);
                        daySchedules.add(h);
                    }

                } else {
                    Log.d(TAG, "Error getting documents: ", task.getException());
                }




                if(daySchedules==null)
                    Toast.makeText(first1.this, "empty view", Toast.LENGTH_SHORT).show();
//
//
//                pg.setVisibility(View.GONE);
//
//
                String x="";
                for(int i=0;i<daySchedules.size();i++){
                    x=x+daySchedules.get(i).toString()+"\n\n";
                }
                t1.setText(x);
            }
        });


    }




}
