package org.javatop.basic.annotation.config;

import org.javatop.basic.annotation.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-10-21 23:33
 * @description : 配置类
 */
@Configuration
public class AppConfig {


    @Bean("u")
    @Scope("singleton")
    public User user() {
        return new User();
    }
}
