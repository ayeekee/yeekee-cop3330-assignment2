package ex36;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static double average(List<Double> values){
        double avg = 0;
        double sum = 0;

        for(int i = 0; i < values.size(); i++)
        {
            sum += values.get(i);
            avg = sum / values.size();
        }

        return avg;
    }

    public static double max(List<Double> values){
        double max = 0;

        for(int i = 0; i < values.size(); i++) {
            if (values.get(i) > max) {
                max = values.get(i);
            }
        }

        return max;
    }

    public static double min(List<Double> values){
        double min = 100000;

        for(int i = 0; i < values.size(); i++) {
            if (values.get(i) < min) {
                min = values.get(i);
            }
        }

        return min;
    }

    public static double std(List<Double> values){
        double std = 0;

        double mean = average(values);

        for(int i = 0; i < values.size(); i++){
            std += Math.pow(values.get(i) - mean, 2);
        }

        std = Math.sqrt(std / values.size());

        return std;
    }

    public static void main( String[] args ) {
        Scanner se = new Scanner(System.in);
        ArrayList<Double> values = new ArrayList<Double>();
        String end = "done";
        String input = "";

        while(true){
            System.out.print("Enter a number: ");
            input = se.nextLine();

            if(input.equals(end)){
                break;
            }
            else if(!input.matches("[0-9]+")){
                System.out.println("Invalid input.");
            }
            else{
                double val = Double.parseDouble(input);
                values.add(val);
            }
        }

        System.out.println("Numbers: " + values);

        double avg = average(values);
        System.out.println("The average is " + String.format("%.1f", avg));

        double max = max(values);
        System.out.println("The maximum is " + String.format("%.0f", max));

        double min = min(values);
        System.out.println("The minimum is " + String.format("%.0f", min));

        double std = std(values);
        System.out.println("The standard deviation is " + String.format("%.2f", std));
    }
}
