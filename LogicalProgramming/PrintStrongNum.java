import java.util.*;
//total sum of factorial of each digit is the same no.
class PrintStrongNum
{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter limit: ");
	int limit = sc.nextInt();
	

    for(int num=1; num<limit; num++){
		int res = 0;
		int temp =num;
	while(num>0){
		int fact=1;
		int rem = num%10;
		for (int i=1; i<=rem ;i++ )
		{
             fact = fact*i;
		}
		res = res+fact;
		num = num/10;

	}
	//System.out.println(temp+"\n"+res);

      if (temp == res)
		System.out.println(temp+" is a strong number.");
	}

	}
}