package com.kfr.youkuang.service;

import com.kfr.youkuang.dao.AccountDao;
import com.kfr.youkuang.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WallfacerRZD
 * @date 2018/12/3 23:02
 */
@Service
public class AccountService {
    private final AccountDao accountDao;

    @Autowired
    public AccountService(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> getAllAccountsByUserID(final int userID) {
        // todo
        return new ArrayList<>();
    }

    public UserServiceStatus createAccount(final Account newAccount){
        final int newAccountID= newAccount.getAccountID();
        Account selectedAccount = accountDao.selectAccountByAccountID(newAccountID);
        if(selectedAccount == null){
            accountDao.insertOneAccount(newAccount);
            return  new UserServiceStatus(UserServiceStatus.SUCCEED, "创建账本成功"); //是否用UserServiceStatus？
        } else {
            return new UserServiceStatus(UserServiceStatus.FAILED, "账本名已存在");
        }
    }
}
