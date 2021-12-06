package Functional;

import Function.IFunction;

public class DefiniteIntegral<T extends IFunction> implements Functionality.IFunctional<T> {

    private double left;
    private double right;
    private int splitsCount;

    /**
     * @throws IllegalArgumentException if values out of bounds on which the
     *                                  function is defined
     */
    public DefiniteIntegral(double left, double right, int splitsCount) throws IllegalArgumentException {
        if (left > right) {
            throw new IllegalArgumentException("Left value more than right value");
        }
        this.left = left;
        this.right = right;
        this.splitsCount = splitsCount;
    }

    /**
     * @return definite integral from left to right
     */
    @Override
    public double getValue(T function) {
        if (function == null) {
            throw new IllegalArgumentException("Function is null");
        }

        final double h = (right - left) / splitsCount;
        double integral = 0;
        for (int i = 1; i <= splitsCount; ++i) {
            integral += function.getValue(left + h * i);
        }

        return integral * h;
    }
}
