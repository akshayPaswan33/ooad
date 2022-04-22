package com.company.designpatterns.duckapp.ducks;

import com.company.designpatterns.duckapp.Quackable;
import com.company.designpatterns.duckapp.observer.Observable;
import com.company.designpatterns.duckapp.observer.Observer;

public class RubberDuck implements Quackable {
    private final Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
        notifyObservers();
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
