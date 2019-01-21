package com.kfr.youkuang.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @author WallfacerRZD
 * @date 2019/1/21 22:23
 */
public class CreateAccountRequest {
    private final String accountName;
    private final BigDecimal sum;
    private final Timestamp createdTime;
    private final Timestamp lastModifiedTime;

    public CreateAccountRequest(final String accountName) {
        this.accountName = accountName;
        this.sum = BigDecimal.ZERO;
        this.createdTime = new Timestamp(System.currentTimeMillis());
        this.lastModifiedTime = new Timestamp(System.currentTimeMillis());
    }

    public String getAccountName() {
        return accountName;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public Timestamp getLastModifiedTime() {
        return lastModifiedTime;
    }
}
