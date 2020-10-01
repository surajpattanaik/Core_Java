import java.util.*;
class SumOfEvenandOddDigits
{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
		int num= sc.nextInt();
        int sum=0,rem;
		int sum_of_even=0;
		int sum_of_odd =0;
		
		while (num>0)
		{
			rem = num%10;
			if (rem%2==0)
			{
				sum_of_even = sum_of_even + rem;
			} else
			{
				sum_of_odd = sum_of_odd + rem;
			}
			  
			num = num/10;
			
		}
		
		System.out.println("sum of even num = "+sum_of_even+" \nand sum of odd num = "+sum_of_odd);
	}
}