//prints "beep" continuously if alarm is on.
import java.util.Scanner;
public class Alarm {
private static Scanner s;
	public static void main(String[] args) {
	s=new Scanner(System.in);
	System.out.print("Is alarm on?");
	boolean on=s.nextBoolean();
	while(on)
	{
		System.out.println("beep");
	}
		// TODO Auto-generated method stub
	

	}
}