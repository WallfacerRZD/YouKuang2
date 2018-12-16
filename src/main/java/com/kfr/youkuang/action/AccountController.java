package com.kfr.youkuang.action;

import com.kfr.youkuang.entity.Account;
import com.kfr.youkuang.service.AccountService;
import com.kfr.youkuang.service.ServiceStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author WallfacerRZD
 * @date 2018/12/3 22:47
 */
@RestController
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(final AccountService accountService) {
        this.accountService = accountService;
    }

    /**
     * 使用HTTP GET(HTTP还有POST, PUT, DELETE, PATCH等方法)方法请求/accounts的请求由该方法处理
     *
     * @param request
     * @return json格式的账本数组
     */
    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public List<Account> getAllAccounts(final HttpServletRequest request) {
        final HttpSession session = request.getSession();
        /*
            已经登录用户的userID在登录时已经存到了session中
            未登录的请求会被拦截器拦截(现在不管, 最后再配置), 不会进入该方法
            所以session.getAttribute("userID")一定会返回该登录用户的userID
         */
        final String userID = (String) session.getAttribute("userID");
        return accountService.getAllAccountsByUserID(Integer.valueOf(userID));
    }

    @PostMapping("/account}")  //存疑
    public ServiceStatus createAccount(final String AccountName, final HttpServletRequest request) {
        return accountService.createAccount(new Account(AccountName, (int) request.getSession().getAttribute("userID")));
    }

  /*  @DeleteMapping("/account/{accountID}")
    public ServiceStatus deleteAccount(final Account account) {
        return accountService.deleteAccount(account);

    }*/
}
