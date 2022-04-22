package com.company.designpatterns.duckapp;

import com.company.designpatterns.duckapp.adapter.GooseAdapter;
import com.company.designpatterns.duckapp.composite.Flock;
import com.company.designpatterns.duckapp.decorator.QuackCounter;
import com.company.designpatterns.duckapp.factory.AbstractDuckFactory;
import com.company.designpatterns.duckapp.factory.CountingDuckFactory;
import com.company.designpatterns.duckapp.goose.Goose;
import com.company.designpatterns.duckapp.observer.Quackologist;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory){
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable mallardDuck2 = duckFactory.createMallardDuck();
        Quackable mallardDuck3 = duckFactory.createMallardDuck();
        Quackable mallardDuck4 = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseAdapter = new GooseAdapter(new Goose());

        System.out.println("Duck Simulator");

        Flock flock = new Flock();
        flock.add(redheadDuck);
        flock.add(duckCall);
        flock.add(rubberDuck);
        flock.add(gooseAdapter);

        Flock flockOfMallards = new Flock();
        flockOfMallards.add(mallardDuck);
        flockOfMallards.add(mallardDuck2);
        flockOfMallards.add(mallardDuck3);
        flockOfMallards.add(mallardDuck4);

        flock.add(flockOfMallards);

        Quackologist quackologist = new Quackologist();
        flock.registerObserver(quackologist);

        simulate(flock);
//
//        simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//        simulate(gooseAdapter);

        System.out.println("Number of quacks is "+QuackCounter.getNumOfQuacks());
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
