package com.example.dell.roomlivedata;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "contactdetails")
public class Contact {

    @PrimaryKey@ColumnInfo(name = "contactid")@NonNull
    String id;
    @ColumnInfo(name = "contactname")
    String name;
    @ColumnInfo(name = "contactmail")
    String mail;
    @ColumnInfo(name = "contactnumber")
    String number;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
