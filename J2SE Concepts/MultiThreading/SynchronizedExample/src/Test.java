
public class Test {
	public static void main(String[] args) {
		Add a = new Add();
		Thread1 th1 = new Thread1(a);
		Thread  th2 = new Thread2(a);
		th1.start();
		th2.start();

	}
}
