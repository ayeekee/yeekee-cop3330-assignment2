package ex26;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;
import java.lang.Math;

public class PaymentCalculator {
    public static double calculateMonthsUntilPaidOff(double b, double i, double p){
        double result = 0;

        double div = b / p;
        double root = 1 + i;
        double pow = Math.pow((root), 30);
        double log1 = Math.log(1 + (div * (1 - pow)));
        double log2 = Math.log(root);

        result = (-1.0/30.0) * log1 / log2;

        return (int)Math.ceil(result);
    }

    public static void main( String[] args ) {
        Scanner se = new Scanner(System.in);

        System.out.print("What is your balance? ");
        String balance = se.nextLine();
        double b = Double.parseDouble(balance);

        System.out.print("What is the APR on the card (as a percent)? ");
        String per = se.nextLine();
        double apr = Double.parseDouble(per);
        double i = (apr / 100) / 365;

        System.out.print("What is the monthly payment you can make? ");
        String mon = se.nextLine();
        double p = Double.parseDouble(mon);

        double months = calculateMonthsUntilPaidOff(b, i, p);

        System.out.println("It will take you " + (int)months + " months to pay off this card.");
    }

}

