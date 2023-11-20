package org.javatop;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-11-20 21:58
 * @description :
 */
public class IocTest {


    /**
     *  用于测试: IoC测试
     */
    @Test
    public void test01() {

        // 1.创建Spring容器 去加载beans.xml文件
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        // 2.获取bean对象
        Person person = (Person) ctx.getBean("person");
        System.out.println("person = " + person);

    }
}
