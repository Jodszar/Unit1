package com.company;
import java.util.Scanner;
public class FindTheAverage {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        double total=0;
        System.out.println("Print four values.");
        System.out.println("Value 1:");
        double value1= kb. nextDouble();
        total+= value1;
        System.out.println("Value 2:");
        double value2= kb.nextDouble();
        total+= value2;
        System.out.println("Value 3:");
        double value3= kb.nextDouble();
        total+= value3;
        System.out.println("Value 4:");
        double value4= kb.nextDouble();
        total+= value4;
        System.out.println("Average = " +total/4);





    }
}
