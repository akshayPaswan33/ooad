package com.company;

import com.company.guitarshop.Guitar;
import com.company.guitarshop.Inventory;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar searchGuitar = new Guitar(null,"fender","1","electric","Alder","Alder",0);
        Guitar guitar = inventory.search(searchGuitar);
        if(guitar!=null) System.out.println(guitar);
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("1",20, "1", "Alder", "Alder", "electric", "fender");
        inventory.addGuitar("2",10, "1", "Chedar", "Chedar", "acoustic", "builder");
    }
}
