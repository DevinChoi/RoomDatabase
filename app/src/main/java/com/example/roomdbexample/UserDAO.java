package com.example.roomdbexample;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

/**
 * Data Access Object *
 * CRUD 행위를 하는 인터페이스
 */
@Dao
public interface UserDAO {

    @Insert // 삽입
    void setInsertUser(User user);

    @Update // 수정
    void setUpdateUser(User user);

    @Delete // 삭제
    void setDeleteUser(User user);

    /* 조회 */
    @Query("SELECT * FROM User") // 쿼리 : 데이터베이스에 요청하는 명령문. mySQL
    List<User> getUserAll();
}
