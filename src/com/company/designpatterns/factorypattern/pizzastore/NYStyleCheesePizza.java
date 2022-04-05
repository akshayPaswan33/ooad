package com.company.designpatterns.factorypattern.pizzastore;

public class NYStyleCheesePizza extends Pizza {
    private PizzaIngredientFactory pizzaIngredientFactory;

    public NYStyleCheesePizza(
            PizzaIngredientFactory pizzaIngredientFactory
    ) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        name = "NY Style Sauce and Cheese Pizza";
    }

    @Override
    void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
    }
}
