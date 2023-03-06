package com.schoolwork;

import java.util.ArrayList;

public class Dealership {

    double grandTotal = 0;

    public void addToGrandTotal(double inputAmount) {
        this.grandTotal = this.grandTotal + inputAmount;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void printGrandTotal() {
        System.out.println("The grand total for all transactions: $" + grandTotal);
    }


}

