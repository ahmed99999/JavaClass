package com.company;

public class Morgage {
    private double principal;
    private double interest;
    private double period;

    public Morgage( double principal, double interest, double period ){
        setPrincipal( principal );
        setPeriod( period );
        setInterest( interest );
    }

    private void setInterest( double interest ){
        if ( interest < 0 || interest > 30 ) throw new IllegalArgumentException("Interest should be between 0 and 30");
        this.interest = interest;
    }

    private void setPeriod( double period ){
        if ( period < 1 || period > 30 ) throw new IllegalArgumentException("Period should be between 1 and 30");
        this.period = period;
    }

    private void setPrincipal( double principal ){
        if ( principal < 1000 || principal > 1_000_000 ) throw new IllegalArgumentException("Principal should be between 1000 and 1.000.000");
        this.principal = principal;
    }

    public double getBalance( int m ){
        double rate = this.interest / 100 / 12;
        double period = this.period * 12 ;
        return this.principal * ( Math.pow( 1 + rate, period ) - Math.pow( 1 + rate, m )) / ( Math.pow( 1 + rate, m ) - 1 );
    }

    public double getMorgage(){
        double rate = this.interest / 100 / 12;
        double period = this.period * 12;
        return this.principal * ( rate *  Math.pow((1 + rate), period) ) / ( Math.pow( (1 + rate), period ) - 1 );
    }
}
