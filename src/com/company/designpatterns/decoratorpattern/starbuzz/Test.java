package com.company.designpatterns.decoratorpattern.starbuzz;

public class Test {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();

        System.out.println(beverage.getDescription()
                + " $" + beverage.getCost());

        Beverage beverage1 = new Milk(beverage);

        System.out.println(beverage1.getDescription()
                + " $" + beverage1.getCost());
    }
}
