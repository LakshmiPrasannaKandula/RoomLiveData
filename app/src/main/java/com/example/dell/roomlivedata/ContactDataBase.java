package com.example.dell.roomlivedata;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = Contact.class,version = 1)
public abstract class ContactDataBase extends RoomDatabase {

    public abstract ContactDao contactDao();

    public static ContactDataBase instance;

    public static ContactDataBase getInstance(Context context){

        if(instance==null){

            instance=Room.databaseBuilder(context,ContactDataBase.class,"contact")
                   .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}
