package com.example.tt3;

import android.app.Activity;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.TextView;

public class customlistnews extends ArrayAdapter<String> {
    private String fruit[];
    Activity context;
    public customlistnews(Activity context, String[] fruit) {
        super(context, R.layout.listfile, fruit);
        this.context = context;
        this.fruit = fruit;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View r = convertView;
        ViewHolder viewHolder = null;
        if(r == null){
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.listnews,null,true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) r.getTag();
        }
        viewHolder.t1.setText(fruit[position]);
        return r;

    }
    class ViewHolder{
        TextView t1;
        ViewHolder(View v){
            t1 = v.findViewById(R.id.textView1);
        }
    }
}
