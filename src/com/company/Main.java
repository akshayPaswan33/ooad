package com.company;

import com.company.guitarshop.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Map<String, Object> properties = new HashMap<>();
        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("model","1");
        properties.put("builder",Builder.FENDER);
        properties.put("type", Type.ACOUSTIC);
        properties.put("backWood", Wood.CEDAR);
        properties.put("frontWood",Wood.CEDAR);
        properties.put("numOfStrings", 12);
        InstrumentSpec searchSpec = new InstrumentSpec(properties);
        List<Instrument> instruments = inventory.search(searchSpec);
        if(instruments!=null) System.out.println(instruments.size());
    }

    private static void initializeInventory(Inventory inventory) {
        Map<String, Object> properties = new HashMap<>();
        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("model","1");
        properties.put("builder",Builder.FENDER);
        properties.put("type", Type.ACOUSTIC);
        properties.put("backWood", Wood.CEDAR);
        properties.put("frontWood",Wood.CEDAR);
        properties.put("numOfStrings", 12);
        inventory.addInstrument("1",20, new InstrumentSpec(properties));
    }
}
