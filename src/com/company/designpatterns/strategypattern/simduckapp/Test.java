package com.company.designpatterns.strategypattern.simduckapp;

import com.company.designpatterns.strategypattern.simduckapp.behaviours.FlyNoWay;
import com.company.designpatterns.strategypattern.simduckapp.models.Duck;
import com.company.designpatterns.strategypattern.simduckapp.models.MallardDuck;

public class Test {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        mallard.setFlyBehaviour(new FlyNoWay());
        mallard.performFly();
    }
}
