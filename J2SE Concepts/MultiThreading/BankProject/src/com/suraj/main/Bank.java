package com.suraj.main;

import com.suraj.blogic.*;
import com.suraj.threads.*;

public class Bank {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount();
		BankAccount acc3 = new BankAccount();

		acc1.setAccNum(1234);
		acc2.setAccNum(5678);
		acc3.setAccNum(7654);
		acc3.setBalance(10000);

		System.out.println("initial acc1 balance " + acc1.currentBalance());

		System.out.println("initial acc2 balance " + acc2.currentBalance());

		System.out.println("initial acc3 balance  " + acc3.currentBalance());

		DepositerThread dt1 = new DepositerThread(acc1, 5000, "Counter1");

		DepositerThread dt2 = new DepositerThread(acc2, 2000, "Counter2");

		WithdraweeThread wt3 = new WithdraweeThread(acc3, 3000, "Counter3");

		dt1.start();
		dt2.start();
		wt3.start();

		try {
			// Thread.sleep(10000); //main thread sleeps(paused) for 10 sec.
			 dt1.join(); //main thread paused and will resume after counter1 finishes its execution.
			 dt2.join(); //main thread paused and will resume after counter2 finishes its execution.

			 wt3.join(5000); //here also main thread will pause but only for 5 secs 
			 //if within 5 secs counter3 finish then main thread will continue 
			 //but if counter3 takes more time to complete then main thread will not wait for C3 and will start its operation.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		System.out.println("updated acc1 balance " + acc1.currentBalance());

		System.out.println("updated acc2 balance " + acc2.currentBalance());

		System.out.println("updated acc3 balance  " + acc3.currentBalance());

	}

}
