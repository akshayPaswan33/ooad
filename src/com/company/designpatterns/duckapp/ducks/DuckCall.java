package com.company.designpatterns.duckapp.ducks;

import com.company.designpatterns.duckapp.Quackable;
import com.company.designpatterns.duckapp.observer.Observable;
import com.company.designpatterns.duckapp.observer.Observer;

public class DuckCall implements Quackable {
    private final Observable observable;

    public DuckCall() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
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
