package com.kfr.youkuang.action;

import com.kfr.youkuang.entity.AccountItem;
import com.kfr.youkuang.service.AccountItemService;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
    public class AccountItemController {
        private AccountItemService accountItemService;

        @Autowired
        public AccountItemController(AccountItemService accountItemService){
            this.accountItemService =accountItemService;
        }

        //	查询账本内所有账目
        @GetMapping("/account/{accountID}")
        public List<AccountItem> getAllItems(int accountID, HttpServletRequest request){
            return accountItemService.getAllItems(accountID,request);
        }

        //记一笔





}
