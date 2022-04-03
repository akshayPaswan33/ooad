package com.company.guitarshop;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private final List<Instrument> instruments;

    public Inventory() {
        instruments = new LinkedList<Instrument>();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec){
        instruments.add(new Instrument(serialNumber, price, spec));
    }

    public List<Instrument> search(InstrumentSpec instrumentSpec) {
        List<Instrument> result = new LinkedList<>();
        for(Instrument instrument : instruments) {
            InstrumentSpec spec = instrument.getInstrumentSpec();
            if(spec.equals(instrumentSpec)) result.add(instrument);
        }
        return result;
    }
}
