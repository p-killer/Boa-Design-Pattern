package com.mlsc.trainings.designpatterns.a3.behavioral.state.designpattern;

public class GoldState extends AccountState {

    // Overloaded constructors
    public GoldState(AccountState state) {
        this.balance = state.getBalance();
        this.account = state.getAccount();
        initialize();
        //this(state.getBalance(), state.getAccount());

    }

//	public GoldState(double balance, Account account) {
//		this.setBalance(balance);
//		this.setAccount(account);
//		initialize();
//	}

    private void initialize() {
        // Should come from a database
        interest = 0.05;
        lowerLimit = 1000.0;
        upperLimit = 10000000.0;
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
        if (balance < 0.0) {
            account.setAccountState(new RedState(this));
        } else if (balance < lowerLimit) {
            account.setAccountState(new SilverState(this));
        }
    }

}
