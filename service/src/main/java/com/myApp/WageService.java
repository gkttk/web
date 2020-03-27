package com.myApp;

public class WageService {

    public static double vszn(double num){
        return num*0.35;
    }

    public static double belgoz(double num){
        return num*0.006;
    }

    public static double podohodnyi(double num){
        return num*0.13;
    }

    public static double prof(double num){
        return num*0.01;
    }

    public static double checkWage(double num){
        double vszn = vszn(num);
        double belgoz = belgoz(num);
        double podohodnyi = podohodnyi(num);
        double prof = prof(num);
        double sum = vszn + belgoz + podohodnyi + prof;
        return num-sum;
    }


}
