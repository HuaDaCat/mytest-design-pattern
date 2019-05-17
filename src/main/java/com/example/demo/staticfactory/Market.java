package com.example.demo.staticfactory;

public class Market {
    public static final int MENU_CAR = 1;//汽车
    public static final int MENU_SHIP = 2;//船
    public static final int MENU_PLANE = 3;//飞机

    public static WorkShop getMenu(int menuType) {
        switch (menuType) {
            case MENU_CAR:
                return new Car();
            case MENU_SHIP:
                return new Ship();
            case MENU_PLANE:
                return new Plane();
            default:
                return new Error();
        }
    }
}
