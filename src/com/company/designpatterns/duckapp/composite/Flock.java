package com.company.designpatterns.duckapp.composite;

import com.company.designpatterns.duckapp.Quackable;
import com.company.designpatterns.duckapp.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
    private List<Quackable> quackers;

    public Flock() {
        quackers = new ArrayList<>();
    }

    public void add(Quackable quackable) {
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        for (Quackable quackable : quackers) {
            quackable.quack();
        }
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        for(Quackable quackable : quackers) quackable.registerObserver(o);
    }

    @Override
    public void notifyObservers() {
        for (Quackable quackable : quackers) quackable.notifyObservers();
    }
}
