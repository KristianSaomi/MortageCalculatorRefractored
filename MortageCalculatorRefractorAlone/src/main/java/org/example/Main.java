package org.example;

public class Main {

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

        var calculateMortage = new CalculateMortage(principal, annualInterest, years);
        var mortageReporter = new MortageReporter(calculateMortage);
        mortageReporter.printMortgage();
        mortageReporter.printPaymentSchedule();
    }
}
