package com.company;

import java.util.ArrayList;
import java.util.UUID;

public class BankAccount {
    private static String id;
    private double balance;
    private ClientBank client;
    private ArrayList<String> record;

    public BankAccount(double balance, ClientBank client) {
        this.id = UUID.randomUUID().toString();
        this.balance = balance;
        this.client = client;
        this.record = new ArrayList<>();
    }

    public void deposit(double money){
        balance += money;
        record.add("The " + client.getName() + ", has deposited: " + money);
    }

    public void extract(double money){
        if((balance + 2000)>= money) {
            balance -= money;
            record.add("The " + client.getName() + ",has withdrawn: " + money);
        }else{
            System.out.println("Not enought money on the account..");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", client=" + client +
                "Record= " + record +
                '}';
    }

    public void activity(){
        System.out.println(record);
    }
}
