package com.company.designpatterns.strategypattern.simduckapp.behaviours;

import com.company.designpatterns.strategypattern.simduckapp.behaviours.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
