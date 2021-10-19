package org.learn.accountapp;

import java.util.ArrayList;
import java.util.List;

public class Transactions {

    List<Account> accountsList;

    public Transactions() {
        this.accountsList = new ArrayList<>();
    }

    public void deposit(int accountNumber, double amount){
        //search the account in the list
        Account account = getAccount(accountNumber);
        if(account != null){
            //if account found deposit amount
            double newBalance = account.getBalance() + amount;
            account.setBalance(newBalance);
            System.out.println(newBalance);
        }else{
            //If not found display message
            System.out.println("Account does not exist");
        }

    }

    public void createAccount(String customerName, double openingBalance){
        Account account  = new Account( customerName, openingBalance);
        accountsList.add(account);
        System.out.println("Account created successfully. Account number is " + account.getAccountNumber());
    }

    public void checkBalance(int accountNumber){
        Account account = getAccount(accountNumber);
        if(account!= null){
            System.out.println(account.getBalance());
        }else{
            System.out.println("Account does not exist");
        }
    }

    private Account getAccount(int accountNumber){
        Account account = null;

        for(Account acc: accountsList){
            if(acc.getAccountNumber() == accountNumber){
                account = acc;
                break;
            }
        }
        return account;
    }

}
