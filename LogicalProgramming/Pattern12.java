class Pattern12
{
	public static void main(String args[]){
		int i;
		int j;
		int k=3;
		for (i =1; i<=5 ; i++)
		{
			for (j =1;j<=i ;j++ )
			{
               
				int rem=k%2;
				k++;

				System.out.print(rem);
			}
			System.out.println();
		}

	}
}