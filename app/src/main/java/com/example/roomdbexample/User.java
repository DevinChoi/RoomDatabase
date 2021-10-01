package com.example.roomdbexample;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/* 데이터가 엑셀처럼 표 형태로 들어감 */

@Entity  // 클래스가 아니라 룸이 지원하는 데이터 모델로 사용. 클래스 이름 = 테이블 이름
public class User {

    @PrimaryKey(autoGenerate = true) // 새로운 사용자가 추가될 때 마다 자동으로 증가하며 들어감
    private int id = 0; // 하나의 사용자에 대한 고유 id 값

    private String name;

    private String age;

    private String phoneNumber;

    // getter, setter
    // 데이터 모델을 가져오거나, 세팅을 하기 위한 준비단계
    // art+insert
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
