package com.example.demo.factorymethod;

public class FactoryB extends Factory {
    @Override
    public Product ManuFacture() {
        return new ProductB();
    }
}
