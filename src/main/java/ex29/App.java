package ex29;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;

public class App {

    public static int calculate(int rate){
        int years = 72 / rate;

        return years;
    }

    public static void main( String[] args ) {
        Scanner se = new Scanner(System.in);

        int rate = 0;
        String ror = " ";

        while(!ror.matches("[1-9]*")){
            System.out.print("What is the rate of return? ");
            ror = se.nextLine();

            if(!ror.matches("[1-9]*")){
                System.out.println("Sorry. That's not a valid input.");
            }
        }

        rate = Integer.parseInt(ror);

        int result = calculate(rate);

        System.out.println("It will take " + result + " years to double your initial investment.");
    }
}
