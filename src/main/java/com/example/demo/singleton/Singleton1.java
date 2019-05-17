package com.example.demo.singleton;

/**
 * 饿汉式
 */
public class Singleton1 {
    //    private final static Singleton1 INSTANCE = new Singleton1();
    //
    //    private Singleton1() {
    //    }
    //
    //    public static Singleton1 getInstance() {
    //        return INSTANCE;
    //    }
    private static Singleton1 instance;

    static {
        instance = new Singleton1();
    }

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return instance;
    }
}
