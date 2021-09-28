package ex27;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;

public class App {
    public static int validateFName(String fName){
        if(fName.equals("")){
            return -1;
        }
        else if(fName.length() < 2){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static int validateLName(String lName){
        if(lName.equals("")){
            return -2;
        }
        else if(lName.length() < 2){
            return 2;
        }
        else{
            return 0;
        }
    }

    public static int validateZipCode(String zip){
        if(zip.matches("\\d{5}")){
            return 0;
        }
        else{
            return 3;
        }
    }

    public static int validateID(String id){

        if(id.matches("[a-zA-Z]{2}-\\d{4}")){
            return 0;
        }
        else{
            return 4;
        }
    }

    public static void validateInput(){
        Scanner se = new Scanner(System.in);
        int[] result = new int[4];

        System.out.print("Enter the first name: ");
        String fName = se.nextLine();

        System.out.print("Enter the last name: ");
        String lName = se.nextLine();

        System.out.print("Enter the ZIP code: ");
        String zip = se.nextLine();

        System.out.print("Enter the employee ID: ");
        String id = se.nextLine();

        result[0] = validateFName(fName);
        result[1] = validateLName(lName);
        result[2] = validateZipCode(zip);
        result[3] = validateID(id);

        for(int i = 0; i < 4; i++){
            output(result[i]);
        }
    }

    public static void output(int result){

        String sf = "There were no errors found.";

        if (result == -1) {
            sf = String.format("The first name must be filled in.");
        } else if(result == -2){
            sf = String.format("The last name must be filled in.");
        } else if (result == 1) {
            sf = String.format("The first name must be at least 2 characters long.");
        } else if (result == 2) {
            sf = String.format("The last name must be at least 2 characters long.");
        } else if (result == 3) {
            sf = String.format("The zipcode must be a 5 digit number.");
        } else if (result == 4) {
            sf = String.format("The employee ID must be in the format of AA-1234.");
        }

        System.out.println(sf);
    }

    public static void main( String[] args ) {
        validateInput();
    }
}
