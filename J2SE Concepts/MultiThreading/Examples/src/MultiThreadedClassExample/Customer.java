package MultiThreadedClassExample;

public class Customer {
public static void main(String[] args) {
	System.out.println("main start ");
	MyThread1 mt1 = new MyThread1();
	MyThread2 mt2 = new MyThread2();
	MyThread3 mt3 = new MyThread3();
	mt1.start();
	mt2.start();
	mt3.start();
	System.out.println("main end ");
}
}
