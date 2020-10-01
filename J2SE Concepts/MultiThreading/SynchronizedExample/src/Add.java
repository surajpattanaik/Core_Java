
public class Add {
	int x, y;

	synchronized void add(int x, int y) {
	// void add(int x, int y) {
		this.x = x;
		this.y = y;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}

		int res = this.x + this.y;
		System.out.println("In " + Thread.currentThread().getName() + "Result " + res);

	}
}
