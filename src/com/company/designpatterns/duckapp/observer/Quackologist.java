package com.company.designpatterns.duckapp.observer;

public class Quackologist implements Observer{
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
