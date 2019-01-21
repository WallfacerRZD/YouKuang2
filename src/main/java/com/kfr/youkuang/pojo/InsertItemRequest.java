package com.kfr.youkuang.pojo;

import java.math.BigDecimal;

/**
 * @author WallfacerRZD
 * @date 2019/1/21 21:57
 */
public class InsertItemRequest {
    private final String inOut;
    private final BigDecimal money;
    private final long time;
    private final int type;
    private final String tip;

    public InsertItemRequest(final String inOut, final BigDecimal money, final long time,
                             final int type, final String tip) {
        this.inOut = inOut;
        this.money = money;
        this.time = time;
        this.type = type;
        this.tip = tip;
    }

    public String getInOut() {
        return inOut;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public long getTime() {
        return time;
    }

    public int getType() {
        return type;
    }

    public String getTip() {
        return tip;
    }
}
