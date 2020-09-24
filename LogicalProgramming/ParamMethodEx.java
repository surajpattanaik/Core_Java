import java.util.Scanner;
class ParamMethodEx 
{
	static boolean EvenOrOdd(int x)
	{
		return(x % 2 == 0);
		
	}


	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println(" Enter Number");
		int num = scn.nextInt();
	/*
	boolean even = EvenOrOdd(num);
	if(even)
		{
		System.out.println(num+"  is even");
		}
		else 
		{
			System.out.printf("%d is odd ",num);
		}
	*/


	//////////////////////OR///////////////////


    /*    
	    if(EvenOrOdd(num))
		{
		System.out.println(num+"  is even");
		}
		else 
		{
			System.out.printf("%d is odd ",num);
		}

  */

  /////////////////////OR/////////////////////
     
	 
	 System.out.println(
		 EvenOrOdd(num)
		 ? num+"  is even" : num+"  is odd");


     










	}
}
