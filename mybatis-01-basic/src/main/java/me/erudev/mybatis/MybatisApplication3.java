package me.erudev.mybatis;

import me.erudev.mybatis.dao.DepartmentMapper;
import me.erudev.mybatis.entity.Department;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author pengfei.zhao
 * @date 2021/4/13 15:42
 */
public class MybatisApplication3 {
    public static void main(String[] args) throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession();
        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
        List<Department> departments = mapper.findAll();
        departments.forEach(System.out::println);
        Department department = mapper.findById("18ec781fbefd727923b0d35740b177ab");
        System.out.println(department);
    }
}
