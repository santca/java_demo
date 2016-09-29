package com.feicuiedu.demo3;

/**
 * Created by chenyan on 2016/9/28.
 */
public class ExceptionDemo {

    public static void main(String[] args) throws MyException {

        int i = 5;
        int j = 1;


            int k = i / j;
            throw new MyException("对不起我错了");


       // System.out.println("haha");
    }
}
