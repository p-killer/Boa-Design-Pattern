package com.mlsc.trainings.designpatterns.a3.behavioral.state.designpattern;

public class AccountApp {

	public static void main(String[] args) {

		Account account = new Account("Rajeev Bajaj");

		// Financial transactions
		account.deposit(500.0);
		account.deposit(300.0);
		account.deposit(550.0);
		account.payInterest();
		account.withdraw(2000.00);
		account.withdraw(1100.00);

	

	}
}
