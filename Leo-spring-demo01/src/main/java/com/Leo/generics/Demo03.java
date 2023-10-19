package com.Leo.generics;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/8/23 22:33
 * @description :
 */
public class Demo03 {
//    public static void main(String[] args) {
//        Student<String, Integer, Character> stu = new Student<>("Leo", 22, '男');
//        String name = stu.getName();
//        Integer age = stu.getAge();
//        Character sex = stu.getSex();
//        System.out.println("学生信息如下：");
//        System.out.println("学生姓名：" + name + "，年龄：" + age + "，性别：" + sex);
//    }


    public static <T> void List(T book) { // 定义泛型方法
        if (book != null) {
            System.out.println(book);
        }
    }
    public static void main(String[] args) {
        Book stu = new Book(1, "Leo学Java", 28);
        List(stu);
        // 调用泛型方法
    }
}
