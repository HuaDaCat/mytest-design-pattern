package com.example.demo.singleton;

/**
 * 懒汉式
 */
public class Singleton2 {
    //    private static Singleton2 instance;
//
//    private Singleton2() {
//    }
//
//    public static Singleton2 getInstance() {
//        if (instance == null) {
//            instance = new Singleton2();
//        }
//        return instance;
//    }
//


//    private static Singleton2 instance;
//
//    private Singleton2() {}
//
//    public static Singleton2 getInstance() {
//        if (instance == null) {
//            synchronized (Singleton.class) {
//                instance = new Singleton2();
//            }
//        }
//        return instance;
//    }


    private static Singleton2 instance;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
