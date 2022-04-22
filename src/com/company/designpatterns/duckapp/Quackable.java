package com.company.designpatterns.duckapp;

import com.company.designpatterns.duckapp.observer.QuackObservable;

public interface Quackable extends QuackObservable {
    public void quack();
}
