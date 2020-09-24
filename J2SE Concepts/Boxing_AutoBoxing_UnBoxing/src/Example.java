
public class Example {

	public static void main(String[] args) {
	int x=10;
	Integer a=new Integer(x);//Boxing
	Integer b=x;//AutoBoxing
	int y=Integer.valueOf(a);//UnBoxing
	int z=a;//AutoBoxing
	System.out.println(x);//10
    System.out.println(a + "\t" + b);//10 10
    System.out.println(y + "\t" +  z);// 10 10
	}

}
