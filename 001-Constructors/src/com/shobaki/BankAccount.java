package com.shobaki;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount() {
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, int phoneNumber) {
        this("99999", 100.55, customerName,email,phoneNumber);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Deposit of " + amount + " made. New balance is " + this.balance);
    }
    public void withdraw(double amount){
        if (amount <= balance){
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + " processed. Remaining balance is " + this.balance);
        }else{
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        }

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' + "\n" +
                ", balance=" + balance + "\n" +
                ", customerName='" + customerName + '\'' + "\n" +
                ", email='" + email + '\'' + "\n" +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
