package MultiThreadedClassExample;

public class MyThread1 extends Thread {
public void deposit() {
	System.out.println("Deposit: MyThread1 "+getName());
}
public void withdraw() {
	System.out.println("Withdraw: MyThread1 "+getName());
}
@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.println("run: MyThread1 "+getName());
		deposit();
		withdraw();
	}
}
