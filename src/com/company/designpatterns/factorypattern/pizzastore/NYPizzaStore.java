package com.company.designpatterns.factorypattern.pizzastore;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza(); }
        return null;
    }
}
