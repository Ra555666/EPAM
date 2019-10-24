package org.ramus.javafundamentals.mainTask;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MTaskFundamentals {

    public static void greeting(String name){
        System.out.println("Greeting " + name);
    }

    public static void revert(String name) {
        StringBuilder sb = new StringBuilder(name);
        System.out.print("Now your name is ");
        name = sb.reverse().toString().toLowerCase();
        System.out.println(name.substring(0,1).toUpperCase() + name.substring(1,name.length()));
    }

    public static void workingWithNumbers(int quality){
        int[] arr = new int[quality];
        System.out.println("With perenos");
        for (int i = 0; i < quality; i++){
            arr[i] = (int)(Math.random()*11);
            System.out.println(arr[i]);
        }
        System.out.println("Without perenos");
        System.out.println(Arrays.toString(arr));
    }

    public static void summingNumbers(int quality){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[quality];
        int sum = 0;
        for (int i = 0; i < quality; i++){
            arr[i] = in.nextInt();
            sum +=arr[i];
        }
        System.out.println("Sum of your number is " + sum);
    }

    public static String whatIsMonthIs(int monthNumber){
        String month;
        switch (monthNumber){
            case 1: month = "January";
                break;
            case 2: month = "February";
                break;
            case 3: month = "March";
                break;
            case 4: month = "April";
                break;
            case 5: month = "May";
                break;
            case 6: month = "June";
                break;
            case 7: month = "July";
                break;
            case 8: month = "August";
                break;
            case 9: month = "September";
                break;
            case 10: month = "October";
                break;
            case 11: month = "November";
                break;
            case 12: month = "December";
                break;
            default: month = "Try again";
        }
        return month;
    }
}
