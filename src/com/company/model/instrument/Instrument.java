package com.company.model.instrument;

public abstract class Instrument {

    protected String serialNumber;

    protected Double price;

    protected InstrumentSpec instrumentSpec;

    public Instrument(String serialNumber, Double price, InstrumentSpec instrumentSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.instrumentSpec = instrumentSpec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public InstrumentSpec getSpec() {
        return instrumentSpec;
    }

}
