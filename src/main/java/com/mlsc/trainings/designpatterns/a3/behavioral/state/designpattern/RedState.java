package com.mlsc.trainings.designpatterns.a3.behavioral.state.designpattern;

public class RedState extends AccountState {
    double serviceFee;

    // Constructor 
    public RedState(AccountState state) {
        this.balance = state.getBalance();
        this.account = state.getAccount();
        initialize();
    }

    private void initialize() {
        // Should come from a datasource
        interest = 0.0;
        lowerLimit = -100.0;
        upperLimit = 0.0;
        serviceFee = 15.00;
    }

    public void deposit(double amount) {
        balance += amount;
        stateChangeCheck();
    }

    public void withdraw(double amount) {
        balance = balance - serviceFee;
        System.out.println("No funds available for withdrawal!");
    }

    public void payInterest() {
        // No interest is paid
    }

    private void stateChangeCheck() {
        if (balance > upperLimit) {
            account.setAccountState(new SilverState(this));
        }
    }

}
