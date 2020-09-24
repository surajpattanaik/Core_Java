
public class Certificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean passport = false ;
boolean birthcertificate = true ;
boolean driverslicense = true ;
if(passport) {
	System.out.println("A passport is a valid number");
}
else if(birthcertificate) {
	System.out.println("A birth certificate is a valid Id");
}
else if(driverslicense) {
	System.out.println("A drivers license is a valid Id");

}
else {
	System.out.println("Invalid Id your application is denied");
}
	}

}
