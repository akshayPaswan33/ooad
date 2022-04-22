package com.company.designpatterns.duckapp.factory;

import com.company.designpatterns.duckapp.Quackable;
import com.company.designpatterns.duckapp.ducks.DuckCall;
import com.company.designpatterns.duckapp.ducks.MallardDuck;
import com.company.designpatterns.duckapp.ducks.RedheadDuck;
import com.company.designpatterns.duckapp.ducks.RubberDuck;

public class DuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
