//Factory.java
public class Factory {

	int items;
	boolean itemsInFactory;

	synchronized void produce(int items) {
		if (itemsInFactory) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

		this.items = items;
		itemsInFactory = true;
		System.out.println("produced items: " + items);
		notify();
	}

	synchronized int consume() {
		if (!itemsInFactory) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

		itemsInFactory = false;
		System.out.println("consumed items: " + items);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notifyAll();
		return items;
	}

}
