class AddArgs
{
	public static void main(String[] args) {
		var sum = 0 ;
		for(int i=0 ; i < args.length; i++)
		{
			sum = sum + Integer.parseInt(args[i]);

		}
		System.out.println("After add : "+sum);

	}
}