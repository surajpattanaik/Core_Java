
public class Bigest_3 {
;
	public static void main(String[] args) {
   System.out.println("Hello");
   double no1=Double.parseDouble(args[0]);
   double no2=Double.parseDouble(args[1]);	// TODO Auto-generated method stub
   double no3=Double.parseDouble(args[2]);
   if(no1 > no2 && no1 > no3)
   {
	   System.out.println(no1 +" is big");
   }
   if(no2 > no1 && no2 > no3) {
	   System.out.println(no2 +" is big");
   }
   if(no3 > no1 && no3 > no2)
   {
	   System.out.println(no3 +" is big");
   }
	
}
}