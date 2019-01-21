package com.kfr.youkuang.service;

import com.kfr.youkuang.Util;
import com.kfr.youkuang.dao.AccountDao;
import com.kfr.youkuang.entity.Account;
import com.kfr.youkuang.pojo.CreateAccountRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
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

    public ServiceStatus createAccount(final CreateAccountRequest createAccountRequest,
                                       final HttpServletRequest request) {
        final String newAccountName = createAccountRequest.getAccountName();
        final int userID = Util.getUserID(request);
        Account selectedAccount = accountDao.selectAccountByAccountName(newAccountName, userID);
        if (selectedAccount == null) {
            accountDao.insertOneAccount(createAccountRequest, userID);
            return new ServiceStatus(ServiceStatus.SUCCEED, "创建账本成功");
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
