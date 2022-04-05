package com.company.designpatterns.factorypattern.pizzastore;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) { pizza = new NYStyleCheesePizza();
        }
        return pizza;
    }
}
