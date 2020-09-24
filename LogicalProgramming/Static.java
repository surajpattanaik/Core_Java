//example of static block
class Static
{
	void show(){
		System.out.println("Show()....");
	}

	static

{
	System.out.println("test:static block 1");
	Static t1=new Static();
	t1.show();
}
public static void main(String[] args) {
	System.out.println("test:main()");
}
static{
	System.out.println("test:static block 2");
}
}
//o/p...//test:static block 1
//         Show()....
//          test:static block 2
//         test:main()