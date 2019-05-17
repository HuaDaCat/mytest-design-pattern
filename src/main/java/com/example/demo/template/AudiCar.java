package com.example.demo.template;

public class AudiCar extends CarModel {
    @Override
    public void start() {
        System.out.println("奥迪启动");
    }

    @Override
    public void stop() {
        System.out.println("奥迪停车");
    }
}
