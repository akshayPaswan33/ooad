package com.company.designpatterns.strategypattern.simduckapp.behaviours;

import com.company.designpatterns.strategypattern.simduckapp.behaviours.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I squeak");
    }
}
