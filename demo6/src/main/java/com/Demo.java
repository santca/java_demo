package com;

/**
 * Created by chenyan on 2016/10/9.
 */
public class Demo {

    private static Demo demo;

    private Demo() {

    }

    public static Demo getInstance() {

        //System.out.println("demo="+demo);
        if (demo == null) {
            demo = new Demo();
        }

        return demo;
    }

}
