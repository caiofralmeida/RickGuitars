package com.company.model.inventory;

import com.company.model.instrument.*;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    protected List<Instrument> instruments;

    public void addInstrument(String serialNumber, Double price, InstrumentSpec instrumentSpec) {

        Instrument instrument = null;

        if (instrumentSpec instanceof GuitarSpec) {
            instrument = new Guitar(serialNumber, price, instrumentSpec);
        }else if (instrumentSpec instanceof MandolinSpec) {
            instrument = new Mandolin(serialNumber, price, instrumentSpec);
        }

        instruments.add(instrument);
    }

    public Instrument get(String serialNumber) {
        for(Instrument instrument: instruments) {
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }

        return null;
    }

    public List<Guitar> search(GuitarSpec guitar) {

        List<Guitar> list = new ArrayList<Guitar>();

        for(Instrument instrument : instruments) {
            if (instrument.getSpec().matches(guitar)) {
                list.add((Guitar)instrument);
            }
        }

        return list;
    }

    public List<Mandolin> search(MandolinSpec mandolin) {
        List<Mandolin> list = new ArrayList<Mandolin>();

        for(Instrument instrument : instruments) {
            if (instrument.getSpec().matches(mandolin)) {
                list.add((Mandolin)instrument);
            }
        }

        return list;
    }
}
