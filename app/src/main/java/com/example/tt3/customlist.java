package com.example.tt3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customlist extends ArrayAdapter<String> {
    private String fruit[];
    private String f2[];
    private String f3[];
    Activity context;
    public customlist(Activity context, String[] fruit, String[] f2, String[] f3) {
        super(context, R.layout.listfile, fruit);
        this.context = context;
        this.fruit = fruit;
        this.f2 = f2;
        this.f3 = f3;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View r = convertView;
        ViewHolder viewHolder = null;
        if(r == null){
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.listfile,null,true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) r.getTag();
        }
        viewHolder.t1.setText(fruit[position]);
        viewHolder.t2.setText(f2[position]);
        viewHolder.t3.setText(f3[position]);
        return r;

    }
    class ViewHolder{
        TextView t1;
        TextView t2;
        TextView t3;
        ViewHolder(View v){
            t1 = v.findViewById(R.id.textView1);
            t2 = v.findViewById(R.id.textView2);
            t3 = v.findViewById(R.id.textView3);
        }
    }
}
