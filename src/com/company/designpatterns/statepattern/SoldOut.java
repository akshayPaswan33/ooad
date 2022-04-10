package com.company.designpatterns.statepattern;

public class SoldOut implements StateInterface {

    private Gumball gumball;

    public SoldOut(Gumball gumball) {
        this.gumball = gumball;
    }

    @Override
    public void insert() {
        System.out.println("Gumballs sold out. Cannot insert");
    }

    @Override
    public void eject() {
        System.out.println("Gumballs sold out. Cannot eject");
    }

    @Override
    public void crank() {
        System.out.println("Gumballs sold out. Cannot crank");
    }

    @Override
    public void dispense() {
        System.out.println("Gumballs sold out. Cannot dispense");
    }
}
