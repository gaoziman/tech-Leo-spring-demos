package org.javatop.integration.mapper;

import org.javatop.integration.pojo.User;

import java.util.List;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-10-19 21:43
 * @description : UserMapper
 */
public interface UserMapper {
    /**
     * 通过用户ID查询用户
     * @param id 用户ID
     * @return 用户信息
     */
    User getUserById(int id);


    /**
     * 查询所有用户
     * @return 全部用户信息
     */
    List<User> getAllUsers();


    /**
     * 添加用户
     * @param user 用户
     */
    void insertUser(User user);


    /**
     * 更新用户
     * @param user 用户
     */
    void updateUser(User user);


    /**
     * 删除用户
     * @param id 用户id
     */
    void deleteUser(int id);
}
