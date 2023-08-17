package Ćwiczenia6;

public class AbsoluteLinearFunction extends LinearFunction implements Fun{

    public AbsoluteLinearFunction(double num1, double num2) {

        super(num1,num2);
    }

    @Override
    public double f(double num3) {

        return num3*Math.abs(getNum1()+getNum2());
    }

}