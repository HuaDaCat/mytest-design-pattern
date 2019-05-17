package com.example.demo.singleton;

/**
 * 内部静态类
 */
public class Singleton4 {
    private Singleton4() {
    }

    private static class SingletonInstance {
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
