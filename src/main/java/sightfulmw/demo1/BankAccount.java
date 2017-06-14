package sightfulmw.demo1;

public class BankAccount {
	

	private String accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void depositFunds (double addedFunds) {
		balance += addedFunds;
	}
	
	public void withdrawFunds (double removedFunds){
		if (removedFunds > balance){
			System.out.println("Insufficient Funds " + "Cannot remove " + removedFunds + " from Account " + getAccountNumber() + ". with a balance of " + balance + ".");
		} else {
			balance -= removedFunds;
		}
	}

}
