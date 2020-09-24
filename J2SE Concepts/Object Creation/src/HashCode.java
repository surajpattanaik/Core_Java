//How to get Hashcode.
public class HashCode {
static HashCode t1;
	public static void main(String[] args) {
		System.out.println(t1);//null
		t1=new HashCode();
		System.out.println(t1);//hashcode

	}

}
