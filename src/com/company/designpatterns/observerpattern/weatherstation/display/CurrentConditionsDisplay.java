package com.company.designpatterns.observerpattern.weatherstation.display;

import com.company.designpatterns.observerpattern.weatherstation.observer.Observer;
import com.company.designpatterns.observerpattern.weatherstation.subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private final WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(temperature+" and "+humidity);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemp();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
