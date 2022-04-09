package com.company.designpatterns.factorypattern.pizzastore;

public abstract class PizzaStore {
    public final Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare(); pizza.bake(); pizza.cut(); pizza.box();
        return pizza;
    }

    //This is a factory method as it handles the instantiation problem of Pizza
    //A factory method returns a Product that is typically used within methods defined in the superclass.
    public abstract Pizza createPizza(String type);
}
