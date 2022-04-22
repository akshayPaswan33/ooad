package com.company.designpatterns.duckapp.factory;

import com.company.designpatterns.duckapp.Quackable;
import com.company.designpatterns.duckapp.decorator.QuackCounter;
import com.company.designpatterns.duckapp.ducks.DuckCall;
import com.company.designpatterns.duckapp.ducks.MallardDuck;
import com.company.designpatterns.duckapp.ducks.RedheadDuck;
import com.company.designpatterns.duckapp.ducks.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
