package com.kfr.youkuang.service;

import com.kfr.youkuang.dao.AccountDao;
import com.kfr.youkuang.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return accountDao.getAllAccountsByUserID(userID);
    }

    public ServiceStatus createAccount(final Account newAccount) {
        final String newAccountName = newAccount.getAccountName();
        Account selectedAccount = accountDao.selectAccountByAccountName(newAccountName);
        if (selectedAccount == null) {
            System.out.println(newAccount);
            accountDao.insertOneAccount(newAccount);
            return new ServiceStatus(ServiceStatus.SUCCEED, "创建账本成功"); //是否用UserServiceStatus？
        } else {
            return new ServiceStatus(ServiceStatus.FAILED, "账本名已存在");
        }
    }

    public ServiceStatus deleteAccount(final Account account) {
        final int delAccountID = account.getAccountID();
        final int delUserID = account.getUserID();
        if (accountDao.deleteAccount(delAccountID, delUserID)) {
            return new ServiceStatus(ServiceStatus.SUCCEED, "删除账本成功");
        } else {
            return new ServiceStatus(ServiceStatus.FAILED, "删除账本失败");
        }
    }
}
