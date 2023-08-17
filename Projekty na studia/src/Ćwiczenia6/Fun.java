package Ćwiczenia6;

public interface Fun {

    double f(double x);

    static double minimum(Fun funct, double num1, double num2, double alpha) {
        double minimum = num1;
        double num3 = num1;
        while ( num3 <= num2 ){
            num3=alpha+num3;
            if (funct.f(num3) < funct.f(minimum)){
                minimum = num3;
            }
        }
        return minimum;
    }

}
