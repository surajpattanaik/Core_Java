import java.math.*;
public class FactWithoutDatatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer f=1;
Integer num=Integer.parseInt(args[0]);
for(Integer i= 1; i<= num ; i++)
{
	f=f*i;
	System.out.println("fact is : "+f);
	
}
BigInteger f1=new BigInteger("1");
for(Integer i=1; i<=num; i++) {
	f1=f1.multiply(new BigInteger(""+i));
	System.out.println("fact is "+f1);
}
	}

}
