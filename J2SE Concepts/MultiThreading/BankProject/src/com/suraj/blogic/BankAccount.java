package com.suraj.blogic;

public class BankAccount {
	private long accNum;
	private double balance;

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amt) {
       this.balance = this.balance + amt ;
       System.out.println(amt + " is deposited successfully in the account "+accNum+
    		   " from the thread "+Thread.currentThread().getName());
      
	}
	
	public void withdraw(double amt) {
	       this.balance = this.balance - amt ;
	       System.out.println(amt + " is withdrawn successfully from the account "+accNum+
	    		   " from the thread "+Thread.currentThread().getName());
	      
		}
	public double currentBalance() {
		return balance;
	}
}
