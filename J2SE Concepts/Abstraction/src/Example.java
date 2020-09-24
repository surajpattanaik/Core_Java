//How to Create Object of Abstract class by Inheritance.
abstract class Example {
	int x=12;
	void show()
	{
		System.out.println("Test:show()....");
	}
	abstract void display();
	abstract void fun();
}
abstract class Demo extends Example
{
	void display() {
		System.out.println("display()....");
	}
}
class Demo1 extends Demo {
void fun()
{
	System.out.println("fun()....");
}
public static void main(String[] args) {
	Demo1 d1=new Demo1();
	System.out.println(d1 instanceof Example);//true
	System.out.println(d1 instanceof Demo);//true
	System.out.println(d1 instanceof Demo1);//true
	System.out.println(d1.x);
    d1.show();
    d1.display();
    d1.fun();
}
}
