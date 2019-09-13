package com.company;

public class Painting {
    public static void main(String[] args) {

        int length= 32;
        int width= 40;
        int hight= 16;
        int areaofwindow= 15;
        int areaofdoor= 20;
        int numberofdoors= 2;
        int numberofwindows= 4;

        double multi= (length* hight*2)+ (width* hight*2) + length*width;
        double subtract= (multi-areaofdoor*numberofdoors- areaofwindow*numberofwindows);
        double divide= subtract/ 350;

        System.out.println("you will need " +divide+" gallons of paint");






    }

}
