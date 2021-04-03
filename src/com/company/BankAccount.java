package com.company;

public class BankAccount {
    private int id;
    private String name;
    private double balance;

    public BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public BankAccount(int id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0.0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double credit(double cash){
        this.balance += cash;
        return this.balance;
    }

    public double debit(double cash){
        if ((this.balance - cash) < 0){
            System.out.println("No hay dinero para completar la transaccion");
        }
        else {
            this.balance -= cash;
        }
        return this.balance;
    }

    public void showAccount(){
        System.out.println("ID: #" + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Balance: $" + this.balance);
    }
}
