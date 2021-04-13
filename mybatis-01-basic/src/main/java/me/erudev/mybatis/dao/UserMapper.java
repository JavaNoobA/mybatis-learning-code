package me.erudev.mybatis.dao;

import me.erudev.mybatis.entity.User;

import java.util.List;

/**
 * @author pengfei.zhao
 * @date 2021/4/13 16:05
 */
public interface UserMapper {

    List<User> findAll();
}
