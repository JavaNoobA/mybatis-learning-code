package me.erudev.mybatis;

import me.erudev.mybatis.dao.DepartmentDao;
import me.erudev.mybatis.dao.impl.DepartmentDaoImpl;
import me.erudev.mybatis.entity.Department;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author pengfei.zhao
 * @date 2021/4/13 15:31
 */
public class MybatisApplication2 {
    public static void main(String[] args) throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        DepartmentDao departmentDao = new DepartmentDaoImpl(factory);
        List<Department> departments = departmentDao.findAll();
        departments.forEach(System.out::println);

    }
}
