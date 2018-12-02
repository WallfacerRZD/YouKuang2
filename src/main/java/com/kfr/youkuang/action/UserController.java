package com.kfr.youkuang.action;

import com.kfr.youkuang.entity.User;
import com.kfr.youkuang.service.UserServiceStatus;
import com.kfr.youkuang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public UserServiceStatus register(final int userID, final String userName, final String password) {
        return userService.register(new User(userID, userName, password));
    }

    @GetMapping("/login")
    public UserServiceStatus login(final int userID, final String userName, final String password) {
        return userService.login(new User(userID, userName, password));
    }
}
