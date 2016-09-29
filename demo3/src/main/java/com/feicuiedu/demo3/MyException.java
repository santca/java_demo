package com.feicuiedu.demo3;

/**
 * Created by chenyan on 2016/9/28.
 */
public class MyException extends  Exception {

    private String message;

    public MyException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
