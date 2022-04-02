package com.company.guitarshop;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private final List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<Guitar>();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec spec){
        guitars.add(new Guitar(serialNumber,price, spec));
    }

    public Guitar getGuitar(String serialNumber) {
        for(Guitar guitar : guitars) {
            if(guitar.getSerialNumber().equals(serialNumber)) return guitar;
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchSpec) {
        List<Guitar> result = new LinkedList<>();
        for(Guitar guitar : guitars) {
            GuitarSpec spec = guitar.getSpec();
            if(spec.equals(searchSpec)) result.add(guitar);
        }
        return result;
    }
}
