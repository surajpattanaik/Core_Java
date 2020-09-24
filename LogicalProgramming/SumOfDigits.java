//count the total sum of digits...
import java.util.*;
class SumOfDigits
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
		int num= sc.nextInt();
        int sum=0,temp;
		
		while (num>0)
		{
			temp = num%10;  
			sum += temp;
			num = num/10;
			
		}
		
		System.out.println("sum of digits = "+sum);
	}
}