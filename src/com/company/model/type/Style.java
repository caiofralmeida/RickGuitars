package com.company.model.type;

public enum Style {

    A("A"),
    F("F");

    private String style;

    Style(String builder) {
        this.style = builder;
    }

    public String toString() {
        return style;
    }
}
