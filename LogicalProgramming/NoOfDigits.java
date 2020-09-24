//count the no of digits...
import java.util.*;
class NoOfDigits
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
		int num= sc.nextInt();
        int digits=0;
		
		while (num>0)
		{
			num = num/10;
			digits++;
		}
		
		System.out.println("no of digits = "+digits);
	}
}