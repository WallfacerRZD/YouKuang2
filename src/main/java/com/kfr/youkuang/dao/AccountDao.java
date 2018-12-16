package com.kfr.youkuang.dao;

import com.kfr.youkuang.entity.Account;
import com.kfr.youkuang.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.sql.Date;
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
        final Date lastModifiedTime = account.getLastModifiedTime();
        final Date createTime = account.getCreatedTime();
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
        List accountIDs = accountMapper.getaccountsIDbyUserID(userID);
        List<Account> allAccounts = null;
        for (int i = 0; i < accountIDs.size(); i++) {
            Account a = accountMapper.selectAccountByAccountID((Integer) accountIDs.get(i));
            allAccounts.add(a);
        }
        return accountIDs;
    }
}
