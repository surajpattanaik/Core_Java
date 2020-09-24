import java.util.Scanner;
public class CoffeeMachine {
private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.print("Enter passcode");
		int passcode =s.nextInt();
		String coffeetype;
		switch(passcode)
		{
		case 555: coffeetype="Espresso";
		break;
		case 666: coffeetype="Vanilla latte";
		break;
		case 777: coffeetype="Drip coffee";
		break;
		default: coffeetype="Unknown";
		System.out.println(coffeetype);
		break;
		}
		System.out.println(coffeetype);
		// TODO Auto-generated method stub

	}

}
