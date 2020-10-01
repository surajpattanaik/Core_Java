import java.util.*;
//total sum of factorial of each digit is the same no.
class StrongNo
{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number: ");
	int num = sc.nextInt();
	int temp;
	temp=num;
	int res = 0;


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
	{
		System.out.println("It is a strong number.");
	}
	else{
		System.out.println("It is not a strong number.");
	}



	}
}