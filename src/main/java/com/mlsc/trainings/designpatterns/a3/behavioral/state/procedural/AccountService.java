package com.mlsc.trainings.designpatterns.a3.behavioral.state.procedural;

public class AccountService {

	Account account = null;

	public AccountService(Account account) {
		this.account = account;
	}

	public void deposit(double amount) {
		double currentBalance = account.getBalance();
		currentBalance += amount;
		account.setBalance(currentBalance);
	}

	public void withdraw(double amount) {

		double currentBalance = account.getBalance();
		if (currentBalance <= 0) {
			currentBalance = currentBalance - 15;
			System.out.println("Cannot be withdrawn");
		} else {
			currentBalance -= amount;
		}
		account.setBalance(currentBalance);

	}

	public void payInterest() {

		double currentBalance = account.getBalance();
		
		if (currentBalance <= 0) {
			// No Interest

		} else if (currentBalance > 0 && currentBalance <= 1000) {
			currentBalance += ((0.5 / 100) * currentBalance);
		} else if (currentBalance > 1000) {
			currentBalance += ((0.10 / 100) * currentBalance);
		}
		account.setBalance(currentBalance);

	}

}
