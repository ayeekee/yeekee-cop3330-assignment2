package ex24;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static boolean isAnagram(char[] one, char[] two, int len){

        Arrays.sort(one);
        Arrays.sort(two);

        for (int i = 0; i < len; i++)
            if (one[i] != two[i])
                return false;

        return true;
    }

    public static int checkLength(String one, String two){
        int length1 = 0, length2 = 0;

        length1 = one.length();
        length2 = two.length();

        if(length1 == length2){
            return length1;
        }
        else{
            return 0;
        }
    }

    public static void main( String[] args ) {
        Scanner se = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");

        System.out.print("Enter the first string: ");
        String string1 = se.nextLine();

        System.out.print("Enter the second string: ");
        String string2 = se.nextLine();

        int len = checkLength(string1, string2);

        if(len == 0){
            System.out.println("\"" + string1 + "\"" + " and " + "\"" + string2 + "\"" + " are not anagrams.");
        }
        else{
            char[] char1 = string1.toCharArray();
            char[] char2 = string2.toCharArray();

            if(isAnagram(char1, char2, len) == true){
                System.out.println("\"" + string1 + "\"" + " and " + "\"" + string2 + "\"" + " are anagrams.");
            }
            else{
                System.out.println("\"" + string1 + "\"" + " and " + "\"" + string2 + "\"" + " are not anagrams.");
            }

        }

    }
}
