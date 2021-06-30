package com.example.smarthome;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {users.class} , version = 1)
public abstract class usersDatabase extends RoomDatabase {


    public abstract usersDao usersDao();
}
