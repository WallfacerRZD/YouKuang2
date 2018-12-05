package com.kfr.youkuang.service;

import com.kfr.youkuang.dao.UserDao;
import com.kfr.youkuang.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * @author WallfacerRZD
 * @date 2018/11/19 22:29
 */
@Service
public class UserService {
    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User selectUserByUserName(final String userName) {
        return this.userDao.selectUserByUserName(userName);
    }

    /**
     * 验证等业务逻辑写在Service层
     *
     * @param newUser
     * @return 注册成功返回true, 注册失败返回false
     */
    public UserServiceStatus register(final User newUser) {
        final String newUserName = newUser.getUserName();
        User selectedUser = userDao.selectUserByUserName(newUserName);
        if (selectedUser == null) {
            userDao.insertOneUser(newUser);//新建用户
            return new UserServiceStatus(UserServiceStatus.SUCCEED, "注册成功");
        } else {
            return new UserServiceStatus(UserServiceStatus.FAILED, "账号已被注册");
        }

    }

    //登录
    public UserServiceStatus login(final User loginUser, final HttpServletRequest request) {
        final String loginUserName = loginUser.getUserName();
        User selectedUser = userDao.selectUserByUserName(loginUserName);
        if (selectedUser.getPassword().equals(loginUser.getPassword())) {
            /*
                将登录成功的userID存到session中
                该用户后续的请求调用session.getAttribute("userID")将返回userID
             */
            request.getSession().setAttribute("userID", selectedUser.getUserID());
            return new UserServiceStatus(UserServiceStatus.SUCCEED, "登录成功");
        } else {
            // 登录失败
            return new UserServiceStatus(UserServiceStatus.FAILED, "登录失败");
        }


    }


}
