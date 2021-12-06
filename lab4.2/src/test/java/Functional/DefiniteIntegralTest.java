package Functional;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Function.ExponentialFunction;
import Function.FractionalFunction;
import Function.LinearFunction;
import Function.SinusoidFunction;

public class DefiniteIntegralTest {
    @Test
    public void test() {
        DefiniteIntegral<LinearFunction> integral = new DefiniteIntegral(-5, 10, 1000000);
        LinearFunction f = new LinearFunction(-1000, 1000, 2, 4);
        assertEquals(135, integral.getValue(f), 1e-3);

        DefiniteIntegral<SinusoidFunction> integral2 = new DefiniteIntegral(-5, 10, 1000000);
        SinusoidFunction f2 = new SinusoidFunction(-1000, 1000, 2, 4);
        assertEquals(0.5375100617328269, integral2.getValue(f2), 1e-3);

        DefiniteIntegral<ExponentialFunction> integral3 = new DefiniteIntegral(-2, 3, 1000000);
        ExponentialFunction f3 = new ExponentialFunction(-1000, 1000, 2, 4);
        assertEquals(59.90040327990211, integral3.getValue(f3), 1e-3);

        DefiniteIntegral<FractionalFunction> integral4 = new DefiniteIntegral(5, 10, 1000000);
        FractionalFunction f4 = new FractionalFunction(0, 10, 1, 2, 3, 4);
        assertEquals(1.795982565655494, integral4.getValue(f4), 1e-3);
    }
}
