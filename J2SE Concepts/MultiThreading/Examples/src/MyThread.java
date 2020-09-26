
public class MyThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
        System.out.println("my run method");
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		MyThread th1= new MyThread();
		th1.start();
		System.out.println("main end");
	}

}
