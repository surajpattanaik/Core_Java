class PerfectNumber
//sum of total factors (excluding itself) is itself. ex : 6.
{
	public static void main(String args[]){
	
	
    int num = 6;
	int res =0;
	for (int i=1; i<num ;i++ )
	{
		if (num%i ==0)
		{
           res = res+i;
		}
	}
	if (res == num)
	{
		System.out.println("it is a perfect number.");
	}
	else{
		System.out.println("it is not a perfect number.");
	}



	}
}