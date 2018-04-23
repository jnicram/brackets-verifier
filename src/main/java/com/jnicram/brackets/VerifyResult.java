package com.jnicram.brackets;

import lombok.Getter;

public enum VerifyResult {

    TRUE("TRUE"), FALSE("FALSE");

    @Getter
    private String value;

    VerifyResult(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
