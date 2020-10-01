class Pattern14
{
	public static void main(String args[]){
		int i;
		int j;
		String s = "HELLO";
		char[] ch = s.toCharArray();

		for (i =ch.length; i>=1 ; i--)
		{
			for (j =0; j<=i-1 ;j++ )
			{

				System.out.print(ch[j]);
			}
			System.out.println();
		}

	}
}