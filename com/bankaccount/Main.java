package com.bankaccount;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(2000);//Initialize the account with initial balanace of 2000 rupees
        System.out.println("*************************");
        //make some deposits abd withdrawals
        account.deposit(500);
        account.deposit(-200);
        account.deposit(1000);
        account.debit(-900);
        account.debit(12000);
        account.debit(100.89);
        System.out.println("****************************");
        //printing final balance
        System.out.println("Final balance is "+account.getBalance());
    }
}
