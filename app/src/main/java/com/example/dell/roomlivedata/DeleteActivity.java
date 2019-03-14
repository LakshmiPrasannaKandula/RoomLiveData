package com.example.dell.roomlivedata;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DeleteActivity extends AppCompatActivity {

    EditText deleteid;
    ContactViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        deleteid=findViewById(R.id.did);

        viewModel=ViewModelProviders.of(this).get(ContactViewModel.class);
    }

    public void delete(View view) {

        Contact contact=new Contact();
        contact.setId(deleteid.getText().toString());

        viewModel.deleteData(contact);
        Toast.makeText(this, "deleted successfully", Toast.LENGTH_SHORT).show();
    }
}
