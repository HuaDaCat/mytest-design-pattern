package com.example.demo.staticfactory;

public class Car implements WorkShop {
    @Override
    public void work() {
        System.out.println("制造了汽车");
    }
}
