interface Test {
	static void show() {
		System.out.println("Test:Show...");
	}
}
interface Demo {
	static void show() {
		System.out.println("Demo:Show...");
	}
}
class Myclass implements Test,Demo {
	public static void main(String[] args) {
		Myclass mc=new Myclass();
		Test.show();
	    Demo.show();
	    //mc.show();\\error...
	}
}