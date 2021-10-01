package com.example.roomdbexample;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {User.class}, version = 1) // user라는 테이블, 변경 관리를 위해 버전 명시
public abstract class UserDatabase extends RoomDatabase {

    public abstract UserDAO userDAO();
}
