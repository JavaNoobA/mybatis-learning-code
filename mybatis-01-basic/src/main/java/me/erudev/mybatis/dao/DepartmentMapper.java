package me.erudev.mybatis.dao;

import me.erudev.mybatis.entity.Department;

import java.util.List;

/**
 * @author pengfei.zhao
 * @date 2021/4/13 15:41
 */
public interface DepartmentMapper {

    List<Department> findAll();

    int insert(Department department);

    int update(Department department);

    int deleteById(String id);

    Department findById(String id);
}
