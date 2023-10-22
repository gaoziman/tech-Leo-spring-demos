package org.javatop.basic.annotation.pojo;

import org.springframework.stereotype.Component;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-10-20 22:46
 * @description : User实体类
 */
@Component
public class User {
    private Integer id;

    private String name;

    private String email;


    public User() {
        System.out.println("User.User");
        System.out.println("User对象被创建了.....");
    }

    public User(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
