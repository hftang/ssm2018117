package com.itcast.test;

import com.itcast.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hftang
 * @date 2019-01-05 19:21
 * @desc
 */
public class TestSpring {


    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        accountService.findAll();

    }
}
