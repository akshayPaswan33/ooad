package com.company.designpatterns.duckapp.decorator;

import com.company.designpatterns.duckapp.Quackable;
import com.company.designpatterns.duckapp.observer.Observable;
import com.company.designpatterns.duckapp.observer.Observer;

public class QuackCounter implements Quackable {

    private final Observable observable;

    private final Quackable duck;
    private static int numOfQuacks = 0;

    public QuackCounter(Quackable duck) {
        this.observable = new Observable(duck);
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numOfQuacks++;
        notifyObservers();
    }

    public static int getNumOfQuacks() {
        return numOfQuacks;
    }

    @Override
    public void registerObserver(Observer o) {
        observable.registerObserver(o);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
