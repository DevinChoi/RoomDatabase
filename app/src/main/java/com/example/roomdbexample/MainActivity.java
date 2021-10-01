package com.example.roomdbexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private UserDAO mUserDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserDatabase database = Room.databaseBuilder(
                getApplicationContext(),
                UserDatabase.class,
                "dialendar.db")                   // db name :스키마
                .fallbackToDestructiveMigration()       // 스키마(database) 버전 변경 가능
                .allowMainThreadQueries()               // Main Thread에서 DB의 IO(입출력)를 가능하게 함
                .build();

        mUserDAO = database.userDAO();                  // 인터페이스 객체 할당

        /* 데이터 삽입 */
//        User user = new User();// 객체 인스턴스 생성, 아이디 자동 생성
//        user.setName("일력프로젝트");
//        user.setAge("1");
//        user.setPhoneNumber("000-0000-0000");
//
//        mUserDAO.setInsertUser(user);

        /* 데이터 조회 */
        List<User> userList = mUserDAO.getUserAll();
        for (int i = 0; i < userList.size(); i++) {
            Log.d("TEST", userList.get(i).getName() + "\n"
                            + userList.get(i).getAge() + "\n"
                            + userList.get(i).getPhoneNumber() + "\n");
        }

        /* 데이터 수정 */
//        User user2 = new User();// 객체 인스턴스 생성
//        user2.setId(1);
//        user2.setName("일력프로젝트_수정");
//        user2.setAge("2");
//        user2.setPhoneNumber("111-0000-0000");
//
//        mUserDAO.setUpdateUser(user2);

        /* 데이터 삭제 */
        User user3 = new User();
        user3.setId(2);

        mUserDAO.setDeleteUser(user3);
    }
}