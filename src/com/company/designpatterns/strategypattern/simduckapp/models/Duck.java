package com.company.designpatterns.strategypattern.simduckapp.models;

import com.company.designpatterns.strategypattern.simduckapp.behaviours.FlyBehaviour;
import com.company.designpatterns.strategypattern.simduckapp.behaviours.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void swim() {
        System.out.println("I can swim");
    }

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
