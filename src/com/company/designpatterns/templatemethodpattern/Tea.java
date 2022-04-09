package com.company.designpatterns.templatemethodpattern;

public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Steeping tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}
