package com.company.designpatterns.observerpattern.weatherstation.subject;

import com.company.designpatterns.observerpattern.weatherstation.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private float temp, humidity, pressure;
    private final List<Observer> observerList;

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observerList) observer.update(temp, humidity, pressure);
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temp = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
