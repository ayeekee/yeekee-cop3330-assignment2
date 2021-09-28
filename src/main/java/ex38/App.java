package ex38;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;

public class App {

    public static int[] filterEvenNumbers(int[] numArray){

        int eSize = 0;

        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] % 2 == 0){
                eSize++;
            }
        }

        int[] evenArray = new int[eSize];
        int index = 0;

        for(int j = 0; j < numArray.length; j++){
            if(numArray[j] % 2 == 0){
                evenArray[index] = numArray[j];
                index++;
            }
        }

        return evenArray;
    }

    public static void main( String[] args ) {
        Scanner se = new Scanner(System.in);

        System.out.println("Enter a list of numbers, separated by spaces: ");
        String numbers = se.nextLine();

        String[] tokens = numbers.split(" ");
        int[] numArray = new int[tokens.length];

        int i = 0;
        for (String token : tokens){
            numArray[i++] = Integer.parseInt(token);
        }

        int[] evenArray = new int[numArray.length];

        evenArray = filterEvenNumbers(numArray);

        System.out.println("The even numbers are: ");

        for(i = 0; i < evenArray.length; i++){
            System.out.print(evenArray[i] + " ");
        }

    }
}
