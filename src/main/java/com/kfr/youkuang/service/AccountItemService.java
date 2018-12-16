package com.kfr.youkuang.service;

import com.kfr.youkuang.Util;
import com.kfr.youkuang.dao.AccountItemDao;
import com.kfr.youkuang.entity.AccountItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class AccountItemService {
    private final AccountItemDao accountItemDao;

    @Autowired
    public AccountItemService(AccountItemDao accountItemDao) {
        this.accountItemDao = accountItemDao;

    }

    //获取账本内容
    public List<AccountItem> getAllItems(int accountID, HttpServletRequest request) {
        String tableName = Util.getNewTableName(accountID, request);
        return accountItemDao.selectAllItems(tableName);

    }

    //记一笔
    public ServiceStatus insert(AccountItem accountItem, int accountID, HttpServletRequest request) {
        String tableName = Util.getNewTableName(accountID, request);
        try {
            accountItemDao.insertItem(accountItem, tableName);
            return new ServiceStatus(ServiceStatus.SUCCEED, "操作成功");
        } catch (Exception e) {
            return new ServiceStatus(ServiceStatus.FAILED, "操作失败");

        }

    }

    //修改账本内容
    public ServiceStatus modify(AccountItem accountItem, int accountID, HttpServletRequest request) {
        String tableName = Util.getNewTableName(accountID, request);
        try {
            accountItemDao.modifyItem(accountItem, tableName);
            return new ServiceStatus(ServiceStatus.SUCCEED, "操作成功");
        } catch (Exception e) {
            return new ServiceStatus(ServiceStatus.FAILED, "操作失败");
        }
    }

    //删除内容
    public ServiceStatus delete(AccountItem accountItem, int accountID, HttpServletRequest request) {
        String tableName = Util.getNewTableName(accountID, request);
        int iNo = accountItem.getiNo();
        try {
            accountItemDao.deleteItem(iNo, tableName);
            return new ServiceStatus(ServiceStatus.SUCCEED, "操作成功");
        } catch (Exception e) {
            return new ServiceStatus(ServiceStatus.FAILED, "操作失败");
        }
    }

}
