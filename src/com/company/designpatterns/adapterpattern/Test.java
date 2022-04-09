package com.company.designpatterns.adapterpattern;

public class Test {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Duck duck1 = new TurkeyAdapter(new WildTurkey());

        duck.quack();
        duck1.quack();

        duck.fly();
        duck1.fly();
    }
}
