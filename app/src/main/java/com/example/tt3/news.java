package com.example.tt3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class news extends AppCompatActivity {


    ListView listView;
    String[] fruit = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        listView = findViewById(R.id.listnew);
        customlistnews customlist = new customlistnews(this,fruit);
        listView.setAdapter(customlist);
    }
}
