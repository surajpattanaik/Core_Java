import java.util.*;
import java.io.*;
import java.lang.*;
public class Employee 
	String ename;
	double salary;
	String locations[];
	ArrayList<Integer>deptno;
	LinkedList<String>dname;
	TreeSet<Long>phone;
	HashSet<String>emails;
	HashMap<String,Long>refs;
	static Scanner sc=new Scanner(System.in);
	public Employee() {
	System.out.println("Enter the name");
	ename=sc.next();
	System.out.println("Enter the salary");
	salary=sc.nextDouble();
	System.out.println("Enter the no of locations you want to store");
	int no_of_loc=sc.nextInt();
	locations[no_of_loc]=sc.next();
	locations=new String[no_of_loc];
	locations[no_of_loc]=sc.next();
	String choice=null;
	deptno=new ArrayList<Integer>();
	do {
		System.out.println("Enter a new dept no");
		deptno.add(sc.nextInt());
		System.out.println("Do you want a new deptno!(Yes for continue)");
		choice=sc.next();
		
	}
	while(choice.equalsIgnoreCase("Yes"));
	dname=new LinkedList<String>();
	do {
		System.out.println("Enter a new dept name.." );
		dname.add(sc.next());
		System.out.println("Do you want to add a new dept name!(Yes  for Continue)");
		choice =sc.next();
	}
	while(choice.equalsIgnoreCase("Yes"));
	phone=new TreeSet<Long>();
	do {
		System.out.println("Enter a new phone no.." );
		phone.add(sc.nextLong());
		System.out.println("Do you want to add a new phone no!(Yes  for Continue)");
		choice =sc.next();
	}
	while(choice.equalsIgnoreCase("Yes"));
	
	emails=new HashSet<String>();
	do {
		System.out.println("Enter a new email id.." );
		emails.add(sc.next());
		System.out.println("Do you want to add a new email id!(Yes  for Continue)");
		choice =sc.next();
	}
	while(choice.equalsIgnoreCase("Yes"));
	
	refs=new HashMap<String,Long>();
	do {
		System.out.println("Enter the reference details(name and phone).." );
		refs.put(sc.next(),sc.nextLong());
		System.out.println("Do you want to add  new ref!(Yes  for Continue)");
		choice =sc.next();
	}
	while(choice.equalsIgnoreCase("Yes"));
	}
	public String toString() {
	return "Employee[ename= " +ename+",Salary= "+salary+",Locations = "+Arrays.toString(no_of_loc)+",Dept no = "+deptno +",Dept name = "+dname+",phone = "+phone+",emails= "+emails+",Reference= "+refs+"]";
	}
	}
	public class Collection_Ex {
	static Scanner sc=new Scanner(System.in);
    public void main(String[] args) {
	TreeMap<Integer,Employee>map=new TreeMap<Integer,Employee>();
	String choice=null;
	do {
		System.out.println("Enter employee Id");
	int eid=sc.nextInt();
	Employee e1=new Employee();
	map.put(eid,e1);
	System.out.println("Do you want to add a new Employee(Yes or No)");
	choice=sc.next();
	}
	while(choice.equalsIgnoreCase("Yes"));
	System.out.println("Al the Employee Details...");
	System.out.println(map);
}
}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


