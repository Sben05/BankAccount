/**
 * 
 * @author Shreeniket Bendre
 * Project: BankAccount
 * File: BankAccount.java
 *
 */
public class BankAccount {
	
	
	
    // Fields
	
	private String name;
	private double balance;
	private int accountNumber;
	
	
    // Constructors
   
	public BankAccount(String nameInput, int accountNumberInput) {
		name = nameInput;
		accountNumber = accountNumberInput;
		balance = 0;
	}
	
	public BankAccount(String nameInput, int accountNumberInput, double balanceInput) {
		name = nameInput;
		accountNumber = accountNumberInput;
		balance = balanceInput;
	}
	
	
	//Methods
	
	public void deposit(double amountToDeposit) {
		balance += amountToDeposit;
	}
	
	public void withdraw(double amountToWithdraw) {
		balance -= amountToWithdraw;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String toString() {
		
		return "Name of User: " + name + "\nAccount Balance: " + balance + "\nAccount Number: " + accountNumber;
	}
	
}
