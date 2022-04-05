package com.company.designpatterns.observerpattern.weatherstation.subject;

import com.company.designpatterns.observerpattern.weatherstation.observer.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
