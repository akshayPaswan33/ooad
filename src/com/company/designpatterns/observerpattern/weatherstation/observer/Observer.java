package com.company.designpatterns.observerpattern.weatherstation.observer;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
