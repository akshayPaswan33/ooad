package com.company.designpatterns.statepattern;

public class Test {

    public static void main(String[] args) {
        Gumball gumball = new Gumball();
        gumball.insert();
        gumball.eject();
        gumball.crank();
        gumball.dispense();

        gumball.insert();
        gumball.eject();
        gumball.crank();
        gumball.dispense();
    }
}
