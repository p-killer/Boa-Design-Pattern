package com.mlsc.trainings.designpatterns.a3.behavioral.state.procedural;

public class Account {

	private double balance;
	private String owner;

	public Account(String owner) {
		this.owner = owner;
	}
	
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getOwner() {
		return owner;
	}
	
	
	

}
