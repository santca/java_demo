package com.feicuiedu.demo3;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by chenyan on 2016/9/28.
 */
public class Test1 {

    public static void main(String[] args) {

        User liubei = new User(1,"liubei", 40);
        User guanyu = new User(2,"guyuan", 30);
        User zhangfei = new User(3,"zhangfei", 29);
        User zhugeliang = new User(4,"zhugeliang", 25);
        User zhaoyun = new User(1,"zhaoyun", 16);

        HashSet<User> userSet = new HashSet<User>();

        userSet.add(zhaoyun);
        userSet.add(liubei);
        userSet.add(guanyu);
        userSet.add(zhugeliang);
        userSet.add(zhangfei);

        System.out.println(liubei.equals("adfasdf"));
        System.out.println(liubei==guanyu);


        Iterator<User> it = userSet.iterator();
        while(it.hasNext()) {
            User u = it.next();
            System.out.println(u);
        }
    }
}
