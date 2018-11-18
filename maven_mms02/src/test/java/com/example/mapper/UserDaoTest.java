package com.example.mapper;

import com.example.bean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class UserDaoTest {

    private UserDao userDao;

    @Before
    public void init() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        userDao = sqlSession.getMapper(UserDao.class);
//        ApplicationContext ac = new ClassPathXmlApplicationContext("SqlMapConfig.xml");
//        userDao = ac.getBean("userDao", UserDao.class);
    }

    @Test
    public void findAll() {
        userDao.findAll();
    }
}