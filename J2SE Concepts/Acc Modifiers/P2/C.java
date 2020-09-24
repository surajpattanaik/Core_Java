package P2;
import P1.A;
class C extends A{
	public static void main(String[] args) {
	C c1=new C();
	System.out.println("---------class C----------");
	        	System.out.println("can't access a var as it is private.");
	        	System.out.println("can't access b var as it is default.");
	        	System.out.println("c =" +c1.c + "from class B (protected)");
	        	System.out.println("d =" +c1.d + "from class B(public)");


}
}