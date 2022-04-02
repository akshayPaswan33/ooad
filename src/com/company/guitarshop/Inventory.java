package com.company.guitarshop;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private final List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<Guitar>();
    }

    public void addGuitar(String serialNumber, double price, String model, String frontWood, String backWood, String type, String builder){
        guitars.add(new Guitar(serialNumber,builder, model, type, backWood, frontWood, price));
    }

    public Guitar getGuitar(String serialNumber) {
        for(Guitar guitar : guitars) {
            if(guitar.getSerialNumber().equals(serialNumber)) return guitar;
        }
        return null;
    }

    public Guitar search(Guitar searchGuitar) {
        if(searchGuitar.getBackWood()==null || searchGuitar.getFrontWood()==null || searchGuitar.getBuilder()==null || searchGuitar.getModel()==null || searchGuitar.getType()==null) return null;
        for(Guitar guitar : guitars) {
            if(searchGuitar.getType().equals(guitar.getType()) && searchGuitar.getModel().equals(guitar.getModel())
            && searchGuitar.getBuilder().equals(guitar.getBuilder()) && searchGuitar.getFrontWood().equals(guitar.getFrontWood())
            && searchGuitar.getBackWood().equals(guitar.getBackWood())) return guitar;
        }
        return null;
    }
}
