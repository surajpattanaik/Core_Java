import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name");
		String name=sc.next();
		System.out.println("Enter the Roll");
		int roll=sc.nextInt();
		System.out.println("Enter the cgpa");
		float cgpa=sc.nextFloat();
		System.out.println("Hello "+name);
		System.out.println(" Your Roll is "+roll);
		System.out.println(" And Cgpa is "+cgpa);
				
	}

}
