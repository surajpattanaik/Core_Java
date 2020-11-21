package FuctionalInterfaces.PredefinedFI.Predicate;

import java.util.function.Predicate;

public class Example {

	public static void main(String[] args) {

		Predicate<String> pr = s -> s.length() > 5;
		String[] s = { "12", "12345", "123456", "1234567", "23" };
		
	   for(String s1:s) {
		   if(pr.test(s1)) {
			   System.out.println(s1+" have "+s1.length()+" characters which is greater thatn 5");
		   }
	   }

	}
}
