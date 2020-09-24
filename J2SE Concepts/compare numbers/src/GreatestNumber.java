//accepts three numbers.If they are unequal then display the greatest number or display they are equal.
import java.io.*;
public class GreatestNumber {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
int a,b,c;
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.println("Enter three numbers");
a=Integer.parseInt(in.readLine());
b=Integer.parseInt(in.readLine());
c=Integer.parseInt(in.readLine());
if((a>b) && (a>c))
{
	System.out.println(a+" is greatest number");
}
else if((b>a) && (b>c))
{
	System.out.println(b+" is greatest number");
}
else if((c>a)&&(c>b))
{
	System.out.println(c+" is greatest number");
}
else {
	System.out.println("Numbers are equeal!!");
}
}

}
