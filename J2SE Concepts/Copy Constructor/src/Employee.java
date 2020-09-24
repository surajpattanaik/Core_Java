
public class Employee {
int eid;
String ename;
Employee()
{
	
}
Employee(Employee e) {
	eid=e.eid;
	ename=e.ename;
}
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.eid=100;
		e1.ename="Raja";
		System.out.println(e1.eid+"\t"+e1.ename);
		Employee e2=new Employee(e1);
		System.out.println(e2.eid+"\t"+e2.ename);
		e2.eid=101;
		e2.ename="Raja";
		System.out.println(e2.eid+"\t"+e2.ename);
		Employee e3=new Employee(e2);
		System.out.println(e3.eid+"\t"+e3.ename);
	}

}
