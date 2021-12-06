package Function;

public interface IFunction {

    public double getLeftBorder();
    public double getRightBorder();
    public double getValue(double x);
    public boolean isDefinite(double a, double b);
}
