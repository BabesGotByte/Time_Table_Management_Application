package com.example.tt3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customlist2 extends ArrayAdapter<String> {
    private String fruit[];
    private String f2[];
    private String f3[];
    private String f4[];
    Activity context;
    public customlist2(Activity context, String[] fruit, String[] f2, String[] f3, String[] f4) {
        super(context, R.layout.listfile, fruit);
        this.context = context;
        this.fruit = fruit;
        this.f2 = f2;
        this.f3 = f3;
        this.f4 = f4;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View r = convertView;
        ViewHolder viewHolder = null;
        if(r == null){
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.listfile2,null,true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) r.getTag();
        }
        viewHolder.t1.setText(fruit[position]);
        viewHolder.t2.setText(f2[position]);
        viewHolder.t3.setText(f3[position]);
        viewHolder.t4.setText(f4[position]);
        return r;

    }
    class ViewHolder{
        TextView t1;
        TextView t2;
        TextView t3;
        TextView t4;
        ViewHolder(View v){
            t1 = v.findViewById(R.id.textView1);
            t2 = v.findViewById(R.id.textView2);
            t3 = v.findViewById(R.id.textView3);
            t4 = v.findViewById(R.id.textView4);
        }
    }
}

