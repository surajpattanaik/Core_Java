
public class Demo {
void fun1() {
	System.out.println("Demo()fun1...");
}
void fun2() {
	System.out.println("Demo()fun2...");
}
}
class Test extends Demo {
	void fun1() {
		System.out.println("Test:fun1....");
		
	}
	void fun3() {
		System.out.println("Test:fun3....");
	}
	public static void main(String[] args) {
		Demo d1=new Test();
		d1.fun1();
		d1.fun2();
	//d1.fun3();//error
	}
}
