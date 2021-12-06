package Functionality;
import Function.IFunction;

public interface IFunctional<T extends IFunction> {
    public double getValue(T function);
}
