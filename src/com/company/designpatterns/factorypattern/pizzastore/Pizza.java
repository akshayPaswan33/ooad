package com.company.designpatterns.factorypattern.pizzastore;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    void prepare() {
        System.out.println("Pizza prepared");
    }
    void cut() {
        System.out.println("Pizza is cut into 4 pieces");
    }
    void box() {
        System.out.println("Pizza is put inside box");
    }
    void bake() {
        System.out.println("Pizza baked");
    }

}
