package org.learn.accountapp;

import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Transactions transactions = new Transactions();
        System.out.println("Enter customer name and opening balance");
        String name = scanner.next();
        double balance = scanner.nextDouble();
        transactions.createAccount(name, balance);

        System.out.println("Enter account and amount to deposit");
        transactions.deposit(scanner.nextInt(), scanner.nextDouble());

        System.out.println("Enter account number to check balance");
        int accountNo = scanner.nextInt();
        transactions.checkBalance(accountNo);

    }
}
