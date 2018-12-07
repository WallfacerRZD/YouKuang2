package com.kfr.youkuang.action;

import com.kfr.youkuang.entity.AccountItem;
import com.kfr.youkuang.service.AccountItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
    public class AccountItemController {
        private AccountItemService accountItemService;

        @Autowired
        public AccountItemController(AccountItemService accountItemService){
            this.accountItemService =accountItemService;
        }

        //	查询账本内所有账目
        @GetMapping("/account")
        public List<AccountItem> getAllItems(){
            return accountItemService.getAllItems();
        }


}
