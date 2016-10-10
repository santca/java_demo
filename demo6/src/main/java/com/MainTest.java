package com;

/**
 * Created by chenyan on 2016/10/9.
 */
public class MainTest {

    public static void main(String[] args) {
        Demo demo = Demo.getInstance();
        Demo demo1 = Demo.getInstance();
        Demo demo2 = Demo.getInstance();
        Demo demo3 = Demo.getInstance();

        System.out.println(demo);
        System.out.println(demo1);
        System.out.println(demo2);
        System.out.println(demo3);

    }
}
