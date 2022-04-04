package com.company.designpatterns.strategypattern.simduckapp.models;

import com.company.designpatterns.strategypattern.simduckapp.behaviours.FlyWithWings;
import com.company.designpatterns.strategypattern.simduckapp.behaviours.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        //initializing like this is a poor oops, later we will learn how to fix this
        //don't code on implementations
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Hey, I am Mallard");
    }
}
