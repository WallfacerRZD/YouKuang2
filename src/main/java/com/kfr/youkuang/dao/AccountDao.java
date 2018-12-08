package com.kfr.youkuang.dao;

import com.kfr.youkuang.entity.Account;
import com.kfr.youkuang.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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

    public void insertOneAccount(final Account account){
        final  int AccountID = account.getAccountID();
        final  int UserID = account.getUserID();
        String tablename = "delUserID" + "_" + "delAccountID";
        accountMapper.insertOneAccount(AccountID, UserID);
        accountMapper.createNewAccounttable(tablename);
    }

    public boolean deleteAccount(int delAccountID, int delUserID) {
        String tablename = "delUserID" + "_" + "delAccountID";
        accountMapper.dropAccounttable(tablename);
        return  accountMapper.deleteAccount(delAccountID, delUserID);
    }

    public List<Account> getAllAccountsByUserID(final int userID) {
        List accountIDs = accountMapper.getaccountsIDbyUserID(userID);
        List<Account> allAccounts = null;
        for(int i = 0; i <accountIDs.size() ; i++){
            Account a = accountMapper.selectAccountByAccountID((Integer) accountIDs.get(i));
            allAccounts.add(a);
        }
        return accountIDs;
    }
}
