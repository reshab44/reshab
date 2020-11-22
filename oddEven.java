package com.rishu;

import java.util.Scanner;

class evenOdd
{
    public static void main(String args[])
    {
        /**  Reshab 21/11/2020
         * This program is shows for old and even Numbers
         */
        int number = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check eithe this Number is even or old::");
        number = sc.nextInt();

        /**
         * if Statements Begins
         */

         if ( number / 2 == 0){
             System.out.println("This number is even .  \\n ::: Thank you :::");
         }
         else {
             System.out.println("This number is odd.  \\n  ::: Thank You ::");
         }
    }
}