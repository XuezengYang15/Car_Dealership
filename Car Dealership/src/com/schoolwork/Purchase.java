package com.schoolwork;

public class Purchase extends Transaction {

    double amount;

    //Constructor
    public Purchase(double priceOfCar) {
        this.amount = priceOfCar;
    }

    @Override
    public double getAmount() {
        return amount;
    }


    //setter
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
