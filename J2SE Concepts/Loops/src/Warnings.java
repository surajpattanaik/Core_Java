//prints "warning" msg 5 times.
public class Warnings {

		public void raiseAlarm(int numofWarnings)
		{
			int i=1;
			
			while(i<=numofWarnings)
			{
				System.out.println("Warning");
				i++;
			}
		}
		public static void main(String[] args)// TODO Auto-generated method stub
		{
			Warnings s = new Warnings();
			s.raiseAlarm(5);
		}
	
}

