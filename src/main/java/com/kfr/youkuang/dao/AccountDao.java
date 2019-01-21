package com.kfr.youkuang.dao;

import com.kfr.youkuang.entity.Account;
import com.kfr.youkuang.mapper.AccountMapper;
import com.kfr.youkuang.pojo.CreateAccountRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDao {

    private final AccountMapper accountMapper;

    @Autowired
    public AccountDao(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    public Account selectAccountByAccountName(final String accountName, final int userID) {
        return accountMapper.selectAccountByAccountName(accountName, userID);
    }

    public Account selectAccountByAccountID(final int accountID) {
        return accountMapper.selectAccountByAccountID(accountID);
    }

    public void insertOneAccount(final CreateAccountRequest createAccountRequest, final int userID) {
        final String accountName = createAccountRequest.getAccountName();
        accountMapper.insertOneAccount(createAccountRequest.getAccountName(),
                                       userID,
                                       createAccountRequest.getSum(),
                                       createAccountRequest.getLastModifiedTime(),
                                       createAccountRequest.getCreatedTime());
        int accountID = selectAccountByAccountName(accountName, userID).getAccountID();
        accountMapper.createNewAccountTable("UAT" + userID + "_" + accountID);
    }

    public boolean deleteAccount(int delAccountID, int delUserID) {
        String tableName = delUserID + "_" + delAccountID;
        accountMapper.dropAccountTable(tableName);
        return accountMapper.deleteAccount(delAccountID, delUserID);
    }

    public List<Account> getAllAccountsByUserID(final int userID) {
        return accountMapper.getaccountsIDbyUserID(userID);
    }
}
