package com.example.tt3;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.ListAdapter;
        import android.widget.ListView;
        import android.widget.TextView;


public class second1 extends AppCompatActivity {

    TextView t1,t2,t3;
    ListView listView;
    String[] fruit = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"};
    String[] fruit2 = {"a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1", "i1", "j1", "k", "l", "m", "n", "o", "p", "q", "r"};
    String[] fruit3 = {"a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"};
    String[] fruit4= {"a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listView = findViewById(R.id.listview2);
        customlist2 customlist = new customlist2(this,fruit,fruit2,fruit3,fruit4);
        listView.setAdapter(customlist);

        t1=findViewById(R.id.textView5);
        t2=findViewById(R.id.textView6);
        Intent intent=getIntent();

        String teacher= intent.getStringExtra("teacher");
        String day= intent.getStringExtra("day");
        t1.setText(teacher);
        t2.setText(day);

    }
}

