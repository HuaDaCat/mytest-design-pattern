package com.example.demo.staticfactory;

public class Plane implements WorkShop {
    @Override
    public void work() {
        System.out.println("制造了飞机");
    }
}
