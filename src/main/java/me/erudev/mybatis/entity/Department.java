package me.erudev.mybatis.entity;

/**
 * @author pengfei.zhao
 * @date 2021/4/13 14:59
 */
public class Department {
    private String id;

    private String name;

    private String tel;

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
