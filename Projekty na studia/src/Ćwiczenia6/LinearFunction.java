package Ćwiczenia6;

public class LinearFunction extends Function implements Fun
{
    private double num1;
    private double num2;

    public void setNum1(double num1) {
        this.num1 = num1; }

    public void setNum2(double num2) {
        this.num2 = num2; }

    public LinearFunction(double num1, double num2){
        this.num1 = num1;;
        this.num2 = num2;
    }
    public double getNum1() {
        return num1; }

    public double getNum2() {
        return num2; }

    @Override
    public double f(double num3) {
        double num4;
        num4 = num2+num1*num3;
        return num4;
    }

    @Override
    void increaseCoefficientsBy(double num5) {
        num1 += num5;
        num2 += num5;
    }

    @Override
    void decreaseCoefficientsBy(double z) {
        num1-= z;
        num2-= z;
    }


}
