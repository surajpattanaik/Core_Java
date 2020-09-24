import java.util.Scanner;
public class Discount {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = s.nextInt();
System.out.print("Are you a student?");
boolean bn = s.nextBoolean();
	
 if( age <= 15 || age > 60 || bn )
{
	System.out.println("Your ticket price is 5$");
}
else {
	System.out.println("Your ticket price is 10$");
}
	}
	}

