package com.itcast.controller;

import com.itcast.domain.Account;
import com.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author hftang
 * @date 2019-01-05 19:08
 * @desc
 */
@Controller
@RequestMapping(path = "/account")
public class AccountController {

    //依赖注入
    @Autowired
    private AccountService accountService;

    @RequestMapping(path = "/findAll")
    public String findAll(Model model) {
        System.out.println("findall----controller");
        List<Account> list = accountService.findAll();
        model.addAttribute("list", list);
        return "list";
    }

    @RequestMapping(path = "/saveAccount")
    public void saveAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws Exception {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath() + "/account/findAll");
        return;
    }


}
