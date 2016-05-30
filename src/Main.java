/**
 * Created by diz on 27.05.2016.
 */
public class Main {

    public double getSumm(double a, double b) {
        return a + b;
    }

    public double getSub(double a, double b) {
        return a - b;
    }

    public double getMult(double a, double b) {
        return a * b;
    }

    public double getDivision(double a, double b) {
        if (a == 0) throw new ArithmeticException();
        return (double) b / a;
    }

    public int getDivision(int a, int b) {
        return b / a;
    }

}