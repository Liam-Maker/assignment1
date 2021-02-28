package com.meritamerica.assignment1;

public class MeritAmericaBankApp {

	public static void main(String args[]) {
		
		AccountHolder myAccount = new AccountHolder("Yoni", "", "Werkneh", "6758244555", 100.0, 1000.0);
		
		
		System.out.println(myAccount.toString());

		
		myAccount.getCheckingAccount().deposit(500);

		
		myAccount.getSavingsAccount().withdraw(800);
	
		
		System.out.println(myAccount.getCheckingAccount().toString());
		
	
	}
}