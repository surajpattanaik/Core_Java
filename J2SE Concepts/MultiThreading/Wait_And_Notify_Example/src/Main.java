//Main.java
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factory bajaj = new Factory();
		new Producer(bajaj);
		new Consumer(bajaj);
	}

}
