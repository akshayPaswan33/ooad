package com.company;

import com.company.guitarshop.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar searchGuitar = new Guitar(null,"1", Builder.MARTIN, Type.ELECTRIC, Wood.CEDAR,Wood.CEDAR,0);
        Guitar guitar = inventory.search(searchGuitar);
        if(guitar!=null) System.out.println(guitar);
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("1",20, "1", Wood.CEDAR, Wood.CEDAR, Type.ELECTRIC, Builder.MARTIN);
        inventory.addGuitar("2",10, "1", Wood.BRAZILLIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, Type.ACOUSTIC, Builder.PRS);
    }
}
