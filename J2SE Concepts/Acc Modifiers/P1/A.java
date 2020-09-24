package P1;
public class A{
	private int a=10;
	        int b=20;
	protected int c=30;
	public int d=40;
	public static void main(String[] args) {
	        	A a1 = new A();
	        	System.out.println("---------class A----------");
	        	System.out.println("a =" +a1.a + "from class A(private)" );
	        	System.out.println("b =" +a1.b + "from class A(default)" );
	        	System.out.println("c =" +a1.c + "from class A(protected)" );
	        	System.out.println("d =" +a1.d + "from class A(public)"  );

	        }        
}
