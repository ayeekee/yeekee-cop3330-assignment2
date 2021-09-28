package ex31;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;

public class App {
    public static double calculateHR(int age, int rhr, int intensity){
        double targetHR = 0;

        targetHR =  (((220-age) - rhr) * (intensity * .01)) + rhr;

        return targetHR;
    }

    public static void main( String[] args ) {
        Scanner se = new Scanner(System.in);

        String old = " ";
        String resting = " ";
        int age, rhr = 0;

        while(!old.matches("[0-9]+") || !resting.matches("[0-9]+")){
            System.out.print("How old are you? ");
            old = se.nextLine();

            System.out.print("What is your resting heart rate? ");
            resting = se.nextLine();

            if(!old.matches("[0-9]+") || !resting.matches("[0-9]+")){
                System.out.println("Please enter a number.");
            }
        }

        age = Integer.parseInt(old);
        rhr = Integer.parseInt(resting);

        System.out.println("Resting pulse: " + rhr + "      " + "Age: " + age);

        double targetHR = 0;

        for(int i = 1; i<=1; i++) {
            System.out.format("Intensity |   Rate\n");
            System.out.println("------------------------");
            int intensity = 55;

            for(int j = 55; j<=95; j+=5) {
                targetHR = calculateHR(age, rhr, intensity);
                intensity += 5;
                System.out.format("%d%%       |   %d bpm\n", j, (int)Math.round(targetHR));
            }
            System.out.println();
        }

    }
}
