//display the grades according to marks obtained.
import java.io.*;
public class Grades {

	public static void main(String[] args) throws IOException {
		int m;
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		System.out.println("Enter the marks");
		m=Integer.parseInt(in.readLine());
		if(m>=80)
		{
			System.out.println("Distinction");
		}
		if((m>=60) && (m<80))
		{
			System.out.println("first division");
		}
		if((m>=45)&& (m<60))
		{
			System.out.println("second division");
		
		}
		if((m>=40)&&(m<45))
		{
			
			System.out.println("pass");
		}
		if(m<40)
		{
			System.out.println("Promotion not granted");
		}
		// TODO Auto-generated method stub

	}

}
