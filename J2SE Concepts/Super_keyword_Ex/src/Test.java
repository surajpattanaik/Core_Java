
public class Test {
int x=10;
}

class Demo extends Test {
	int x=20;
	void show() {
		int x=30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
	public static void main(String[] args) {
		Demo d1=new Demo();
		d1.show();
	}
}

