package com.company.model.instrument;

import com.company.model.type.Style;

public class MandolinSpec extends InstrumentSpec {

    protected  Style style;

    public Style getStyle() {
        return style;
    }

    public boolean matches(MandolinSpec mandolinSpec) {

        if (!super.matches(mandolinSpec)) {
            return false;
        }

        if(!(mandolinSpec instanceof MandolinSpec)) {
            return false;
        }

        if (this.getStyle() != mandolinSpec.getStyle()) {
            return false;
        }

        return true;
    }
}
