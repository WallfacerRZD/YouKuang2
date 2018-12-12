package com.kfr.youkuang.service;

import com.kfr.youkuang.Util;
import com.kfr.youkuang.dao.AccountDao;
import com.kfr.youkuang.dao.AccountItemDao;
import com.kfr.youkuang.entity.Account;
import com.kfr.youkuang.entity.AccountItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class AccountItemService {
    private final AccountItemDao accountItemDao;
    private final AccountDao accountDao;

    @Autowired
    public AccountItemService(AccountItemDao accountItemDao, AccountDao accountDao){
        this.accountItemDao = accountItemDao;
        this.accountDao = accountDao;

    }

    //获取账本内容
    public List<AccountItem> getAllItems(int accountID, HttpServletRequest request){
        String tableName = Util.getNewTableName(accountID, request);
        return accountItemDao.selectAllItems(tableName);

    }
    //记一笔
    public void insert(AccountItem accountItem, int accountID, HttpServletRequest request){
        String tableName = Util.getNewTableName(accountID, request);
        accountItemDao.insertItem(accountItem, tableName);

    }

    //修改账本内容
    public void modify(AccountItem accountItem){

    }

    //删除内容
    public void delete(){

    }

}
