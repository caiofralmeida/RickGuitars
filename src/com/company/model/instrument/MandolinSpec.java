package com.company.model.instrument;

import com.company.model.type.Builder;
import com.company.model.type.Style;
import com.company.model.type.Type;
import com.company.model.type.Wood;

public class MandolinSpec extends InstrumentSpec {

    protected  Style style;

    public MandolinSpec(
        String model,
        Type type,
        Wood topWood,
        Wood backWood,
        Builder builder,
        Style style
    ) {
        super(model, type, topWood, backWood, builder);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    public boolean matches(MandolinSpec mandolinSpec) {

        if (!super.matches(mandolinSpec)) {
            return false;
        }

        if (this.getStyle() != mandolinSpec.getStyle()) {
            return false;
        }

        return true;
    }
}
