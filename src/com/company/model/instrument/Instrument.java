package com.company.model.instrument;

public abstract class Instrument {

    protected String serialNumber;

    protected Double price;

    protected InstrumentSpec instrumentSpec;

    public String getSerialNumber() {
        return serialNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    protected InstrumentSpec getSpec() {
        return instrumentSpec;
    }

}
