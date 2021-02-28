package com.meritamerica.assignment1;


public class SavingsAccount extends CheckingAccount {
	protected final double ANNUAL_INTEREST_RATE =  .01;
	public SavingsAccount(double openingBalance) {
		super(openingBalance);
	}

	public String toString(){
		return "Savings Account Balance: $" + currentBalance + "\n" +
			"Savings Account Interest Rate: " + ANNUAL_INTEREST_RATE + "\n" +
			"Savings Account Balance in 3 years: $" + futureValue(3) + "\n";		
	}
}

/*SavingsAccount(double openingBalance)
double getBalance()
double getInterestRate()
boolean withdraw(double amount)
boolean deposit(double amount)
double futureValue(int years)
String toString()
Sample output:
Savings Account Balance: $1000
Savings Account Interest Rate: 0.01
Savings Account Balance in 3 years: $1030.03
*/