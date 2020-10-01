
public class PrintMessage {
	synchronized void printmessage(String msg) {
	//void printmessage(String msg) {
		System.out.print("{ " + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println("}");
	}
}
