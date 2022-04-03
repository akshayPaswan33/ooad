package com.company;

import com.company.guitarshop.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        InstrumentSpec searchSpec = new GuitarSpec("1", Builder.MARTIN, Type.ELECTRIC, Wood.CEDAR,Wood.CEDAR,12);
        List<Instrument> instruments = inventory.search(searchSpec);
        if(instruments!=null) System.out.println(instruments.size());
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addInstrument("1",20, new GuitarSpec("1",  Builder.MARTIN, Type.ELECTRIC, Wood.CEDAR, Wood.CEDAR,12));
        inventory.addInstrument("2",10, new GuitarSpec("1",  Builder.FENDER, Type.ACOUSTIC, Wood.BRAZILLIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD,6));
        inventory.addInstrument("3",11, new MandolinSpec("1",  Builder.FENDER, Type.ACOUSTIC, Wood.BRAZILLIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD,Style.A));
    }
}
