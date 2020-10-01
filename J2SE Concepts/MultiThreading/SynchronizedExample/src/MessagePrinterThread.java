
public class MessagePrinterThread implements Runnable {
	String msg;
	PrintMessage pm;
	Thread th;

	public MessagePrinterThread(PrintMessage pm, String msg) {
		// TODO Auto-generated constructor stub
		this.pm = pm;
		this.msg = msg;
		th = new Thread(this);
		th.start();
	}

	@Override
	public void run() {
		pm.printmessage(msg);

	}

}
