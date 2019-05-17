package com.example.demo.staticfactory;

public class Ship implements WorkShop {
    @Override
    public void work() {
        System.out.println("制造了船");
    }
}
