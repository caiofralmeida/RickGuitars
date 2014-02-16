package com.company.model.type;

public enum Style {

    LIGHT("Light"),
    BLACK("Black");

    private String style;

    Style(String builder) {
        this.style = builder;
    }

    public String toString() {
        return style;
    }
}
