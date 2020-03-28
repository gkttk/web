package com.myApp;

public class WageService {

    private static WageService instance;

    private WageService() {}

    public static WageService getInstance() {
        if (instance == null) {
            synchronized (WageService.class) {
                instance = new WageService();
            }
        }
        return instance;
    }

    public double vszn(double wage) {
        return wage * 0.35;
    }

    public double belgoz(double wage) {
        return wage * 0.006;
    }

    public double podohodnyi(double wage) {
        return wage * 0.13;
    }

    public double prof(double wage) {
        return wage * 0.01;
    }

    public double checkWage(double wage) {
        double taxes = instance.vszn(wage) + instance.belgoz(wage) + instance.podohodnyi(wage) + instance.prof(wage);
        return wage - taxes;
    }


}
