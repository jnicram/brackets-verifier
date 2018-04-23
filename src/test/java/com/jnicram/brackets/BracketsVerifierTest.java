package com.jnicram.brackets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BracketsVerifierTest {

    private BracketsVerifier classUnderTest;

    @Before
    public void init() {
        classUnderTest = new BracketsVerifier();
    }

    @Test
    public void shouldReturnTrueStringWhenEmptyStringGiven() {
        // given
        String data = "";

        // when
        String result = classUnderTest.verify(data);

        // then
        Assert.assertEquals(VerifyResult.TRUE.value(), result);
    }

}