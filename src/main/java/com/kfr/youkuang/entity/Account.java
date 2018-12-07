package com.kfr.youkuang.entity;

import java.sql.Date;
import java.sql.Timestamp;

public class Account {
    private String accountName;
    private int accountID;
    private String userName;
    private int userID;
    private double sum;
    private Date lastModifiedTime;
    private Date createdTime;
    private String tablename;

    public Account(String AccountName, String UserName) {

        this.accountName = AccountName;
        this.userName = UserName;
        sum = 0;
        //存疑 lastModifiedTime  createdTime
        tablename = userID + "_" + accountID;
    }

    @Override
    public String toString() {
        return "Account{" +
                "UserName='" + userName + '\'' +
                ", AccountName='" + accountName + '\'' +
                '}';
    }

    public String getAccountName() {
        return accountName;
    }

    public String getUserName() {
        return userName;
    }

    public int getAccountID() {
        return accountID;
    }

    public int getUserID() {
        return userID;
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

    public String getTablename() {
        return tablename;
    }
}
