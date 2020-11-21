package FuctionalInterfaces.CustomFI;

interface Test {

	
	public String bookCab(String source,String dest);
}

public class Cab{
	public static void main(String[] args) {
		
		Test t=(source,dest)->{
			                   System.out.println("Cab is booked from "+source+" to "+dest);
			                   return "Price is 500rs";
		};
		
		System.out.println(t.bookCab("Cuttack","Bhubaneswar"));
	}
}



