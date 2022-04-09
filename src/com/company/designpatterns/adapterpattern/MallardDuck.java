package com.company.designpatterns.adapterpattern;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("I can quack");
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
