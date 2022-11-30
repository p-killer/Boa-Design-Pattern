package com.mlsc.trainings.designpatterns.a3.behavioral.state.designpattern;

public abstract class AccountState {
	// Properties
	protected Account account;
	protected double interest;
	protected double lowerLimit;
	protected double upperLimit;
	protected double balance;

	public Account getAccount() {
		return account;
	}


	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


	public abstract void deposit(double amount);

	public abstract void withdraw(double amount);

	public abstract void payInterest();

}
