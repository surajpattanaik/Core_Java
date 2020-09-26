package MultiThreadedClassExample;

public class MyThread2 extends Thread {
	public void deposit() {
		System.out.println("Deposit: MyThread2 "+getName());
	}
	public void withdraw() {
		System.out.println("Withdraw: MyThread2 "+getName());
	}
	@Override
		public void run() {
			// TODO Auto-generated method stub
		System.out.println("run: MyThread2 "+getName());
			deposit();
			withdraw();
		}
}
