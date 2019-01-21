package com.kfr.youkuang.pojo;

/**
 * @author WallfacerRZD
 * @date 2019/1/21 21:26
 */
public class RegisterRequest {
    private final String userName;

    private final String password;

    public RegisterRequest(final String userName, final String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
