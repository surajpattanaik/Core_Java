public class College 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();// instance to represent the student s1.




		Student s2 = new Student();// instance to represent the student s2.




		//storing s1 values in instance 1.
		s1.sno = 101;
		s1.name = "SURAJ";
		s1.course = "CJ";
		s1.fee = 2500;


		//storing s2 values in instance 2.
		s2.sno = 102;
		s2.name = "LOLWA";
		s2.course = "Psychology";
		s1.fee = 5000;


		System.out.println("\ns1 object details");
			    System.out.println("s1.sno\t: "+ s1.sno);
				System.out.println("s1.sname\t: "+ s1. name);
				System.out.println("s1.course\t: "+ s1.course);
				System.out.println("s1.fee\t: "+ s1.fee);
        
		System.out.println("\ns2 object details");
			    System.out.println("s2.sno\t: "+ s2.sno);
				System.out.println("s2.sname\t: "+ s2.name);
				System.out.println("s2.course\t: "+ s2.course);
				System.out.println("s2.fee\t: "+ s2.fee);
        





		System.out.println("Hello World!");
	}
}
