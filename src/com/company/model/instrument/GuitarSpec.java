package com.company.model.instrument;

import com.company.model.type.Builder;
import com.company.model.type.Type;
import com.company.model.type.Wood;

public class GuitarSpec extends InstrumentSpec {

    protected int numStrings;

    public GuitarSpec(
        String model,
        Type type,
        Wood topWood,
        Wood backWood,
        Builder builder,
        int numStrings
    ) {
        this.model = model;
        this.type = type;
        this.topWood = topWood;
        this.backWood = backWood;
        this.builder = builder;
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public boolean matches(GuitarSpec guitarSpec) {

        if (this.getNumStrings() != guitarSpec.getNumStrings()) {
            return false;
        }

        if (this.getBackWood() != guitarSpec.getBackWood()) {
            return false;
        }

        if (this.getTopWood() != guitarSpec.getTopWood()) {
            return false;
        }

        if (this.getBuilder() != guitarSpec.getBuilder()) {
            return false;
        }

        if (this.getModel() != guitarSpec.getModel()) {
            return false;
        }

        if (this.getType() != guitarSpec.getType()) {
            return false;
        }

        return true;
    }
}
