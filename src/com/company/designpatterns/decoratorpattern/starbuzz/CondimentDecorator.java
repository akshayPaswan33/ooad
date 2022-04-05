package com.company.designpatterns.decoratorpattern.starbuzz;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    @Override
    public abstract String getDescription();

    @Override
    public abstract double getCost();
}
