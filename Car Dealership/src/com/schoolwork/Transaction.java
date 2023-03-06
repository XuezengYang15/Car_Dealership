package com.schoolwork;

//Superclass

abstract class Transaction {

    private String customer;
    private int date;

    public abstract double getAmount();
}
