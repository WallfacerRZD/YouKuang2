package com.kfr.youkuang.action;

import com.kfr.youkuang.entity.Account;
import com.kfr.youkuang.entity.User;
import com.kfr.youkuang.service.UserServiceStatus;
import com.kfr.youkuang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import javax.security.auth.login.AccountException;

/**
 * @author WallfacerRZD
 * @date 2018/11/20 23:35
 */
@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public UserServiceStatus register(final String userName, final String password) {
        return userService.register(new User(userName, password));
    }

    @GetMapping("/login")
    public UserServiceStatus login(final String userName,
                                   final String password,
                                   final HttpServletRequest request) {
        return userService.login(new User(userName, password), request);
    }



}
