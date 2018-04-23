package com.jnicram.brackets;

public enum VerifyResult {

    TRUE("TRUE"), FALSE("FALSE");

    private String value;

    VerifyResult(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
