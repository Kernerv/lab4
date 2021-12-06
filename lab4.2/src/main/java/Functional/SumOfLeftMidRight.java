package Functional;

import Function.IFunction;

public class SumOfLeftMidRight<T extends IFunction> implements Functionality.IFunctional<T> {

    private double left;
    private double right;

    public SumOfLeftMidRight(double left, double right) throws IllegalArgumentException {
        if (left > right) {
            throw new IllegalArgumentException("Left value more than right value");
        }
        this.left = left;
        this.right = right;
    }

    @Override
    public double getValue(T function) {
        if (function == null) {
            throw new IllegalArgumentException("Function is null");
        }
        if (left > right || left < function.getLeftBorder() || right > function.getRightBorder()) {
            throw new IllegalArgumentException("Values out of bounds on which the function is defined");
        }
        return function.getValue(left) + function.getValue(right) + function.getValue((left + right) / 2);
    }
}
