package MultiThreadedClassExample;

public class MyThread3 extends Thread {
	public void deposit() {
		System.out.println("Deposit: MyThread3 "+getName());
	}
	public void withdraw() {
		System.out.println("Withdraw: MyThread3 "+getName());
	}
	@Override
		public void run() {
			// TODO Auto-generated method stub
		System.out.println("run: MyThread3 "+getName());
			deposit();
			withdraw();
		}
}
