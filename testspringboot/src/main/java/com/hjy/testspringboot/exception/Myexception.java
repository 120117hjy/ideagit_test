package com.hjy.testspringboot.exception;

public class Myexception extends RuntimeException {

    public Myexception() {
        super("用户名出错");
    }
}
