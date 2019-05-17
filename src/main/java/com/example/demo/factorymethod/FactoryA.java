package com.example.demo.factorymethod;

public class FactoryA extends Factory {
    @Override
    public Product ManuFacture() {
        return new ProductA();
    }
}
