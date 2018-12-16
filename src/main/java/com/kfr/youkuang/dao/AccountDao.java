package com.kfr.youkuang.dao;

import com.kfr.youkuang.entity.Account;
import com.kfr.youkuang.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class AccountDao {

    private final AccountMapper accountMapper;

    @Autowired
    public AccountDao(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    public Account selectAccountByAccountName(final String AccountName) {
        return accountMapper.selectAccountByAccountName(AccountName);
    }

    public Account selectAccountByAccountID(final int AccountID) {
        return accountMapper.selectAccountByAccountID(AccountID);
    }

    public void insertOneAccount(final Account account) {
        final String accountName = account.getAccountName();
        final int userID = account.getUserID();
        final BigDecimal sum = account.getSum();
        final Timestamp lastModifiedTime = account.getLastModifiedTime();
        final Timestamp createTime = account.getCreatedTime();
        accountMapper.insertOneAccount(accountName, userID, sum, lastModifiedTime, createTime);
        int accountID = selectAccountByAccountName(accountName).getAccountID();
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
