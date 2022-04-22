package com.company.designpatterns.duckapp.observer;

public interface QuackObservable {
    public void registerObserver(Observer o);
    public void notifyObservers();
}
