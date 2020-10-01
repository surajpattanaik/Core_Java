
public class Thread1 extends Thread {
	Add a;

	Thread1(Add a1) {
		this.a = a1;
	}

	public void run() {
		a.add(50, 60);
	}
}
