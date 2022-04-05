package com.company.designpatterns.decoratorpattern.starbuzz;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "plus" + "Milk";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.20;
    }
}
