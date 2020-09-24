class  PrintPrimeNumbers
{
	public static void main(String[] args) 
	{
		int temp=0;
		int n = 50;
		for(int num=2; num<=n; num++) {
			for(int i=2; i< num; i++)
			{
				if(num%i==0)
				{
					temp=temp+1;
				}
			}
			
			if(temp==0) 
			{

		System.out.println(num);
			}
			else {
				temp=0;
			}
		}
	}
}
