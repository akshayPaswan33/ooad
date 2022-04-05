package com.company.designpatterns.factorypattern.pizzastore;

public class Test {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        //PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.name + "\n");
        //pizza = chicagoStore.orderPizza("cheese");
        //System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
