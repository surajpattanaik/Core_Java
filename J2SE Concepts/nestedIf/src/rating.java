import java.util.Scanner;
public class rating {
	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.print("Enter rating");
		int rating = s.nextInt();
		if(rating >=0 && rating <=5)
		{
			if(rating <=2)
			{
				System.out.println("What is the reason for your low rating?");
			}
			System.out.println("Thank you for your feedback.");
			
		}
		else 
		{
			System.out.println("Invalid rating!");
		}
		
		// TODO Auto-generated method stub

	}

}
