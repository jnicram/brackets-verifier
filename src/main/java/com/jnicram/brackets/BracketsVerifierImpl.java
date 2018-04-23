package com.jnicram.brackets;

import java.util.ArrayList;
import java.util.List;

public class BracketsVerifierImpl implements BracketsVerifier {

    private static final String BRACKETS_TYPES = "()[]";

    @Override
    public String verify(String data) {
        if (data == null || data.isEmpty()) return VerifyResult.TRUE.value();

        List<Character> openedBrackets = new ArrayList<>();
        for (int index = 0; index < data.length(); index++) {
            int bracketIndex = BRACKETS_TYPES.indexOf(data.charAt(index));
            if (bracketIndex == -1) continue;
            if (isOpenedBracket(String.valueOf(data.charAt(index)))) {
                openedBrackets.add(BRACKETS_TYPES.charAt(bracketIndex + 1));
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
