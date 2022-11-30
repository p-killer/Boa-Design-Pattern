package com.mlsc.trainings.designpatterns.a3.behavioral.state.procedural;

public class AccountApp {

	public static void main(String[] args) {

		Account account = new Account("Chandrakant");

		AccountService service = new AccountService(account);
		
		service.deposit(5000);
		System.out.println(account.getBalance());

		service.payInterest();
		System.out.println("After paying Interest : " + account.getBalance());

		service.withdraw(4505);
		service.payInterest();
		System.out.println(account.getBalance());

		service.withdraw(600);
		System.out.println(account.getBalance());
		
		service.withdraw(600);
		service.payInterest(); // Interest will not be paid
		service.payInterest(); // Interest will not be paid
		System.out.println(account.getBalance());
		
		
		

	}

}
