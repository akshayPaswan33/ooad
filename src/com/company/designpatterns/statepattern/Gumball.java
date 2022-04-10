package com.company.designpatterns.statepattern;

public class Gumball {
    StateInterface sold;
    StateInterface soldOut;

    StateInterface state;

    public Gumball() {
        sold = new Sold(this);
        soldOut = new SoldOut(this);

        state = sold;
    }

    public StateInterface getSold() {
        return sold;
    }

    public void setSold(StateInterface sold) {
        this.sold = sold;
    }

    public StateInterface getSoldOut() {
        return soldOut;
    }

    public void setSoldOut(StateInterface soldOut) {
        this.soldOut = soldOut;
    }

    public void insert() {
        state.insert();
    }

    public void eject() {
        state.eject();
    }

    public void crank(){
        state.crank();
    }

    public void dispense() {
        state.dispense();
    }

    public void setState(StateInterface state) {
        this.state = state;
    }
}
