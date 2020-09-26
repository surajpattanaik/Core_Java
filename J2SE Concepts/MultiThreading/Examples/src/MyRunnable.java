

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("my run");
	}
	public static void main(String[] args) {
	System.out.println("main start");
	MyRunnable th1 = new MyRunnable();
	Thread th2 = new Thread(th1);
	th2.start();
	System.out.println("main end");
	}

}
