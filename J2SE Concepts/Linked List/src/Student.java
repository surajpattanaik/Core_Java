
public class Student {
int roll;
Student next;
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		System.out.println(s1 + "\t" + s2 +"\t" + s3);
		s1.roll=100;
		s2.roll=200;
		s3.roll=300;
		s1.next=s2;
		s2.next=s3;
		s3.next=null;
		System.out.println("All the student details...");
		
		Student begin=s1;
		while(begin !=null) {
			System.out.println(begin.roll);
			begin=begin.next;
		}
		

	}

}
