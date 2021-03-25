/**
 * 
 * @author Shreeniket Bendre
 * Project: BankAccount
 * File: BankAccountMain.java
 *
 */
public class BankAccountMain {

	public static void main(String[] args) {
		
		BankAccount accountOne = new BankAccount("Carson Wentz", 10);
		BankAccount accountTwo = new BankAccount("Jose Canseco", 21, 300);
		
		accountOne.deposit(5);
		accountTwo.deposit(30);
		System.out.println("Account One Balance: " + accountOne.getBalance() + "\nAccount Two Balance: " + accountTwo.getBalance());
		
		accountOne.withdraw(10);
		accountTwo.withdraw(15);
		System.out.println("Account One Balance: " + accountOne.getBalance() + "\nAccount Two Balance: " + accountTwo.getBalance());
		
		accountOne.deposit(20.3);
		accountTwo.deposit(30.88);
		System.out.println("Account One Balance: " + accountOne.getBalance() + "\nAccount Two Balance: " + accountTwo.getBalance());
		
		accountOne.withdraw(10);
		accountTwo.withdraw(15);
		System.out.println("Account One Balance: " + accountOne.getBalance() + "\nAccount Two Balance: " + accountTwo.getBalance());
		
		accountOne.deposit(2833);
		accountTwo.deposit(0.001);
		System.out.println("Account One Balance: " + accountOne.getBalance() + "\nAccount Two Balance: " + accountTwo.getBalance());
		
		accountOne.withdraw(93.93);
		accountTwo.withdraw(28);
		System.out.println("Account One Balance: " + accountOne.getBalance() + "\nAccount Two Balance: " + accountTwo.getBalance());
		
		System.out.println("\n\n"+accountOne.toString());
		System.out.println("\n"+accountTwo.toString());
	}

}
