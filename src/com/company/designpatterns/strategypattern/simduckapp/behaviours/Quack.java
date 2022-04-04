package com.company.designpatterns.strategypattern.simduckapp.behaviours;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I quack");
    }
}
