package com.company.designpatterns.adapterpattern;

public class WildTurkey implements Turkey{

    @Override
    public void gobble() {
        System.out.println("I gobble");
    }

    @Override
    public void fly() {
        System.out.println("I can fly too");
    }
}
