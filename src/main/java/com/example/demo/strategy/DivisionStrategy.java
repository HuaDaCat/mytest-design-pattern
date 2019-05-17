package com.example.demo.strategy;

public class DivisionStrategy implements Strategy {
    @Override
    public int calculate(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new RuntimeException("除数不能为0");
        }
    }
}