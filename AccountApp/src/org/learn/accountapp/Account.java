package org.learn.accountapp;

public class Account {
    private static int accountCounter = 100;
    private int accountNumber;
    private String customerName;
    private double balance;

    public Account(String customerName, double balance) {
        this.accountNumber = accountCounter++;
        this.customerName = customerName;
        this.balance = balance;
    }

/*    //Constructor Overloaded
    public Account(double balance, String customerName) {
        this.accountNumber = accountCounter++;
        this.customerName = customerName;
        this.balance = balance;
    }*/

    //Getters and Setter
    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
