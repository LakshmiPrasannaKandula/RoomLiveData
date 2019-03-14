package com.example.dell.roomlivedata;

import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.os.AsyncTask;
import android.provider.ContactsContract;

import java.util.List;

public class ContactRepository {
    public  static ContactDao myDao;

    LiveData<List<Contact>>  getAllData;
    public ContactRepository(Context context){

        ContactDataBase contactDataBase=ContactDataBase.getInstance(context);
        myDao=contactDataBase.contactDao();
        getAllData=myDao.getAllContacts();

    }
    public  void insert(Contact contact){
        new InsertTask().execute(contact);
    }
    public void   update(Contact contact){
        new  Updatetask().execute(contact);
    }
    public void  delete(Contact contact){
        new DeleteTask().execute(contact);
    }
    public  void  deleteAll(Contact contact){
        new DeleteAllTask().execute();
    }
    public class InsertTask extends AsyncTask<Contact,Void,Void>{

        @Override
        protected Void doInBackground(Contact... contacts) {

            myDao.inserdata(contacts[0]);
            return null;
        }
    }
    public class Updatetask extends  AsyncTask<Contact,Void,Void>{

        @Override
        protected Void doInBackground(Contact... contacts) {
            myDao.updatedata(contacts[0]);
            return null;
        }
    }
    public  class  DeleteTask  extends  AsyncTask<Contact,Void,Void>{

        @Override
        protected Void doInBackground(Contact... contacts) {
            myDao.deletedata(contacts[0]);
            return null;
        }
    }
    public class  DeleteAllTask extends  AsyncTask<Void,Void,Void>{

        @Override
        protected Void doInBackground(Void... voids) {
            myDao.deleteAll();
            return null;
        }
    }
}
