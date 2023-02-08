package com.example.sqlConnection;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // So that hibernate identify whose attributes to pick while on table generation
@Table(name = "user_info") // just to give the table name
public class User {

    @Id
    private int id;
    private String name;

    private String age;

    private String mobileNo;


    public User(){ // default constructor

    }

    public User(int id, String name, String age,String mobileNo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobileNo = mobileNo;
    }

    public int getId() {
        return id;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
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
}
