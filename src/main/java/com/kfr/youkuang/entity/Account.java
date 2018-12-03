package com.kfr.youkuang.entity;

public class Account {
    private String AccountName;

    private String UserName;

    private double sum;

    public Account(String AccountName, String UserName){

        this.AccountName = AccountName;
        this.UserName = UserName;
        sum = 0;
    }
    @Override
    public String toString() {
        return "Account{" +
                "UserName='" + UserName + '\'' +
                ", AccountName='" + AccountName + '\'' +
                '}';
    }

    public void setAccountName() { this.AccountName = AccountName; }

    public String getAccountName(){ return AccountName; }

    public String getUserName(){ return UserName; }

}
