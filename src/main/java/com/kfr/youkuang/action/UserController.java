package com.kfr.youkuang.action;

import com.kfr.youkuang.Util;
import com.kfr.youkuang.entity.User;
import com.kfr.youkuang.pojo.LoginRequest;
import com.kfr.youkuang.pojo.RegisterRequest;
import com.kfr.youkuang.service.ServiceStatus;
import com.kfr.youkuang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

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
    public ServiceStatus register(final RegisterRequest registerRequest) {
        return userService.register(registerRequest);
    }

    @GetMapping("/login")
    public ServiceStatus login(final LoginRequest loginRequest,
                               final HttpServletRequest request) {
        return userService.login(loginRequest, request);
    }

    @GetMapping("/logout")
    public ServiceStatus logout(final HttpServletRequest request) {
        return userService.logout(request);
    }

    @GetMapping("/userInfo")
    public User userInfo(HttpServletRequest request) {
        return userService.selectUserByUserID(Util.getUserID(request));

    }


}
