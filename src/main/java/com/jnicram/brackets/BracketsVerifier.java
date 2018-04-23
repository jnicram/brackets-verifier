package com.jnicram.brackets;

import java.util.ArrayList;
import java.util.List;

public class BracketsVerifier {

    private static final String BRACKETS_TYPES = "()[]";

    public String verify(String data) {
        if (data == null || data.length() == 0) return VerifyResult.TRUE.value();

        List<Character> openedBrackets = new ArrayList<>();
        for (int index = 0; index < data.length(); index++) {
            int poz = BRACKETS_TYPES.indexOf(data.charAt(index));
            if (poz == -1) continue;
            if (isOpenedBracket(String.valueOf(data.charAt(index)))) {
                openedBrackets.add(BRACKETS_TYPES.charAt(poz + 1));
            } else {
                if (openedBrackets.isEmpty() || openedBrackets.get(openedBrackets.size() - 1) != data.charAt(index))
                    return VerifyResult.FALSE.value();
                openedBrackets.remove(openedBrackets.size() - 1);
            }
        }

        return openedBrackets.isEmpty() ? VerifyResult.TRUE.value() : VerifyResult.FALSE.value();
    }

    private boolean isOpenedBracket(String data) {
        return "(".equals(data) || "[".equals(data);
    }
}
