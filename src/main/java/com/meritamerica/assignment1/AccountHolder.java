package com.meritamerica.assignment1;

public class AccountHolder {
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private double checkingAccountOpeningBalance;
	private double CHECKING_ACCOUNT_INTEREST_RATE = 0.0001;
	public double FUTURE_VALUE = 100.03; 
	private double savingsAccountOpeningBalance;
	private double SAVINGS_ACCOUNT_INTREST_RATE = 0.01;
	public double FUTURE_SAVINGS = 1030.03;
	
	public AccountHolder() {
	}

	public AccountHolder(String firstName, String middleName, String lastName, String ssn,
			double checkingAccountOpeningBalance, double CHECKING_ACCOUNT_INTREST_RATE, double FUTURE_VALUE, double savingsAccountOpeningBalance,
			double SAVINGS_ACCOUNT_INTREST_RATE, double FUTURE_SAVINGS) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.CHECKING_ACCOUNT_INTEREST_RATE = CHECKING_ACCOUNT_INTREST_RATE;
		this.FUTURE_VALUE = FUTURE_VALUE;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
		this.SAVINGS_ACCOUNT_INTREST_RATE = SAVINGS_ACCOUNT_INTREST_RATE;
		this.FUTURE_SAVINGS = FUTURE_SAVINGS;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public double getCheckingAccountOpeningBalance() {
		return checkingAccountOpeningBalance;
	}

	public void setCheckingAccountOpeningBalance(double checkingAccountOpeningBalance) {
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
	}

	public double getCHECKING_ACCOUNT_INTEREST_RATE() {
		return CHECKING_ACCOUNT_INTEREST_RATE;
	}

	public void setCHECKING_ACCOUNT_INTEREST_RATE(double cHECKING_ACCOUNT_INTEREST_RATE) {
		CHECKING_ACCOUNT_INTEREST_RATE = cHECKING_ACCOUNT_INTEREST_RATE;
	}

	public double getFUTURE_VALUE() {
		return FUTURE_VALUE;
	}

	public void setFUTURE_VALUE(double fUTURE_VALUE) {
		FUTURE_VALUE = fUTURE_VALUE;
	}

	public double getSavingsAccountOpeningBalance() {
		return savingsAccountOpeningBalance;
	}

	public void setSavingsAccountOpeningBalance(double savingsAccountOpeningBalance) {
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
	}

	public double getSAVINGS_ACCOUNT_INTREST_RATE() {
		return SAVINGS_ACCOUNT_INTREST_RATE;
	}

	public void setSAVINGS_ACCOUNT_INTREST_RATE(double sAVINGS_ACCOUNT_INTREST_RATE) {
		SAVINGS_ACCOUNT_INTREST_RATE = sAVINGS_ACCOUNT_INTREST_RATE;
	}

	public double getFUTURE_SAVINGS() {
		return FUTURE_SAVINGS;
	}

	public void setFUTURE_SAVINGS(double fUTURE_SAVINGS) {
		FUTURE_SAVINGS = fUTURE_SAVINGS;
	}

	@Override
	public String toString() {
		return ("Name: " + this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName()
		+ "\nSSN: " + this.getSsn() + "\nChecking Account Balance:" + this.getCheckingAccountOpeningBalance()
		+ "\nChecking Account Interest Rate:" + this.getCHECKING_ACCOUNT_INTEREST_RATE() + "\nChecking Account Balance in 3 Years: " + this.getFUTURE_VALUE()
		+ "\nSavings Account Balance: " + this.getSavingsAccountOpeningBalance() + "\nSavings Account Intrest Rate: " + this.getSAVINGS_ACCOUNT_INTREST_RATE()
		+ "\nSavings Account Balance in 3 Years: " + this.getFUTURE_SAVINGS());
	}
	
	
	/*Sample output:
		Name: John James Doe
		SSN: 123-45-6789
		Checking Account Balance: $100
		Checking Account Interest Rate: 0.0001
		Checking Account Balance in 3 years: $100.03
		Savings Account Balance: $1000
		Savings Account Interest Rate: 0.01
		Savings Account Balance in 3 years: $1030.03*/

		
	

}