package ex35;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {

    public static int numberChooser(List players){
        double numPlayers = players.size() - 1;
        double winner = Math.floor(Math.random() * numPlayers + 1);

        return (int)winner;
    }

    public static void main( String[] args ) {
        Scanner se = new Scanner(System.in);
        List <String> players = new ArrayList<>();
        String name = "";

        while(true){
            System.out.print("Enter a name: ");
            name = se.nextLine();

            if(name.equals("")){
                break;
            }
            else{
                players.add(name);
            }
        }

        int res = numberChooser(players);

        System.out.println("The winner is... " + players.get(res) + "!");
    }
}
