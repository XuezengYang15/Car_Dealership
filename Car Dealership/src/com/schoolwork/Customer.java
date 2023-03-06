package com.schoolwork;

public class Customer {
    private String firstName;
    private String lastName;
    private String transactionType;
    private String customerNumber;
    private String date;
    private double transactionAmount;

    //Constructor
    public Customer (String inputFirstName, String inputLastName,  String inputCustomerNumber,
                     String inputTransactionType, double inputTransactionAmount, String inputDate){
        firstName = inputFirstName;
        lastName = inputLastName;
        customerNumber = inputCustomerNumber;
        transactionType = inputTransactionType;
        transactionAmount = inputTransactionAmount;
        date = inputDate;
    }

    public Customer (){

    }

    //Getter
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public String getDate() { return date; }

    //Setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public void setDate(String date) { this.date = date; }

    //toString Method
    public String toString() {
        return  "First Name: " + getFirstName() + "\n" +
                "Last Name: " + getLastName() + "\n" +
                "Customer Number: " + getCustomerNumber() + "\n" +
                "Date of Purchase: " + getDate() + "\n" +
                "Transaction Type: " + getTransactionType() + "\n" +
                "Transaction Total: $" + getTransactionAmount();
    }


}
