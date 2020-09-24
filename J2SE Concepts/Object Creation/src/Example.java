//Reference Vs Object
public class Example {
int a=10,b=20,c=30;
Example()  {
	System.out.println("Example:Constructor...");
}
	public static void main(String[] args) {
		System.out.println(new Example().a);
		System.out.println(new Example().b);
		System.out.println(new Example().c);
		
		
		   Example t1=new Example();
			
		   System.out.println(t1.a);
			System.out.println(t1.b);
			System.out.println(t1.c);
			
	}

}
