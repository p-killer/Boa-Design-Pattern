package com.mlsc.trainings.designpatterns.a3.behavioral.state.designpattern;

public class Account {

	private AccountState currentState;
	
	
	//private double balance;
	private String owner;

	public double getBalance() {
		return currentState.getBalance();
	}

//	public void setBalance(double balance) {
//		this.balance = balance;
//	}

//	public AccountState getAccountState() {
//		return accountState;
//	}

	protected void setAccountState(AccountState accountState) {
		this.currentState = accountState;
	}

	// Constructor
	public Account(String owner) {
		// New accounts are 'Silver' by default
		this.owner = owner;
		currentState = new SilverState(0.0, this);
	}

	public void deposit(double amount) {

		currentState.deposit(amount);
		
		
		System.out.println("Deposited : " + amount);
		System.out.println("Balance = " + this.getBalance());
		System.out.println("Status = "
				+ this.currentState.getClass().getName());
		System.out.println(" --------------- ");
	}

	public void withdraw(double amount) {
		currentState.withdraw(amount);
		
		
		System.out.println("Withdrew : " + amount);
		System.out.println("Balance = " + this.getBalance());
		System.out.println("Status = "
				+ this.currentState.getClass().getName());
		System.out.println(" --------------- ");
	}

	public void payInterest() {
		currentState.payInterest();
		
		
		System.out.println("Interest Paid --- ");
		System.out.println("Balance = " + this.getBalance());
		System.out
				.println("Status = " + this.currentState.getClass().getName());
		System.out.println(" ---------------- ");
	}

}
