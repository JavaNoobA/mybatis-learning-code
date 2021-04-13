package me.erudev.mybatis.entity;

import java.util.Date;

/**
 * @author pengfei.zhao
 * @date 2021/4/13 16:04
 */
public class User {

    private String id;

    private String name;

    private Integer age;

    private Date birthday;

    private Department department;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", department=" + department +
                '}';
    }
}
