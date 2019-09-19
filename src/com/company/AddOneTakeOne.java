package com.company;
import java.util.Scanner;
public class AddOneTakeOne {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number:");
        int total=kb.nextInt();
        int add= total--;
        int sub= add--;
        int last= sub++;
        System.out.print(total + " " );
        System.out.print(last +" ");
        System.out.print( sub );
    }
}
