package com.example.smarthome;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.smarthome.users;

import java.util.List;

@Dao
public interface usersDao {
    @Insert
    void insertusers (users user);

    @Query("Select*from users")
    List<users> getUserslist();

    @Delete
           void deleteuser (users user);

    @Query("Select*from users where userName = :username and password = :userpassword")
    List<users> getUsers(String username ,String userpassword);

    @Update
    void updateuser (users user);
}
