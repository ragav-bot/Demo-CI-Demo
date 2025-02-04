package com.example.numbertypecheck.util;

public enum NumberType {
    EVEN("Even"),
    ODD("Odd");

    private String value;

    NumberType(String key) {
        this.value = key;
    }

    public String getValue() {
        return value;
    }
}
