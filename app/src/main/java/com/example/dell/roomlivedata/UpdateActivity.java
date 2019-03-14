package com.example.dell.roomlivedata;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateActivity extends AppCompatActivity {
    EditText cuid,cuname,cunumber,cuemail;
    ContactViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        cuid=findViewById(R.id.aid);
        cuname=findViewById(R.id.aname);
        cunumber=findViewById(R.id.anumber);
        cuemail=findViewById(R.id.amail);

        viewModel=ViewModelProviders.of(this).get(ContactViewModel.class);
    }

    public void update(View view) {

        Contact contact=new Contact();
        contact.setId(cuid.getText().toString());
        contact.setName(cuname.getText().toString());
        contact.setNumber(cunumber.getText().toString());
        contact.setMail(cuemail.getText().toString());
        viewModel.updateData(contact);
        Toast.makeText(this, "Updated successfully", Toast.LENGTH_SHORT).show();
        finish();
    }
}
