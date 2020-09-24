abstract class Example{
	static int a;
	static{
		System.out.println("hi");
	}
	{
        System.out.println("non static");
	}
	static void m1() {
		System.out.println("hi 1");
	}
	Example(){
		a=20;
		System.out.println("Const "+a);
	}
abstract void m2();
abstract int m3();
//static abstract void m3();
//final abstract void m4();
//private abstract void m5();
protected abstract void m4();
public abstract void m5();
public static void main(String args[]){
	a = 10;
	//Example e1 = new Example();
}
}