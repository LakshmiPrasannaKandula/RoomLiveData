package com.example.dell.roomlivedata;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {
    EditText iid,iname,inumber,iemail;
    ContactViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        iid=findViewById(R.id.aid);
        iname=findViewById(R.id.aname);
        inumber=findViewById(R.id.anumber);
        iemail=findViewById(R.id.amail);

        viewModel=ViewModelProviders.of(this).get(ContactViewModel.class);


    }

    public void save(View view) {
        Contact  contact=new Contact();
        contact.setId(iid.getText().toString());
        contact.setName(iname.getText().toString());
        contact.setNumber(inumber.getText().toString());
        contact.setMail(iemail.getText().toString());

        viewModel.insertData(contact);
        Toast.makeText(this, "saved succesfully", Toast.LENGTH_SHORT).show();

        finish();
    }
    public void update(View view) {
        startActivity(new Intent(this,UpdateActivity.class));
    }

    public void delete(View view) {
        startActivity(new Intent(this,DeleteActivity.class));
    }
}
