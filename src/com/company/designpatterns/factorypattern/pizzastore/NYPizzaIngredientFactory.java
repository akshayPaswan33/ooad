package com.company.designpatterns.factorypattern.pizzastore;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public String createDough() {
        return "NY dough";
    }

    @Override
    public String createSauce() {
        return "NY sauce";
    }
}
