package Functional;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Function.LinearFunction;

public class SumOfLeftMidRightTest {
    @Test
    public void test() {
        SumOfLeftMidRight<LinearFunction> sum = new SumOfLeftMidRight(0, 10);
        LinearFunction f = new LinearFunction(-1000, 1000, 2, 4);

        assertEquals(42, sum.getValue(f), 1e-10);
    }
}
