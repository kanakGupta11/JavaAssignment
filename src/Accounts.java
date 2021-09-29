import java.util.Date;
import java.util.Scanner;

public class Accounts {
	String ownerName;
	String address;
	String accountType;
	Date createdDate;
	double balance;
	String status;
	Scanner scnr = new Scanner(System.in);
	
	public void openAccount() {
		System.out.println("Enter Name : ");
		ownerName = scnr.next();
		System.out.println("Enter your Address : ");
		address = scnr.next();
		System.out.println("Enter Account type : ");
		accountType = scnr.next();
		System.out.println("Enter Balance : ");
		balance = scnr.nextDouble();
		createdDate = new Date();
	}
	
	public void showAccount() {
		System.out.println("Name of Account Holder : "+ ownerName);
		System.out.println("Account type : " + accountType);
		System.out.println("Address : " + address);
		System.out.println("Account Balance : " + balance);
		System.out.println("Created Date : " + createdDate);
		System.out.println("Status of account : " + status);
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		if(amount < balance) {
			balance = balance - amount;
		}
		else {
			System.out.println("Current Amount is greater than your balance, transaction not possible!!");
		}
	}
	
	public boolean search(String name) {
		if(ownerName.equals(name)) {
			showAccount();
			return true;
		}
		return false;
	}
}