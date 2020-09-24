class College{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.sno=128;
		s1.sname="Suraj";
		s1.course="CJ";
		s1.fee=1000.0;
		Student s2 = new Student();
		s2.sno=200;
		s2.sname="john";
		s2.course="Acting";
		s2.fee=2000.0;
		System.out.println("Suraj Course details...........");
			System.out.println("Student no: "+s1.sno);
				System.out.println("Student name: "+s1.sname);
					System.out.println("Student Course: "+s1.course);
						System.out.println("Student fee: "+s1.fee);
		System.out.println("John Course details...........");
		   System.out.println("Student no: "+s2.sno);
			   System.out.println("Student name: "+s2.sname);
				    System.out.println("Student Course: "+s2.course);
					    System.out.println("Student fee: "+s2.fee);

           
	}
}