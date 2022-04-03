package com.company.guitarshop;

public class Guitar extends Instrument {

    //problematic code, each time we define a new instrument type we have to create a new class like this which has only a constructor

    public Guitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        super(serialNumber, price, guitarSpec);
    }
}
