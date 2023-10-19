package com.Leo.demo01;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/8/23 21:11
 * @description : 泛型 的实现
 */
public class Demo01 {

    private static int add(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    private static float add(float a, float b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    private static double add(double a, double b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }

}
