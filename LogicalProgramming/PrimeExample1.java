import java.util.Scanner;
class PrimeExample1
{
	
	static int temp=0;
	static void checkPrime(int num) {
		if(num==0||num==1){  
   System.out.println(num+" is not prime number");      
  }
  else {
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println(num +" is a prime number");
		}
		else {
			System.out.println(num +" is  not a prime number");
		}
	
	}
	}
	public static void main(String[] args) 
	{
	 Scanner scn = new Scanner(System.in);
	 System.out.println("Enter the number");
     checkPrime(scn.nextInt()); 
	}
}
