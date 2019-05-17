package com.example.demo.template;

public class BenzCar extends CarModel {
    @Override
    public void start() {
        System.out.println("奔驰启动");
    }

    @Override
    public void stop() {
        System.out.println("奔驰停车");
    }
}
