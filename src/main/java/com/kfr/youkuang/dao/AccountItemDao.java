package com.kfr.youkuang.dao;
import com.kfr.youkuang.entity.AccountItem;
import com.kfr.youkuang.mapper.AccountItemMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Max;
import java.util.List;

@Repository
public class AccountItemDao {
    private final AccountItemMapper accountItemMapper;

    @Autowired
    public AccountItemDao(AccountItemMapper accountItemMapper){this.accountItemMapper =accountItemMapper;}


    //获取账本内容
    public List<AccountItem> selectAllItems(){


    }

    //记一笔
    public void insertItem(AccountItem accountItem){

    }

    //修改账本内容
    public void modifyItem(AccountItem accountItem){

    }

    //删除内容
    public void deleteItem(){

    }


}
