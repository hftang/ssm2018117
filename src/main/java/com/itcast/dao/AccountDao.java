package com.itcast.dao;

import com.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author hftang
 * @date 2019-01-05 19:02
 * @desc
 */

@Repository
public interface AccountDao {

    @Select("select * from account")
    public List<Account> findAll();

    @Insert("insert into account (name,money) values (#{name},#{money})")
    public void saveAccount(Account account);
}