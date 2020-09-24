//'this' can be used as function argument and constructor argument.
public class Demo {
int x=20;
Demo(Test t) {
	int x=10;
	System.out.println(x);//10
	System.out.println(this.x);//20
	System.out.println(t.x);//30
}
}
class Test {
	int x=30;
	void show() {
		int x=40;
		new Demo(this);
		
	}
	public static void main(String[] args) {
		new Test().show();
	}
}
