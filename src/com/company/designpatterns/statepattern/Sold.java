package com.company.designpatterns.statepattern;

public class Sold implements StateInterface{

    private Gumball gumball;

    public Sold(Gumball gumball) {
        this.gumball = gumball;
    }

    @Override
    public void insert() {
        System.out.println("Gumballs selling. Cannot insert");
    }

    @Override
    public void eject() {
        System.out.println("Gumballs selling. Cannot eject");
    }

    @Override
    public void crank() {
        System.out.println("Gumballs selling. Already cranked");
    }

    @Override
    public void dispense() {
        System.out.println("Gumballs selling. Dispensed");
        gumball.setState(gumball.soldOut);
    }
}
