public class StringPooling {
public static void main(String[] args) {

	
	String s1 = "a";
	String s2 ="a";
	
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	
	String s3 = new String("a");
	String s4 = new String("a");
	
	System.out.println(s3==s4);
	System.out.println(s3.equals(s3));
}
}
