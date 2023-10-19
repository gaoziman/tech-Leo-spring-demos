package com.Leo.generics;

public class Student<N, A, S> {
    /** 姓名 */
    private N name;

    /** 年龄 */
    private A age;


    /**  性别 */
    private S sex;
    // 创建类的构造函数

    public Student(N name, A age, S sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    /** 下面是上面3个属性的setter/getter方法*/
    public N getName() {
        return name;
    }

    public void setName(N name) {
        this.name = name;
    }

    public A getAge() {
        return age;
    }

    public void setAge(A age) {
        this.age = age;
    }

    public S getSex() {
        return sex;
    }

    public void setSex(S sex) {
        this.sex = sex;
    }
}