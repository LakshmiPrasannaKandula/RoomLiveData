package com.example.dell.roomlivedata;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface ContactDao {

    @Insert
    public void inserdata(Contact contact);

    @Query("select * from  contactdetails")
    public LiveData<List<Contact>> getAllContacts();
    @Update
    public void updatedata(Contact contact);

    @Delete
    public  void  deletedata(Contact contact);

    @Query("delete from contactdetails")
    public  void  deleteAll();

}
