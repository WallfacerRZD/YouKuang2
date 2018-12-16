package com.kfr.youkuang.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Account {
    private int accountID;

    private String accountName;

    private int userID;

    private BigDecimal sum;

    private Timestamp lastModifiedTime;

    private Timestamp createdTime;


    public Account(final int accountID,
                   final String accountName,
                   final int userID,
                   final BigDecimal sum,
                   final Timestamp lastModifiedTime,
                   final Timestamp createdTime) {
        this.accountID = accountID;
        this.accountName = accountName;
        this.userID = userID;
        this.sum = sum;
        this.lastModifiedTime = lastModifiedTime;
        this.createdTime = createdTime;
    }

    public Account(String AccountName, int userID) {

        this.accountName = AccountName;
        this.userID = userID;
        sum = new BigDecimal(0);
        lastModifiedTime = new Timestamp(System.currentTimeMillis());
        createdTime = new Timestamp(System.currentTimeMillis());
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", accountID=" + accountID +
                ", userID=" + userID +
                ", sum=" + sum +
                ", lastModifiedTime=" + lastModifiedTime +
                ", createdTime=" + createdTime +
                '}';
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountID() {
        return accountID;
    }

    public int getUserID() {
        return userID;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public Timestamp getLastModifiedTime() {
        return lastModifiedTime;
    }

    public BigDecimal getSum() {
        return sum;
    }

}
