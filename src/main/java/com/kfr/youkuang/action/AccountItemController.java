package com.kfr.youkuang.action;

import com.kfr.youkuang.entity.AccountItem;
import com.kfr.youkuang.service.AccountItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


@RestController
public class AccountItemController {
    private AccountItemService accountItemService;

    @Autowired
    public AccountItemController(AccountItemService accountItemService) {
        this.accountItemService = accountItemService;
    }

    //	查询账本内所有账目
    @GetMapping("/account/{accountID}")
    public List<AccountItem> getAllItems(@PathVariable(name = "accountID") int accountID,
                                         HttpServletRequest request) {
        return accountItemService.getAllItems(accountID, request);
    }

    //记一笔
    @PutMapping("/account/{accountID}")
    public void insert(@PathVariable("accountID") int accountID,
                       String inOut,
                       BigDecimal money,
                       String time,
                       int type,
                       String tip,
                       HttpServletRequest request) {
        long transtime = Long.parseLong(time);
        AccountItem accountItem = new AccountItem(inOut,money,new Timestamp(transtime),type,tip);

        accountItemService.insert(accountItem, accountID, request);
    }

    //修改账目
    @PatchMapping("/account/{accountID}")
    public void moodify(@PathVariable("accountID") int accountID,
                        int accountItemID,
                        String inOut,
                        BigDecimal money,
                        String time,
                        int type,
                        String tip,
                        HttpServletRequest request) {
        long transtime = Long.parseLong(time);
        AccountItem accountItem = new AccountItem(accountItemID,inOut,money,new Timestamp(transtime),type,tip);
        accountItemService.modify(accountItem, accountID, request);
    }

    //删除账目
    @DeleteMapping("/account/{accountID}")
    public void delete(@RequestBody AccountItem accountItem,
                       @PathVariable("accountID") int accountID,
                       HttpServletRequest request) {
        accountItemService.delete(accountItem, accountID, request);
    }


}
