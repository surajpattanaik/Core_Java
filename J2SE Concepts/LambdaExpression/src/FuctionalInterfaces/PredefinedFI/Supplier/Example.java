package FuctionalInterfaces.PredefinedFI.Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Example {

	
	public static void main(String[] args) {
		Supplier<Date> sp=()->new Date();
		System.out.println(sp.get());
	}
}
