class Pattern15
{
	public static void main(String args[]){
		int i;
		int j;
		String s = "HELLO";
		char[] ch = s.toCharArray();

		for (i =0; i<=ch.length ; i++)
		{
			for (j =i; j<ch.length ;j++ )
			{

				System.out.print(ch[j]);
			}
			System.out.println();
		}

	}
}