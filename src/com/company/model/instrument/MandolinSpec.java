package com.company.model.instrument;

import com.company.model.type.Style;

public class MandolinSpec extends InstrumentSpec {

    protected  Style style;

    public Style getStyle() {
        return style;
    }

    public boolean matches(MandolinSpec mandolinSpec) {
        if (this.getStyle() != mandolinSpec.getStyle()) {
            return false;
        }

        if (this.getBackWood() != mandolinSpec.getBackWood()) {
            return false;
        }

        if (this.getTopWood() != mandolinSpec.getTopWood()) {
            return false;
        }

        if (this.getBuilder() != mandolinSpec.getBuilder()) {
            return false;
        }

        if (this.getModel() != mandolinSpec.getModel()) {
            return false;
        }

        if (this.getType() != mandolinSpec.getType()) {
            return false;
        }

        return true;
    }
}
