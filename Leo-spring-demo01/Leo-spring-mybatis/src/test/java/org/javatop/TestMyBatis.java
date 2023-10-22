package org.javatop;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.javatop.integration.mapper.UserMapper;
import org.javatop.integration.pojo.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-10-19 21:58
 * @description :
 */
public class TestMyBatis {

    /**
    * 用于测试: 查询所有用户
    */
    @Test
    public void test01() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = userMapper.getAllUsers();

        for (User user : userList) {
            System.out.println("user = " + user);
        }
    }
}
