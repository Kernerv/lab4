public class SquareTrinomial {
    private double a,b,c;

    public SquareTrinomial(double a, double b ,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double Dis(){
        if (b*b - 4*a*c < 0) {
            throw new IllegalArgumentException("Дискриминант < 0");
        }
        else return (b*b - 4*a*c);
    }

    public double[] RadicalCalculation(){
        double[] radicalArray;
        if (a == 0){
            throw new IllegalArgumentException("Аргумент a не может быть меньше 0");
        }
        radicalArray = new double[2];
        radicalArray[0] = (-b+Math.sqrt(Dis()))/(2*a);
        radicalArray[1] = (-b-Math.sqrt(Dis()))/(2*a);
        return radicalArray;
    }
}
