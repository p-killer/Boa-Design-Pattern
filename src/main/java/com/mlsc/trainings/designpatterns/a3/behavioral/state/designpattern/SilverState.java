package com.mlsc.trainings.designpatterns.a3.behavioral.state.designpattern;

public class SilverState extends AccountState {

    // Overloaded constructors

    public SilverState(AccountState state) {
        this(state.getBalance(), state.getAccount());

    }

    public SilverState(double balance, Account account) {
        this.balance = balance;
        this.account = account;
        initialize();
    }

    private void initialize() {
        // Should come from a datasource
        interest = 0.0;
        lowerLimit = 0.0;
        upperLimit = 1000.0;
    }

    public void deposit(double amount) {
        balance += amount;
        stateChangeCheck();
    }

    public void withdraw(double amount) {
        balance -= amount;
        stateChangeCheck();
    }

    public void payInterest() {
        balance += interest * balance;
        stateChangeCheck();
    }

    private void stateChangeCheck() {
        if (balance < lowerLimit) {
            account.setAccountState(new RedState(this));
        } else if (balance > upperLimit) {
            account.setAccountState(new GoldState(this));
        }
    }

}
