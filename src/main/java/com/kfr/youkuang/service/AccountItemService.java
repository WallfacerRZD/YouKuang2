package com.kfr.youkuang.service;

import com.kfr.youkuang.dao.AccountItemDao;
import com.kfr.youkuang.entity.AccountItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountItemService {
    private final AccountItemDao accountItemDao;

    @Autowired
    public AccountItemService(AccountItemDao accountItemDao){
        this.accountItemDao = accountItemDao;
    }

    //获取账本内容
    public List<AccountItem> getAllItems(){
        return accountItemDao.selectAllItems();

    }
    //记一笔
    public void insert(AccountItem accountItem){

    }

    //修改账本内容
    public void modify(AccountItem accountItem){

    }

    //删除内容
    public void delete(){

    }

}
