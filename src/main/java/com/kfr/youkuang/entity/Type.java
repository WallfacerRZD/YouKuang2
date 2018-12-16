package com.kfr.youkuang.entity;

public class Type {
    private int typeID;
    private String type;

    public Type(String type) {
        this.type = type;
        //存疑 id？？？
    }

    public String getType() {
        return type;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTypeID(int typeID) {
        //存疑
    }
}
