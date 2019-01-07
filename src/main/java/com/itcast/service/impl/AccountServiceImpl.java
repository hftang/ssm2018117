package com.itcast.service.impl;

import com.itcast.dao.AccountDao;
import com.itcast.domain.Account;
import com.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hftang
 * @date 2019-01-05 19:05
 * @desc
 */

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    //    注入 dao
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("service find all....");

        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("service...save");
        accountDao.saveAccount(account);
    }
}
