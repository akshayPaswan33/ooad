package com.company.designpatterns.strategypattern.simduckapp.behaviours;

import com.company.designpatterns.strategypattern.simduckapp.behaviours.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I have wings to fly");
    }
}
