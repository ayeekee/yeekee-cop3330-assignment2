package ex28;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static int add(ArrayList<Integer> inputList){
        int sum = 0;
        for (int i : inputList) {
            sum += i;
        }
        return sum;
    }

    public static void main( String[] args ) {

        Scanner se = new Scanner(System.in);
        int result = 0;

        ArrayList<Integer> inputList = new ArrayList<Integer>(10);

        System.out.println("Please enter 5 numbers.");
        for(int i = 0; i < 5; i++){
            System.out.print("Enter a number: ");
            String num = se.nextLine();
            int n = Integer.parseInt(num);

            inputList.add(n);
        }

        result = add(inputList);

        System.out.println("The total is " + result + ".");
    }
}
