import java.util.Scanner;

public class multipleTable {

    public static void main(String [] args) {
        int number;
        Scanner multiple = new Scanner(System.in);
        /**
         * This Programm show the Multiple of tables:::::::
         */
        System.out.println("Input Number to Print Table ::" );
        number = multiple.nextInt();

        /**
         * :::::::::::::::
         */
        System.out.println(" Flowing is the table of :: " + number);
        for ( int i = 1; i <= 10; i++){
            System.out.println(  number + "X" + i  + "=" + number * i );
        }
        /**
         * Feedback::::::::;
         */
        System.out.println(" Thank You ");

    }
}