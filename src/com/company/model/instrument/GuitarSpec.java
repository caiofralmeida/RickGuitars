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

        if (!super.matches(guitarSpec)) {
            return false;
        }

        if (this.getNumStrings() != guitarSpec.getNumStrings()) {
            return false;
        }

        if (!(guitarSpec instanceof GuitarSpec)) {
            return false;
        }

        return true;
    }
}
