package com.schoolwork;

public class Lease extends Transaction {

    double monthlyPayment;
    int numOfMonth;

    //Constructor
    public Lease(double monthlyPayment, int numOfMonth) {
        this.monthlyPayment = monthlyPayment;
        this.numOfMonth = numOfMonth;
    }

    @Override
    public double getAmount() {
        double amount = monthlyPayment * numOfMonth;
        return amount;
    }

    //getter
    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public int getNumOfMonth() {
        return numOfMonth;
    }

    //setter
    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public void setNumOfMonth(int numOfMonth) {
        this.numOfMonth = numOfMonth;
    }

    //toString method
    public String toString() {
        return "Total amount paid for lease: " + getAmount() + "\n" +
                "Lease term: " + numOfMonth + "\n" +
                "Monthly payment: " + monthlyPayment;
    }
}
