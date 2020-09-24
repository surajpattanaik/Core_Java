
public class A extends Object {
	int x=10;
	int a=100;
	A()
	{
		System.out.println("A:Constructor");
	}

}
class B extends A {
	int y=20;
	B()
	{
		System.out.println("B:Constr");
	}
}
class C extends B {
	int z=30;
	int a=90;
	C()
	{
		System.out.println("C:Constr");
	}
	public static void main(String[] args) {
		C c1=new C();
		System.out.println(c1.a);
	    System.out.println(c1.x);
	    System.out.println(c1.y);
	    System.out.println(c1.z);
}
}