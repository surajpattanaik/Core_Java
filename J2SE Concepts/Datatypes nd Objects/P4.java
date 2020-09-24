class Test
{
    static int x = 5;
           int y = 6;
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(x);
		System.out.println(Test.x);
		System.out.println(t.x);
		//stem.out.println(y);   ....(error)
		//stem.out.println(Test.y);....(error)
		System.out.println(t.y);
	}
}
//o/p is 5
//       5
//       5
//       6