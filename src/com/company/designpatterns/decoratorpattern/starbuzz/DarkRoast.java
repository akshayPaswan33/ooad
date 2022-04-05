package com.company.designpatterns.decoratorpattern.starbuzz;

public class DarkRoast extends Beverage{
    @Override
    public String getDescription() {
        return "I am Dark roast";
    }

    @Override
    public double getCost() {
        return 1.99;
    }
}
