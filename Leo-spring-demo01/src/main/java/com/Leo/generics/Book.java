package com.Leo.generics;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/8/23 22:22
 * @description : Book
 */
public class Book {
    private int Id; // 图书编号
    private String Name; // 图书名称
    private int Price; // 图书价格

    public Book(int id, String name, int price) { // 构造方法
        this.Id = id;
        this.Name = name;
        this.Price = price;
    }

    public String toString() { // 重写 toString()方法
        return this.Id + ", " + this.Name + "，" + this.Price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
