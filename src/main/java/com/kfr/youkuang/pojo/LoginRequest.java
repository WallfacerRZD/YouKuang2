package com.kfr.youkuang.pojo;

/**
 * @author WallfacerRZD
 * @date 2019/1/21 21:36
 */
public class LoginRequest {
    private final String userName;
    private final String password;

    public LoginRequest(final String userName, final String password) {
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
