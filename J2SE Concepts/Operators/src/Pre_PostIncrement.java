//example of unary operators
public class Pre_PostIncrement {
	public static void main(String[] args) {
		int x=90;
		System.out.println(-+-+-x);
		int a=10,b;
		b=a++ + --a + a++ + --a + ++a + ++a;
		System.out.println(a +"\t"+ b);
	}

}
