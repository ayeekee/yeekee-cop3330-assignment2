package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

public class App {

    public static void table(int size){

        for(int i = 1 ; i<=size; i++) {
            System.out.format("%5d", i);

            for(int j = 1; j<=size; j++) {
                System.out.format("%5d", i*j);
            }
            System.out.println();
        }
    }

    public static void main( String[] args ) {
        int size = 12;

        table(12);
    }
}
