package com.company.designpatterns.templatemethodpattern;

public abstract class CaffeineBeverage {

    //This is a template method
    final void prepare() {
        boilWater();
        brew();
        addToCup();
        addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("boiling water");
    }

    void addToCup() {
        System.out.println("pouring into cup");
    }
}
