package P1;
class B{
	public static void main(String[] args) {
	        	A a1 = new A();
	        	System.out.println("---------class B----------");
	        	System.out.println("can't access a var as it is private.");
	        	System.out.println("b =" +a1.b + "from class B(default)");
	        	System.out.println("c =" +a1.c + "from class B(protected)");
	        	System.out.println("d =" +a1.d + "from class B(public)");

	        }        

}