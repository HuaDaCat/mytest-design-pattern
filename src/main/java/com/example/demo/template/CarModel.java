package com.example.demo.template;

public abstract class CarModel {
    //启动
    public abstract void start();

    //停止
    public abstract void stop();

    final public void excet() {
        this.start();
        this.stop();
    }
}
