package com.suraj.threads;

import com.suraj.blogic.*;
import com.suraj.main.*;

public class WithdraweeThread extends Thread {

	private BankAccount acc;
	private double amt;

	public WithdraweeThread(BankAccount acc, double amt, String threadName) {
		super(threadName);

		this.acc = acc;
		this.amt = amt;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
			try {
				Thread.sleep(7000); //counter 3 pause for 7 secs.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		acc.withdraw(amt);
		
	}
}