package com.kfr.youkuang.entity;

import java.sql.Date;
import java.sql.Timestamp;

public class Account {
    private String accountName;
    private int accountID;
    private String UserName;
    private double sum;
    private Date lastModifiedTime;
    private Date createdTime;

    public Account(String AccountName, String UserName) {

        this.accountName = AccountName;
        this.UserName = UserName;
        sum = 0;
        //存疑 lastModifiedTime  createdTime
    }

    @Override
    public String toString() {
        return "Account{" +
                "UserName='" + UserName + '\'' +
                ", AccountName='" + accountName + '\'' +
                '}';
    }


    public String getAccountName() {
        return accountName;
    }

    public String getUserName() {
        return UserName;
    }

    public int getAccountID() {
        return accountID;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public double getSum() {
        return sum;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

}
