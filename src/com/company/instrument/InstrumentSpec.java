package com.company.instrument;

import com.company.type.Builder;
import com.company.type.Type;
import com.company.type.Wood;

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
        return true;
    }
}
