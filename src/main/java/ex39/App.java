package ex39;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.HashMap;
import java.util.*;

public class App {
    public static HashMap<Integer, String> fNameMap(){
        HashMap<Integer, String> map = new HashMap<>();

        map.put(0, "Jacquelyn");
        map.put(1, "Jake");
        map.put(2, "John");
        map.put(3, "Michaela");
        map.put(4,"Sally");
        map.put(5, "Tou");

        return map;
    }

    public static HashMap<Integer, String> lNameMap(){
        HashMap<Integer, String> map = new HashMap<>();

        map.put(0, "Jackson");
        map.put(1, "Jacobson");
        map.put(2, "Johnson");
        map.put(3, "Michaelson");
        map.put(4,"Weber");
        map.put(5, "Xiong");

        return map;
    }

    public static HashMap<Integer, String> positionMap(){
        HashMap<Integer, String> map = new HashMap<>();

        map.put(0, "DBA");
        map.put(1, "Programmer");
        map.put(2, "Manager");
        map.put(3, "District Manager");
        map.put(4,"Web Developer");
        map.put(5, "Software Engineer");

        return map;
    }

    public static HashMap<Integer, String> dateMap(){
        HashMap<Integer, String> map = new HashMap<>();

        map.put(0, "");
        map.put(1, "");
        map.put(2, "2016-12-31");
        map.put(3, "2015-12-19");
        map.put(4,"2015-12-18");
        map.put(5, "2016-10-05");

        return map;
    }

    public static void main( String[] args ) {
        ArrayList mapList = new ArrayList();
        HashMap<Integer, String> fNameMap = new HashMap<>();
        HashMap<Integer, String> lNameMap = new HashMap<>();
        HashMap<Integer, String> positionMap = new HashMap<>();
        HashMap<Integer, String> dateMap = new HashMap<>();

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

        System.out.println(sortFN.get(0) + " " + sortLN.get(0) +"   | " +sortPS.get(0)+"                 | " + sortDT.get(0));
        System.out.println(sortFN.get(1) + " " + sortLN.get(1) +"       | " +sortPS.get(1)+"          | " + sortDT.get(1));
        System.out.println(sortFN.get(2) + " " + sortLN.get(2) +"        | " +sortPS.get(2)+"             | " + sortDT.get(2));
        System.out.println(sortFN.get(3) + " " + sortLN.get(3) +" | " +sortPS.get(3)+"    | " + sortDT.get(3));
        System.out.println(sortFN.get(4) + " " + sortLN.get(4) +"         | " +sortPS.get(4)+"       | " + sortDT.get(4));
        System.out.println(sortFN.get(5) + " " + sortLN.get(5) +"           | " +sortPS.get(5)+"   | " + sortDT.get(5));

    }
}



