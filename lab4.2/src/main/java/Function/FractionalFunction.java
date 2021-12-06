package Function;

public class FractionalFunction implements IFunction {

    private double leftBorder;
    private double rightBorder;

    private double a;
    private double b;
    private double c;
    private double d;


    public FractionalFunction(double leftBorder, double rightBorder, double a, double b, double c, double d) {
        if (leftBorder > rightBorder) {
            throw new IllegalArgumentException("Left border more than right border");
        }
        this.leftBorder = leftBorder;
        this.rightBorder = rightBorder;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getLeftBorder() {
        return leftBorder;
    }

    @Override
    public double getRightBorder() {
        return rightBorder;
    }


    @Override
    public double getValue(double x) {
        if (x - leftBorder < 1e-10 || x - rightBorder > 1e-10) {
            throw new IllegalArgumentException("x out of definition");
        }
        return (a * x + b) / (c * x + d);
    }

    @Override
    public boolean isDefinite(double a, double b) {
        return a - leftBorder > 1e-10 && b - rightBorder < 1e-10;
    }
}

