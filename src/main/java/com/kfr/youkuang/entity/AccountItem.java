package com.kfr.youkuang.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

public class AccountItem {
    private int iNo;
    private String inOut;
    private BigDecimal money;
    private int typeID;
    private Timestamp time;
    private String tip;

    public AccountItem(int iNo, String inOut, BigDecimal money, Timestamp time,int typeID, String tip) {
        this.iNo = iNo;
        this.inOut = inOut;
        this.money = money;
        this.typeID = typeID;
        this.time = time;
        this.tip = tip;
    }
    public AccountItem(String inOut, BigDecimal money, Timestamp time, int typeID, String tip){
        this.inOut = inOut;
        this.money = money;
        this.typeID = typeID;
        this.time = time;
        this.tip = tip;

    }

    public int getiNo() {
        return iNo;
    }

    public void setiNo(int iNo) {
        this.iNo = iNo;
    }

    public String getInOut() {
        return inOut;
    }

    public void setInOut(String inOut) {
        this.inOut = inOut;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
