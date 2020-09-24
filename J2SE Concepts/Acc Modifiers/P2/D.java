package P2;
import P1.A;
class D{
	public static void main(String[] args) {
		 A a1=new A();
		 System.out.println("---------class D----------");
	        	System.out.println("can't access a var as it is private.");
	        	System.out.println("can't access b var as it is default.");
	        	System.out.println("can't access C var as it is protected.");
	        	System.out.println("d =" +a1.d + "from class B (public).");

	}
}