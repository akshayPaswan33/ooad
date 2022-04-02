package com.company;

import com.company.guitarshop.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec searchGuitar = new GuitarSpec("1", Builder.MARTIN, Type.ELECTRIC, Wood.CEDAR,Wood.CEDAR);
        List<Guitar> guitars = inventory.search(searchGuitar);
        if(guitars!=null) System.out.println(guitars.size());
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("1",20, "1", Wood.CEDAR, Wood.CEDAR, Type.ELECTRIC, Builder.MARTIN);
        inventory.addGuitar("2",10, "1", Wood.BRAZILLIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, Type.ACOUSTIC, Builder.PRS);
    }
}
