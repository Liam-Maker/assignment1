package com.meritamerica.assignment1;


public class MeritAmericaBankApp {

	public static void main(String args[]) {
		
		AccountHolder myAccount = new AccountHolder("Yoni","","Werkneh", "6758244555", 100, 1000);
		
	
		System.out.println(myAccount.toString());

		
		myAccount.getCheckingAccount().deposit(500);

		
		myAccount.getSavingsAccount().withdraw(800);
		
		
		
		
		System.out.println(myAccount.getCheckingAccount().toString());
		System.out.println(myAccount.getSavingsAccount().toString());
	
	AccountHolder herAccount = new AccountHolder("Zufan","","Werkneh", "6758244800", 200, 500);
		herAccount.getCheckingAccount().deposit(-500);
		herAccount.getSavingsAccount().withdraw(600);
		
		System.out.println(herAccount.toString());
		System.out.println(herAccount.getCheckingAccount().toString());
		System.out.println(herAccount.getSavingsAccount().toString());
	}
}
/* public static void main(String[] args)
Instantiate an account holder with a checkings balance of $100 and a savings balance of $1000
Display the account holder’s toString() output
Deposit $500 into the checking account
Withdraw $800 from the savings account
Display the checking account toString() output
Display the savings account toString() output
Instantiate another account holder with a checkings balance of $200 and a savings balance of $500
Deposit -$500 into the checking account
Withdraw $600 from the savings account
Display the second account holder’s toString() output
*/

