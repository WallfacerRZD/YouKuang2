package com.kfr.youkuang.service;

public class ItemStatus {
    public static final boolean SUCCEED = true;

    public static final boolean FAILED = false;

    private boolean succeed;
    private String description;
    private int iNo;

    public ItemStatus(boolean succeed, String description, int iNo) {
        this.succeed = succeed;
        this.description = description;
        this.iNo = iNo;
    }

    public boolean isSucceed() {
        return succeed;
    }

    public void setSucceed(boolean succeed) {
        this.succeed = succeed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getiNo() {
        return iNo;
    }

    public void setiNo(int iNo) {
        this.iNo = iNo;
    }
}
