package com.company;

import java.text.NumberFormat;

public class Main {

    public static void main( String[] args ){
        double principal = Console.getNumber( "Principal ( $1K - $1M ): ", 1000, 1_000_000 );
        double interest = Console.getNumber( "Annual Interest Rate: ", 0, 30);
        double period = Console.getNumber( "Period (Years): ", 1, 30);

        var morgageObj = new Morgage( principal, interest, period );
        System.out.println( "Mortgage: " + NumberFormat.getCurrencyInstance().format( morgageObj.getMorgage() ));
    }
}
