package com.feicuiedu.demo3;

/**
 * Created by chenyan on 2016/9/28.
 */
public class ThreadDemo1 implements Runnable {

    public static void main(String[] args) {

        ThreadDemo1 td = new ThreadDemo1();

        new Thread(td).start();

        System.out.println("main方法");
    }


    @Override
    public void run() {
        int i = 0;
        while(i<20) {
            System.out.println("线程run方法"+ i);
            i ++;
        }
    }
}
