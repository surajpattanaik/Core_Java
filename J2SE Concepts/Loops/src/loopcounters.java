//adds numbers from 15 o 20 and returns sum.
public class loopcounters {
public int addnumbers()
{
	int sum=0;
	for(int i=15; i<=20; i++)
	{
		sum += i;
		
	}
	System.out.println(sum);
	return sum;
	
}
	public static void main(String[] args) {
		loopcounters n=new loopcounters();
		n.addnumbers();
		// TODO Auto-generated method stub
		
	}

}
