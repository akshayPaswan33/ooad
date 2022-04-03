package com.company.guitarshop;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private final List<Instrument> instruments;

    public Inventory() {
        instruments = new LinkedList<Instrument>();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec){

        //problematic code, each time we add a new type of instrument we be creating new if statement

        Instrument instrument = null;
        if(spec instanceof GuitarSpec) {
            instrument = new Guitar(serialNumber, price, (GuitarSpec) spec);
        }else if(spec instanceof MandolinSpec) {
            instrument = new Mandolin(serialNumber, price, (MandolinSpec) spec);
        }
        if(instrument!=null) instruments.add(instrument);
    }

    //now adding and removing property from GuitarSpec won't have affect here.
    public List<Instrument> search(InstrumentSpec instrumentSpec) {
        List<Instrument> result = new LinkedList<>();
        for(Instrument instrument : instruments) {
            InstrumentSpec spec = instrument.getInstrumentSpec();
            if(spec.equals(instrumentSpec)) result.add(instrument);
        }
        return result;
    }
}
