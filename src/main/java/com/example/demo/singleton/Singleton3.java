package com.example.demo.singleton;

/**
 * 双重检查
 */
public class Singleton3 {
    private static Singleton3 instance;

    public Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                    System.out.println("创建");
                }
            }
        }
        return instance;
    }
    public void show(){
        System.out.println("show");
    }
}
