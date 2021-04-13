package me.erudev.mybatis.dao;

import me.erudev.mybatis.entity.Department;

import java.util.List;

/**
 * @author pengfei.zhao
 * @date 2021/4/13 15:24
 */
public interface DepartmentDao {
    List<Department> findAll();

    Department findById();
}
