package com.company;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner( System.in );

    public static double getNumber( String promt ){
        System.out.print( promt );
        return scanner.nextDouble();
    }

    public static double getNumber( String promt, int min, int max ){
        while ( true ){
            System.out.print( promt );
            double number = scanner.nextDouble();
            if ( number > min && number <= max ) return number;
            else System.out.println("enter a number grater than '" + min + "' and less then or equal to '" + max + "'" );
        }
    }
}
