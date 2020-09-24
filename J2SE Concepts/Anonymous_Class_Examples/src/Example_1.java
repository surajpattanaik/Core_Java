
public class Example_1 {
	void show()
	{
		System.out.println("Example:show()....");
	}
}
class Test
{
	public static void main(String[] args) {
		Example_1 e1=new Example_1();
		Example_1 e2=new Example_1()//anonymous1
		{
		void show()
		{
		System.out.println("Test$1:show()....");
		}
		};
		Example_1 e3=new Example_1()//anonymous2
		{
		void show()
		{
			System.out.println("Test$2:show()....");
		}
		};
		e1.show();
		e2.show();
		e3.show();
	System.out.println(e1);//hashCode of e1...
	System.out.println(e2);//hashCode of e2...
	System.out.println(e3);//hashCode of e3...
}
}