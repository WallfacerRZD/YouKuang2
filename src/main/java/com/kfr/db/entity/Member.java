package com.kfr.db.entity;

import java.sql.Date;

/**
 * @author WallfacerRZD
 * @date 2018/11/9 12:08
 */
public class Member {
    private String name;

    private String studentID;

    private Date birthDay;

    private String hobby;

    public Member(String name, String studentID, Date birthDay, String hobby) {

        this.name = name;
        this.studentID = studentID;
        this.birthDay = birthDay;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", studentID='" + studentID + '\'' +
                ", birthDay=" + birthDay +
                ", hobby='" + hobby + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
