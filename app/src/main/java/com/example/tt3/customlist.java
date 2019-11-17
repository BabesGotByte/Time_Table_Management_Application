package com.example.tt3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class customlist extends ArrayAdapter<DaySchedule> {
    ArrayList<DaySchedule> daySchedulex;
    Activity context;
    public customlist(first1 context, ArrayList<DaySchedule> daySchedulex) {
        super(context, R.layout.listfile, daySchedulex);
        this.context = context;
        this.daySchedulex = daySchedulex;
    }

//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//
//        View r = convertView;
//        ViewHolder viewHolder = null;
//        if(r == null){
//            LayoutInflater layoutInflater = context.getLayoutInflater();
//            r=layoutInflater.inflate(R.layout.listfile,null,true);
//            viewHolder = new ViewHolder(r);
//            r.setTag(viewHolder);
//        }
//        else{
//            viewHolder = (ViewHolder) r.getTag();
//        }
//        viewHolder.t1.setText("....");
//        viewHolder.t2.setText(daySchedulex.get(position).getFaculty());
//        viewHolder.t3.setText("...");
//        return r;
//
//
//
//
//
//    }



    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {


        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listfile, null,true);

        TextView t1 = (TextView) rowView.findViewById(R.id.textView1);
        TextView t2 = (TextView) rowView.findViewById(R.id.textView2);
        TextView t3 = (TextView) rowView.findViewById(R.id.textView3);

        t1.setText(daySchedulex.get(position).getSubject());
        t2.setText(daySchedulex.get(position).getFaculty());
        t3.setText(daySchedulex.get(position).getTime());

        return rowView;

    };
 }

//    static class ViewHolder{
//        TextView t1;
//        TextView t2;
//        TextView t3;
//        ViewHolder(View v){
//            t1 = v.findViewById(R.id.textView1);
//            t2 = v.findViewById(R.id.textView2);
//            t3 = v.findViewById(R.id.textView3);
//        }
//    }

