package com.kfr.youkuang.service;

import com.kfr.youkuang.dao.UserDao;
import com.kfr.youkuang.entity.Account;
import com.kfr.youkuang.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
     * @param newUser
     * @return 注册成功返回true, 注册失败返回false
     */
    public UserServiceStatus register(final User newUser) {
        final String newUserName = newUser.getUserName();
        User selectedUser = userDao.selectUserByUserName(newUserName);
        if (selectedUser == null) {
            userDao.insertOneUser(newUser);
            return new UserServiceStatus(UserServiceStatus.SUCCEED, "注册成功");
        } else {
            return new UserServiceStatus(UserServiceStatus.FAILED, "账号已被注册");
        }
    }

    public UserServiceStatus createAccount(final Account newAccount){
        final String newAccountName= newAccount.getAccountName();
        Account selectedAccount = userDao.selectAccountByAccountName(newAccountName);
        if(selectedAccount == null){
            userDao.insertOneAccount(newAccount);
            return  new UserServiceStatus(UserServiceStatus.SUCCEED, "创建账本成功");
        } else {
            return new UserServiceStatus(UserServiceStatus.FAILED, "账本名已存在");
        }
    }
}
