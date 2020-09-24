//how wrapper class is slower than datatype.
class TestTime
{
	public static void main(String[] args) {
		
		long start,stop;
		int sum=0;
		start=System.currentTimeMillis ();
		for (int i=0; i<=20; i++  ) {
			sum=sum+i;

			stop=System.currentTimeMillis ();
			System.out.println("time taken by datatype: "+(stop-start));
			System.out.println("...........");

		}
			Integer sum1=0;
			start=System.currentTimeMillis ();
			for (Integer j=0; j<=20; j++ ) {
				sum1=sum1+j;
				stop=System.currentTimeMillis ();
				System.out.println("time taken by wrrapperclass: "+(stop-start));
				
			}
		}
	}
