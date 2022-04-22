package com.company.designpatterns.duckapp.adapter;

import com.company.designpatterns.duckapp.Quackable;
import com.company.designpatterns.duckapp.goose.Goose;
import com.company.designpatterns.duckapp.observer.Observer;

public class GooseAdapter implements Quackable {

    private final Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void registerObserver(Observer o) {

    }

    @Override
    public void notifyObservers() {

    }
}
