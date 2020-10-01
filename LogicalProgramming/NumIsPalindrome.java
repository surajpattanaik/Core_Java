class NumIsPalindrome 
{
	public static void main(String args[]){
	
		int n = 525;
		int rev = 0;
		int temp;
		temp = n;

		while(n>0)
		{
		
           int r = n%10;
		   rev = rev*10 +r;
		   n = n/10;
         
		}
		if (temp==rev)
		{
			System.out.println("the num is palindrome");
		}
		else{
			System.out.println("the num is not palindrome");
		}




	}
}