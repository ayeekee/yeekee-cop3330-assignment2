package ex37;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;
import java.util.*;
import java.util.Random;

public class App {

    public static ArrayList<String> passwordGenerator(int minLen, int special, int num){

        Random rand = new Random();

        int letters = special + num;
        String[] numArray = {"1","2","3","4","5","6","7","8","9","0"};
        String[] letArray = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] specArray = {"~", "`", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", ">", "<"};

        List<String> numList = new ArrayList<String>(Arrays.asList(numArray));
        List<String> letList = new ArrayList<String>(Arrays.asList(letArray));
        List<String> specList = new ArrayList<String>(Arrays.asList(specArray));

        List<String> passwordList = new ArrayList<String>(100);

        for(int i = 1; i <= num; i++){
            passwordList.add(numList.get(rand.nextInt(numList.size())));
        }

        for(int i = 1; i <= special; i++){
            passwordList.add(specList.get(rand.nextInt(specList.size())));
        }

        for(int i = 1; i <= letters; i++){
            passwordList.add(letList.get(rand.nextInt(letList.size())));
        }

        if(passwordList.size() != minLen){
            int extra = minLen - passwordList.size();

            for(int i = 1; i <= extra; i++){
                passwordList.add(letList.get(rand.nextInt(letList.size())));
            }
        }

        Collections.shuffle(passwordList);

        return (ArrayList<String>) passwordList;
    }

    public static void main( String[] args ) {
        Scanner se = new Scanner(System.in);

        System.out.print("What's the minimum length? ");
        String min = se.next();
        int minLen = Integer.parseInt(min);

        System.out.print("How many special characters? ");
        String spec = se.next();
        int special = Integer.parseInt(spec);

        System.out.print("How many numbers? ");
        String numbers = se.next();
        int num = Integer.parseInt(numbers);

        List<String> passwordList = new ArrayList<String>(100);

        passwordList = passwordGenerator(minLen, special, num);

        System.out.print("Your password is ");
        System.out.print(passwordList.toString().replace("[","").replace("]","").replace(",","").replace(" ",""));
    }
}
