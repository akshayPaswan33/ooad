package com.company.guitarshop;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private final List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<Guitar>();
    }

    public void addGuitar(String serialNumber, double price, String model, Wood frontWood, Wood backWood, Type type, Builder builder){
        guitars.add(new Guitar(serialNumber,price, new GuitarSpec(model,builder,type,backWood,frontWood)));
    }

    public Guitar getGuitar(String serialNumber) {
        for(Guitar guitar : guitars) {
            if(guitar.getSerialNumber().equals(serialNumber)) return guitar;
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec guitarSpec) {
        if(guitarSpec.getBackWood()==null || guitarSpec.getFrontWood()==null || guitarSpec.getBuilder()==null || guitarSpec.getModel()==null || guitarSpec.getType()==null) return null;
        List<Guitar> result = new LinkedList<>();
        for(Guitar guitar : guitars) {
            GuitarSpec spec = guitar.getSpec();
            if(guitarSpec.getType().equals(spec.getType()) && guitarSpec.getModel().equals(spec.getModel())
            && guitarSpec.getBuilder().equals(spec.getBuilder()) && guitarSpec.getFrontWood().equals(spec.getFrontWood())
            && guitarSpec.getBackWood().equals(spec.getBackWood())) result.add(guitar);
        }
        return result;
    }
}
