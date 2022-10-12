package org.example;

import java.text.NumberFormat;


public class MortageReporter {

    private final NumberFormat currencyInstance;
    private CalculateMortage calculator;

    public MortageReporter(CalculateMortage calculator) {
        this.calculator = calculator;
        currencyInstance = NumberFormat.getCurrencyInstance();
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currencyInstance.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (double balances : calculator.getRemainingBalances() )
            System.out.println(currencyInstance.format(balances));
        }
    }
