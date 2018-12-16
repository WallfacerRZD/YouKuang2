package com.kfr.youkuang.entity;

public class Type {
    private int typeID;
    private String type;

    public Type(int typeID, String type) {
        this.typeID = typeID;
        this.type = type;
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

    public void setTypeID(int typeID) {this.typeID = typeID; }
}
