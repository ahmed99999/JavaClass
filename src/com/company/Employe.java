package com.company;

public class Employe {
    private int baseSalary;
    private int hourlyRate;

    public Employe( int baseSalary , int hourlyRate){
        setBaseSalary( baseSalary );
        setHourlyRate( hourlyRate );
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    private void setBaseSalary( int baseSalary ) {
        if ( baseSalary <= 0 ) throw new IllegalArgumentException("Salary cannot be negative or 0");
        this.baseSalary = baseSalary;
    }

    private void setHourlyRate( int hourlyRate ) {
        if ( hourlyRate <= 0 ) throw new IllegalArgumentException("Hourly Rate cannot be negative or 0");
        this.hourlyRate = hourlyRate;
    }

    public int calculateWage( int extraHours ){
        return this.baseSalary + ( extraHours * this.hourlyRate );
    }

    public int calculateWage( ){
        return calculateWage ( 0 );
    }
}
