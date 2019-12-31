package com.example.demo.model;

public class User {
	public int uid;
    public String username;
    public String PASSWORD;
    public String sex;
    public int age;
    public String phone;
    public String Email;
    public String IDcardNumber;

    public User(){}
    public User(String username, String PASSWORD, String phone, String sex, int age, String Email, String IDcardNumber) {
        this.setUsername(username);
        this.setPASSWORD(PASSWORD);
        this.setPhone(phone);
        this.setSex(sex);
        this.setAge(age);
        this.setEmail(Email);
        this.setIDcardNumber(IDcardNumber);
    }
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getIDcardNumber() {
        return IDcardNumber;
    }

    public void setIDcardNumber(String IDcardNumber) {
        this.IDcardNumber = IDcardNumber;
    }
    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", PASSWORD='" + PASSWORD + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", Email='" + Email + '\'' +
                ", IDcardNumber='" + IDcardNumber + '\'' +
                '}';
    }
}


