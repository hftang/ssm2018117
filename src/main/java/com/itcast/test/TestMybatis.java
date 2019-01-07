package com.itcast.test;

import com.itcast.dao.AccountDao;
import com.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author hftang
 * @date 2019-01-07 10:40
 * @desc
 */
public class TestMybatis {

    @Test
    public void test01() throws Exception {
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        AccountDao dao = session.getMapper(AccountDao.class);
        List<Account> all = dao.findAll();
        for (int i = 0; i < all.size(); i++) {
            System.out.println(all.get(i));
        }
        session.close();
        in.close();


    }

    //    保存的测试
    @Test
    public void testSave() throws Exception {
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        AccountDao dao = session.getMapper(AccountDao.class);
        Account account = new Account();
        account.setName("kkkkk");
        account.setMoney(800d);
        dao.saveAccount(account);

        session.commit();
        session.close();
        in.close();


    }
}
