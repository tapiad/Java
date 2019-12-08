package com.JavaCDMProject;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        double interestRate = scanner.nextDouble();
        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();

        double rate = (interestRate/12) / 100;
        int nPayments = years * 12;

        double mortgage = principal * (rate * Math.pow((1 + rate), nPayments) / ((Math.pow((1 + rate), nPayments)) -1));

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(mortgage);
        System.out.print("Mortgage: " + result);
    }
}
