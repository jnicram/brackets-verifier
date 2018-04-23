package com.jnicram.brackets;

public class BracketsVerifier {

    public String verify(String data) {
        if (data == null || data.length() == 0) return VerifyResult.TRUE.value();
        return VerifyResult.FALSE.value();
    }
}
