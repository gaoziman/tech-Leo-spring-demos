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

        // 根据名字获取对象
        Person person1 = (Person) ctx.getBean("person");
        System.out.println("person1 = " + person1);
        // 根据类获取对象 通过class
        Person person2 = ctx.getBean("person", Person.class);
        System.out.println("person2 = " + person2);

        //根据类型获取对象
        Person person3 = ctx.getBean(Person.class);
        System.out.println("person3 = " + person3);


    }
}
