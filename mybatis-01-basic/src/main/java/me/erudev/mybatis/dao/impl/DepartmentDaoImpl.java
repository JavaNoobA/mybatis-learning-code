package me.erudev.mybatis.dao.impl;

import me.erudev.mybatis.dao.DepartmentDao;
import me.erudev.mybatis.entity.Department;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author pengfei.zhao
 * @date 2021/4/13 15:24
 */
public class DepartmentDaoImpl implements DepartmentDao {

    private SqlSessionFactory sqlSessionFactory;

    public DepartmentDaoImpl(SqlSessionFactory factory) {
        sqlSessionFactory = factory;
    }

    @Override
    public List<Department> findAll() {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            return sqlSession.selectList("departmentMapper.findAll");
        }
    }

    @Override
    public Department findById() {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            return sqlSession.selectOne("departmentMapper.findById");
        }
    }
}
