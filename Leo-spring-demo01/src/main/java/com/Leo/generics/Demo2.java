package com.Leo.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/8/23 22:22
 * @description :
 */
public class Demo2 {
    public static void main(String[] args) {
        // 创建3个Book对象
        Book book1 = new Book(1, "灰姑娘", 8);
        Book book2 = new Book(2, "大猩猩", 12);
        Book book3 = new Book(3, "童话故事", 22);
        // 定义泛型 Map 集合
        Map<Integer, Book> books = new HashMap<>();
        // 将第一个 Book 对象存储到 Map 中
        books.put(1001, book1);
        // 将第二个 Book 对象存储到 Map 中
        books.put(1002, book2);
        // 将第三个 Book 对象存储到 Map 中
        books.put(1003, book3);
        System.out.println("泛型Map存储的图书信息如下:");
        for (Integer id : books.keySet()) {
            // 遍历键
            System.out.print(id + "——");
            // 不需要类型转换
            System.out.println(books.get(id).getName());
        }
        // 定义泛型的 List 集合
        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        System.out.println("泛型List存储的图书信息如下:");
        for (int i = 0; i < bookList.size(); i++) {
            // 这里不需要类型转换
            System.out.println(bookList.get(i));
        }
    }

}
