package com.kfr.youkuang.dao;
import com.kfr.youkuang.entity.AccountItem;
import com.kfr.youkuang.mapper.AccountItemMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

@Repository
public class AccountItemDao {
    private final AccountItemMapper accountItemMapper;

    @Autowired
    public AccountItemDao(AccountItemMapper accountItemMapper){this.accountItemMapper =accountItemMapper;}


    //获取账本内容
    public List<AccountItem> selectAllItems(String tableName){

        return accountItemMapper.selectAllItems(tableName);
    }

    //记一笔
    public void insertItem(AccountItem accountItem, String tableName){
        final String inOut = accountItem.getInOut();
        final BigDecimal money = accountItem.getMoney();
        final int type = accountItem.getTypeID();
        final Date time = accountItem.getTime();
        final String tip = accountItem.getTip();
        accountItemMapper.insertItem(tableName,inOut,money,type,time,tip);

    }

    //修改账本内容
    public void modifyItem(AccountItem accountItem,String tableName){
        final int iNo = accountItem.getiNo();
        final String inOut = accountItem.getInOut();
        final BigDecimal money = accountItem.getMoney();
        final int type = accountItem.getTypeID();
        final Date time = accountItem.getTime();
        final String tip = accountItem.getTip();
        accountItemMapper.modifyItem(tableName,inOut,money,type,time,tip,iNo);


    }

    //删除内容
    public void deleteItem(int iNo,String tableName){
        accountItemMapper.deleteItem(iNo,tableName);

    }


}
