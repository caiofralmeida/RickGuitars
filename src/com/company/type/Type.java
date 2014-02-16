package com.company.type;

public enum Type {
    ELETRIC("Eletric"),
    ACOUSTIC("Acoustic");

    private String type;

    Type(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
