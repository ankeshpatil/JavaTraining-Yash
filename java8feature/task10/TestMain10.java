package com.yash.java8feature.task10;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * @author ankesh.patil
 *
 */
/*
 * .WAP to which will take the year and sell in that year. User will enter 5 or
 * 10 years data. Year 2015 2016 2017 2018 2019 Sell (in crore) 5 6 5.5 6.5 8
 * Above data is sample data now you have to predict the sell for the year 2020,
 * or 2021 or 2022 on the basis of the given year sell data. User can enter sell
 * for any year and can ask for predication of sell for any given year.
 */
public class TestMain10 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap< Integer, Double> hm = new HashMap<>();
        Integer year = null;
        Double sell = null;
        System.out.println("please enter year and sell in crore");
        for(int i=1;i<6;i++)
        {
            System.out.println("Enter year");
             year = sc.nextInt();
            System.out.println("Enter sell");
            sell = sc.nextDouble();
            hm.put(year, sell);
        }
        
        hm.put((year+1), (sell+0.5));
        hm.put((year+2), (sell+1));
        hm.put((year+3), (sell+1.5));
        
        System.out.println("Your data " +hm);
        System.out.println("enter year for predication of sell for any given year");
        int input=sc.nextInt();
        hm.forEach((k,v)->System.out.println("Year is "+k +" sell is "+v));
     
        
        System.out.println(hm.get(input));
        
    }
}
