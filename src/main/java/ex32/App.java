package ex32;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;

public class App {

    public static int easy(){
        int max = 10;
        int min = 1;

        int key = (int)(Math.random()*(max-min)) + min;

        return key;
    }

    public static int med(){
        int max = 100;
        int min = 1;

        int key = (int)(Math.random()*(max-min)) + min;

        return key;
    }

    public static int hard(){
        int max = 1000;
        int min = 1;

        int key = (int)(Math.random()*(max-min)) + min;

        return key;
    }

    public static void main( String[] args ) {
        Scanner se = new Scanner(System.in);

        System.out.println("Let's play Guess the Number!");

        String level = "";
        int choice;

        String again = "";

        while(!again.matches("n(?i)")){
            while(!level.matches("[1-3]")){
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                level = se.nextLine();

                if(!level.matches("[1-3]")){
                    System.out.println("Sorry, that is not a valid input.");
                }
            }
            choice = Integer.parseInt(level);

            String guess = "";
            int key = 0;

            if(choice == 1){
                key = easy();
            }
            else if(choice == 2){
                key = med();
            }
            else if(choice == 3){
                key = hard();
            }

            int numGuess = 0;

            int g = -1;

            while(g != key){
                System.out.print("I have my number. What's your guess? ");
                guess = se.nextLine();
                g = Integer.parseInt(guess);

                if(!guess.matches("[1-9]*")){
                    System.out.print("Wrong. Guess again.");
                    numGuess++;
                }

                while(g != key) {
                    if (g < key) {
                        System.out.print("Too low. Guess again: ");
                        guess = se.nextLine();
                        g = Integer.parseInt(guess);
                        numGuess++;
                    } else if (g > key) {
                        System.out.print("Too high. Guess again: ");
                        guess = se.nextLine();
                        g = Integer.parseInt(guess);
                        numGuess++;
                    }
                }

                if(g == key){
                    System.out.println("You got it in " + numGuess + " guesses!");
                    break;
                }
            }

            System.out.print("Do you wish to play again? (Y/N) " );
            again = se.nextLine();

            if(again.matches("y(?i)")){
                continue;
            }else if(again.matches("n(?i)")){
                break;
            }else{
                System.out.println("Invalid input.");
            }
        }
    }
}
