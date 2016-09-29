package com.feicuiedu.demo3;

/**
 * Created by chenyan on 2016/9/28.
 */
public class ThreadDemo extends Thread {

    public static void main(String[] args) {

        ThreadDemo td = new ThreadDemo();

        td.start();

        System.out.println("main方法");
    }

    @Override
    public void run() {
        int i = 0;
        while(i<5) {
            long begin =System.currentTimeMillis();
            System.out.println("线程run方法"+ i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long end =System.currentTimeMillis();
            System.out.println("当次循环耗时"+((end-begin)/1000)+"秒");

            i ++;
        }
    }
}
