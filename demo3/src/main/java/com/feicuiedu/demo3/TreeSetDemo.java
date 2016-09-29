package com.feicuiedu.demo3;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by chenyan on 2016/9/28.
 */
public class TreeSetDemo {

    public static void main(String[] args) {

        User liubei = new User(1,"liubei", 40);
        User guanyu = new User(2,"guyuan", 30);
        User zhangfei = new User(3,"zhangfei", 29);
        User zhugeliang = new User(4,"zhugeliang", 25);
        User zhaoyun = new User(1,"zhaoyun", 16);

        TreeSet<User> userSet = new TreeSet<User>();

        userSet.add(zhaoyun);
        userSet.add(liubei);
        userSet.add(guanyu);
        userSet.add(zhugeliang);
        userSet.add(zhangfei);

        Iterator<User> it = userSet.iterator();
        while(it.hasNext()) {
            User u = it.next();
            System.out.println(u);
        }

    }
}