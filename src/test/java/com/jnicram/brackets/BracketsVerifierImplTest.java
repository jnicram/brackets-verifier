package com.jnicram.brackets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BracketsVerifierImplTest {

    private final String data;
    private final VerifyResult dataResult;

    private BracketsVerifierImpl classUnderTest;

    public BracketsVerifierImplTest(String data, VerifyResult dataResult) {
        this.data = data;
        this.dataResult = dataResult;
    }

    @Parameters( name = "{index}: verify({0}) = {1}" )
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                { null , VerifyResult.TRUE },
                { "", VerifyResult.TRUE },
                { "(]", VerifyResult.FALSE },
                { "([3)]", VerifyResult.FALSE },
                { "([6)", VerifyResult.FALSE },
                { "(([34[34]])234)", VerifyResult.TRUE },
                { "([([()])])", VerifyResult.TRUE }
        };
        return Arrays.asList(data);
    }

    @Before
    public void init() {
        classUnderTest = new BracketsVerifierImpl();
    }

    @Test
    public void shouldReturnTrueStringWhenEmptyStringGiven() {
        // given

        // when
        String result = classUnderTest.verify(data);

        // then
        Assert.assertEquals(dataResult.value(), result);
    }
}