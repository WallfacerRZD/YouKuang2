package com.kfr.youkuang.action;

import com.kfr.youkuang.entity.AccountItem;
import com.kfr.youkuang.pojo.InsertItemRequest;
import com.kfr.youkuang.pojo.ModifyItemRequest;
import com.kfr.youkuang.service.AccountItemService;
import com.kfr.youkuang.service.ServiceStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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
    public ServiceStatus insert(@PathVariable("accountID") int accountID,
                                final InsertItemRequest insertItemRequest,
                                HttpServletRequest request) {
        return accountItemService.insert(insertItemRequest, accountID, request);
    }

    //修改账目
    @PatchMapping("/account/{accountID}")
    public ServiceStatus moodify(@PathVariable("accountID") int accountID,
                                 ModifyItemRequest modifyItemRequest,
                                 HttpServletRequest request) {
        return accountItemService.modify(modifyItemRequest, accountID, request);
    }

    //删除账目
    @DeleteMapping("/account/{accountID}")
    public ServiceStatus delete(@PathVariable("accountID") int accountID,
                                int accountItemID,
                                HttpServletRequest request) {
        return accountItemService.delete(accountItemID, accountID, request);
    }


}
