package com.kfr.youkuang.pojo;

import java.math.BigDecimal;

/**
 * @author WallfacerRZD
 * @date 2019/1/21 22:11
 */
public class ModifyItemRequest {
    private final int accountItemID;
    private final String inOut;
    private final BigDecimal money;
    private final long time;
    private final int type;
    private final String tip;

    public ModifyItemRequest(final int accountItemID, final String inOut, final BigDecimal money,
                             final long time, final int type, final String tip) {
        this.accountItemID = accountItemID;
        this.inOut = inOut;
        this.money = money;
        this.time = time;
        this.type = type;
        this.tip = tip;
    }

    public int getAccountItemID() {
        return accountItemID;
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
