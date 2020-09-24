import java.util.Scanner;
class BikeRider 
{

public static void main( String []args) {
	Scanner scn = new Scanner(System.in);

	Bike b = new Bike();
	System.out.println(" Change gear ");
	int g = scn.nextInt();
	b.setGear(g);

}

}