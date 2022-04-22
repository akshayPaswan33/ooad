package com.company.designpatterns.duckapp.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable implements QuackObservable{
    private final List<Observer> observers;
    private final QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) observer.update(duck);
    }

    public QuackObservable getDuck() {
        return duck;
    }
}
