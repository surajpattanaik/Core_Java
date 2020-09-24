//Static and non-Static reference examples
public class Reference {
static Reference r1;
Reference r2;//non_static ref
int x=10;
static int y=20;
public static void main(String[] args) {
		Reference  r3=new Reference();
		System.out.println(r3.r1);
		System.out.println(r3.r2);
		System.out.println(r3.x);
		System.out.println(r3.y);
		

	}

}
 