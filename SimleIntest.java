package com.rishu;

import java.util.Scanner;

class Calutator{
    public static void main (String [] args ) {
        /** Reshab 22/11/2020
         * This Programm is for Calculating Simle Intest::
         */

        double simpleIntest = 0;
        int principle ;
        int time ;
        double rate ;
        Scanner si = new Scanner(System.in);
        System.out.println("enter principle amount::");
        principle = si.nextInt();
        System.out.println("Enter time:");
        time = si.nextInt();
        System.out.println("enter rate::");
        rate = si.nextDouble();
        /**
         * FOrmula Begins
         */

        simpleIntest = (principle*time*rate)/100;
        //::::::;
        System.out.println("Simple Intest is ::" + simpleIntest);
    }


}
