package com.company.designpatterns.factorypattern.pizzastore;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza(ingredientFactory); }
        return null;
    }
}
