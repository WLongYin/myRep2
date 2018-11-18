package com.example.mapper;

import com.example.bean.User;

import java.util.List;

/**
 * @ClassName UserDao
 * @Descrintion TODO
 * @Author wly
 * @Date 2018/11/13 21:06
 * @Version 1.0
 **/
public interface UserDao {
    List<User> findAll();
}
