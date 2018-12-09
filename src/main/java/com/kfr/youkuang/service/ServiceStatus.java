package com.kfr.youkuang.service;

/**
 * @author WallfacerRZD
 * @date 2018/11/19 23:16
 */
public class ServiceStatus {
    public static final boolean SUCCEED = true;

    public static final boolean FAILED = false;

    private boolean succeed;

    private String description;

    public ServiceStatus(boolean succeed, String description) {
        this.succeed = succeed;
        this.description = description;
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
}
