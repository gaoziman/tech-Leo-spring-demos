package org.javatop.integration.mapper;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.javatop.integration.pojo.User;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-10-25 16:47
 * @description :
 */
public class UserMapperTest {
    private static UserMapper mapper;

    @BeforeClass
    public static void setUpMybatisDatabase() {
        SqlSessionFactory builder = new SqlSessionFactoryBuilder().build(UserMapperTest.class.getClassLoader().getResourceAsStream("mybatisTestConfiguration/UserMapperTestConfiguration.xml"));
        //you can use builder.openSession(false) to not commit to database
        mapper = builder.getConfiguration().getMapper(UserMapper.class, builder.openSession(true));

    }

    @Test
    public void testGetAllUsers() {
        List<User> allUsers = mapper.getAllUsers();
        allUsers.stream().forEach(System.out::println);
    }
}
