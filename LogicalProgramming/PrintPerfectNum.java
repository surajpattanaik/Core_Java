import java.util.Scanner;
class PrintPerfectNum
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.println("enter limit");
		int limit = sc.nextInt();
		for(int num=1; num<limit; num++) {
		int res =0;
	for (int i=1; i<num ;i++ )
	{
		if (num%i ==0)
		{
           res = res+i;
		}
		
	}
	if(num == res) 
			 System.out.println(num+" is a perfect number");
		}
	}
}