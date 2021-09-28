package ex34;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;

public class App {

    public static int removeName(String remove){

        if(remove.matches("John Smith")){
            return 0;
        }
        else if(remove.matches("Jackie Jackson")){
            return 1;
        }
        else if(remove.matches("Chris Jones")){
            return 2;
        }
        else if(remove.matches("Amanda Cullen")){
            return 3;
        }
        else if(remove.matches("Jeremy Goodwin")){
            return 4;
        }
        else{
            return -1;
        }
    }

    public static void main( String[] args ) {
        Scanner se = new Scanner(System.in);

        String employees[] = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

        System.out.println("There are " + employees.length + " employees: ");
        for(int i=0; i < employees.length; i++){
            System.out.println(employees[i]);
        }

        System.out.print("Enter an employee name to remove: ");
        String remove = se.nextLine();

        int res = removeName(remove);

        if(res == -1){
            System.out.println("Invalid input.");
        }
        else{
            System.out.println("There are 4 employees: ");

            String[] copy = new String[employees.length - 1];

            for (int i = 0, j = 0; i < employees.length; i++) {
                if (i != res) {
                    copy[j++] = employees[i];
                }
            }

            for(int i=0; i < copy.length; i++){
                System.out.println(copy[i]);
            }

        }
    }
}
