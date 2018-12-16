package com.kfr.youkuang.entity;

import java.math.BigDecimal;
import java.sql.Date;

public class Account {
    private String accountName;
    private int accountID;
    private String userName;
    private int userID;
    private BigDecimal sum;
    private Date lastModifiedTime;
    private Date createdTime;
    private String tablename;

    public Account(String accountName, int accountID, String userName, int userID, BigDecimal sum, Date lastModifiedTime, Date createdTime, String tablename) {
        this.accountName = accountName;
        this.accountID = accountID;
        this.userName = userName;
        this.userID = userID;
        this.sum = sum;
        this.lastModifiedTime = lastModifiedTime;
        this.createdTime = createdTime;
        this.tablename = tablename;
    }

    public Account(String AccountName, int userID) {

        this.accountName = AccountName;
        this.userID = userID;
        sum = new BigDecimal(0);
        tablename = userID + "_" + accountID;
        lastModifiedTime = new Date(System.currentTimeMillis());
        createdTime = new Date(System.currentTimeMillis());
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

    public BigDecimal getSum() {
        return sum;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getTablename() {
        return tablename;
    }
}
