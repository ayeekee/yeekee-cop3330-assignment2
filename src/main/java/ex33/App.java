package ex33;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;
import java.util.Random;

public class App {

    public static int magic8Ball(String[] responses){
        Random r = new Random();
        int key = r.nextInt(responses.length);

        return key;
    }

    public static void main( String[] args ) {
        Scanner se = new Scanner(System.in);

        String[] responses = {"Yes.", "No.", "Ask again later."};

        System.out.println("What's your question? ");
        String question = se.nextLine();

        int key = magic8Ball(responses);

        System.out.println(responses[key]);
    }
}
