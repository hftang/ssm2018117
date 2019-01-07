package com.itcast.service;

import com.itcast.domain.Account;

import java.util.List;

/**
 * @author hftang
 * @date 2019-01-05 19:04
 * @desc
 */
public interface AccountService {


    public List<Account> findAll();

    public void saveAccount(Account account);
}
