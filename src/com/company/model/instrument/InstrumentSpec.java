package com.company.model.instrument;

import com.company.model.type.Builder;
import com.company.model.type.Type;
import com.company.model.type.Wood;

public class InstrumentSpec {

    protected String model;

    protected Type type;

    protected Wood topWood, backWood;

    protected Builder builder;

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public boolean matches(InstrumentSpec instrumentSpec) {
        if (this.getBackWood() != instrumentSpec.getBackWood()) {
            return false;
        }

        if (this.getTopWood() != instrumentSpec.getTopWood()) {
            return false;
        }

        if (this.getBuilder() != instrumentSpec.getBuilder()) {
            return false;
        }

        if (this.getModel() != instrumentSpec.getModel()) {
            return false;
        }

        if (this.getType() != instrumentSpec.getType()) {
            return false;
        }

        return true;
    }
}
