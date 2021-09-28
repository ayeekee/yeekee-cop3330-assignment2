package ex25;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;

public class App1
{
    public static int passwordValidator(String password){

        if(password.length() < 8){
            return -1;
        }
        else if(password.matches("[0-9]*")){
            return 1;
        }
        else if(password.matches("[a-zA-Z]+")){
            return 2;
        }
        else if(password.matches("[a-zA-Z]+[0-9]+") || password.matches("[0-9]+[a-zA-Z]+") || password.matches("[a-zA-Z]+[0-9]+[a-zA-Z]+") || password.matches("[0-9]+[a-zA-Z]+[0-9]+")){
            return 3;
        }
        else if(password.matches("[^A-Za-z0-9]+[a-zA-Z0-9]+") || password.matches("[a-zA-Z0-9]+[^A-Za-z0-9]+") || password.matches("[^A-Za-z0-9]*[a-zA-Z0-9]+[^A-Za-z0-9]*") || password.matches("[a-zA-Z0-9]*[^A-Za-z0-9]+[a-zA-Z0-9]*")){
            return 4;
        }
        else{
            return 0;
        }
    }

    public static void output(String password, int result){

        String sf = "Invalid input.";

        if(result == -1){
            sf = String.format("The password %s is not enough characters. Please make it at least 8 characters long.", password);
        }
        else if(result == 1){
            sf = String.format("The password '%s' is a very weak password.",password);
        }
        else if(result == 2){
            sf = String.format("The password '%s' is a weak password.",password);
        }
        else if(result == 3){
            sf = String.format("The password '%s' is a strong password.",password);
        }
        else if(result == 4){
            sf = String.format("The password '%s' is a very strong password.",password);
        }

        System.out.println(sf);
    }

    public static void main( String[] args ) {
        Scanner se = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String password = se.nextLine();

        int result = passwordValidator(password);

        output(password, result);
    }
}
