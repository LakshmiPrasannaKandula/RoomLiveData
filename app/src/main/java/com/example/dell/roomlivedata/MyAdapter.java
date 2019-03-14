package com.example.dell.roomlivedata;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    List<Contact> contactList;

    public MyAdapter(MainActivity mainActivity, List<Contact> contacts) {
        this.context=mainActivity;
        this.contactList=contacts;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.rowdesign,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {

        Contact model=contactList.get(position);
        holder.tid.setText(model.id);
        holder.tname.setText(model.name);
        holder.tnumber.setText(model.number);
        holder.tmail.setText(model.mail);

    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tid,tname,tnumber,tmail;
        public MyViewHolder(View itemView) {
            super(itemView);
            tid=itemView.findViewById(R.id.rid);
            tname=itemView.findViewById(R.id.rname);
            tnumber=itemView.findViewById(R.id.rnumber);
            tmail=itemView.findViewById(R.id.remail);
        }
    }
}
