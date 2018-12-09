package com.kfr.youkuang.entity;

import java.math.BigDecimal;
import java.sql.Date;

public class AccountItem {
    private int iNo;
    private String inOut;
    private BigDecimal money;
    private Date time;
    private int typeID;
    private String tip;

    public AccountItem(String inOut,BigDecimal money, int typeID, String tip ) {
        this.inOut = inOut;
        this.money = money;
        this.typeID = typeID;
        this.tip = tip;
       //存疑 this.time =？？？
    }

    public BigDecimal getMoney() {
        return money;
    }
    public Date getTime() {
        return time;
    }
    public String getInOut() {
        return inOut;
    }
    public int getiNo() {
        return iNo;
    }
    public int getTypeID() {
        return typeID;
    }
    public String getTip() {
        return tip;
    }

    public void setInOut(String inOut) {
        this.inOut = inOut;
    }
    public void setMoney(BigDecimal money) {
        this.money = money;
    }
    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }
    public void setTip(String tip) {
        this.tip = tip;
    }

}
