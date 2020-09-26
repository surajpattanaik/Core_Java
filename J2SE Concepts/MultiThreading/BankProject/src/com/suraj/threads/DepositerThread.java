package com.suraj.threads;

import com.suraj.blogic.*;
import com.suraj.main.*;

public class DepositerThread extends Thread {

	private BankAccount acc;
	private double amt;

	public DepositerThread(BankAccount acc, double amt, String threadName) {
		super(threadName);

		this.acc = acc;
		this.amt = amt;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
			
		acc.deposit(amt);
		
	}
}