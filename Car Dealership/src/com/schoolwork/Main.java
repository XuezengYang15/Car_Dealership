package com.schoolwork;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numOfCustomers;
        String inputFirstName;
        String inputLastName;
        String transactionType = "";
        String inputCustomerNumber;
        String date;
        int response, numOfMonths;
        double leaseAmount = 0; //Total amount paid during leasing the car.
        double priceOfCar;
        double monthlyPayment = 0;
        double transactionAmount = 0;
        double residueValue; //residue value is the amount owed on car after lease terms.

        Scanner keyboard = new Scanner(System.in);

        Dealership dealer = new Dealership();

        //Array list to hold all of the customers
        ArrayList<Customer> customerList = new ArrayList<Customer>();

        System.out.println("How many customers came to the dealership?");
        numOfCustomers = keyboard.nextInt();

        //Consume the remaining newline.
        keyboard.nextLine();

        for (int index = 0; index < numOfCustomers; index++) {

            System.out.println("What is customer " + (index + 1) + "'s first name?");
            inputFirstName = keyboard.nextLine();

            System.out.println("What is customer " + (index + 1) + "'s last name?");
            inputLastName = keyboard.nextLine();

            System.out.println("What is customer " + (index + 1) + "'s phone number?");
            inputCustomerNumber = keyboard.nextLine();

            System.out.println("What was the date when customer " + (index + 1) + " came in to buy the car?");
            date = keyboard.nextLine();

            System.out.println("Did the customer lease the car, enter 1. If they brought it in cash, enter 2:");
            response = keyboard.nextInt();


            if (response == 1) {
                transactionType = "Lease";
                System.out.println("What is the retail price of the car?");
                priceOfCar = keyboard.nextDouble();

                //Leasing will not use down payment or charge interest in this program.
                System.out.println("Enter the number of months customer " + (index + 1) + " is leasing.  " +
                        "Please select from the following numbers, 24, 36, 39, 48, 60, 72, 84, or 96: ");
                numOfMonths = keyboard.nextInt();

                //Consume the remaining newline.
                keyboard.nextLine();

                //I used rydeshopper.com lease calculator to figure out how leasing works.
                //Down payment and interest rates were left out of the calculation.
                //The decimal number was found by dividing the residue value by the retail value.
                switch (numOfMonths) {
                    case 24:
                        residueValue = .7225 * priceOfCar;
                        leaseAmount = priceOfCar - residueValue;
                        monthlyPayment = leaseAmount / numOfMonths;
                        break;
                    case 36:
                        residueValue = .6141 * priceOfCar;
                        leaseAmount = priceOfCar - residueValue;
                        monthlyPayment = leaseAmount / numOfMonths;
                        break;
                    case 39:
                        residueValue = .5897 * priceOfCar;
                        leaseAmount = priceOfCar - residueValue;
                        monthlyPayment = leaseAmount / numOfMonths;
                        break;
                    case 48:
                        residueValue = .5220 * priceOfCar;
                        leaseAmount = priceOfCar - residueValue;
                        monthlyPayment = leaseAmount / numOfMonths;
                        break;
                    case 60:
                        residueValue = .4437 * priceOfCar;
                        leaseAmount = priceOfCar - residueValue;
                        monthlyPayment = leaseAmount / numOfMonths;
                        break;
                    case 72:
                        residueValue = .3771 * priceOfCar;
                        leaseAmount = priceOfCar - residueValue;
                        monthlyPayment = leaseAmount / numOfMonths;
                        break;
                    case 84:
                        residueValue = .3206 * priceOfCar;
                        leaseAmount = priceOfCar - residueValue;
                        monthlyPayment = leaseAmount / numOfMonths;
                        break;
                    case 96:
                        residueValue = .396 * priceOfCar;
                        leaseAmount = priceOfCar - residueValue;
                        monthlyPayment = leaseAmount / numOfMonths;
                        break;
                    default:
                        System.out.println("Invalid leasing term selected.");
                }

                Lease leaseTransaction = new Lease(monthlyPayment, numOfMonths);

                transactionAmount = leaseTransaction.getAmount();

                //Adds the lease amount to the grand total profit.
                dealer.addToGrandTotal(leaseTransaction.getAmount());
            } else if (response == 2) {
                transactionType = "Purchase in full";
                System.out.println("What is the retail price of the car?");
                priceOfCar = keyboard.nextDouble();

                //Consume the remaining newline.
                keyboard.nextLine();

                //Price of car will be passed to constructor and initializing the amount
                //field in the Purchase class.
                Purchase purchaseTransaction = new Purchase(priceOfCar);

                //Transaction amount will be passed to the customer object.
                transactionAmount = purchaseTransaction.getAmount();

                //Adds the purchase price of car to grand total.
                dealer.addToGrandTotal(purchaseTransaction.getAmount());

            }

            Customer client = new Customer(inputFirstName, inputLastName, inputCustomerNumber,
                    transactionType, transactionAmount, date);

            //Adds the client to an ArrayList to print out later.
            customerList.add(client);

        }

        //Prints out the clients.
        for (Customer client : customerList)
            System.out.println(client + "\n");

        //Prints out the total transaction of from all clients.
        dealer.printGrandTotal();
    }
}
