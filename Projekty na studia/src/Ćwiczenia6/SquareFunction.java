package Ćwiczenia6;

public class SquareFunction extends Function implements Fun {
    private double num1;
    private double num2;
    private double num3;

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;

    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getNum3() {
        return num3;
    }
    public SquareFunction(double num1, double num2, double num3){
        this.num1 = num1;;
        this.num2 = num2;
        this.num3 = num3;
    }

    @Override
    void increaseCoefficientsBy(double delta) {
        num1 += delta;
        num2 += delta;
        num3 += delta;
    }

    @Override
    void decreaseCoefficientsBy(double delta) {
        num1 -= delta;
        num2 -= delta;
        num3 -= delta;
    }

    @Override
    public double f(double num4) {
        double num5;
        num5 = ((num4*num4)*num1)+(num2*num4)+num3;
        return num5;
    }
}
