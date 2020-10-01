
public class MessagePrinterThreadUser {
	public static void main(String[] args) {

		PrintMessage pm = new PrintMessage();
		

		MessagePrinterThread ob1 = new MessagePrinterThread(pm, "Abc");
		MessagePrinterThread ob2 = new MessagePrinterThread(pm, "Bbc");
		MessagePrinterThread ob3 = new MessagePrinterThread(pm, "Cbc");

	}
}
