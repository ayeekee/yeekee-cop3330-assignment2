package ex40;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.HashMap;
import java.util.*;
import java.util.Scanner;

public class App {
    public static HashMap<String, String> fNameMap(){
        HashMap<String, String> map = new HashMap<>();

        map.put("Jackson", "Jacquelyn");
        map.put("Jacobson", "Jake");
        map.put("Johnson", "John");
        map.put("Michaelson", "Michaela");
        map.put("Weber","Sally");
        map.put("Xiong", "Tou");

        return map;
    }

    public static HashMap<String, String> lNameMap(){
        HashMap<String, String> map = new HashMap<>();

        map.put("Jackson", "Jackson");
        map.put("Jacobson", "Jacobson");
        map.put("Johnson", "Johnson");
        map.put("Michaelson", "Michaelson");
        map.put("Weber","Weber");
        map.put("Xiong", "Xiong");

        return map;
    }

    public static HashMap<String, String> positionMap(){
        HashMap<String, String> map = new HashMap<>();

        map.put("Jackson", "DBA");
        map.put("Jacobson", "Programmer");
        map.put("Johnson", "Manager");
        map.put("Michaelson", "District Manager");
        map.put("Weber","Web Developer");
        map.put("Xiong", "Software Engineer");

        return map;
    }

    public static HashMap<String, String> dateMap(){
        HashMap<String, String> map = new HashMap<>();

        map.put("Jackson", "");
        map.put("Jacobson", "");
        map.put("Johnson", "2016-12-31");
        map.put("Michaelson", "2015-12-19");
        map.put("Weber","2015-12-18");
        map.put("Xiong", "2016-10-05");

        return map;
    }

    public static void main( String[] args ) {
        ArrayList mapList = new ArrayList();

        Scanner se = new Scanner(System.in);

        HashMap<String, String> fNameMap = new HashMap<>();
        HashMap<String, String> lNameMap = new HashMap<>();
        HashMap<String, String> positionMap = new HashMap<>();
        HashMap<String, String> dateMap = new HashMap<>();

        fNameMap = fNameMap();
        lNameMap = lNameMap();
        positionMap = positionMap();
        dateMap = dateMap();

        mapList.add(fNameMap);
        mapList.add(lNameMap);
        mapList.add(positionMap);
        mapList.add(dateMap);



        System.out.println("Name                | Position            | Separation Date");
        System.out.println("--------------------|---------------------|------------------");

        ArrayList<String> sortFN = new ArrayList<String>(fNameMap.values());
        ArrayList<String> sortLN = new ArrayList<String>(lNameMap.values());
        ArrayList<String> sortPS = new ArrayList<String>(positionMap.values());
        ArrayList<String> sortDT = new ArrayList<String>(dateMap.values());





    }
}