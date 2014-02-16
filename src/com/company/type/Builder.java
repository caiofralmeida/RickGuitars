package com.company.type;

public enum Builder {

    GIBSON("Gibson"),
    FENDER("Fender"),
    MARTIN("Martin"),
    COLLINGS("Collings"),
    OLSON("Olson"),
    RYAN("Ryan"),
    PRS("Prs"),
    ANY("Any");

    private String builder;

    Builder(String builder) {
        this.builder = builder;
    }

    public String toString() {
        return builder;
    }
}
