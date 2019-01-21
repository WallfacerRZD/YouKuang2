package com.kfr.youkuang.dao;

import com.kfr.youkuang.entity.AccountItem;
import com.kfr.youkuang.mapper.AccountItemMapper;
import com.kfr.youkuang.pojo.InsertItemRequest;
import com.kfr.youkuang.pojo.ModifyItemRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public class AccountItemDao {
    private final AccountItemMapper accountItemMapper;

    @Autowired
    public AccountItemDao(AccountItemMapper accountItemMapper) {
        this.accountItemMapper = accountItemMapper;
    }


    //获取账本内容
    public List<AccountItem> selectAllItems(String tableName) {

        return accountItemMapper.selectAllItems(tableName);
    }

    //记一笔
    public void insertItem(InsertItemRequest insertItemRequest, String tableName) {
        accountItemMapper.insertItem(tableName,
                                     insertItemRequest.getInOut(),
                                     insertItemRequest.getMoney(),
                                     insertItemRequest.getType(),
                                     new Timestamp(insertItemRequest.getTime()),
                                     insertItemRequest.getTip());
    }

    //修改账本内容
    public void modifyItem(ModifyItemRequest modifyItemRequest, String tableName) {
        accountItemMapper.modifyItem(tableName,
                                     modifyItemRequest.getInOut(),
                                     modifyItemRequest.getMoney(),
                                     modifyItemRequest.getType(),
                                     new Timestamp(modifyItemRequest.getTime()),
                                     modifyItemRequest.getTip(),
                                     modifyItemRequest.getAccountItemID());
    }

    //删除内容
    public void deleteItem(int iNo, String tableName) {
        accountItemMapper.deleteItem(iNo, tableName);

    }


}
